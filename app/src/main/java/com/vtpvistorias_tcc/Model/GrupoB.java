package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.HashMap;
import java.util.Map;

public class GrupoB extends Inspecao {

    //Atributos
    private Long idFicha;

    //Sistema Carroceria
    private Boolean parabrisaQuebrado = false;
    private Boolean parabrisaSolto = false;
    private Boolean parabrisaTrincado = false;

    private Boolean vidroTraseiroFalta	= false;
    private Boolean vidroTraseiroQuebrado = false;
    private Boolean vidroTraseiroSolto = false;
    private Boolean vidroTraseiroTrincado = false;
    private Boolean vidroTraseiroOutro = false;

    private Boolean estruturaColunaDanificada = false;

    private Boolean oculosTrincado = false;

    private Boolean revestimentoExternoChapariaSolto = false;
    private Boolean revestimentoExternoChapariaDanificado = false;

    private Boolean bancosRasgado = false;
    private Boolean bancosSolto = false;
    private Boolean bancosQuebrado = false;
    private Boolean bancosDanificado = false;
    private Boolean bancosFalta = false;

    private Boolean bancosPassageirosRasgado = false;
    private Boolean bancosPassageirosSolto = false;
    private Boolean bancosPassageirosQuebrado = false;
    private Boolean bancosPassageirosDanificado = false;
    private Boolean bancosPassageirosFalta = false;

    private Boolean sistemasPortasMancalNaoFunciona = false;
    private Boolean sistemasPortasMancalQuebrada = false;
    private Boolean sistemasPortasMancalSolta = false;

    private Boolean folhasPortasRevestimentoQuebrada = false;
    private Boolean folhasPortasRevestimentoDanificada = false;
    private Boolean folhasPortasRevestimentoSolta = false;

    private Boolean borrachaPortasFalta = false;
    private Boolean borrachaPortasQuebrada = false;

    private Boolean tampaoPistaoPortasFalta	= false;
    private Boolean tampaoPistaoPortasQuebrada = false;
    private Boolean tampaoPistaoPortasSolta = false;

    private Boolean cilindroPortasVazando = false;
    private Boolean cilindroPortasDanificada = false;
    private Boolean cilindroPortasSolta = false;

    private Boolean janelaLateralMotoristaDanificada = false;
    private Boolean janelaLateralMotoristaEmpenada = false;
    private Boolean janelaLateralMotoristaFalta = false;

    private Boolean quadroJanelaQuebrado = false;
    private Boolean quadroJanelaSolto = false;

    private Boolean separadorLimitadorPuxadorFalta = false;
    private Boolean separadorLimitadorPuxadorDanificado = false;

    private Boolean parachoquePonteiraFalta = false;
    private Boolean parachoquePonteiraSolta = false;
    private Boolean parachoquePonteiraDanificado = false;

    private Boolean espelhosRetrovisoresConvexosFalta =false;
    private Boolean espelhosRetrovisoresConvexosQuebrado = false;
    private Boolean espelhosRetrovisoresConvexosSolto = false;

    private Boolean limpadorParaBrisaNaoFunciona =false;
    private Boolean limpadorParaBrisaFalta = false;

    private Boolean limpezaInterna = false;
    private Boolean limpezaExterna = false;
    private Boolean limpezaInferior = false;

    //Iluminação Interna
    private Boolean caixaItinerarioIluminacaoInsulficiente = false;
    private Boolean caixaItinerarioTampaSolta = false;
    private Boolean caixaItinerarioMecanicaDefeito = false;
    private Boolean caixaItinerariaVidroQuebrado = false;
    private Boolean caixaItinerarioFaltaBorracha = false;

    private Boolean iluminacaoSacaoInternaNaoFunciona = false;
    private Boolean iluminacaoSacaoInternaQuebrada = false;
    private Boolean iluminacaoSacaoInternafalta = false;

    private Boolean solicitacaoParadaLampadaQueimada = false;
    private Boolean solicitacaoParadaSonoroNaoFunciona = false;
    private Boolean solicitacaoParadaSemCordao = false;

    private Boolean iluminacaoSalaoInternaNaoFunciona = false;
    private Boolean iluminacaoSalaoInternaQuebrada = false;
    private Boolean iluminacaoSalaoInternaFalta = false;

    private Boolean luzDegrauFalta = false;
    private Boolean luzDegrauNaoFunciona = false;

    //Posto de Comando
    private Boolean comandoPainelManometroNaoFunciona = false;
    private Boolean comandoPainelVelocimentoNaoFunciona	= false;
    private Boolean comandoPainelLuzesNaoAcende = false;
    private Boolean comandoPainelSistemaVentilacaoNaoFunciona = false;

    private Boolean chaveSetaBuzinaNaoFunciona = false;
    private Boolean chaveSetaBuzinaDanificada = false;
    private Boolean chaveSetaBuzinaFalta = false;

    //Interior do Veiculo
    private Boolean degrausLiso = false;
    private Boolean degrausDanificado = false;

    private Boolean pisoLiso = false;
    private Boolean pisoDanificado = false;

    private Boolean tampaInspecaoSolta = false;
    private Boolean tampaInspecaoDanificada = false;
    private Boolean tampaInspecaoFaltaManutencao = false;

    private Boolean tampaMotorSolta	= false;
    private boolean tampaMotorSemTrava = false;
    private Boolean tampaMotorDanificado = false;
    private Boolean tampaMotorSemVedacao = false;

    private Boolean revestimentoInternoSolto = false;
    private boolean revestimentoInternoDanificada = false;
    private Boolean revestimentoInternoDanificado = false;
    private Boolean revestimentoInternoFaltando = false;
    private Boolean revestimentoInternoIrregular = false;

    private Boolean balaustresSolto = false;
    private Boolean balaustresFalta = false;

    private Boolean derrapanteFalta = false;
    private Boolean derrapanteSolto = false;
    private Boolean derrapanteLiso = false;

    private Boolean postoCobrancaDanificado = false;
    private Boolean postoCobrancaFalta = false;
    private Boolean postoCobrancaSolto = false;

    private Boolean escotilhasCupulasFalta = false;
    private Boolean escotilhasCupulasDanificada = false;
    private Boolean escotilhasCupulasSolta = false;
    private Boolean escotilhasCupulasTrincada = false;

    private Boolean saidaEmergenciaSemIdentificacao = false;
    private Boolean saidaEmergenciaSemLacre = false;
    private Boolean saidaEmergenciaDanificada = false;

    //Iluminação Externa/Sinalização
    private Boolean faroisOculosAlto = false;
    private Boolean faroisOculosBaixo = false;
    private Boolean faroisOculosNaoFunciona = false;
    private Boolean faroisOculosFalta = false;
    private Boolean faroisOculosSolto = false;
    private Boolean faroisOculosQuebrado = false;

    private Boolean luzesSetaEmergenciaDanificada = false;
    private Boolean luzesSetaEmergenciaNaoFunciona = false;
    private Boolean luzesSetaEmergenciaFalta = false;
    private Boolean luzesSetaEmergenciaQuebrada = false;

    private Boolean lanternasLentesDanificada = false;
    private Boolean lanternasLentesNaoFunciona = false;

    private Boolean luzesDelimitadorasVigiasLentesFaltando = false;
    private Boolean luzesDelimitadorasVigiasLentesNaoFunciona = false;

    private Boolean luzFreioLentesDanificada = false;
    private Boolean luzFreioLentesNaoFunciona = false;
    private Boolean luzFreioLentesConservacaoIrregular = false;

    private Boolean brakeLightNaoFunciona = false;
    private Boolean brakeLightFalta = false;
    private Boolean brakeLightConservacaoIrregular = false;

    private Boolean luzReFalta = false;
    private Boolean luzReNaoFunciona = false;
    private Boolean luzReSemLente = false;
    private Boolean luzReConservacaoIrregular = false;

    private Boolean luzPlacaNaoFunciona  = false;
    private Boolean luzPlacaFalta = false;
    private Boolean luzPlacaConservacaoIrregular = false;

    //Sistema Elétrico
    private Boolean partidaNaoFunciona = false;

    //Equipamento de Segurança
    private Boolean extintorIrregular = false;
    private Boolean extintorSuporteQuebrado = false;
    private Boolean extintorSuporteSolto = false;
    private Boolean extintorFalta = false;

    private Boolean trianguloFalta = false;
    private Boolean trianguloDanificado = false;

    //Sistema Carroceria
    private Boolean silenciosoSolto = false;
    private Boolean silenciosoDanificado = false;

    private Boolean tuboDescargaSolto = false;
    private Boolean tuboDescargaFalta = false;
    private Boolean tuboDescargaIrregular = false;

