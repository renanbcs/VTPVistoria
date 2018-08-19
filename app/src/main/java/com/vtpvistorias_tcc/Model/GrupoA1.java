package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.HashMap;
import java.util.Map;

public class GrupoA1 extends Inspecao {

    //Atributos
    private Long idFicha;

    private Boolean areaCadeirasRodasMenorEspecificacao = false;
    private Boolean comunicacaoVisualInternaAdesivosObstaculos = false;

    private Boolean areaManobrasObstaculos = false;

    private Boolean portasFechamentoDeficiente = false;
    private Boolean portasConservacao = false;
    private Boolean portasNaoTrava = false;

    private Boolean elevadorIncompativel = false;
    private Boolean elevadorVaoLivre = false;
    private Boolean elevadorCursoIncompativel = false;
    private Boolean elevadorSeparado = false;
    private Boolean elevadorInacessivel = false;
    private Boolean elevadorInexistente = false;
    private Boolean elevadorNaoFunciona = false;
    private Boolean elevadorPinturaForaPadrao = false;
    private Boolean elevadorObstaculo = false;
    private Boolean elevadorRapido = false;
    private Boolean elevadorBrusco = false;
    private Boolean elevadorBarulho = false;
    private Boolean elevadorOutros = false;
    private Boolean elevadorBarulhoExcessivo = false;
    private Boolean elevadorVazamento = false;
    private Boolean elevadorInoperante = false;

    private Boolean itensSegurancaInexistente = false;
    private Boolean itensSegurancaFuncionamento = false;
    private Boolean itensSegurancaInoperante = false;
    private Boolean itensSegurancaConservacao = false;
    private Boolean itensSegurancaTransporteDeficiente = false;
    private Boolean itensSegurancaMaterialNaoResiliente = false;

    private Boolean tacografoFalta;
    private Boolean tacografoFaltaLacre;
    private Boolean tacografoNaoFunciona;
    private Boolean tacografoEstadoConservacao;

    private Boolean pisoLiso;
    private Boolean pisoSujo;
    private Boolean pisoDerrapante;

    private Boolean quebraSolInexistente;
    private Boolean quebraSolDesregulado;
    private Boolean quebraSolSolto;

    private Boolean desembacadorParaBrisaNaoFunciona;
    private Boolean desembacadorParaBrisaFalta;

    private Boolean bancosAltosSimplesInexistentes;
    private Boolean bancosAltosSimplesConservacao;
    private Boolean bancosAltosSimplesFixacao;

    private Boolean radioComunicacaoNaoFunciona;
    private Boolean radioComunicacaoFixacao;
    private Boolean radioComunicacaoConservacao;
    private Boolean radioComunicacaoLenteDanificada;

    private Boolean brakeLightInexistente;
    private Boolean brakeLightSolto;

    private Boolean comunicacaoVisualInternaAdesivosInexistente;
    private Boolean comunicacaoVisualInternaAdesivosConservacao;
    private Boolean comunicacaoVisualInternaAdesivosForaPadrao;


    public GrupoA1() {
    }

