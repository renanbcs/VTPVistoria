package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrupoA implements Serializable {

    //Atributos
    private Long idFicha;

    //Sistema Freio
    private Boolean valvulaPedalVazando = false;
    private Boolean valvulaPedalContaminada = false;

    private Boolean almofadaPedalGasta = false;
    private Boolean almofadaPedalFalta = false;

    private Boolean freioEstacionamentoVazando = false;
    private Boolean freioEstacionamentoNaoFunciona = false;

    private Boolean varaoFreioMaoDespressurizada = false;
    private Boolean varaoFreioMaoSolta = false;
    private Boolean varaoFreioMaoSemAcao = false;

    private Boolean catracaFalta = false;

    private Boolean pinoCatracaFalta = false;

    private Boolean lonasFreioContaminada = false;
    private Boolean lonasFreioSolta = false;
    private Boolean lonasFreioQuebrada = false;
    private Boolean lonasFreioDesrregulada = false;
    private Boolean lonasFreioFina = false;

    private Boolean cilindrosPneumaticosVazando = false;
    private Boolean cilindrosPneumaticosDesativado = false;

    private Boolean servoFreioVazando = false;
    private Boolean servoFreioSolto = false;

    private Boolean cilindroRodaVazando = false;
    private Boolean cilindroRodaSolto = false;

    private Boolean cilindroMestreVazando = false;
    private Boolean cilindroMestreSolto = false;

    private Boolean flexivelRodaVazando = false;
    private Boolean flexivelRodaDanificado = false;
    private Boolean flexivelRodaDesalinhado = false;
    private Boolean flexivelRodaIrregular = false;

    private Boolean valvulaTubularReservatorioVazando = false;
    private Boolean valvulaTubularReservatorioContaminada = false;

    //Sistema Suspensao
    private Boolean amortecedorFaltando = false;
    private Boolean amortecedorVazando = false;
    private Boolean amortecedorSolto = false;
    private Boolean amortecedorDanificado = false;

    private Boolean suporteAmortecedorDanificado = false;
    private Boolean suporteAmortecedorSolto = false;

    private Boolean buchaAmortecedorDanificada = false;
    private Boolean buchaAmortecedorSolta = false;

    private Boolean feixeMolasDanificado = false;
    private Boolean feixeMolasSolta = false;

    private Boolean buchaMolasFolga = false;

    private Boolean espigaoMolasCortado = false;
    private Boolean espigaoMolasQuebrado = false;

    private Boolean grampoMolasDanificado = false;
    private Boolean grampoMolasSolto = false;

    private Boolean suporteMolasDanificado = false;
    private Boolean suporteMolasSolto = false;

    private Boolean algemaDanificado = false;
    private Boolean algemaSolto = false;

    private Boolean pinoSuporteMolaSolto = false;
    private Boolean pinoSuporteMolaQuebrado = false;
    private Boolean pinoSuporteMolaFalta = false;

    private Boolean molaHelicoidalQuebrada = false;
    private Boolean molaHelicoidalSolta = false;

    private Boolean suporteMolaHelicoidalQuebrada = false;
    private Boolean suporteMolaHelicoidalSolto = false;

    private Boolean bolsaoDeArDanificada = false;
    private Boolean bolsaoDeArSolto = false;
    private Boolean bolsaoDeArVazando = false;

    private Boolean valculaNivelDanificada = false;
    private Boolean valculaNivelSolta = false;
    private Boolean valculaNivelVazando = false;

    private Boolean barraEstabilizadoraSolta = false;
    private Boolean barraEstabilizadoraFalta = false;
    private Boolean barraEstabilizadoraQuebrada = false;
    private Boolean barraEstabilizadoraFolga = false;

    private Boolean buchaBarraEstabilizadoraFalta = false;
    private Boolean buchaBarraEstabilizadoraFolga = false;

    private Boolean bananaBeanSolta = false;
    private Boolean bananaBeanDanificada = false;
    private Boolean bananaBeanDesalinhada = false;
    private Boolean bananaBeanFolga = false;

    private Boolean hasteSuporteReacaoTraseiraEmpenada = false;
    private Boolean hasteSuporteReacaoTraseiraFolga = false;
    private Boolean hasteSuporteReacaoTraseiraSolta = false;
    private Boolean hasteSuporteReacaoTraseiraQuebrada = false;

    //Sistema Tracao
    private Boolean eixoCardanFolga = false;
    private Boolean eixoCardanDesalinhado = false;
    private Boolean eixoCardanSolto	 = false;
    private Boolean eixoCardanBorrachaDanificada = false;

    //Sistema Rodante
    private Boolean pneuDesgastado = false;
    private Boolean pneuIrregular = false;
    private Boolean pneuDanificado = false;
    private Boolean pneuTalao = false;

    private Boolean rodaFaltaPorca = false;
    private Boolean rodaFaltaEspelho = false;
    private Boolean rodaDanificada = false;

    // Sistema de Eixo dianteiro -Direção
    private Boolean caixaDirecaoSolta = false;
    private Boolean caixaDirecaoVazamFlexEncanamento = false;

    private Boolean suporteCaixaSolto = false;
    private Boolean suporteCaixaTrincado = false;

    private Boolean bracoTerminalCaixaFolga	 = false;
    private Boolean bracoTerminalCaixaSolto = false;

    private Boolean amortecedorDirecaoSolto	 = false;
    private Boolean amortecedorDirecaoVazando = false;
    private Boolean amortecedorDirecaoFalta = false;

    private Boolean eixoDianteiroEmpenado = false;
    private Boolean eixoDianteiroTrincado = false;

    private Boolean rolamentoMangaEixoDanificado = false;
    private Boolean rolamentoMangaEixoFolga = false;

    private Boolean parafusoBatenteMangaFalta = false;
    private Boolean parafusoBatenteMangaSolto = false;

    private Boolean bracoEixoDianteiroSolto	 = false;
    private Boolean bracoEixoDianteiroDanificado = false;

    private Boolean terminaisBarraLongaSolto = false;
    private Boolean terminaisBarraLongaFolga = false;

    private Boolean bracoIntermediarioSolto	 = false;
    private Boolean bracoIntermediarioFolga = false;

    private Boolean hasteSuporteReacaoEmpenada = false;
    private Boolean hasteSuporteReacaoFolga	 = false;
    private Boolean hasteSuporteReacaoSolta	 = false;
    private Boolean hasteSuporteReacaoQuebrada = false;

    //Sistema Chassio-Plataforma
    private Boolean tanqueCombustivelVazando = false;
    private Boolean tanqueCombustivelSolto	 = false;

    private Boolean cintaSuporteTanqueFalta	= false;
    private Boolean cintaSuporteTanqueQuebrada	 = false;

    private Boolean estruturaDegrausSolta = false;
    private Boolean estruturaDegrausAlturaIrregular = false;
    private Boolean estruturaDegrausQuebrada = false;

    private Boolean charrisPlatTrincado	= false;
    private Boolean charrisPlatQuebrado	 = false;
    private Boolean charrisPlatReparoInadequado	 = false;

    private Boolean segCintoBloqueioPortasNFunciona	= false;
    private Boolean segCintoBloqueioPortasFalta	 = false;

    public GrupoA() {
    }

    public void salvar(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Grupo A").push().setValue(this);
    }

    @Exclude

    public Map<String, HashMap<String, Object>> toMap(){
        HashMap<String, HashMap<String, Object>> hashMapFichaA = new HashMap<>();
        HashMap<String, Object> hashMapSistemaFreio = new HashMap<>();
        HashMap<String, Object> hashMapSistemaSuspensao = new HashMap<>();
        HashMap<String, Object> hashMapSistemaTracao = new HashMap<>();
        HashMap<String, Object> hashMapSistemaRodante = new HashMap<>();
        HashMap<String, Object> hashMapEixoDianteiro = new HashMap<>();
        HashMap<String, Object> hashMapChassioPlataforma = new HashMap<>();

        //hashMapFichaA.put("idFicha",getIdFicha());

        //Sistema Freio
        hashMapSistemaFreio.put("valvulaPedalVazando",getValvulaPedalVazando());
        hashMapSistemaFreio.put("valvulaPedalContaminada",getValvulaPedalContaminada());

        hashMapSistemaFreio.put("almofadaPedalGasta",getAlmofadaPedalGasta());
        hashMapSistemaFreio.put("almofadaPedalFalta",getAlmofadaPedalFalta());

        hashMapSistemaFreio.put("freioEstacionamentoVazando",getFreioEstacionamentoVazando());
        hashMapSistemaFreio.put("freioEstacionamentoNaoFunciona",getFreioEstacionamentoNaoFunciona());

        hashMapSistemaFreio.put("varaoFreioMaoDespressurizada",getVaraoFreioMaoDespressurizada());
        hashMapSistemaFreio.put("varaoFreioMaoSolta",getVaraoFreioMaoSolta());
        hashMapSistemaFreio.put("varaoFreioMaoSemAcao",getVaraoFreioMaoSemAcao());

        hashMapSistemaFreio.put("catracaFalta",getCatracaFalta());

        hashMapSistemaFreio.put("pinoCatracaFalta",getPinoCatracaFalta());

        hashMapSistemaFreio.put("lonasFreioContaminada",getLonasFreioContaminada());
        hashMapSistemaFreio.put("lonasFreioSolta",getLonasFreioSolta());
        hashMapSistemaFreio.put("lonasFreioQuebrada",getLonasFreioQuebrada());
        hashMapSistemaFreio.put("lonasFreioDesrregulada",getLonasFreioDesrregulada());
        hashMapSistemaFreio.put("lonasFreioFina",getLonasFreioFina());

        hashMapSistemaFreio.put("cilindrosPneumaticosVazando",getCilindrosPneumaticosVazando());
        hashMapSistemaFreio.put("cilindrosPneumaticosDesativado",getCilindrosPneumaticosDesativado());

        hashMapSistemaFreio.put("servoFreioVazando",getServoFreioVazando());
        hashMapSistemaFreio.put("servoFreioSolto",getServoFreioSolto());
        hashMapSistemaFreio.put("cilindroRodaVazando",getCilindroRodaVazando());
        hashMapSistemaFreio.put("cilindroRodaSolto",getCilindroRodaSolto());
        hashMapSistemaFreio.put("cilindroMestreVazando",getCilindroMestreVazando());
        hashMapSistemaFreio.put("cilindroMestreSolto",getCilindroMestreSolto());
        hashMapSistemaFreio.put("flexivelRodaVazando",getFlexivelRodaVazando());
        hashMapSistemaFreio.put("flexivelRodaDanificado",getFlexivelRodaDanificado());
        hashMapSistemaFreio.put("flexivelRodaDesalinhado",getFlexivelRodaDesalinhado());
        hashMapSistemaFreio.put("flexivelRodaIrregular",getFlexivelRodaIrregular());
        hashMapSistemaFreio.put("valvulaTubularReservatorioVazando",getValvulaTubularReservatorioVazando());
        hashMapSistemaFreio.put("valvulaTubularReservatorioContaminada",getValvulaTubularReservatorioContaminada());

        hashMapFichaA.put("SistemaFreio", hashMapSistemaFreio);

        //Sistema Suspensao
        hashMapSistemaSuspensao.put("amortecedorFaltando",getAmortecedorFaltando());

        hashMapSistemaSuspensao.put("amortecedorVazando",getAmortecedorVazando());
        hashMapSistemaSuspensao.put("amortecedorSolto",getAmortecedorSolto());
        hashMapSistemaSuspensao.put("amortecedorDanificado",getAmortecedorDanificado());

        hashMapSistemaSuspensao.put("suporteAmortecedorDanificado",getSuporteAmortecedorDanificado());
        hashMapSistemaSuspensao.put("suporteAmortecedorSolto",getSuporteAmortecedorSolto());

        hashMapSistemaSuspensao.put("buchaAmortecedorDanificada",getBuchaAmortecedorDanificada());
        hashMapSistemaSuspensao.put("buchaAmortecedorSolta",getBuchaAmortecedorSolta());

        hashMapSistemaSuspensao.put("feixeMolasDanificado",getFeixeMolasDanificado());
        hashMapSistemaSuspensao.put("feixeMolasSolta",getFeixeMolasSolta());

        hashMapSistemaSuspensao.put("buchaMolasFolga",getBuchaMolasFolga());
        hashMapSistemaSuspensao.put("espigaoMolasCortado",getEspigaoMolasCortado());
        hashMapSistemaSuspensao.put("espigaoMolasQuebrado",getEspigaoMolasQuebrado());

        hashMapSistemaSuspensao.put("grampoMolasDanificado",getGrampoMolasDanificado());
        hashMapSistemaSuspensao.put("grampoMolasSolto",getGrampoMolasSolto());

        hashMapSistemaSuspensao.put("suporteMolasDanificado",getSuporteMolasDanificado());
        hashMapSistemaSuspensao.put("suporteMolasSolto",getSuporteMolasSolto());

        hashMapSistemaSuspensao.put("algemaDanificado",getAlgemaDanificado());
        hashMapSistemaSuspensao.put("algemaSolto",getAlgemaSolto());

        hashMapSistemaSuspensao.put("pinoSuporteMolaSolto",getPinoSuporteMolaSolto());
        hashMapSistemaSuspensao.put("pinoSuporteMolaQuebrado",getPinoSuporteMolaQuebrado());
        hashMapSistemaSuspensao.put("pinoSuporteMolaFalta",getPinoSuporteMolaFalta());

        hashMapSistemaSuspensao.put("molaHelicoidalQuebrada",getMolaHelicoidalQuebrada());
        hashMapSistemaSuspensao.put("molaHelicoidalSolta",getMolaHelicoidalSolta());

        hashMapSistemaSuspensao.put("suporteMolaHelicoidalQuebrada",getSuporteMolaHelicoidalQuebrada());
        hashMapSistemaSuspensao.put("suporteMolaHelicoidalSolto",getSuporteMolaHelicoidalSolto());

        hashMapSistemaSuspensao.put("bolsaoDeArDanificada",getBolsaoDeArDanificada());
        hashMapSistemaSuspensao.put("bolsaoDeArSolto",getBolsaoDeArSolto());
        hashMapSistemaSuspensao.put("bolsaoDeArVazando",getBolsaoDeArVazando());

        hashMapSistemaSuspensao.put("barraEstabilizadoraSolta",getBarraEstabilizadoraSolta());
        hashMapSistemaSuspensao.put("barraEstabilizadoraFalta",getBarraEstabilizadoraFalta());
        hashMapSistemaSuspensao.put("barraEstabilizadoraFolga",getBarraEstabilizadoraFolga());
        hashMapSistemaSuspensao.put("barraEstabilizadoraQuebrada",getBarraEstabilizadoraQuebrada());

        hashMapSistemaSuspensao.put("buchaBarraEstabilizadoraFalta",getBuchaBarraEstabilizadoraFalta());
        hashMapSistemaSuspensao.put("buchaBarraEstabilizadoraFolga",getBuchaBarraEstabilizadoraFolga());

        hashMapSistemaSuspensao.put("bananaBeanSolta",getBananaBeanSolta());
        hashMapSistemaSuspensao.put("bananaBeanDanificada",getBananaBeanDanificada());
        hashMapSistemaSuspensao.put("bananaBeanDesalinhada",getBananaBeanDesalinhada());
        hashMapSistemaSuspensao.put("bananaBeanFolga",getBananaBeanFolga());

        hashMapSistemaSuspensao.put("hasteSuporteReacaoTraseiraEmpenada",getHasteSuporteReacaoTraseiraEmpenada());
        hashMapSistemaSuspensao.put("hasteSuporteReacaoTraseiraFolga",getHasteSuporteReacaoTraseiraFolga());
        hashMapSistemaSuspensao.put("hasteSuporteReacaoTraseiraSolta",getHasteSuporteReacaoTraseiraSolta());
        hashMapSistemaSuspensao.put("hasteSuporteReacaoTraseiraQuebrada",getHasteSuporteReacaoTraseiraQuebrada());

        hashMapFichaA.put("SistemaSuspensao", hashMapSistemaSuspensao);

        //Sistema Tracao
        hashMapSistemaTracao.put("eixoCardanFolga",getEixoCardanFolga());
        hashMapSistemaTracao.put("eixoCardanDesalinhado",getEixoCardanDesalinhado());
        hashMapSistemaTracao.put("eixoCardanSolto",getEixoCardanSolto());
        hashMapSistemaTracao.put("eixoCardanBorrachaDanificada",getEixoCardanBorrachaDanificada());

        hashMapFichaA.put("SistemaTracao", hashMapSistemaTracao);

        //Sistema Rodante
        hashMapSistemaRodante.put("pneuDesgastado",getPneuDesgastado());
        hashMapSistemaRodante.put("pneuIrregular",getPneuIrregular());
        hashMapSistemaRodante.put("pneuDanificado",getPneuDanificado());
        hashMapSistemaRodante.put("pneuTalao",getPneuTalao());

        hashMapSistemaRodante.put("rodaFaltaPorca",getRodaFaltaPorca());
        hashMapSistemaRodante.put("rodaFaltaEspelho",getRodaFaltaEspelho());
        hashMapSistemaRodante.put("rodaDanificada",getRodaDanificada());

        hashMapFichaA.put("SistemaRodante", hashMapSistemaRodante);

        // Sistema de Eixo dianteiro -Direção
        hashMapEixoDianteiro.put("caixaDirecaoSolta",getCaixaDirecaoSolta());
        hashMapEixoDianteiro.put("caixaDirecaoVazamFlexEncanamento",getCaixaDirecaoVazamFlexEncanamento());

        hashMapEixoDianteiro.put("suporteCaixaSolto",getSuporteCaixaSolto());
        hashMapEixoDianteiro.put("suporteCaixaTrincado",getSuporteCaixaTrincado());

        hashMapEixoDianteiro.put("bracoTerminalCaixaFolga",getBracoTerminalCaixaFolga());
        hashMapEixoDianteiro.put("bracoTerminalCaixaSolto",getBracoTerminalCaixaSolto());

        hashMapEixoDianteiro.put("amortecedorDirecaoSolto",getAmortecedorDirecaoSolto());
        hashMapEixoDianteiro.put("amortecedorDirecaoVazando",getAmortecedorDirecaoVazando());
        hashMapEixoDianteiro.put("amortecedorDirecaoFalta",getAmortecedorDirecaoFalta());

        hashMapEixoDianteiro.put("eixoDianteiroEmpenado",getEixoDianteiroEmpenado());
        hashMapEixoDianteiro.put("eixoDianteiroTrincado",getEixoDianteiroTrincado());

        hashMapEixoDianteiro.put("rolamentoMangaEixoDanificado",getRolamentoMangaEixoDanificado());
        hashMapEixoDianteiro.put("rolamentoMangaEixoFolga",getRolamentoMangaEixoFolga());

        hashMapEixoDianteiro.put("parafusoBatenteMangaFalta",getParafusoBatenteMangaFalta());
        hashMapEixoDianteiro.put("parafusoBatenteMangaSolto",getParafusoBatenteMangaSolto());

        hashMapEixoDianteiro.put("bracoEixoDianteiroSolto",getBracoEixoDianteiroSolto());
        hashMapEixoDianteiro.put("bracoEixoDianteiroDanificado",getBracoEixoDianteiroDanificado());

        hashMapEixoDianteiro.put("terminaisBarraLongaSolto",getTerminaisBarraLongaSolto());

        hashMapEixoDianteiro.put("terminaisBarraLongaFolga",getTerminaisBarraLongaFolga());

        hashMapEixoDianteiro.put("bracoIntermediarioSolto",getBracoIntermediarioSolto());
        hashMapEixoDianteiro.put("bracoIntermediarioFolga",getBracoIntermediarioFolga());

        hashMapEixoDianteiro.put("hasteSuporteReacaoEmpenada",getHasteSuporteReacaoEmpenada());
        hashMapEixoDianteiro.put("hasteSuporteReacaoFolga",getHasteSuporteReacaoFolga());
        hashMapEixoDianteiro.put("hasteSuporteReacaoSolta",getHasteSuporteReacaoSolta());
        hashMapEixoDianteiro.put("hasteSuporteReacaoQuebrada",getHasteSuporteReacaoQuebrada());

        hashMapFichaA.put("SistemaEixoDianteiro", hashMapEixoDianteiro);

        //Sistema Chassio-Plataforma
        hashMapChassioPlataforma.put("tanqueCombustivelVazando",getTanqueCombustivelVazando());
        hashMapChassioPlataforma.put("tanqueCombustivelSolto",getTanqueCombustivelSolto());

        hashMapChassioPlataforma.put("cintaSuporteTanqueFalta",getCintaSuporteTanqueFalta());
        hashMapChassioPlataforma.put("cintaSuporteTanqueQuebrada",getCintaSuporteTanqueQuebrada());

        hashMapChassioPlataforma.put("estruturaDegrausSolta",getEstruturaDegrausSolta());
        hashMapChassioPlataforma.put("estruturaDegrausAlturaIrregular",getEstruturaDegrausAlturaIrregular());
        hashMapChassioPlataforma.put("estruturaDegrausQuebrada",getEstruturaDegrausQuebrada());

        hashMapChassioPlataforma.put("charrisPlatTrincado",getCharrisPlatTrincado());
        hashMapChassioPlataforma.put("charrisPlatQuebrado",getCharrisPlatQuebrado());
        hashMapChassioPlataforma.put("charrisPlatReparoInadequado",getCharrisPlatReparoInadequado());

        hashMapChassioPlataforma.put("segCintoBloqueioPortasNFunciona",getSegCintoBloqueioPortasNFunciona());
        hashMapChassioPlataforma.put("segCintoBloqueioPortasFalta",getSegCintoBloqueioPortasFalta());

        hashMapFichaA.put("SistemaChassioPlataforma", hashMapChassioPlataforma);

        return hashMapFichaA;
    }


    public Long getIdFicha(){
        return idFicha;
    }

    public void setIdFicha(Long idFicha){
        this.idFicha=idFicha;
    }

    public Boolean getValvulaPedalVazando() {
        return valvulaPedalVazando;
    }

    public void setValvulaPedalVazando(Boolean valvulaPedalVazando) {
        this.valvulaPedalVazando = valvulaPedalVazando;
    }

    public Boolean getValvulaPedalContaminada() {
        return valvulaPedalContaminada;
    }

    public void setValvulaPedalContaminada(Boolean valvulaPedalContaminada) {
        this.valvulaPedalContaminada = valvulaPedalContaminada;
    }

    public Boolean getAlmofadaPedalGasta() {
        return almofadaPedalGasta;
    }

    public void setAlmofadaPedalGasta(Boolean almofadaPedalGasta) {
        this.almofadaPedalGasta = almofadaPedalGasta;
    }

    public Boolean getAlmofadaPedalFalta() {
        return almofadaPedalFalta;
    }

    public void setAlmofadaPedalFalta(Boolean almofadaPedalFalta) {
        this.almofadaPedalFalta = almofadaPedalFalta;
    }

    public Boolean getFreioEstacionamentoVazando() {
        return freioEstacionamentoVazando;
    }

    public void setFreioEstacionamentoVazando(Boolean freioEstacionamentoVazando) {
        this.freioEstacionamentoVazando = freioEstacionamentoVazando;
    }

    public Boolean getFreioEstacionamentoNaoFunciona() {
        return freioEstacionamentoNaoFunciona;
    }

    public void setFreioEstacionamentoNaoFunciona(Boolean freioEstacionamentoNaoFunciona) {
        this.freioEstacionamentoNaoFunciona = freioEstacionamentoNaoFunciona;
    }

    public Boolean getVaraoFreioMaoDespressurizada() {
        return varaoFreioMaoDespressurizada;
    }

    public void setVaraoFreioMaoDespressurizada(Boolean varaoFreioMaoDespressurizada) {
        this.varaoFreioMaoDespressurizada = varaoFreioMaoDespressurizada;
    }

    public Boolean getVaraoFreioMaoSolta() {
        return varaoFreioMaoSolta;
    }

    public void setVaraoFreioMaoSolta(Boolean varaoFreioMaoSolta) {
        this.varaoFreioMaoSolta = varaoFreioMaoSolta;
    }

    public Boolean getVaraoFreioMaoSemAcao() {
        return varaoFreioMaoSemAcao;
    }

    public void setVaraoFreioMaoSemAcao(Boolean varaoFreioMaoSemAcao) {
        this.varaoFreioMaoSemAcao = varaoFreioMaoSemAcao;
    }

    public Boolean getCatracaFalta() {
        return catracaFalta;
    }

    public void setCatracaFalta(Boolean catracaFalta) {
        this.catracaFalta = catracaFalta;
    }

    public Boolean getPinoCatracaFalta() {
        return pinoCatracaFalta;
    }

    public void setPinoCatracaFalta(Boolean pinoCatracaFalta) {
        this.pinoCatracaFalta = pinoCatracaFalta;
    }

    public Boolean getLonasFreioContaminada() {
        return lonasFreioContaminada;
    }

    public void setLonasFreioContaminada(Boolean lonasFreioContaminada) {
        this.lonasFreioContaminada = lonasFreioContaminada;
    }

    public Boolean getLonasFreioSolta() {
        return lonasFreioSolta;
    }

    public void setLonasFreioSolta(Boolean lonasFreioSolta) {
        this.lonasFreioSolta = lonasFreioSolta;
    }

    public Boolean getLonasFreioDesrregulada() {
        return lonasFreioDesrregulada;
    }

    public void setLonasFreioDesrregulada(Boolean lonasFreioDesrregulada) {
        this.lonasFreioDesrregulada = lonasFreioDesrregulada;
    }

    public Boolean getLonasFreioFina() {
        return lonasFreioFina;
    }

    public void setLonasFreioFina(Boolean lonasFreioFina) {
        this.lonasFreioFina = lonasFreioFina;
    }

    public Boolean getCilindrosPneumaticosVazando() {
        return cilindrosPneumaticosVazando;
    }

    public void setCilindrosPneumaticosVazando(Boolean cilindrosPneumaticosVazando) {
        this.cilindrosPneumaticosVazando = cilindrosPneumaticosVazando;
    }

    public Boolean getCilindrosPneumaticosDesativado() {
        return cilindrosPneumaticosDesativado;
    }

    public void setCilindrosPneumaticosDesativado(Boolean cilindrosPneumaticosDesativado) {
        this.cilindrosPneumaticosDesativado = cilindrosPneumaticosDesativado;
    }

    public Boolean getServoFreioVazando() {
        return servoFreioVazando;
    }

    public void setServoFreioVazando(Boolean servoFreioVazando) {
        this.servoFreioVazando = servoFreioVazando;
    }

    public Boolean getServoFreioSolto() {
        return servoFreioSolto;
    }

    public void setServoFreioSolto(Boolean servoFreioSolto) {
        this.servoFreioSolto = servoFreioSolto;
    }

    public Boolean getCilindroRodaVazando() {
        return cilindroRodaVazando;
    }

    public void setCilindroRodaVazando(Boolean cilindroRodaVazando) {
        this.cilindroRodaVazando = cilindroRodaVazando;
    }

    public Boolean getCilindroRodaSolto() {
        return cilindroRodaSolto;
    }

    public void setCilindroRodaSolto(Boolean cilindroRodaSolto) {
        this.cilindroRodaSolto = cilindroRodaSolto;
    }

    public Boolean getCilindroMestreVazando() {
        return cilindroMestreVazando;
    }

    public void setCilindroMestreVazando(Boolean cilindroMestreVazando) {
        this.cilindroMestreVazando = cilindroMestreVazando;
    }

    public Boolean getCilindroMestreSolto() {
        return cilindroMestreSolto;
    }

    public void setCilindroMestreSolto(Boolean cilindroMestreSolto) {
        this.cilindroMestreSolto = cilindroMestreSolto;
    }

    public Boolean getFlexivelRodaVazando() {
        return flexivelRodaVazando;
    }

    public void setFlexivelRodaVazando(Boolean flexivelRodaVazando) {
        this.flexivelRodaVazando = flexivelRodaVazando;
    }

    public Boolean getFlexivelRodaDanificado() {
        return flexivelRodaDanificado;
    }

    public void setFlexivelRodaDanificado(Boolean flexivelRodaDanificado) {
        this.flexivelRodaDanificado = flexivelRodaDanificado;
    }

    public Boolean getFlexivelRodaDesalinhado() {
        return flexivelRodaDesalinhado;
    }

    public void setFlexivelRodaDesalinhado(Boolean flexivelRodaDesalinhado) {
        this.flexivelRodaDesalinhado = flexivelRodaDesalinhado;
    }

    public Boolean getFlexivelRodaIrregular() {
        return flexivelRodaIrregular;
    }

    public void setFlexivelRodaIrregular(Boolean flexivelRodaIrregular) {
        this.flexivelRodaIrregular = flexivelRodaIrregular;
    }

    public Boolean getValvulaTubularReservatorioVazando() {
        return valvulaTubularReservatorioVazando;
    }

    public void setValvulaTubularReservatorioVazando(Boolean valvulaTubularReservatorioVazando) {
        this.valvulaTubularReservatorioVazando = valvulaTubularReservatorioVazando;
    }

    public Boolean getValvulaTubularReservatorioContaminada() {
        return valvulaTubularReservatorioContaminada;
    }

    public void setValvulaTubularReservatorioContaminada(Boolean valvulaTubularReservatorioContaminada) {
        this.valvulaTubularReservatorioContaminada = valvulaTubularReservatorioContaminada;
    }

    public Boolean getLonasFreioQuebrada() {
        return lonasFreioQuebrada;
    }

    public void setLonasFreioQuebrada(Boolean lonasFreioQuebrada) {
        this.lonasFreioQuebrada = lonasFreioQuebrada;
    }

    public Boolean getAmortecedorFaltando() {
        return amortecedorFaltando;
    }

    public void setAmortecedorFaltando(Boolean amortecedorFaltando) {
        this.amortecedorFaltando = amortecedorFaltando;
    }

    public Boolean getAmortecedorVazando() {
        return amortecedorVazando;
    }

    public void setAmortecedorVazando(Boolean amortecedorVazando) {
        this.amortecedorVazando = amortecedorVazando;
    }

    public Boolean getAmortecedorSolto() {
        return amortecedorSolto;
    }

    public void setAmortecedorSolto(Boolean amortecedorSolto) {
        this.amortecedorSolto = amortecedorSolto;
    }

    public Boolean getAmortecedorDanificado() {
        return amortecedorDanificado;
    }

    public void setAmortecedorDanificado(Boolean amortecedorDanificado) {
        this.amortecedorDanificado = amortecedorDanificado;
    }

    public Boolean getSuporteAmortecedorDanificado() {
        return suporteAmortecedorDanificado;
    }

    public void setSuporteAmortecedorDanificado(Boolean suporteAmortecedorDanificado) {
        this.suporteAmortecedorDanificado = suporteAmortecedorDanificado;
    }

    public Boolean getSuporteAmortecedorSolto() {
        return suporteAmortecedorSolto;
    }

    public void setSuporteAmortecedorSolto(Boolean suporteAmortecedorSolto) {
        this.suporteAmortecedorSolto = suporteAmortecedorSolto;
    }

    public Boolean getBuchaAmortecedorDanificada() {
        return buchaAmortecedorDanificada;
    }

    public void setBuchaAmortecedorDanificada(Boolean buchaAmortecedorDanificada) {
        this.buchaAmortecedorDanificada = buchaAmortecedorDanificada;
    }

    public Boolean getBuchaAmortecedorSolta() {
        return buchaAmortecedorSolta;
    }

    public void setBuchaAmortecedorSolta(Boolean buchaAmortecedorSolta) {
        this.buchaAmortecedorSolta = buchaAmortecedorSolta;
    }

    public Boolean getFeixeMolasDanificado() {
        return feixeMolasDanificado;
    }

    public void setFeixeMolasDanificado(Boolean feixeMolasDanificado) {
        this.feixeMolasDanificado = feixeMolasDanificado;
    }

    public Boolean getFeixeMolasSolta() {
        return feixeMolasSolta;
    }

    public void setFeixeMolasSolta(Boolean feixeMolasSolta) {
        this.feixeMolasSolta = feixeMolasSolta;
    }

    public Boolean getBuchaMolasFolga() {
        return buchaMolasFolga;
    }

    public void setBuchaMolasFolga(Boolean buchaMolasFolga) {
        this.buchaMolasFolga = buchaMolasFolga;
    }

    public Boolean getEspigaoMolasCortado() {
        return espigaoMolasCortado;
    }

    public void setEspigaoMolasCortado(Boolean espigaoMolasCortado) {
        this.espigaoMolasCortado = espigaoMolasCortado;
    }

    public Boolean getEspigaoMolasQuebrado() {
        return espigaoMolasQuebrado;
    }

    public void setEspigaoMolasQuebrado(Boolean espigaoMolasQuebrado) {
        this.espigaoMolasQuebrado = espigaoMolasQuebrado;
    }

    public Boolean getGrampoMolasDanificado() {
        return grampoMolasDanificado;
    }

    public void setGrampoMolasDanificado(Boolean grampoMolasDanificado) {
        this.grampoMolasDanificado = grampoMolasDanificado;
    }

    public Boolean getGrampoMolasSolto() {
        return grampoMolasSolto;
    }

    public void setGrampoMolasSolto(Boolean grampoMolasSolto) {
        this.grampoMolasSolto = grampoMolasSolto;
    }

    public Boolean getSuporteMolasDanificado() {
        return suporteMolasDanificado;
    }

    public void setSuporteMolasDanificado(Boolean suporteMolasDanificado) {
        this.suporteMolasDanificado = suporteMolasDanificado;
    }

    public Boolean getSuporteMolasSolto() {
        return suporteMolasSolto;
    }

    public void setSuporteMolasSolto(Boolean suporteMolasSolto) {
        this.suporteMolasSolto = suporteMolasSolto;
    }

    public Boolean getAlgemaDanificado() {
        return algemaDanificado;
    }

    public void setAlgemaDanificado(Boolean algemaDanificado) {
        this.algemaDanificado = algemaDanificado;
    }

    public Boolean getAlgemaSolto() {
        return algemaSolto;
    }

    public void setAlgemaSolto(Boolean algemaSolto) {
        this.algemaSolto = algemaSolto;
    }

    public Boolean getPinoSuporteMolaSolto() {
        return pinoSuporteMolaSolto;
    }

    public void setPinoSuporteMolaSolto(Boolean pinoSuporteMolaSolto) {
        this.pinoSuporteMolaSolto = pinoSuporteMolaSolto;
    }

    public Boolean getPinoSuporteMolaQuebrado() {
        return pinoSuporteMolaQuebrado;
    }

    public void setPinoSuporteMolaQuebrado(Boolean pinoSuporteMolaQuebrado) {
        this.pinoSuporteMolaQuebrado = pinoSuporteMolaQuebrado;
    }

    public Boolean getPinoSuporteMolaFalta() {
        return pinoSuporteMolaFalta;
    }

    public void setPinoSuporteMolaFalta(Boolean pinoSuporteMolaFalta) {
        this.pinoSuporteMolaFalta = pinoSuporteMolaFalta;
    }

    public Boolean getMolaHelicoidalQuebrada() {
        return molaHelicoidalQuebrada;
    }

    public void setMolaHelicoidalQuebrada(Boolean molaHelicoidalQuebrada) {
        this.molaHelicoidalQuebrada = molaHelicoidalQuebrada;
    }

    public Boolean getMolaHelicoidalSolta() {
        return molaHelicoidalSolta;
    }

    public void setMolaHelicoidalSolta(Boolean molaHelicoidalSolta) {
        this.molaHelicoidalSolta = molaHelicoidalSolta;
    }

    public Boolean getSuporteMolaHelicoidalQuebrada() {
        return suporteMolaHelicoidalQuebrada;
    }

    public void setSuporteMolaHelicoidalQuebrada(Boolean suporteMolaHelicoidalQuebrada) {
        this.suporteMolaHelicoidalQuebrada = suporteMolaHelicoidalQuebrada;
    }

    public Boolean getSuporteMolaHelicoidalSolto() {
        return suporteMolaHelicoidalSolto;
    }

    public void setSuporteMolaHelicoidalSolto(Boolean suporteMolaHelicoidalSolto) {
        this.suporteMolaHelicoidalSolto = suporteMolaHelicoidalSolto;
    }

    public Boolean getBolsaoDeArDanificada() {
        return bolsaoDeArDanificada;
    }

    public void setBolsaoDeArDanificada(Boolean bolsaoDeArDanificada) {
        this.bolsaoDeArDanificada = bolsaoDeArDanificada;
    }

    public Boolean getBolsaoDeArSolto() {
        return bolsaoDeArSolto;
    }

    public void setBolsaoDeArSolto(Boolean bolsaoDeArSolto) {
        this.bolsaoDeArSolto = bolsaoDeArSolto;
    }

    public Boolean getBolsaoDeArVazando() {
        return bolsaoDeArVazando;
    }

    public void setBolsaoDeArVazando(Boolean bolsaoDeArVazando) {
        this.bolsaoDeArVazando = bolsaoDeArVazando;
    }

    public Boolean getValculaNivelDanificada() {
        return valculaNivelDanificada;
    }

    public void setValculaNivelDanificada(Boolean valculaNivelDanificada) {
        this.valculaNivelDanificada = valculaNivelDanificada;
    }

    public Boolean getValculaNivelSolta() {
        return valculaNivelSolta;
    }

    public void setValculaNivelSolta(Boolean valculaNivelSolta) {
        this.valculaNivelSolta = valculaNivelSolta;
    }

    public Boolean getValculaNivelVazando() {
        return valculaNivelVazando;
    }

    public void setValculaNivelVazando(Boolean valculaNivelVazando) {
        this.valculaNivelVazando = valculaNivelVazando;
    }

    public Boolean getBarraEstabilizadoraSolta() {
        return barraEstabilizadoraSolta;
    }

    public void setBarraEstabilizadoraSolta(Boolean barraEstabilizadoraSolta) {
        this.barraEstabilizadoraSolta = barraEstabilizadoraSolta;
    }

    public Boolean getBarraEstabilizadoraFalta() {
        return barraEstabilizadoraFalta;
    }

    public void setBarraEstabilizadoraFalta(Boolean barraEstabilizadoraFalta) {
        this.barraEstabilizadoraFalta = barraEstabilizadoraFalta;
    }

    public Boolean getBarraEstabilizadoraQuebrada() {
        return barraEstabilizadoraQuebrada;
    }

    public void setBarraEstabilizadoraQuebrada(Boolean barraEstabilizadoraQuebrada) {
        this.barraEstabilizadoraQuebrada = barraEstabilizadoraQuebrada;
    }

    public Boolean getBuchaBarraEstabilizadoraFalta() {
        return buchaBarraEstabilizadoraFalta;
    }

    public void setBuchaBarraEstabilizadoraFalta(Boolean buchaBarraEstabilizadoraFalta) {
        this.buchaBarraEstabilizadoraFalta = buchaBarraEstabilizadoraFalta;
    }

    public Boolean getBuchaBarraEstabilizadoraFolga() {
        return buchaBarraEstabilizadoraFolga;
    }

    public void setBuchaBarraEstabilizadoraFolga(Boolean buchaBarraEstabilizadoraFolga) {
        this.buchaBarraEstabilizadoraFolga = buchaBarraEstabilizadoraFolga;
    }

    public Boolean getBarraEstabilizadoraFolga() {
        return barraEstabilizadoraFolga;
    }

    public void setBarraEstabilizadoraFolga(Boolean barraEstabilizadoraFolga) {
        this.barraEstabilizadoraFolga = barraEstabilizadoraFolga;
    }

    public Boolean getBananaBeanSolta() {
        return bananaBeanSolta;
    }

    public void setBananaBeanSolta(Boolean bananaBeanSolta) {
        this.bananaBeanSolta = bananaBeanSolta;
    }

    public Boolean getBananaBeanDanificada() {
        return bananaBeanDanificada;
    }

    public void setBananaBeanDanificada(Boolean bananaBeanDanificada) {
        this.bananaBeanDanificada = bananaBeanDanificada;
    }

    public Boolean getBananaBeanDesalinhada() {
        return bananaBeanDesalinhada;
    }

    public void setBananaBeanDesalinhada(Boolean bananaBeanDesalinhada) {
        this.bananaBeanDesalinhada = bananaBeanDesalinhada;
    }

    public Boolean getBananaBeanFolga() {
        return bananaBeanFolga;
    }

    public void setBananaBeanFolga(Boolean bananaBeanFolga) {
        this.bananaBeanFolga = bananaBeanFolga;
    }

    public Boolean getHasteSuporteReacaoTraseiraEmpenada() {
        return hasteSuporteReacaoTraseiraEmpenada;
    }

    public void setHasteSuporteReacaoTraseiraEmpenada(Boolean hasteSuporteReacaoTraseiraEmpenada) {
        this.hasteSuporteReacaoTraseiraEmpenada = hasteSuporteReacaoTraseiraEmpenada;
    }

    public Boolean getHasteSuporteReacaoTraseiraFolga() {
        return hasteSuporteReacaoTraseiraFolga;
    }

    public void setHasteSuporteReacaoTraseiraFolga(Boolean hasteSuporteReacaoTraseiraFolga) {
        this.hasteSuporteReacaoTraseiraFolga = hasteSuporteReacaoTraseiraFolga;
    }

    public Boolean getHasteSuporteReacaoTraseiraSolta() {
        return hasteSuporteReacaoTraseiraSolta;
    }

    public void setHasteSuporteReacaoTraseiraSolta(Boolean hasteSuporteReacaoTraseiraSolta) {
        this.hasteSuporteReacaoTraseiraSolta = hasteSuporteReacaoTraseiraSolta;
    }

    public Boolean getHasteSuporteReacaoTraseiraQuebrada() {
        return hasteSuporteReacaoTraseiraQuebrada;
    }

    public void setHasteSuporteReacaoTraseiraQuebrada(Boolean hasteSuporteReacaoTraseiraQuebrada) {
        this.hasteSuporteReacaoTraseiraQuebrada = hasteSuporteReacaoTraseiraQuebrada;
    }

    public Boolean getEixoCardanFolga() {
        return eixoCardanFolga;
    }

    public void setEixoCardanFolga(Boolean eixoCardanFolga) {
        this.eixoCardanFolga = eixoCardanFolga;
    }

    public Boolean getEixoCardanDesalinhado() {
        return eixoCardanDesalinhado;
    }

    public void setEixoCardanDesalinhado(Boolean eixoCardanDesalinhado) {
        this.eixoCardanDesalinhado = eixoCardanDesalinhado;
    }

    public Boolean getEixoCardanSolto() {
        return eixoCardanSolto;
    }

    public void setEixoCardanSolto(Boolean eixoCardanSolto) {
        this.eixoCardanSolto = eixoCardanSolto;
    }

    public Boolean getEixoCardanBorrachaDanificada() {
        return eixoCardanBorrachaDanificada;
    }

    public void setEixoCardanBorrachaDanificada(Boolean eixoCardanBorrachaDanificada) {
        this.eixoCardanBorrachaDanificada = eixoCardanBorrachaDanificada;
    }

    public Boolean getPneuDesgastado() {
        return pneuDesgastado;
    }

    public void setPneuDesgastado(Boolean pneuDesgastado) {
        this.pneuDesgastado = pneuDesgastado;
    }

    public Boolean getPneuIrregular() {
        return pneuIrregular;
    }

    public void setPneuIrregular(Boolean pneuIrregular) {
        this.pneuIrregular = pneuIrregular;
    }

    public Boolean getPneuDanificado() {
        return pneuDanificado;
    }

    public void setPneuDanificado(Boolean pneuDanificado) {
        this.pneuDanificado = pneuDanificado;
    }

    public Boolean getPneuTalao() {
        return pneuTalao;
    }

    public void setPneuTalao(Boolean pneuTalao) {
        this.pneuTalao = pneuTalao;
    }

    public Boolean getRodaFaltaPorca() {
        return rodaFaltaPorca;
    }

    public void setRodaFaltaPorca(Boolean rodaFaltaPorca) {
        this.rodaFaltaPorca = rodaFaltaPorca;
    }

    public Boolean getRodaFaltaEspelho() {
        return rodaFaltaEspelho;
    }

    public void setRodaFaltaEspelho(Boolean rodaFaltaEspelho) {
        this.rodaFaltaEspelho = rodaFaltaEspelho;
    }

    public Boolean getRodaDanificada() {
        return rodaDanificada;
    }

    public void setRodaDanificada(Boolean rodaDanificada) {
        this.rodaDanificada = rodaDanificada;
    }

    public Boolean getCaixaDirecaoSolta() {
        return caixaDirecaoSolta;
    }

    public void setCaixaDirecaoSolta(Boolean caixaDirecaoSolta) {
        this.caixaDirecaoSolta = caixaDirecaoSolta;
    }

    public Boolean getCaixaDirecaoVazamFlexEncanamento() {
        return caixaDirecaoVazamFlexEncanamento;
    }

    public void setCaixaDirecaoVazamFlexEncanamento(Boolean caixaDirecaoVazamFlexEncanamento) {
        this.caixaDirecaoVazamFlexEncanamento = caixaDirecaoVazamFlexEncanamento;
    }

    public Boolean getSuporteCaixaSolto() {
        return suporteCaixaSolto;
    }

    public void setSuporteCaixaSolto(Boolean suporteCaixaSolto) {
        this.suporteCaixaSolto = suporteCaixaSolto;
    }

    public Boolean getSuporteCaixaTrincado() {
        return suporteCaixaTrincado;
    }

    public void setSuporteCaixaTrincado(Boolean suporteCaixaTrincado) {
        this.suporteCaixaTrincado = suporteCaixaTrincado;
    }

    public Boolean getBracoTerminalCaixaFolga() {
        return bracoTerminalCaixaFolga;
    }

    public void setBracoTerminalCaixaFolga(Boolean bracoTerminalCaixaFolga) {
        this.bracoTerminalCaixaFolga = bracoTerminalCaixaFolga;
    }

    public Boolean getBracoTerminalCaixaSolto() {
        return bracoTerminalCaixaSolto;
    }

    public void setBracoTerminalCaixaSolto(Boolean bracoTerminalCaixaSolto) {
        this.bracoTerminalCaixaSolto = bracoTerminalCaixaSolto;
    }

    public Boolean getAmortecedorDirecaoSolto() {
        return amortecedorDirecaoSolto;
    }

    public void setAmortecedorDirecaoSolto(Boolean amortecedorDirecaoSolto) {
        this.amortecedorDirecaoSolto = amortecedorDirecaoSolto;
    }

    public Boolean getAmortecedorDirecaoVazando() {
        return amortecedorDirecaoVazando;
    }

    public void setAmortecedorDirecaoVazando(Boolean amortecedorDirecaoVazando) {
        this.amortecedorDirecaoVazando = amortecedorDirecaoVazando;
    }

    public Boolean getAmortecedorDirecaoFalta() {
        return amortecedorDirecaoFalta;
    }

    public void setAmortecedorDirecaoFalta(Boolean amortecedorDirecaoFalta) {
        this.amortecedorDirecaoFalta = amortecedorDirecaoFalta;
    }

    public Boolean getEixoDianteiroEmpenado() {
        return eixoDianteiroEmpenado;
    }

    public void setEixoDianteiroEmpenado(Boolean eixoDianteiroEmpenado) {
        this.eixoDianteiroEmpenado = eixoDianteiroEmpenado;
    }

    public Boolean getEixoDianteiroTrincado() {
        return eixoDianteiroTrincado;
    }

    public void setEixoDianteiroTrincado(Boolean eixoDianteiroTrincado) {
        this.eixoDianteiroTrincado = eixoDianteiroTrincado;
    }

    public Boolean getRolamentoMangaEixoDanificado() {
        return rolamentoMangaEixoDanificado;
    }

    public void setRolamentoMangaEixoDanificado(Boolean rolamentoMangaEixoDanificado) {
        this.rolamentoMangaEixoDanificado = rolamentoMangaEixoDanificado;
    }

    public Boolean getRolamentoMangaEixoFolga() {
        return rolamentoMangaEixoFolga;
    }

    public void setRolamentoMangaEixoFolga(Boolean rolamentoMangaEixoFolga) {
        this.rolamentoMangaEixoFolga = rolamentoMangaEixoFolga;
    }

    public Boolean getParafusoBatenteMangaFalta() {
        return parafusoBatenteMangaFalta;
    }

    public void setParafusoBatenteMangaFalta(Boolean parafusoBatenteMangaFalta) {
        this.parafusoBatenteMangaFalta = parafusoBatenteMangaFalta;
    }

    public Boolean getParafusoBatenteMangaSolto() {
        return parafusoBatenteMangaSolto;
    }

    public void setParafusoBatenteMangaSolto(Boolean parafusoBatenteMangaSolto) {
        this.parafusoBatenteMangaSolto = parafusoBatenteMangaSolto;
    }

    public Boolean getBracoEixoDianteiroSolto() {
        return bracoEixoDianteiroSolto;
    }

    public void setBracoEixoDianteiroSolto(Boolean bracoEixoDianteiroSolto) {
        this.bracoEixoDianteiroSolto = bracoEixoDianteiroSolto;
    }

    public Boolean getBracoEixoDianteiroDanificado() {
        return bracoEixoDianteiroDanificado;
    }

    public void setBracoEixoDianteiroDanificado(Boolean bracoEixoDianteiroDanificado) {
        this.bracoEixoDianteiroDanificado = bracoEixoDianteiroDanificado;
    }

    public Boolean getTerminaisBarraLongaSolto() {
        return terminaisBarraLongaSolto;
    }

    public void setTerminaisBarraLongaSolto(Boolean terminaisBarraLongaSolto) {
        this.terminaisBarraLongaSolto = terminaisBarraLongaSolto;
    }

    public Boolean getTerminaisBarraLongaFolga() {
        return terminaisBarraLongaFolga;
    }

    public void setTerminaisBarraLongaFolga(Boolean terminaisBarraLongaFolga) {
        this.terminaisBarraLongaFolga = terminaisBarraLongaFolga;
    }

    public Boolean getBracoIntermediarioSolto() {
        return bracoIntermediarioSolto;
    }

    public void setBracoIntermediarioSolto(Boolean bracoIntermediarioSolto) {
        this.bracoIntermediarioSolto = bracoIntermediarioSolto;
    }

    public Boolean getBracoIntermediarioFolga() {
        return bracoIntermediarioFolga;
    }

    public void setBracoIntermediarioFolga(Boolean bracoIntermediarioFolga) {
        this.bracoIntermediarioFolga = bracoIntermediarioFolga;
    }

    public Boolean getHasteSuporteReacaoEmpenada() {
        return hasteSuporteReacaoEmpenada;
    }

    public void setHasteSuporteReacaoEmpenada(Boolean hasteSuporteReacaoEmpenada) {
        this.hasteSuporteReacaoEmpenada = hasteSuporteReacaoEmpenada;
    }

    public Boolean getHasteSuporteReacaoFolga() {
        return hasteSuporteReacaoFolga;
    }

    public void setHasteSuporteReacaoFolga(Boolean hasteSuporteReacaoFolga) {
        this.hasteSuporteReacaoFolga = hasteSuporteReacaoFolga;
    }

    public Boolean getHasteSuporteReacaoSolta() {
        return hasteSuporteReacaoSolta;
    }

    public void setHasteSuporteReacaoSolta(Boolean hasteSuporteReacaoSolta) {
        this.hasteSuporteReacaoSolta = hasteSuporteReacaoSolta;
    }

    public Boolean getHasteSuporteReacaoQuebrada() {
        return hasteSuporteReacaoQuebrada;
    }

    public void setHasteSuporteReacaoQuebrada(Boolean hasteSuporteReacaoQuebrada) {
        this.hasteSuporteReacaoQuebrada = hasteSuporteReacaoQuebrada;
    }

    public Boolean getTanqueCombustivelVazando() {
        return tanqueCombustivelVazando;
    }

    public void setTanqueCombustivelVazando(Boolean tanqueCombustivelVazando) {
        this.tanqueCombustivelVazando = tanqueCombustivelVazando;
    }

    public Boolean getTanqueCombustivelSolto() {
        return tanqueCombustivelSolto;
    }

    public void setTanqueCombustivelSolto(Boolean tanqueCombustivelSolto) {
        this.tanqueCombustivelSolto = tanqueCombustivelSolto;
    }

    public Boolean getCintaSuporteTanqueFalta() {
        return cintaSuporteTanqueFalta;
    }

    public void setCintaSuporteTanqueFalta(Boolean cintaSuporteTanqueFalta) {
        this.cintaSuporteTanqueFalta = cintaSuporteTanqueFalta;
    }

    public Boolean getCintaSuporteTanqueQuebrada() {
        return cintaSuporteTanqueQuebrada;
    }

    public void setCintaSuporteTanqueQuebrada(Boolean cintaSuporteTanqueQuebrada) {
        this.cintaSuporteTanqueQuebrada = cintaSuporteTanqueQuebrada;
    }

    public Boolean getEstruturaDegrausSolta() {
        return estruturaDegrausSolta;
    }

    public void setEstruturaDegrausSolta(Boolean estruturaDegrausSolta) {
        this.estruturaDegrausSolta = estruturaDegrausSolta;
    }

    public Boolean getEstruturaDegrausAlturaIrregular() {
        return estruturaDegrausAlturaIrregular;
    }

    public void setEstruturaDegrausAlturaIrregular(Boolean estruturaDegrausAlturaIrregular) {
        this.estruturaDegrausAlturaIrregular = estruturaDegrausAlturaIrregular;
    }

    public Boolean getEstruturaDegrausQuebrada() {
        return estruturaDegrausQuebrada;
    }

    public void setEstruturaDegrausQuebrada(Boolean estruturaDegrausQuebrada) {
        this.estruturaDegrausQuebrada = estruturaDegrausQuebrada;
    }

    public Boolean getCharrisPlatTrincado() {
        return charrisPlatTrincado;
    }

    public void setCharrisPlatTrincado(Boolean charrisPlatTrincado) {
        this.charrisPlatTrincado = charrisPlatTrincado;
    }

    public Boolean getCharrisPlatQuebrado() {
        return charrisPlatQuebrado;
    }

    public void setCharrisPlatQuebrado(Boolean charrisPlatQuebrado) {
        this.charrisPlatQuebrado = charrisPlatQuebrado;
    }

    public Boolean getCharrisPlatReparoInadequado() {
        return charrisPlatReparoInadequado;
    }

    public void setCharrisPlatReparoInadequado(Boolean charrisPlatReparoInadequado) {
        this.charrisPlatReparoInadequado = charrisPlatReparoInadequado;
    }

    public Boolean getSegCintoBloqueioPortasNFunciona() {
        return segCintoBloqueioPortasNFunciona;
    }

    public void setSegCintoBloqueioPortasNFunciona(Boolean segCintoBloqueioPortasNFunciona) {
        this.segCintoBloqueioPortasNFunciona = segCintoBloqueioPortasNFunciona;
    }

    public Boolean getSegCintoBloqueioPortasFalta() {
        return segCintoBloqueioPortasFalta;
    }

    public void setSegCintoBloqueioPortasFalta(Boolean segCintoBloqueioPortasFalta) {
        this.segCintoBloqueioPortasFalta = segCintoBloqueioPortasFalta;
    }
}