    private Boolean protecaoTuboDescargaFalta = false;
    private Boolean protecaoTuboDescargaSolta = false;

    private Boolean articulacaoSolto = false;
    private Boolean articulacaoFalta = false;
    private Boolean articulacaoRasgado = false;
    private Boolean articulacaoGasto = false;

    private Boolean vazamentoExcessivoMotor = false;
    private Boolean vazamentoExcessivoCambio = false;





    public GrupoB() {
    }

    public void salvar(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Grupo B").push().setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap(){
        HashMap<String, Object> hashMapFichaB = new HashMap<>();

        //hashMapFichaB.put("idFicha",getIdFicha());
        //Sistema Carroceria
        hashMapFichaB.put("parabrisaQuebrado", getParabrisaQuebrado());
        hashMapFichaB.put("parabrisaSolto",getParabrisaSolto());
        hashMapFichaB.put("parabrisaTrincado",getParabrisaTrincado());

        hashMapFichaB.put("vidroTraseiroFalta", getVidroTraseiroFalta());
        hashMapFichaB.put("vidroTraseiroQuebrado", getVidroTraseiroQuebrado());
        hashMapFichaB.put("vidroTraseiroSolto", getVidroTraseiroSolto());
        hashMapFichaB.put("vidroTraseiroTrincado", getVidroTraseiroTrincado());
        hashMapFichaB.put("vidroTraseiroOutro", getVidroTraseiroSolto());

        hashMapFichaB.put("estruturaColunaDanificada", getEstruturaColunaDanificada());

        hashMapFichaB.put("oculosTrincado", getOculosTrincado());

        hashMapFichaB.put("revestimentoExternoChapariaSolto", getRevestimentoExternoChapariaSolto());
        hashMapFichaB.put("revestimentoExternoChapariaDanificado", getRevestimentoExternoChapariaDanificado());

        hashMapFichaB.put("bancosRasgado", getBancosRasgado());
        hashMapFichaB.put("bancosSolto", getBancosSolto());
        hashMapFichaB.put("bancosQuebrado", getBancosQuebrado());
        hashMapFichaB.put("bancosDanificado", getBancosDanificado());
        hashMapFichaB.put("bancosFalta",getBancosFalta());

        hashMapFichaB.put("bancosPassageirosRasgado", getBancosPassageirosRasgado());
        hashMapFichaB.put("bancosPassageirosSolto", getBancosPassageirosSolto());
        hashMapFichaB.put("bancosPassageirosQuebrado", getBancosPassageirosQuebrado());
        hashMapFichaB.put("bancosPassageirosDanificado", getBancosPassageirosDanificado());
        hashMapFichaB.put("bancosPassageirosFalta", getBancosPassageirosFalta());

        hashMapFichaB.put("sistemasPortasMancalNaoFunciona", getSistemasPortasMancalNaoFunciona());
        hashMapFichaB.put("sistemasPortasMancalQuebrada", getSistemasPortasMancalQuebrada());
        hashMapFichaB.put("sistemasPortasMancalSolta", getSistemasPortasMancalSolta());

        hashMapFichaB.put("folhasPortasRevestimentoQuebrada", getFolhasPortasRevestimentoQuebrada());
        hashMapFichaB.put("folhasPortasRevestimentoDanificada", getFolhasPortasRevestimentoDanificada());
        hashMapFichaB.put("folhasPortasRevestimentoSolta", getFolhasPortasRevestimentoSolta());

        hashMapFichaB.put("borrachaPortasFalta", getBorrachaPortasFalta());
        hashMapFichaB.put("borrachaPortasQuebrada", getBorrachaPortasQuebrada());

        hashMapFichaB.put("tampaoPistaoPortasFalta",getTampaoPistaoPortasFalta());
        hashMapFichaB.put("tampaoPistaoPortasQuebrada", getTampaoPistaoPortasQuebrada());
        hashMapFichaB.put("tampaoPistaoPortasSolta", getTampaoPistaoPortasSolta());

        hashMapFichaB.put("cilindroPortasVazando", getCilindroPortasVazando());
        hashMapFichaB.put("cilindroPortasDanificada", getCilindroPortasDanificada());
        hashMapFichaB.put("cilindroPortasSolta", getCilindroPortasSolta());

        hashMapFichaB.put("janelaLateralMotoristaDanificada", getJanelaLateralMotoristaDanificada());
        hashMapFichaB.put("janelaLateralMotoristaEmpenada", getJanelaLateralMotoristaEmpenada());
        hashMapFichaB.put("janelaLateralMotoristaFalta", getJanelaLateralMotoristaFalta());

        hashMapFichaB.put("quadroJanelaQuebrado", getQuadroJanelaQuebrado());
        hashMapFichaB.put("quadroJanelaSolto", getQuadroJanelaSolto());

        hashMapFichaB.put("separadorLimitadorPuxadorFalta", getSeparadorLimitadorPuxadorFalta());
        hashMapFichaB.put("separadorLimitadorPuxadorDanificado",getSeparadorLimitadorPuxadorDanificado());

        hashMapFichaB.put("parachoquePonteiraFalta", getParachoquePonteiraFalta());
        hashMapFichaB.put("parachoquePonteiraSolta", getParachoquePonteiraSolta());
        hashMapFichaB.put("parachoquePonteiraDanificado", getParachoquePonteiraDanificado());

        hashMapFichaB.put("espelhosRetrovisoresConvexosFalta", getEspelhosRetrovisoresConvexosFalta());
        hashMapFichaB.put("espelhosRetrovisoresConvexosQuebrado", getEspelhosRetrovisoresConvexosQuebrado());
        hashMapFichaB.put("espelhosRetrovisoresConvexosSolto", getEspelhosRetrovisoresConvexosSolto());

        hashMapFichaB.put("limpadorParaBrisaNaoFunciona", getLimpadorParaBrisaNaoFunciona());
        hashMapFichaB.put("limpadorParaBrisaFalta",getLimpadorParaBrisaFalta());

        hashMapFichaB.put("limpezaInterna", getLimpezaInterna());
        hashMapFichaB.put("limpezaExterna", getLimpezaExterna());
        hashMapFichaB.put("limpezaInferior", getLimpezaInferior());

        //iluminação Interna
        hashMapFichaB.put("caixaItinerarioIluminacaoInsulficiente", getCaixaItinerarioIluminacaoInsulficiente());
        hashMapFichaB.put("caixaItinerarioTampaSolta",getCaixaItinerarioTampaSolta());
        hashMapFichaB.put("caixaItinerarioMecanicaDefeito",getCaixaItinerarioMecanicaDefeito());
        hashMapFichaB.put("caixaItinerariaVidroQuebrado",getCaixaItinerariaVidroQuebrado());
        hashMapFichaB.put("caixaItinerarioFaltaBorracha",getCaixaItinerarioFaltaBorracha());

        hashMapFichaB.put("iluminacaoSacaoInternaNaoFunciona", getIluminacaoSacaoInternaNaoFunciona());
        hashMapFichaB.put("iluminacaoSacaoInternaQuebrada" , getIluminacaoSacaoInternaQuebrada());
        hashMapFichaB.put("iluminacaoSacaoInternafalta",getIluminacaoSacaoInternafalta());

        hashMapFichaB.put("solicitacaoParadaLampadaQueimada",getSolicitacaoParadaLampadaQueimada());
        hashMapFichaB.put("solicitacaoParadaSonoroNaoFunciona", getSolicitacaoParadaSonoroNaoFunciona());
        hashMapFichaB.put("solicitacaoParadaSemCordao",getSolicitacaoParadaSemCordao());

        hashMapFichaB.put("iluminacaoSalaoInternaNaoFunciona",getIluminacaoSalaoInternaNaoFunciona());
        hashMapFichaB.put("iluminacaoSalaoInternaQuebrada", getIluminacaoSalaoInternaQuebrada());
        hashMapFichaB.put("iluminacaoSalaoInternaFalta",getIluminacaoSalaoInternaFalta());

        hashMapFichaB.put("luzDegrauFalta", getLuzDegrauFalta());
        hashMapFichaB.put("luzDegrauNaoFunciona", getLuzDegrauNaoFunciona());

        //Posto de Comando
        hashMapFichaB.put("comandoPainelManometroNaoFunciona", getComandoPainelManometroNaoFunciona());
        hashMapFichaB.put("comandoPainelVelocimentoNaoFunciona", getComandoPainelVelocimentoNaoFunciona());
        hashMapFichaB.put("comandoPainelLuzesNaoAcende", getComandoPainelLuzesNaoAcende());
        hashMapFichaB.put("comandoPainelSistemaVentilacaoNaoFunciona", getComandoPainelSistemaVentilacaoNaoFunciona());

        hashMapFichaB.put("chaveSetaBuzinaNaoFunciona", getChaveSetaBuzinaNaoFunciona());
        hashMapFichaB.put("chaveSetaBuzinaDanificada", getChaveSetaBuzinaDanificada());
        hashMapFichaB.put("chaveSetaBuzinaFalta", getChaveSetaBuzinaFalta());

        //Interior do Veiculo
        hashMapFichaB.put("degrausLiso", getDegrausLiso());
        hashMapFichaB.put("degrausDanificado", getDegrausDanificado());

        hashMapFichaB.put("pisoLiso", getPisoLiso());
        hashMapFichaB.put("pisoDanificado", getPisoDanificado());

        hashMapFichaB.put("tampaInspecaoSolta", getTampaInspecaoSolta());
        hashMapFichaB.put("tampaInspecaoDanificada", getTampaInspecaoDanificada());
        hashMapFichaB.put("tampaInspecaoFaltaManutencao", getTampaInspecaoFaltaManutencao());

        hashMapFichaB.put("tampaMotorSolta", getTampaMotorSolta());
        hashMapFichaB.put("tampaMotorSemTrava", getTampaMotorSemTrava());
        hashMapFichaB.put("tampaMotorDanificado", getTampaMotorDanificado());
        hashMapFichaB.put("tampaMotorSemVedacao", getTampaMotorSemVedacao());

        hashMapFichaB.put("revestimentoInternoSolto", getRevestimentoInternoSolto());
        hashMapFichaB.put("revestimentoInternoDanificada", getRevestimentoInternoDanificada());
        hashMapFichaB.put("revestimentoInternoDanificado", getRevestimentoInternoDanificado());
        hashMapFichaB.put("revestimentoInternoFaltando",getRevestimentoInternoFaltando());
        hashMapFichaB.put("revestimentoInternoIrregular", getRevestimentoInternoIrregular());

        hashMapFichaB.put("balaustresSolto", getBalaustresSolto());
        hashMapFichaB.put("balaustresFalta", getBalaustresFalta());

        hashMapFichaB.put("derrapanteFalta", getDerrapanteFalta());
        hashMapFichaB.put("derrapanteSolto", getDerrapanteSolto());
        hashMapFichaB.put("derrapanteLiso", getDerrapanteLiso());

        hashMapFichaB.put("postoCobrancaDanificado", getPostoCobrancaDanificado());
        hashMapFichaB.put("postoCobrancaFalta", getPostoCobrancaFalta());
        hashMapFichaB.put("postoCobrancaSolto", getPostoCobrancaSolto());

        hashMapFichaB.put("escotilhasCupulasFalta", getEscotilhasCupulasFalta());
        hashMapFichaB.put("escotilhasCupulasDanificada", getEscotilhasCupulasDanificada());
        hashMapFichaB.put("escotilhasCupulasSolta", getEscotilhasCupulasSolta());
        hashMapFichaB.put("escotilhasCupulasTrincada",getEscotilhasCupulasTrincada());

        hashMapFichaB.put("saidaEmergenciaSemIdentificacao",getSaidaEmergenciaSemIdentificacao());
        hashMapFichaB.put("saidaEmergenciaSemLacre",getSaidaEmergenciaSemLacre());
        hashMapFichaB.put("saidaEmergenciaDanificada",getSaidaEmergenciaDanificada());

        //Iluminação Externa/Sinalização
        hashMapFichaB.put("faroisOculosAlto",getFaroisOculosAlto());
        hashMapFichaB.put("faroisOculosBaixo",getFaroisOculosBaixo());
        hashMapFichaB.put("faroisOculosNaoFunciona",getFaroisOculosNaoFunciona());
        hashMapFichaB.put("faroisOculosFalta",getFaroisOculosFalta());
        hashMapFichaB.put("faroisOculosSolto",getFaroisOculosSolto());
        hashMapFichaB.put("faroisOculosQuebrado",getFaroisOculosQuebrado());

        hashMapFichaB.put("luzesSetaEmergenciaDanificada",getLuzesSetaEmergenciaDanificada());
        hashMapFichaB.put("luzesSetaEmergenciaNaoFunciona",getLuzesSetaEmergenciaNaoFunciona());
        hashMapFichaB.put("luzesSetaEmergenciaFalta",getLuzesSetaEmergenciaFalta());
        hashMapFichaB.put("luzesSetaEmergenciaQuebrada",getLuzesSetaEmergenciaQuebrada());

        hashMapFichaB.put("lanternasLentesDanificada",getLanternasLentesDanificada());
        hashMapFichaB.put("lanternasLentesNaoFunciona",getLanternasLentesNaoFunciona());

        hashMapFichaB.put("luzesDelimitadorasVigiasLentesFaltando",getLuzesDelimitadorasVigiasLentesFaltando());
        hashMapFichaB.put("luzesDelimitadorasVigiasLentesNaoFunciona",getLuzesDelimitadorasVigiasLentesNaoFunciona());

        hashMapFichaB.put("luzFreioLentesDanificada", getLuzFreioLentesDanificada());
        hashMapFichaB.put("luzFreioLentesNaoFunciona",getLuzFreioLentesNaoFunciona());
        hashMapFichaB.put("luzFreioLentesConservacaoIrregular",getLuzFreioLentesConservacaoIrregular());

        hashMapFichaB.put("brakeLightNaoFunciona",getBrakeLightNaoFunciona());
        hashMapFichaB.put("brakeLightFalta",getBrakeLightFalta());
        hashMapFichaB.put("brakeLightConservacaoIrregular",getBrakeLightConservacaoIrregular());

        hashMapFichaB.put("luzReFalta",getLuzReFalta());
        hashMapFichaB.put("luzReNaoFunciona", getLuzReNaoFunciona());
        hashMapFichaB.put("luzReSemLente",getLuzReSemLente());

        hashMapFichaB.put("luzPlacaNaoFunciona",getLuzPlacaNaoFunciona());
        hashMapFichaB.put("luzPlacaFalta",getLuzPlacaFalta());
        hashMapFichaB.put("luzPlacaConservacaoIrregular",getLuzPlacaConservacaoIrregular());

        //Sistema Elétrico
        hashMapFichaB.put("partidaNaoFunciona",getPartidaNaoFunciona());

        //Equipamento de Segurança
        hashMapFichaB.put("extintorIrregular", getExtintorIrregular());
        hashMapFichaB.put("extintorSuporteQuebrado",getExtintorSuporteQuebrado());
        hashMapFichaB.put("extintorSuporteSolto",getExtintorSuporteSolto());
        hashMapFichaB.put("extintorFalta",getExtintorSuporteSolto());

        hashMapFichaB.put("trianguloFalta",getTrianguloFalta());
        hashMapFichaB.put("trianguloDanificado",getTrianguloDanificado());

        //Sistema Carroceria
        hashMapFichaB.put("silenciosoSolto",getSilenciosoSolto());
        hashMapFichaB.put("silenciosoDanificado",getSilenciosoDanificado());

        hashMapFichaB.put("tuboDescargaSolto",getTuboDescargaSolto());
        hashMapFichaB.put("tuboDescargaFalta",getTuboDescargaFalta());
        hashMapFichaB.put("tuboDescargaIrregular",getTuboDescargaIrregular());

        hashMapFichaB.put("protecaoTuboDescargaFalta",getProtecaoTuboDescargaFalta());
        hashMapFichaB.put("protecaoTuboDescargaSolta",getProtecaoTuboDescargaSolta());

        hashMapFichaB.put("articulacaoSolto",getArticulacaoSolto());
        hashMapFichaB.put("articulacaoFalta",getArticulacaoFalta());
        hashMapFichaB.put("articulacaoRasgado",getArticulacaoRasgado());
        hashMapFichaB.put("articulacaoGasto",getArticulacaoGasto());

        hashMapFichaB.put("vazamentoExcessivoMotor",getVazamentoExcessivoMotor());
        hashMapFichaB.put("vazamentoExcessivoCambio",getVazamentoExcessivoCambio());





        return hashMapFichaB;
    }