    public void salvar() {
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Grupo C").push().setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap() {
        HashMap<String, Object> hashMapFichaA = new HashMap<>();

        hashMapFichaA.put("idFicha", getIdFicha());

        hashMapFichaA.put("areaCadeirasRodasMenorEspecificacao", getAreaCadeirasRodasMenorEspecificacao());
        hashMapFichaA.put("comunicacaoVisualInternaAdesivosObstaculos", getComunicacaoVisualInternaAdesivosObstaculos());

        hashMapFichaA.put("areaManobrasObstaculos", getAreaManobrasObstaculos());

        hashMapFichaA.put("portasFechamentoDeficiente", getPortasFechamentoDeficiente());
        hashMapFichaA.put("portasConservacao", getPortasConservacao());
        hashMapFichaA.put("portasNaoTrava", getPortasNaoTrava());


        hashMapFichaA.put("elevadorIncompativel", getElevadorIncompativel());
        hashMapFichaA.put("elevadorVaoLivre", getElevadorVaoLivre());
        hashMapFichaA.put("elevadorCursoIncompativel", getElevadorCursoIncompativel());
        hashMapFichaA.put("elevadorSeparado", getElevadorSeparado());
        hashMapFichaA.put("elevadorInacessivel", getElevadorInacessivel());
        hashMapFichaA.put("elevadorInexistente", getElevadorInexistente());
        hashMapFichaA.put("elevadorNaoFunciona", getElevadorNaoFunciona());
        hashMapFichaA.put("elevadorPinturaForaPadrao", getElevadorPinturaForaPadrao());
        hashMapFichaA.put("elevadorObstaculo", getElevadorObstaculo());
        hashMapFichaA.put("elevadorRapido", getElevadorRapido());
        hashMapFichaA.put("elevadorBrusco", getElevadorBrusco());
        hashMapFichaA.put("elevadorBarulho", getElevadorBarulho());
        hashMapFichaA.put("elevadorOutros", getElevadorOutros());
        hashMapFichaA.put("elevadorBarulhoExcessivo", getElevadorBarulhoExcessivo());
        hashMapFichaA.put("elevadorVazamento", getElevadorVazamento());
        hashMapFichaA.put("elevadorInoperante", getElevadorInoperante());

        hashMapFichaA.put("itensSegurancaInexistente", getItensSegurancaInexistente());
        hashMapFichaA.put("itensSegurancaFuncionamento", getItensSegurancaFuncionamento());
        hashMapFichaA.put("itensSegurancaInoperante", getItensSegurancaInoperante());
        hashMapFichaA.put("itensSegurancaConservacao", getItensSegurancaConservacao());
        hashMapFichaA.put("itensSegurancaTransporteDeficiente", getItensSegurancaTransporteDeficiente());
        hashMapFichaA.put("itensSegurancaMaterialNaoResiliente", getItensSegurancaMaterialNaoResiliente());

        hashMapFichaA.put("tacografoFalta", getTacografoFalta());
        hashMapFichaA.put("tacografoFaltaLacre", getTacografoFaltaLacre());
        hashMapFichaA.put("tacografoNaoFunciona", getTacografoNaoFunciona());
        hashMapFichaA.put("tacografoEstadoConservacao", getTacografoEstadoConservacao());

        hashMapFichaA.put("quebraSolInexistente", getQuebraSolInexistente());
        hashMapFichaA.put("quebraSolDesregulado", getQuebraSolDesregulado());
        hashMapFichaA.put("quebraSolSolto", getQuebraSolSolto());

        hashMapFichaA.put("pisoLiso", getPisoLiso());
        hashMapFichaA.put("pisoSujo", getPisoSujo());
        hashMapFichaA.put("pisoDerrapante", getPisoDerrapante());

        hashMapFichaA.put("desembacadorParaBrisaNaoFunciona", getDesembacadorParaBrisaNaoFunciona());
        hashMapFichaA.put("desembacadorParaBrisaFalta", getDesembacadorParaBrisaFalta());

        hashMapFichaA.put("bancosAltosSimplesInexistentes", getBancosAltosSimplesInexistentes());
        hashMapFichaA.put("bancosAltosSimplesConservacao", getBancosAltosSimplesConservacao());
        hashMapFichaA.put("bancosAltosSimplesFixacao", getBancosAltosSimplesFixacao());

        hashMapFichaA.put("radioComunicacaoNaoFunciona", getRadioComunicacaoNaoFunciona());
        hashMapFichaA.put("radioComunicacaoFixacao", getRadioComunicacaoFixacao());
        hashMapFichaA.put("radioComunicacaoConservacao", getRadioComunicacaoConservacao());
        hashMapFichaA.put("radioComunicacaoLenteDanificada", getRadioComunicacaoLenteDanificada());

        hashMapFichaA.put("brakeLightInexistente", getBrakeLightInexistente());
        hashMapFichaA.put("brakeLightSolto", getBrakeLightSolto());

        hashMapFichaA.put("comunicacaoVisualInternaAdesivosInexistente", getComunicacaoVisualInternaAdesivosInexistente());
        hashMapFichaA.put("comunicacaoVisualInternaAdesivosConservacao", getComunicacaoVisualInternaAdesivosConservacao());
        hashMapFichaA.put("comunicacaoVisualInternaAdesivosForaPadrao", getComunicacaoVisualInternaAdesivosForaPadrao());


        return hashMapFichaA;
    }