    public Long getIdFicha(){
        return idFicha;
    }

    public void setIdFicha(Long idFicha){
        this.idFicha=idFicha;
    }


    public Boolean getParabrisaQuebrado() {
        return parabrisaQuebrado;
    }

    public void setParabrisaQuebrado(Boolean parabrisaQuebrado) {
        this.parabrisaQuebrado = parabrisaQuebrado;
    }

    public Boolean getParabrisaSolto() {
        return parabrisaSolto;
    }

    public void setParabrisaSolto(Boolean parabrisaSolto) {
        this.parabrisaSolto = parabrisaSolto;
    }

    public Boolean getParabrisaTrincado() {
        return parabrisaTrincado;
    }

    public void setParabrisaTrincado(Boolean parabrisaTrincado) {
        this.parabrisaTrincado = parabrisaTrincado;
    }

    public Boolean getVidroTraseiroFalta() {
        return vidroTraseiroFalta;
    }

    public void setVidroTraseiroFalta(Boolean vidroTraseiroFalta) {
        this.vidroTraseiroFalta = vidroTraseiroFalta;
    }

    public Boolean getVidroTraseiroQuebrado() {
        return vidroTraseiroQuebrado;
    }

    public void setVidroTraseiroQuebrado(Boolean vidroTraseiroQuebrado) {
        this.vidroTraseiroQuebrado = vidroTraseiroQuebrado;
    }

    public Boolean getVidroTraseiroSolto() {
        return vidroTraseiroSolto;
    }

    public void setVidroTraseiroSolto(Boolean vidroTraseiroSolto) {
        this.vidroTraseiroSolto = vidroTraseiroSolto;
    }

    public Boolean getVidroTraseiroTrincado() {
        return vidroTraseiroTrincado;
    }

    public void setVidroTraseiroTrincado(Boolean vidroTraseiroTrincado) {
        this.vidroTraseiroTrincado = vidroTraseiroTrincado;
    }

    public Boolean getVidroTraseiroOutro() {
        return vidroTraseiroOutro;
    }

    public void setVidroTraseiroOutro(Boolean vidroTraseiroOutro) {
        this.vidroTraseiroOutro = vidroTraseiroOutro;
    }

    public Boolean getEstruturaColunaDanificada() {
        return estruturaColunaDanificada;
    }

    public void setEstruturaColunaDanificada(Boolean estruturaColunaDanificada) {
        this.estruturaColunaDanificada = estruturaColunaDanificada;
    }

    public Boolean getOculosTrincado() {
        return oculosTrincado;
    }

    public void setOculosTrincado(Boolean oculosTrincado) {
        this.oculosTrincado = oculosTrincado;
    }

    public Boolean getRevestimentoExternoChapariaSolto() {
        return revestimentoExternoChapariaSolto;
    }

    public void setRevestimentoExternoChapariaSolto(Boolean revestimentoExternoChapariaSolto) {
        this.revestimentoExternoChapariaSolto = revestimentoExternoChapariaSolto;
    }

    public Boolean getRevestimentoExternoChapariaDanificado() {
        return revestimentoExternoChapariaDanificado;
    }

    public void setRevestimentoExternoChapariaDanificado(Boolean revestimentoExternoChapariaDanificado) {
        this.revestimentoExternoChapariaDanificado = revestimentoExternoChapariaDanificado;
    }

    public Boolean getBancosRasgado() {
        return bancosRasgado;
    }

    public void setBancosRasgado(Boolean bancosRasgado) {
        this.bancosRasgado = bancosRasgado;
    }

    public Boolean getBancosSolto() {
        return bancosSolto;
    }

    public void setBancosSolto(Boolean bancosSolto) {
        this.bancosSolto = bancosSolto;
    }

    public Boolean getBancosQuebrado() {
        return bancosQuebrado;
    }

    public void setBancosQuebrado(Boolean bancosQuebrado) {
        this.bancosQuebrado = bancosQuebrado;
    }

    public Boolean getBancosDanificado() {
        return bancosDanificado;
    }

    public void setBancosDanificado(Boolean bancosDanificado) {
        this.bancosDanificado = bancosDanificado;
    }

    public Boolean getBancosFalta() {
        return bancosFalta;
    }

    public void setBancosFalta(Boolean bancosFalta) {
        this.bancosFalta = bancosFalta;
    }

    public Boolean getBancosPassageirosRasgado() {
        return bancosPassageirosRasgado;
    }

    public void setBancosPassageirosRasgado(Boolean bancosPassageirosRasgado) {
        this.bancosPassageirosRasgado = bancosPassageirosRasgado;
    }

    public Boolean getBancosPassageirosSolto() {
        return bancosPassageirosSolto;
    }

    public void setBancosPassageirosSolto(Boolean bancosPassageirosSolto) {
        this.bancosPassageirosSolto = bancosPassageirosSolto;
    }

    public Boolean getBancosPassageirosQuebrado() {
        return bancosPassageirosQuebrado;
    }

    public void setBancosPassageirosQuebrado(Boolean bancosPassageirosQuebrado) {
        this.bancosPassageirosQuebrado = bancosPassageirosQuebrado;
    }

    public Boolean getBancosPassageirosDanificado() {
        return bancosPassageirosDanificado;
    }

    public void setBancosPassageirosDanificado(Boolean bancosPassageirosDanificado) {
        this.bancosPassageirosDanificado = bancosPassageirosDanificado;
    }

    public Boolean getBancosPassageirosFalta() {
        return bancosPassageirosFalta;
    }

    public void setBancosPassageirosFalta(Boolean bancosPassageirosFalta) {
        this.bancosPassageirosFalta = bancosPassageirosFalta;
    }

    public Boolean getSistemasPortasMancalNaoFunciona() {
        return sistemasPortasMancalNaoFunciona;
    }

    public void setSistemasPortasMancalNaoFunciona(Boolean sistemasPortasMancalNaoFunciona) {
        this.sistemasPortasMancalNaoFunciona = sistemasPortasMancalNaoFunciona;
    }

    public Boolean getSistemasPortasMancalQuebrada() {
        return sistemasPortasMancalQuebrada;
    }

    public void setSistemasPortasMancalQuebrada(Boolean sistemasPortasMancalQuebrada) {
        this.sistemasPortasMancalQuebrada = sistemasPortasMancalQuebrada;
    }

    public Boolean getSistemasPortasMancalSolta() {
        return sistemasPortasMancalSolta;
    }

    public void setSistemasPortasMancalSolta(Boolean sistemasPortasMancalSolta) {
        this.sistemasPortasMancalSolta = sistemasPortasMancalSolta;
    }

    public Boolean getFolhasPortasRevestimentoQuebrada() {
        return folhasPortasRevestimentoQuebrada;
    }

    public void setFolhasPortasRevestimentoQuebrada(Boolean folhasPortasRevestimentoQuebrada) {
        this.folhasPortasRevestimentoQuebrada = folhasPortasRevestimentoQuebrada;
    }

    public Boolean getFolhasPortasRevestimentoDanificada() {
        return folhasPortasRevestimentoDanificada;
    }

    public void setFolhasPortasRevestimentoDanificada(Boolean folhasPortasRevestimentoDanificada) {
        this.folhasPortasRevestimentoDanificada = folhasPortasRevestimentoDanificada;
    }

    public Boolean getFolhasPortasRevestimentoSolta() {
        return folhasPortasRevestimentoSolta;
    }

    public void setFolhasPortasRevestimentoSolta(Boolean folhasPortasRevestimentoSolta) {
        this.folhasPortasRevestimentoSolta = folhasPortasRevestimentoSolta;
    }

    public Boolean getBorrachaPortasFalta() {
        return borrachaPortasFalta;
    }

    public void setBorrachaPortasFalta(Boolean borrachaPortasFalta) {
        this.borrachaPortasFalta = borrachaPortasFalta;
    }

    public Boolean getBorrachaPortasQuebrada() {
        return borrachaPortasQuebrada;
    }

    public void setBorrachaPortasQuebrada(Boolean borrachaPortasQuebrada) {
        this.borrachaPortasQuebrada = borrachaPortasQuebrada;
    }

    public Boolean getTampaoPistaoPortasFalta() {
        return tampaoPistaoPortasFalta;
    }

    public void setTampaoPistaoPortasFalta(Boolean tampaoPistaoPortasFalta) {
        this.tampaoPistaoPortasFalta = tampaoPistaoPortasFalta;
    }

    public Boolean getTampaoPistaoPortasQuebrada() {
        return tampaoPistaoPortasQuebrada;
    }

    public void setTampaoPistaoPortasQuebrada(Boolean tampaoPistaoPortasQuebrada) {
        this.tampaoPistaoPortasQuebrada = tampaoPistaoPortasQuebrada;
    }

    public Boolean getTampaoPistaoPortasSolta() {
        return tampaoPistaoPortasSolta;
    }

    public void setTampaoPistaoPortasSolta(Boolean tampaoPistaoPortasSolta) {
        this.tampaoPistaoPortasSolta = tampaoPistaoPortasSolta;
    }

    public Boolean getCilindroPortasVazando() {
        return cilindroPortasVazando;
    }