    public Long getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Long idFicha) {
        this.idFicha = idFicha;
    }

    public Boolean getAreaCadeirasRodasMenorEspecificacao() {
        return areaCadeirasRodasMenorEspecificacao;
    }

    public void setAreaCadeirasRodasMenorEspecificacao(Boolean areaCadeirasRodasMenorEspecificacao) {
        this.areaCadeirasRodasMenorEspecificacao = areaCadeirasRodasMenorEspecificacao;
    }

    public Boolean getComunicacaoVisualInternaAdesivosObstaculos() {
        return comunicacaoVisualInternaAdesivosObstaculos;
    }

    public void setComunicacaoVisualInternaAdesivosObstaculos(Boolean comunicacaoVisualInternaAdesivosObstaculos) {
        this.comunicacaoVisualInternaAdesivosObstaculos = comunicacaoVisualInternaAdesivosObstaculos;
    }

    public Boolean getAreaManobrasObstaculos() {
        return areaManobrasObstaculos;
    }

    public void setAreaManobrasObstaculos(Boolean areaManobrasObstaculos) {
        this.areaManobrasObstaculos = areaManobrasObstaculos;
    }

    public Boolean getPortasFechamentoDeficiente() {
        return portasFechamentoDeficiente;
    }

    public void setPortasFechamentoDeficiente(Boolean portasFechamentoDeficiente) {
        this.portasFechamentoDeficiente = portasFechamentoDeficiente;
    }

    public Boolean getPortasConservacao() {
        return portasConservacao;
    }

    public void setPortasConservacao(Boolean portasConservacao) {
        this.portasConservacao = portasConservacao;
    }

    public Boolean getPortasNaoTrava() {
        return portasNaoTrava;
    }

    public void setPortasNaoTrava(Boolean portasNaoTrava) {
        this.portasNaoTrava = portasNaoTrava;
    }

    public Boolean getElevadorIncompativel() {
        return elevadorIncompativel;
    }

    public void setElevadorIncompativel(Boolean elevadorIncompativel) {
        this.elevadorIncompativel = elevadorIncompativel;
    }

    public Boolean getElevadorVaoLivre() {
        return elevadorVaoLivre;
    }

    public void setElevadorVaoLivre(Boolean elevadorVaoLivre) {
        this.elevadorVaoLivre = elevadorVaoLivre;
    }

    public Boolean getElevadorCursoIncompativel() {
        return elevadorCursoIncompativel;
    }

    public void setElevadorCursoIncompativel(Boolean elevadorCursoIncompativel) {
        this.elevadorCursoIncompativel = elevadorCursoIncompativel;
    }

    public Boolean getElevadorSeparado() {
        return elevadorSeparado;
    }

    public void setElevadorSeparado(Boolean catracaFalta) {
        this.elevadorSeparado = elevadorSeparado;
    }

    public Boolean getElevadorInacessivel() {
        return elevadorInacessivel;
    }

    public void setElevadorInacessivel(Boolean elevadorInacessivel) {
        this.elevadorInacessivel = elevadorInacessivel;
    }

    public Boolean getElevadorInexistente() {
        return elevadorInexistente;
    }

    public void setElevadorInexistente(Boolean elevadorInexistente) {
        this.elevadorInexistente = elevadorInexistente;
    }

    public Boolean getElevadorNaoFunciona() {
        return elevadorNaoFunciona;
    }

    public void setElevadorNaoFunciona(Boolean elevadorNaoFunciona) {
        this.elevadorNaoFunciona = elevadorNaoFunciona;
    }

    public Boolean getElevadorPinturaForaPadrao() {
        return elevadorPinturaForaPadrao;
    }

    public void setElevadorPinturaForaPadrao(Boolean elevadorPinturaForaPadrao) {
        this.elevadorPinturaForaPadrao = elevadorPinturaForaPadrao;
    }

    public Boolean getElevadorObstaculo() {
        return elevadorObstaculo;
    }

    public void setElevadorObstaculo(Boolean elevadorObstaculo) {
        this.elevadorObstaculo = elevadorObstaculo;
    }

    public Boolean getElevadorRapido() {
        return elevadorRapido;
    }

    public void setElevadorRapido(Boolean elevadorRapido) {
        this.elevadorRapido = elevadorRapido;
    }

    public Boolean getElevadorBrusco() {
        return elevadorBrusco;
    }

    public void setElevadorBrusco(Boolean elevadorBrusco) {
        this.elevadorBrusco = elevadorBrusco;
    }

    public Boolean getElevadorBarulho() {
        return elevadorBarulho;
    }

    public void setElevadorBarulho(Boolean elevadorBarulho) {
        this.elevadorBarulho = elevadorBarulho;
    }

    public Boolean getElevadorOutros() {
        return elevadorOutros;
    }

    public void setElevadorOutros(Boolean elevadorOutros) {
        this.elevadorOutros = elevadorOutros;
    }

    public Boolean getElevadorBarulhoExcessivo() {
        return elevadorBarulhoExcessivo;
    }

    public void setElevadorBarulhoExcessivo(Boolean elevadorBarulhoExcessivo) {
        this.elevadorBarulhoExcessivo = elevadorBarulhoExcessivo;
    }

    public Boolean getElevadorVazamento() {
        return elevadorVazamento;
    }

    public void setElevadorVazamento(Boolean elevadorVazamento) {
        this.elevadorVazamento = elevadorVazamento;
    }

    public Boolean getElevadorInoperante() {
        return elevadorInoperante;
    }

    public void setElevadorInoperante(Boolean elevadorInoperante) {
        this.elevadorInoperante = elevadorInoperante;
    }

    public Boolean getItensSegurancaInexistente() {
        return itensSegurancaInexistente;
    }

    public void setItensSegurancaInexistente(Boolean itensSegurancaInexistente) {
        this.itensSegurancaInexistente = itensSegurancaInexistente;
    }

    public Boolean getItensSegurancaFuncionamento() {
        return itensSegurancaFuncionamento;
    }

    public void setItensSegurancaFuncionamento(Boolean itensSegurancaFuncionamento) {
        this.itensSegurancaFuncionamento = itensSegurancaFuncionamento;
    }

    public Boolean getItensSegurancaInoperante() {
        return itensSegurancaInoperante;
    }

    public void setItensSegurancaInoperante(Boolean itensSegurancaInoperante) {
        this.itensSegurancaInoperante = itensSegurancaInoperante;
    }

    public Boolean getItensSegurancaConservacao() {
        return itensSegurancaConservacao;
    }

    public void setItensSegurancaConservacao(Boolean itensSegurancaConservacao) {
        this.itensSegurancaConservacao = itensSegurancaConservacao;
    }

    public Boolean getItensSegurancaTransporteDeficiente() {
        return itensSegurancaTransporteDeficiente;
    }

    public void setItensSegurancaTransporteDeficiente(Boolean itensSegurancaTransporteDeficiente) {
        this.itensSegurancaTransporteDeficiente = itensSegurancaTransporteDeficiente;
    }

    public Boolean getItensSegurancaMaterialNaoResiliente() {
        return itensSegurancaMaterialNaoResiliente;
    }

    public void setItensSegurancaMaterialNaoResiliente(Boolean itensSegurancaMaterialNaoResiliente) {
        this.itensSegurancaMaterialNaoResiliente = itensSegurancaMaterialNaoResiliente;
    }

    ////sistema carroceria nivel b
    public Boolean getTacografoFalta() {
        return tacografoFalta;
    }

    public void setTacografoFalta(Boolean tacografoFalta) {
        this.tacografoFalta = tacografoFalta;
    }

    public Boolean getTacografoFaltaLacre() {
        return tacografoFaltaLacre;
    }

    public void setTacografoFaltaLacre(Boolean tacografoFaltaLacre) {
        this.tacografoFaltaLacre = tacografoFaltaLacre;
    }

    public Boolean getTacografoNaoFunciona() {
        return tacografoNaoFunciona;
    }

    public void setTacografoNaoFunciona(Boolean tacografoNaoFunciona) {
        this.tacografoNaoFunciona = tacografoNaoFunciona;
    }

    public Boolean getTacografoEstadoConservacao() {
        return tacografoEstadoConservacao;
    }

    public void setTacografoEstadoConservacao(Boolean tacografoEstadoConservacao) {
        this.tacografoEstadoConservacao = tacografoEstadoConservacao;
    }

    public Boolean getPisoLiso() {
        return pisoLiso;
    }

    public void setPisoLiso(Boolean pisoLiso) {
        this.pisoLiso = pisoLiso;
    }

    public Boolean getPisoSujo() {
        return pisoSujo;
    }

    public void setPisoSujo(Boolean pisoSujo) {
        this.pisoSujo = pisoSujo;
    }

    public Boolean getPisoDerrapante() {
        return pisoDerrapante;
    }

    public void setPisoDerrapante(Boolean pisoDerrapante) {
        this.pisoDerrapante = pisoDerrapante;
    }

    public Boolean getQuebraSolInexistente() {
        return quebraSolInexistente;
    }

    public void setQuebraSolInexistente(Boolean quebraSolInexistente) {
        this.quebraSolInexistente = quebraSolInexistente;
    }

    public Boolean getQuebraSolDesregulado() {
        return quebraSolDesregulado;
    }

    public void setQuebraSolDesregulado(Boolean quebraSolDesregulado) {
        this.quebraSolDesregulado = quebraSolDesregulado;
    }

    public Boolean getQuebraSolSolto() {
        return quebraSolSolto;
    }

    public void setQuebraSolSolto(Boolean quebraSolSolto) {
        this.quebraSolSolto = quebraSolSolto;
    }

    public Boolean getDesembacadorParaBrisaNaoFunciona() {
        return desembacadorParaBrisaNaoFunciona;
    }

    public void setDesembacadorParaBrisaNaoFunciona(Boolean desembacadorParaBrisaNaoFunciona) {
        this.desembacadorParaBrisaNaoFunciona = desembacadorParaBrisaNaoFunciona;
    }

    public Boolean getDesembacadorParaBrisaFalta() {
        return desembacadorParaBrisaFalta;
    }

    public void setDesembacadorParaBrisaFalta(Boolean desembacadorParaBrisaFalta) {
        this.desembacadorParaBrisaFalta = desembacadorParaBrisaFalta;
    }

    public Boolean getBancosAltosSimplesInexistentes() {
        return bancosAltosSimplesInexistentes;
    }

    public void setBancosAltosSimplesInexistentes(Boolean bancosAltosSimplesInexistentes) {
        this.bancosAltosSimplesInexistentes = bancosAltosSimplesInexistentes;
    }

    public Boolean getBancosAltosSimplesConservacao() {
        return bancosAltosSimplesConservacao;
    }

    public void setBancosAltosSimplesConservacao(Boolean bancosAltosSimplesConservacao) {
        this.bancosAltosSimplesConservacao = bancosAltosSimplesConservacao;
    }

    public Boolean getBancosAltosSimplesFixacao() {
        return bancosAltosSimplesFixacao;
    }

    public void setBancosAltosSimplesFixacao(Boolean bancosAltosSimplesFixacao) {
        this.bancosAltosSimplesFixacao = bancosAltosSimplesFixacao;
    }

    public Boolean getRadioComunicacaoNaoFunciona() {
        return radioComunicacaoNaoFunciona;
    }

    public void setRadioComunicacaoNaoFunciona(Boolean radioComunicacaoNaoFunciona) {
        this.radioComunicacaoNaoFunciona = radioComunicacaoNaoFunciona;
    }

    public Boolean getRadioComunicacaoFixacao() {
        return radioComunicacaoFixacao;
    }

    public void setRadioComunicacaoFixacao(Boolean radioComunicacaoFixacao) {
        this.radioComunicacaoFixacao = radioComunicacaoFixacao;
    }

    public Boolean getRadioComunicacaoConservacao() {
        return radioComunicacaoConservacao;
    }

    public void setRadioComunicacaoConservacao(Boolean radioComunicacaoConservacao) {
        this.radioComunicacaoConservacao = radioComunicacaoConservacao;
    }

    public Boolean getRadioComunicacaoLenteDanificada() {
        return radioComunicacaoLenteDanificada;
    }

    public void setRadioComunicacaoLenteDanificada(Boolean radioComunicacaoLenteDanificada) {
        this.radioComunicacaoLenteDanificada = radioComunicacaoLenteDanificada;
    }

    public Boolean getBrakeLightInexistente() {
        return brakeLightInexistente;
    }

    public void setBrakeLightInexistente( Boolean brakeLightInexistente) {
        this.brakeLightInexistente = brakeLightInexistente;
    }

    public Boolean getBrakeLightSolto() {
        return brakeLightSolto;
    }

    public void setBrakeLightSolto(Boolean brakeLightSolto) {
        this.brakeLightSolto = brakeLightSolto;
    }

    public Boolean getComunicacaoVisualInternaAdesivosInexistente() {
        return comunicacaoVisualInternaAdesivosInexistente;
    }

    public void setComunicacaoVisualInternaAdesivosInexistente(Boolean comunicacaoVisualInternaAdesivosInexistente) {
        this.comunicacaoVisualInternaAdesivosInexistente = comunicacaoVisualInternaAdesivosInexistente;
    }

    public Boolean getComunicacaoVisualInternaAdesivosConservacao() {
        return comunicacaoVisualInternaAdesivosConservacao;
    }

    public void setComunicacaoVisualInternaAdesivosConservacao(Boolean comunicacaoVisualInternaAdesivosConservacao) {
        this.comunicacaoVisualInternaAdesivosConservacao = comunicacaoVisualInternaAdesivosConservacao;
    }

    public Boolean getComunicacaoVisualInternaAdesivosForaPadrao() {
        return tacografoFalta;
    }

    public void setComunicacaoVisualInternaAdesivosForaPadrao(Boolean comunicacaoVisualInternaAdesivosForaPadrao) {
        this.comunicacaoVisualInternaAdesivosForaPadrao = comunicacaoVisualInternaAdesivosForaPadrao;
    }




}