    public void setCilindroPortasVazando(Boolean cilindroPortasVazando) {
        this.cilindroPortasVazando = cilindroPortasVazando;
    }

    public Boolean getCilindroPortasDanificada() {
        return cilindroPortasDanificada;
    }

    public void setCilindroPortasDanificada(Boolean cilindroPortasDanificada) {
        this.cilindroPortasDanificada = cilindroPortasDanificada;
    }

    public Boolean getCilindroPortasSolta() {
        return cilindroPortasSolta;
    }

    public void setCilindroPortasSolta(Boolean cilindroPortasSolta) {
        this.cilindroPortasSolta = cilindroPortasSolta;
    }

    public Boolean getJanelaLateralMotoristaDanificada() {
        return janelaLateralMotoristaDanificada;
    }

    public void setJanelaLateralMotoristaDanificada(Boolean janelaLateralMotoristaDanificada) {
        this.janelaLateralMotoristaDanificada = janelaLateralMotoristaDanificada;
    }

    public Boolean getJanelaLateralMotoristaEmpenada() {
        return janelaLateralMotoristaEmpenada;
    }

    public void setJanelaLateralMotoristaEmpenada(Boolean janelaLateralMotoristaEmpenada) {
        this.janelaLateralMotoristaEmpenada = janelaLateralMotoristaEmpenada;
    }

    public Boolean getJanelaLateralMotoristaFalta() {
        return janelaLateralMotoristaFalta;
    }

    public void setJanelaLateralMotoristaFalta(Boolean janelaLateralMotoristaFalta) {
        this.janelaLateralMotoristaFalta = janelaLateralMotoristaFalta;
    }

    public Boolean getQuadroJanelaQuebrado() {
        return quadroJanelaQuebrado;
    }

    public void setQuadroJanelaQuebrado(Boolean quadroJanelaQuebrado) {
        this.quadroJanelaQuebrado = quadroJanelaQuebrado;
    }

    public Boolean getQuadroJanelaSolto() {
        return quadroJanelaSolto;
    }

    public void setQuadroJanelaSolto(Boolean quadroJanelaSolto) {
        this.quadroJanelaSolto = quadroJanelaSolto;
    }

    public Boolean getSeparadorLimitadorPuxadorFalta() {
        return separadorLimitadorPuxadorFalta;
    }

    public void setSeparadorLimitadorPuxadorFalta(Boolean separadorLimitadorPuxadorFalta) {
        this.separadorLimitadorPuxadorFalta = separadorLimitadorPuxadorFalta;
    }

    public Boolean getSeparadorLimitadorPuxadorDanificado() {
        return separadorLimitadorPuxadorDanificado;
    }

    public void setSeparadorLimitadorPuxadorDanificado(Boolean separadorLimitadorPuxadorDanificado) {
        this.separadorLimitadorPuxadorDanificado = separadorLimitadorPuxadorDanificado;
    }

    public Boolean getParachoquePonteiraFalta() {
        return parachoquePonteiraFalta;
    }

    public void setParachoquePonteiraFalta(Boolean parachoquePonteiraFalta) {
        this.parachoquePonteiraFalta = parachoquePonteiraFalta;
    }

    public Boolean getParachoquePonteiraSolta() {
        return parachoquePonteiraSolta;
    }

    public void setParachoquePonteiraSolta(Boolean parachoquePonteiraSolta) {
        this.parachoquePonteiraSolta = parachoquePonteiraSolta;
    }

    public Boolean getParachoquePonteiraDanificado() {
        return parachoquePonteiraDanificado;
    }

    public void setParachoquePonteiraDanificado(Boolean parachoquePonteiraDanificado) {
        this.parachoquePonteiraDanificado = parachoquePonteiraDanificado;
    }

    public Boolean getEspelhosRetrovisoresConvexosFalta() {
        return espelhosRetrovisoresConvexosFalta;
    }

    public void setEspelhosRetrovisoresConvexosFalta(Boolean espelhosRetrovisoresConvexosFalta) {
        this.espelhosRetrovisoresConvexosFalta = espelhosRetrovisoresConvexosFalta;
    }

    public Boolean getEspelhosRetrovisoresConvexosQuebrado() {
        return espelhosRetrovisoresConvexosQuebrado;
    }

    public void setEspelhosRetrovisoresConvexosQuebrado(Boolean espelhosRetrovisoresConvexosQuebrado) {
        this.espelhosRetrovisoresConvexosQuebrado = espelhosRetrovisoresConvexosQuebrado;
    }

    public Boolean getEspelhosRetrovisoresConvexosSolto() {
        return espelhosRetrovisoresConvexosSolto;
    }

    public void setEspelhosRetrovisoresConvexosSolto(Boolean espelhosRetrovisoresConvexosSolto) {
        this.espelhosRetrovisoresConvexosSolto = espelhosRetrovisoresConvexosSolto;
    }

    public Boolean getLimpadorParaBrisaNaoFunciona() {
        return limpadorParaBrisaNaoFunciona;
    }

    public void setLimpadorParaBrisaNaoFunciona(Boolean limpadorParaBrisaNaoFunciona) {
        this.limpadorParaBrisaNaoFunciona = limpadorParaBrisaNaoFunciona;
    }

    public Boolean getLimpadorParaBrisaFalta() {
        return limpadorParaBrisaFalta;
    }

    public void setLimpadorParaBrisaFalta(Boolean limpadorParaBrisaFalta) {
        this.limpadorParaBrisaFalta = limpadorParaBrisaFalta;
    }

    public Boolean getLimpezaInterna() {
        return limpezaInterna;
    }

    public void setLimpezaInterna(Boolean limpezaInterna) {
        this.limpezaInterna = limpezaInterna;
    }

    public Boolean getLimpezaExterna() {
        return limpezaExterna;
    }

    public void setLimpezaExterna(Boolean limpezaExterna) {
        this.limpezaExterna = limpezaExterna;
    }

    public Boolean getLimpezaInferior() {
        return limpezaInferior;
    }

    public void setLimpezaInferior(Boolean limpezaInferior) {
        this.limpezaInferior = limpezaInferior;
    }

    public Boolean getCaixaItinerarioIluminacaoInsulficiente() {
        return caixaItinerarioIluminacaoInsulficiente;
    }

    public void setCaixaItinerarioIluminacaoInsulficiente(Boolean caixaItinerarioIluminacaoInsulficiente) {
        this.caixaItinerarioIluminacaoInsulficiente = caixaItinerarioIluminacaoInsulficiente;
    }

    public Boolean getCaixaItinerarioTampaSolta() {
        return caixaItinerarioTampaSolta;
    }

    public void setCaixaItinerarioTampaSolta(Boolean caixaItinerarioTampaSolta) {
        this.caixaItinerarioTampaSolta = caixaItinerarioTampaSolta;
    }

    public Boolean getCaixaItinerariaVidroQuebrado() {
        return caixaItinerariaVidroQuebrado;
    }

    public void setCaixaItinerariaVidroQuebrado(Boolean caixaItinerariaVidroQuebrado) {
        this.caixaItinerariaVidroQuebrado = caixaItinerariaVidroQuebrado;
    }

    public Boolean getCaixaItinerarioMecanicaDefeito() {
        return caixaItinerarioMecanicaDefeito;
    }

    public void setCaixaItinerarioMecanicaDefeito(Boolean caixaItinerarioMecanicaDefeito) {
        this.caixaItinerarioMecanicaDefeito = caixaItinerarioMecanicaDefeito;
    }

    public Boolean getCaixaItinerarioFaltaBorracha() {
        return caixaItinerarioFaltaBorracha;
    }

    public void setCaixaItinerarioFaltaBorracha(Boolean caixaItinerarioFaltaBorracha) {
        this.caixaItinerarioFaltaBorracha = caixaItinerarioFaltaBorracha;
    }

    public Boolean getIluminacaoSacaoInternaNaoFunciona() {
        return iluminacaoSacaoInternaNaoFunciona;
    }

    public void setIluminacaoSacaoInternaNaoFunciona(Boolean iluminacaoSacaoInternaNaoFunciona) {
        this.iluminacaoSacaoInternaNaoFunciona = iluminacaoSacaoInternaNaoFunciona;
    }

    public Boolean getIluminacaoSacaoInternaQuebrada() {
        return iluminacaoSacaoInternaQuebrada;
    }

    public void setIluminacaoSacaoInternaQuebrada(Boolean iluminacaoSacaoInternaQuebrada) {
        this.iluminacaoSacaoInternaQuebrada = iluminacaoSacaoInternaQuebrada;
    }

    public Boolean getIluminacaoSacaoInternafalta() {
        return iluminacaoSacaoInternafalta;
    }

    public void setIluminacaoSacaoInternafalta(Boolean iluminacaoSacaoInternafalta) {
        this.iluminacaoSacaoInternafalta = iluminacaoSacaoInternafalta;
    }

    public Boolean getSolicitacaoParadaLampadaQueimada() {
        return solicitacaoParadaLampadaQueimada;
    }

    public void setSolicitacaoParadaLampadaQueimada(Boolean solicitacaoParadaLampadaQueimada) {
        this.solicitacaoParadaLampadaQueimada = solicitacaoParadaLampadaQueimada;
    }

    public Boolean getSolicitacaoParadaSonoroNaoFunciona() {
        return solicitacaoParadaSonoroNaoFunciona;
    }

    public void setSolicitacaoParadaSonoroNaoFunciona(Boolean solicitacaoParadaSonoroNaoFunciona) {
        this.solicitacaoParadaSonoroNaoFunciona = solicitacaoParadaSonoroNaoFunciona;
    }

    public Boolean getSolicitacaoParadaSemCordao() {
        return solicitacaoParadaSemCordao;
    }

    public void setSolicitacaoParadaSemCordao(Boolean solicitacaoParadaSemCordao) {
        this.solicitacaoParadaSemCordao = solicitacaoParadaSemCordao;
    }


    public Boolean getIluminacaoSalaoInternaNaoFunciona() {
        return iluminacaoSalaoInternaNaoFunciona;
    }

    public void setIluminacaoSalaoInternaNaoFunciona(Boolean iluminacaoSalaoInternaNaoFunciona) {
        this.iluminacaoSalaoInternaNaoFunciona = iluminacaoSalaoInternaNaoFunciona;
    }

    public Boolean getIluminacaoSalaoInternaQuebrada() {
        return iluminacaoSalaoInternaNaoFunciona;
    }

    public void setIluminacaoSalaoInternaQuebrada(Boolean iluminacaoSalaoInternaQuebrada) {
        this.iluminacaoSalaoInternaQuebrada = iluminacaoSalaoInternaQuebrada;
    }

    public Boolean getIluminacaoSalaoInternaFalta() {
        return iluminacaoSalaoInternaFalta;
    }

    public void setIluminacaoSalaoInternaFalta(Boolean iluminacaoSalaoInternaFalta) {
        this.iluminacaoSalaoInternaFalta = iluminacaoSalaoInternaFalta;
    }


    public Boolean getLuzDegrauFalta() {
        return luzDegrauFalta;
    }

    public void setLuzDegrauFalta(Boolean luzDegrauFalta) {
        this.luzDegrauFalta = luzDegrauFalta;
    }

    public Boolean getLuzDegrauNaoFunciona() {
        return luzDegrauNaoFunciona;
    }

    public void setLuzDegrauNaoFunciona(Boolean luzDegrauNaoFunciona) {
        this.luzDegrauNaoFunciona = luzDegrauNaoFunciona;
    }

    public Boolean getComandoPainelManometroNaoFunciona() {
        return comandoPainelManometroNaoFunciona;
    }

    public void setComandoPainelManometroNaoFunciona(Boolean comandoPainelManometroNaoFunciona) {
        this.comandoPainelManometroNaoFunciona = comandoPainelManometroNaoFunciona;
    }

    public Boolean getComandoPainelVelocimentoNaoFunciona() {
        return comandoPainelVelocimentoNaoFunciona;
    }

    public void setComandoPainelVelocimentoNaoFunciona(Boolean comandoPainelVelocimentoNaoFunciona) {
        this.comandoPainelVelocimentoNaoFunciona = comandoPainelVelocimentoNaoFunciona;
    }

    public Boolean getComandoPainelLuzesNaoAcende() {
        return comandoPainelLuzesNaoAcende;
    }

    public void setComandoPainelLuzesNaoAcende(Boolean comandoPainelLuzesNaoAcende) {
        this.comandoPainelLuzesNaoAcende = comandoPainelLuzesNaoAcende;
    }

    public Boolean getComandoPainelSistemaVentilacaoNaoFunciona() {
        return comandoPainelSistemaVentilacaoNaoFunciona;
    }

    public void setComandoPainelSistemaVentilacaoNaoFunciona(Boolean comandoPainelSistemaVentilacaoNaoFunciona) {
        this.comandoPainelSistemaVentilacaoNaoFunciona = comandoPainelSistemaVentilacaoNaoFunciona;
    }

    public Boolean getChaveSetaBuzinaNaoFunciona() {
        return chaveSetaBuzinaNaoFunciona;
    }

    public void setChaveSetaBuzinaNaoFunciona(Boolean chaveSetaBuzinaNaoFunciona) {
        this.chaveSetaBuzinaNaoFunciona = chaveSetaBuzinaNaoFunciona;
    }

    public Boolean getChaveSetaBuzinaDanificada() {
        return chaveSetaBuzinaDanificada;
    }

    public void setChaveSetaBuzinaDanificada(Boolean chaveSetaBuzinaDanificada) {
        this.chaveSetaBuzinaDanificada = chaveSetaBuzinaDanificada;
    }

    public Boolean getChaveSetaBuzinaFalta() {
        return chaveSetaBuzinaFalta;
    }

    public void setChaveSetaBuzinaFalta(Boolean chaveSetaBuzinaFalta) {
        this.chaveSetaBuzinaFalta = chaveSetaBuzinaFalta;
    }

    public Boolean getDegrausLiso() {
        return degrausLiso;
    }

    public void setDegrausLiso(Boolean degrausLiso) {
        this.degrausLiso = degrausLiso;
    }

    public Boolean getDegrausDanificado() {
        return degrausDanificado;
    }

    public void setDegrausDanificado(Boolean degrausDanificado) {
        this.degrausDanificado = degrausDanificado;
    }

    public Boolean getPisoLiso() {
        return pisoLiso;
    }

    public void setPisoLiso(Boolean pisoLiso) {
        this.pisoLiso = pisoLiso;
    }

    public Boolean getPisoDanificado() {
        return pisoDanificado;
    }

    public void setPisoDanificado(Boolean pisoDanificado) {
        this.pisoDanificado = pisoDanificado;
    }

    public Boolean getTampaInspecaoSolta() {
        return tampaInspecaoSolta;
    }

    public void setTampaInspecaoSolta(Boolean tampaInspecaoSolta) {
        this.tampaInspecaoSolta = tampaInspecaoSolta;
    }

    public Boolean getTampaInspecaoDanificada() {
        return tampaInspecaoDanificada;
    }

    public void setTampaInspecaoDanificada(Boolean tampaInspecaoDanificada) {
        this.tampaInspecaoDanificada = tampaInspecaoDanificada;
    }

    public Boolean getTampaInspecaoFaltaManutencao() {
        return tampaInspecaoFaltaManutencao;
    }

    public void setTampaInspecaoFaltaManutencao(Boolean tampaInspecaoFaltaManutencao) {
        this.tampaInspecaoFaltaManutencao = tampaInspecaoFaltaManutencao;
    }

    public Boolean getTampaMotorSolta() {
        return tampaMotorSolta;
    }

    public void setTampaMotorSolta(Boolean tampaMotorSolta) {
        this.tampaMotorSolta = tampaMotorSolta;
    }


    public Boolean getTampaMotorSemTrava() {
        return tampaMotorSemTrava;
    }

    public void setTampaMotorSemTrava(Boolean tampaMotorSemTrava) {
        this.tampaMotorSemTrava = tampaMotorSemTrava;
    }

    public Boolean getTampaMotorDanificado() {
        return tampaMotorDanificado;
    }

    public void setTampaMotorDanificado(Boolean tampaMotorDanificado) {
        this.tampaMotorDanificado = tampaMotorDanificado;
    }

    public Boolean getTampaMotorSemVedacao() {
        return tampaMotorSemVedacao;
    }

    public void setTampaMotorSemVedacao(Boolean tampaMotorSemVedacao) {
        this.tampaMotorSemVedacao = tampaMotorSemVedacao;
    }

    public Boolean getRevestimentoInternoSolto() {
        return revestimentoInternoSolto;
    }

    public void setRevestimentoInternoSolto(Boolean revestimentoInternoSolto) {
        this.revestimentoInternoSolto = revestimentoInternoSolto;
    }

    public Boolean getRevestimentoInternoDanificada() {
        return revestimentoInternoDanificada;
    }

    public void setRevestimentoInternoDanificada(Boolean revestimentoInternoDanificada) {
        this.revestimentoInternoDanificada = revestimentoInternoDanificada;
    }

    public Boolean getRevestimentoInternoDanificado() {
        return revestimentoInternoDanificado;
    }

    public void setRevestimentoInternoDanificado(Boolean revestimentoInternoDanificado) {
        this.revestimentoInternoDanificado = revestimentoInternoDanificado;
    }

    public Boolean getRevestimentoInternoFaltando() {
        return revestimentoInternoFaltando;
    }

    public void setRevestimentoInternoFaltando(Boolean revestimentoInternoFaltando) {
        this.revestimentoInternoFaltando = revestimentoInternoFaltando;
    }

    public Boolean getRevestimentoInternoIrregular() {
        return revestimentoInternoIrregular;
    }

    public void setRevestimentoInternoIrregular(Boolean revestimentoInternoIrregular) {
        this.revestimentoInternoIrregular = revestimentoInternoIrregular;
    }

    public Boolean getBalaustresSolto() {
        return balaustresSolto;
    }

    public void setBalaustresSolto(Boolean balaustresSolto) {
        this.balaustresSolto = balaustresSolto;
    }

    public Boolean getBalaustresFalta() {
        return balaustresFalta;
    }

    public void setBalaustresFalta(Boolean balaustresFalta) {
        this.balaustresFalta = balaustresFalta;
    }

    public Boolean getDerrapanteFalta() {
        return derrapanteFalta;
    }

    public void setDerrapanteFalta(Boolean derrapanteFalta) {
        this.derrapanteFalta = derrapanteFalta;
    }

    public Boolean getDerrapanteSolto() {
        return derrapanteSolto;
    }

    public void setDerrapanteSolto(Boolean derrapanteSolto) {
        this.derrapanteSolto = derrapanteSolto;
    }

    public Boolean getDerrapanteLiso() {
        return derrapanteLiso;
    }

    public void setDerrapanteLiso(Boolean derrapanteLiso) {
        this.derrapanteLiso = derrapanteLiso;
    }

    public Boolean getPostoCobrancaDanificado() {
        return postoCobrancaDanificado;
    }

    public void setPostoCobrancaDanificado(Boolean postoCobrancaDanificado) {
        this.postoCobrancaDanificado = postoCobrancaDanificado;
    }

    public Boolean getPostoCobrancaFalta() {
        return postoCobrancaFalta;
    }

    public void setPostoCobrancaFalta(Boolean postoCobrancaFalta) {
        this.postoCobrancaFalta = postoCobrancaFalta;
    }

    public Boolean getPostoCobrancaSolto() {
        return postoCobrancaSolto;
    }

    public void setPostoCobrancaSolto(Boolean postoCobrancaSolto) {
        this.postoCobrancaSolto = postoCobrancaSolto;
    }

    public Boolean getEscotilhasCupulasFalta() {
        return escotilhasCupulasFalta;
    }

    public void setEscotilhasCupulasFalta(Boolean escotilhasCupulasFalta) {
        this.escotilhasCupulasFalta = escotilhasCupulasFalta;
    }

    public Boolean getEscotilhasCupulasDanificada() {
        return escotilhasCupulasDanificada;
    }

    public void setEscotilhasCupulasDanificada(Boolean escotilhasCupulasDanificada) {
        this.escotilhasCupulasDanificada = escotilhasCupulasDanificada;
    }

    public Boolean getEscotilhasCupulasSolta() {
        return escotilhasCupulasSolta;
    }

    public void setEscotilhasCupulasSolta(Boolean escotilhasCupulasSolta) {
        this.escotilhasCupulasSolta = escotilhasCupulasSolta;
    }

    public Boolean getEscotilhasCupulasTrincada() {
        return escotilhasCupulasTrincada;
    }

    public void setEscotilhasCupulasTrincada(Boolean escotilhasCupulasTrincada) {
        this.escotilhasCupulasTrincada = escotilhasCupulasTrincada;
    }

    public Boolean getSaidaEmergenciaSemIdentificacao() {
        return saidaEmergenciaSemIdentificacao;
    }

    public void setSaidaEmergenciaSemIdentificacao(Boolean saidaEmergenciaSemIdentificacao) {
        this.saidaEmergenciaSemIdentificacao = saidaEmergenciaSemIdentificacao;
    }

    public Boolean getSaidaEmergenciaSemLacre() {
        return saidaEmergenciaSemLacre;
    }

    public void setSaidaEmergenciaSemLacre(Boolean saidaEmergenciaSemLacre) {
        this.saidaEmergenciaSemLacre = saidaEmergenciaSemLacre;
    }

    public Boolean getSaidaEmergenciaDanificada() {
        return saidaEmergenciaDanificada;
    }

    public void setSaidaEmergenciaDanificada(Boolean saidaEmergenciaDanificada) {
        this.saidaEmergenciaDanificada = saidaEmergenciaDanificada;
    }

    public Boolean getFaroisOculosAlto() {
        return faroisOculosAlto;
    }

    public void setFaroisOculosAlto(Boolean faroisOculosAlto) {
        this.faroisOculosAlto = faroisOculosAlto;
    }

    public Boolean getFaroisOculosBaixo() {
        return faroisOculosBaixo;
    }

    public void setFaroisOculosBaixo(Boolean faroisOculosBaixo) {
        this.faroisOculosBaixo = faroisOculosBaixo;
    }

    public Boolean getFaroisOculosNaoFunciona() {
        return faroisOculosNaoFunciona;
    }

    public void setFaroisOculosNaoFunciona(Boolean faroisOculosNaoFunciona) {
        this.faroisOculosNaoFunciona = faroisOculosNaoFunciona;
    }

    public Boolean getFaroisOculosFalta() {
        return faroisOculosFalta;
    }

    public void setFaroisOculosFalta(Boolean faroisOculosFalta) {
        this.faroisOculosFalta = faroisOculosFalta;
    }

    public Boolean getFaroisOculosSolto() {
        return faroisOculosSolto;
    }

    public void setFaroisOculosSolto(Boolean faroisOculosSolto) {
        this.faroisOculosSolto = faroisOculosSolto;
    }

    public Boolean getFaroisOculosQuebrado() {
        return faroisOculosQuebrado;
    }

    public void setFaroisOculosQuebrado(Boolean faroisOculosQuebrado) {
        this.faroisOculosQuebrado = faroisOculosQuebrado;
    }

    public Boolean getLuzesSetaEmergenciaDanificada() {
        return luzesSetaEmergenciaDanificada;
    }

    public void setLuzesSetaEmergenciaDanificada(Boolean luzesSetaEmergenciaDanificada) {
        this.luzesSetaEmergenciaDanificada = luzesSetaEmergenciaDanificada;
    }

    public Boolean getLuzesSetaEmergenciaNaoFunciona() {
        return luzesSetaEmergenciaNaoFunciona;
    }

    public void setLuzesSetaEmergenciaNaoFunciona(Boolean luzesSetaEmergenciaNaoFunciona) {
        this.luzesSetaEmergenciaNaoFunciona = luzesSetaEmergenciaNaoFunciona;
    }

    public Boolean getLuzesSetaEmergenciaFalta() {
        return luzesSetaEmergenciaFalta;
    }

    public void setLuzesSetaEmergenciaFalta(Boolean luzesSetaEmergenciaFalta) {
        this.luzesSetaEmergenciaFalta = luzesSetaEmergenciaFalta;
    }

    public Boolean getLuzesSetaEmergenciaQuebrada() {
        return luzesSetaEmergenciaQuebrada;
    }

    public void setLuzesSetaEmergenciaQuebrada(Boolean luzesSetaEmergenciaQuebrada) {
        this.luzesSetaEmergenciaQuebrada = luzesSetaEmergenciaQuebrada;
    }

    public Boolean getLanternasLentesDanificada() {
        return lanternasLentesDanificada;
    }

    public void setLanternasLentesDanificada(Boolean lanternasLentesDanificada) {
        this.lanternasLentesDanificada = lanternasLentesDanificada;
    }

    public Boolean getLanternasLentesNaoFunciona() {
        return lanternasLentesNaoFunciona;
    }

    public void setLanternasLentesNaoFunciona(Boolean lanternasLentesNaoFunciona) {
        this.lanternasLentesNaoFunciona = lanternasLentesNaoFunciona;
    }

    public Boolean getLuzesDelimitadorasVigiasLentesFaltando() {
        return luzesDelimitadorasVigiasLentesFaltando;
    }

    public void setLuzesDelimitadorasVigiasLentesFaltando(Boolean luzesDelimitadorasVigiasLentesFaltando) {
        this.luzesDelimitadorasVigiasLentesFaltando = luzesDelimitadorasVigiasLentesFaltando;
    }

    public Boolean getLuzesDelimitadorasVigiasLentesNaoFunciona() {
        return luzesDelimitadorasVigiasLentesNaoFunciona;
    }

    public void setLuzesDelimitadorasVigiasLentesNaoFunciona(Boolean luzesDelimitadorasVigiasLentesNaoFunciona) {
        this.luzesDelimitadorasVigiasLentesNaoFunciona = luzesDelimitadorasVigiasLentesNaoFunciona;
    }

    public Boolean getLuzFreioLentesDanificada() {
        return luzFreioLentesDanificada;
    }

    public void setLuzFreioLentesDanificada(Boolean luzFreioLentesDanificada) {
        this.luzFreioLentesDanificada = luzFreioLentesDanificada;
    }

    public Boolean getLuzFreioLentesNaoFunciona() {
        return luzFreioLentesNaoFunciona;
    }

    public void setLuzFreioLentesNaoFunciona(Boolean luzFreioLentesNaoFunciona) {
        this.luzFreioLentesNaoFunciona = luzFreioLentesNaoFunciona;
    }

    public Boolean getLuzFreioLentesConservacaoIrregular() {
        return luzFreioLentesConservacaoIrregular;
    }

    public void setLuzFreioLentesConservacaoIrregular(Boolean luzFreioLentesConservacaoIrregular) {
        this.luzFreioLentesConservacaoIrregular = luzFreioLentesConservacaoIrregular;
    }

    public Boolean getBrakeLightNaoFunciona() {
        return brakeLightNaoFunciona;
    }

    public void setBrakeLightNaoFunciona(Boolean brakeLightNaoFunciona) {
        this.brakeLightNaoFunciona = brakeLightNaoFunciona;
    }

    public Boolean getBrakeLightFalta() {
        return brakeLightFalta;
    }

    public void setBrakeLightFalta(Boolean brakeLightFalta) {
        this.brakeLightFalta = brakeLightFalta;
    }

    public Boolean getBrakeLightConservacaoIrregular() {
        return brakeLightConservacaoIrregular;
    }

    public void setBrakeLightConservacaoIrregular(Boolean brakeLightConservacaoIrregular) {
        this.brakeLightConservacaoIrregular = brakeLightConservacaoIrregular;
    }

    public Boolean getLuzReFalta() {
        return luzReFalta;
    }

    public void setLuzReFalta(Boolean luzReFalta) {
        this.luzReFalta = luzReFalta;
    }

    public Boolean getLuzReNaoFunciona() {
        return luzReNaoFunciona;
    }

    public void setLuzReNaoFunciona(Boolean luzReNaoFunciona) {
        this.luzReNaoFunciona = luzReNaoFunciona;
    }

    public Boolean getLuzReSemLente() {
        return luzReSemLente;
    }

    public void setLuzReSemLente(Boolean luzReSemLente) {
        this.luzReSemLente = luzReSemLente;
    }

    public Boolean getLuzReConservacaoIrregular() {
        return luzReConservacaoIrregular;
    }

    public void setLuzReConservacaoIrregular(Boolean luzReConservacaoIrregular) {
        this.luzReConservacaoIrregular = luzReConservacaoIrregular;
    }

    public Boolean getLuzPlacaNaoFunciona() {
        return luzPlacaNaoFunciona;
    }

    public void setLuzPlacaNaoFunciona(Boolean luzPlacaNaoFunciona) {
        this.luzPlacaNaoFunciona = luzPlacaNaoFunciona;
    }

    public Boolean getLuzPlacaFalta() {
        return luzPlacaFalta;
    }

    public void setLuzPlacaFalta(Boolean luzPlacaFalta) {
        this.luzPlacaFalta = luzPlacaFalta;
    }

    public Boolean getLuzPlacaConservacaoIrregular() {
        return luzPlacaConservacaoIrregular;
    }

    public void setLuzPlacaConservacaoIrregular(Boolean luzPlacaConservacaoIrregular) {
        this.luzPlacaConservacaoIrregular = luzPlacaConservacaoIrregular;
    }

    public Boolean getPartidaNaoFunciona() {
        return partidaNaoFunciona;
    }

    public void setPartidaNaoFunciona(Boolean partidaNaoFunciona) {
        this.partidaNaoFunciona = partidaNaoFunciona;
    }

    public Boolean getExtintorIrregular() {
        return extintorIrregular;
    }

    public void setExtintorIrregular(Boolean extintorIrregular) {
        this.extintorIrregular = extintorIrregular;
    }

    public Boolean getExtintorSuporteQuebrado() {
        return extintorSuporteQuebrado;
    }

    public void setExtintorSuporteQuebrado(Boolean extintorSuporteQuebrado) {
        this.extintorSuporteQuebrado = extintorSuporteQuebrado;
    }

    public Boolean getExtintorSuporteSolto() {
        return extintorSuporteSolto;
    }

    public void setExtintorSuporteSolto(Boolean extintorSuporteSolto) {
        this.extintorSuporteSolto = extintorSuporteSolto;
    }

    public Boolean getExtintorFalta() {
        return extintorFalta;
    }

    public void setExtintorFalta(Boolean extintorFalta) {
        this.extintorFalta = extintorFalta;
    }

    public Boolean getTrianguloFalta() {
        return trianguloFalta;
    }

    public void setTrianguloFalta(Boolean trianguloFalta) {
        this.trianguloFalta = trianguloFalta;
    }

    public Boolean getTrianguloDanificado() {
        return trianguloDanificado;
    }

    public void setTrianguloDanificado(Boolean trianguloDanificado) {
        this.trianguloDanificado = trianguloDanificado;
    }

    public Boolean getSilenciosoSolto() {
        return silenciosoSolto;
    }

    public void setSilenciosoSolto(Boolean silenciosoSolto) {
        this.silenciosoSolto = silenciosoSolto;
    }

    public Boolean getSilenciosoDanificado() {
        return silenciosoDanificado;
    }

    public void setSilenciosoDanificado(Boolean silenciosoDanificado) {
        this.silenciosoDanificado = silenciosoDanificado;
    }

    public Boolean getTuboDescargaSolto() {
        return tuboDescargaSolto;
    }

    public void setTuboDescargaSolto(Boolean tuboDescargaSolto) {
        this.tuboDescargaSolto = tuboDescargaSolto;
    }

    public Boolean getTuboDescargaFalta() {
        return tuboDescargaFalta;
    }

    public void setTuboDescargaFalta(Boolean tuboDescargaFalta) {
        this.tuboDescargaFalta = tuboDescargaFalta;
    }

    public Boolean getTuboDescargaIrregular() {
        return tuboDescargaIrregular;
    }

    public void setTuboDescargaIrregular(Boolean tuboDescargaIrregular) {
        this.tuboDescargaIrregular = tuboDescargaIrregular;
    }

    public Boolean getProtecaoTuboDescargaFalta() {
        return protecaoTuboDescargaFalta;
    }

    public void setProtecaoTuboDescargaFalta(Boolean protecaoTuboDescargaFalta) {
        this.protecaoTuboDescargaFalta = protecaoTuboDescargaFalta;
    }

    public Boolean getProtecaoTuboDescargaSolta() {
        return protecaoTuboDescargaSolta;
    }

    public void setProtecaoTuboDescargaSolta(Boolean protecaoTuboDescargaSolta) {
        this.protecaoTuboDescargaSolta = protecaoTuboDescargaSolta;
    }

    public Boolean getArticulacaoSolto() {
        return articulacaoSolto;
    }

    public void setArticulacaoSolto(Boolean articulacaoSolto) {
        this.articulacaoSolto = articulacaoSolto;
    }

    public Boolean getArticulacaoFalta() {
        return articulacaoFalta;
    }

    public void setArticulacaoFalta(Boolean articulacaoFalta) {
        this.articulacaoFalta = articulacaoFalta;
    }

    public Boolean getArticulacaoRasgado() {
        return articulacaoRasgado;
    }

    public void setArticulacaoRasgado(Boolean articulacaoRasgado) {
        this.articulacaoRasgado = articulacaoRasgado;
    }

    public Boolean getArticulacaoGasto() {
        return articulacaoGasto;
    }

    public void setArticulacaoGasto(Boolean articulacaoGasto) {
        this.articulacaoGasto = articulacaoGasto;
    }

    public Boolean getVazamentoExcessivoMotor() {
        return vazamentoExcessivoMotor;
    }

    public void setVazamentoExcessivoMotor(Boolean vazamentoExcessivoMotor) {
        this.vazamentoExcessivoMotor = vazamentoExcessivoMotor;
    }

    public Boolean getVazamentoExcessivoCambio() {
        return vazamentoExcessivoCambio;
    }

    public void setVazamentoExcessivoCambio(Boolean vazamentoExcessivoCambio) {
        this.vazamentoExcessivoCambio = vazamentoExcessivoCambio;
    }
}

