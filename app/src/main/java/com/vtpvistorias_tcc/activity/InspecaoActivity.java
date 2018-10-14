package com.vtpvistorias_tcc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class InspecaoActivity extends AppCompatActivity {

    private TextView tvInspecao;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspecao);

        tvInspecao = findViewById(R.id.textViewInspecao);
        tvInspecao.setMovementMethod(new ScrollingMovementMethod());

        inspecao = (Inspecao) getIntent().getSerializableExtra("inspecao");

        tvInspecao.setText(
                "\nCodigo da Inspeção: "+ inspecao.getIdInspecao()+
                "\nResultado: "+inspecao.getResultado()+
                "\nData e hora: "+ inspecao.getDataHoraRegistro()+
                "\n\nDados Inspetor"+
                "\nNome: "+inspecao.getInspetor().getNome()+
                "\nEmail: "+ inspecao.getInspetor().getEmail());

        if(inspecao.getGrupoA()!= null || inspecao.getGrupoA1() != null || inspecao.getGrupoB() != null){

            tvInspecao.setText(tvInspecao.getText()+
            "\n\nDetalhes: ");

            if(inspecao.getGrupoA1()!= null){

                tvInspecao.setText(tvInspecao.getText()+
                        "\n\nGrupo A1");

                if(inspecao.getGrupoA1().getTacografo()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nTacografo:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getTacografo().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getTacografo().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getPiso()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nPiso:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getPiso().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getPiso().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getQuebraSol()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nQuebra-Sol:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getQuebraSol().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getQuebraSol().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getDesembacadorParaBrisa()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nDesembaçador Para Brisa:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getDesembacadorParaBrisa().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getDesembacadorParaBrisa().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getBancosAltosSimples()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nBancos Altos Simples:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getBancosAltosSimples().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getBancosAltosSimples().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getRadioComunicacao()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nRadio Comunicação:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getRadioComunicacao().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getRadioComunicacao().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getBrakeLight()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nBrake Light:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getBrakeLight().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getBrakeLight().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getComunicacaoVisualInternaAdesivos()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nComunicação Visual Interna Adesivos:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getComunicacaoVisualInternaAdesivos().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getComunicacaoVisualInternaAdesivos().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getAreaParaCadeiraDeRodas()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nArea para cadeira de rodas:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getAreaParaCadeiraDeRodas().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getAreaParaCadeiraDeRodas().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getAreaParaManobras()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nArea para manobras:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getAreaParaManobras().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getAreaParaManobras().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getPortas()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nPortas:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getPortas().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getPortas().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getElevador()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nElevador:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getElevador().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getElevador().get(a)+"\n");

                    }//fim for

                }//fim if do item

                if(inspecao.getGrupoA1().getItensDeSeguranca()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nItens de Segurança:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getItensDeSeguranca().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getItensDeSeguranca().get(a)+"\n");

                    }//fim for

                }//fim if do item

                //demais itens A1

            }

            if(inspecao.getGrupoA()!= null){

                tvInspecao.setText(tvInspecao.getText()+"\nGrupo A:\n");
                //1 - SISTEMA DE FREIO
                //VALVULA PEDAL
                if(inspecao.getGrupoA().getValvulaPedal()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nValvula Pedal:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getValvulaPedal().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getValvulaPedal().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getAlmofadaPedal()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nAlmofada Pedal:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getAlmofadaPedal().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getAlmofadaPedal().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getFreioDeEstacionamento()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nFreio de Estacionamento:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getFreioDeEstacionamento().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getFreioDeEstacionamento().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getVaraoDoFreioDeMao()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nVarão do Freio de Mão:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getVaraoDoFreioDeMao().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getVaraoDoFreioDeMao().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getCatracasAutomaticaMecanica()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCatracas Automatica Mecanica:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getCatracasAutomaticaMecanica().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getCatracasAutomaticaMecanica().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getPinoDaCatraca()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPino da Catraca:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getPinoDaCatraca().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getPinoDaCatraca().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getLonasDeFreio()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLonas de Freio:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getLonasDeFreio().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getLonasDeFreio().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getCilindrosPneumaticos()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCilindros Pneumaticos:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getCilindrosPneumaticos().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getCilindrosPneumaticos().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getServoDoFreio()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nServo do Freio:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getServoDoFreio().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getServoDoFreio().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getCilindroDeRoda()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCilindro de Roda:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getCilindroDeRoda().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getCilindroDeRoda().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getCilintroMestre()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCilindro Mestre:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getCilintroMestre().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getCilintroMestre().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getFlexivelDaRoda()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nFlexivel da Roda:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getFlexivelDaRoda().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getFlexivelDaRoda().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getValvulasTubularReservatorio()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nValvula Tubular Reservatório:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getValvulasTubularReservatorio().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getValvulasTubularReservatorio().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getAmortecedor()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nAmortecedor:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getAmortecedor().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getAmortecedor().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getSuporteDoAmortecedor()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSuporte do Amortecedor:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getSuporteDoAmortecedor().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getSuporteDoAmortecedor().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBuchaDoAmortecedor()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBucha do Amortecedor:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBuchaDoAmortecedor().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBuchaDoAmortecedor().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getFeixeDeMolas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nFeixe de Molas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getFeixeDeMolas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getFeixeDeMolas().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBuchaDasMolas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBucha das Molas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBuchaDasMolas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBuchaDasMolas().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getEspigaoDasMolas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEspigão das Molas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getEspigaoDasMolas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getEspigaoDasMolas().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getGrampoDasMolas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nGrampo das Molas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getGrampoDasMolas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getGrampoDasMolas().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getSuporteDasMolas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSuporte das Molas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getSuporteDasMolas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getSuporteDasMolas().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getAlgema()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nAlgema:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getAlgema().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getAlgema().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getPinoDoSuporteDaMola()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPino do Suporte da Mola:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getPinoDoSuporteDaMola().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getPinoDoSuporteDaMola().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getMolaHelicoidal()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nMola Helicoidal:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getMolaHelicoidal().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getMolaHelicoidal().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getSuporteEParafusoDaMolaHelicoidal()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSuporte e Parafuso da Mola Helicoidal:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getSuporteEParafusoDaMolaHelicoidal().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getSuporteEParafusoDaMolaHelicoidal().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBolsaoDeAr()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBolsão de Ar:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBolsaoDeAr().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBolsaoDeAr().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getValvulaDeNivel()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nValvula de Nível:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getValvulaDeNivel().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getValvulaDeNivel().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBarraEstabilizadora()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBarra Estabilizadora:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBarraEstabilizadora().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBarraEstabilizadora().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBuchaDaBarraEstabilizadora()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBucha da Barra Estabilizadora:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBuchaDaBarraEstabilizadora().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBuchaDaBarraEstabilizadora().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBananaBean()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBanana Bean:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBananaBean().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBananaBean().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getHasteSuporteDeReacaoTraseira()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nHaste Suporte de Reação Traseira:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getHasteSuporteDeReacaoTraseira().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getHasteSuporteDeReacaoTraseira().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getEixoCardan()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEixo Cardan:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getEixoCardan().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getEixoCardan().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getPneus()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPneus:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getPneus().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getPneus().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getRodas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nRodas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getRodas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getRodas().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getCaixaDeDirecao()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCaixa de Direção:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getCaixaDeDirecao().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getCaixaDeDirecao().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getSuporteDaCaixa()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSuporte da Caixa:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getSuporteDaCaixa().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getSuporteDaCaixa().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBracoTerminalDaCaixa()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBraço Terminal da Caixa:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBracoTerminalDaCaixa().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBracoTerminalDaCaixa().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getAmortecedorDirecao()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nAmortecedor Direção:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getAmortecedorDirecao().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getAmortecedorDirecao().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getEixoDianteiro()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEixo Dianteiro:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getEixoDianteiro().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getEixoDianteiro().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getRolamentoDaMangaDoEixo()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nRolamento da Manga do Eixo:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getRolamentoDaMangaDoEixo().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getRolamentoDaMangaDoEixo().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getParafusoDoBatenteDaManga()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nParafuso do Batente da Manga:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getParafusoDoBatenteDaManga().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getParafusoDoBatenteDaManga().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBracoDoEixoDianteiro()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBraço do Eixo Dianteiro:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBracoDoEixoDianteiro().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBracoDoEixoDianteiro().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getTerminaisDaBarraLonga()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTerminais da Barra Longa:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getTerminaisDaBarraLonga().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getTerminaisDaBarraLonga().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getBracoIntermediario()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBraço Intermediário:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getBracoIntermediario().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getBracoIntermediario().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getHasteSuporteDeReacao()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nHaste Suporte de Reação:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getHasteSuporteDeReacao().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getHasteSuporteDeReacao().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getTanqueDeCombustivel()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTanque de Combustível:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getTanqueDeCombustivel().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getTanqueDeCombustivel().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getCintaSuporteDoTanque()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCinta Suporte do Tanque:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getCintaSuporteDoTanque().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getCintaSuporteDoTanque().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getEstruturaDosDegraus()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEstrutura dos Degraus:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getEstruturaDosDegraus().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getEstruturaDosDegraus().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getChassisEPlataforma()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nChassis e Plataforma:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getChassisEPlataforma().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getChassisEPlataforma().get(a) + "\n");

                    }

                }

                if(inspecao.getGrupoA().getSistemaSegurancaDoCintoMotoristaEBloqueioPortas()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSistema Segurança do Cinto do Motorista e Bloqueio Portas:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().get(a) + "\n");

                    }

                }

                //demais itens A

            }

            if (inspecao.getGrupoB()!=null) {

                tvInspecao.setText(tvInspecao.getText() + "\nGrupo B:\n");

                if (inspecao.getGrupoB().getParaBrisa().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPara Brisa:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getParaBrisa().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getParaBrisa().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getVidroTraseiro().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nVidro Traseiro:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getVidroTraseiro().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getVidroTraseiro().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getEstrutura().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEstrutura:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getEstrutura().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getEstrutura().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getOculos().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nÓculos:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getOculos().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getOculos().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getRevestimentoExternoChaparia().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nRevestimento Externo Chaparia:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getRevestimentoExternoChaparia().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getRevestimentoExternoChaparia().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getBancos().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBancos:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getBancos().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getBancos().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getBancosPassageiros().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBancos Passageiros:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getBancosPassageiros().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getBancosPassageiros().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getSistemasDePortasMancal().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSistemas de Portas Mancal:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getSistemasDePortasMancal().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getSistemasDePortasMancal().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getFolhasDasPortasRevestimento().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nFolhas das Portas Revestimento:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getFolhasDasPortasRevestimento().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getFolhasDasPortasRevestimento().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getBorrachaDasPortas().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBorracha das Portas:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getBorrachaDasPortas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getBorrachaDasPortas().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getTampaoPistaoDasPortas().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTampão Pistão das Portas:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getTampaoPistaoDasPortas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getTampaoPistaoDasPortas().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getCilindroDasPortas().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCilindro das Portas:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getCilindroDasPortas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getCilindroDasPortas().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getJanelaLateralDoMotorista().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nJanela Lateral do Motorista:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getJanelaLateralDoMotorista().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getJanelaLateralDoMotorista().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getQuadroDaJanela().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nQuadro da Janela:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getQuadroDaJanela().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getQuadroDaJanela().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getSeparadorLimitadorPuxador().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSeparador Limitador Puxador:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getSeparadorLimitadorPuxador().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getSeparadorLimitadorPuxador().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getParachoquePonteira().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nParachoque Ponteira:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getParachoquePonteira().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getParachoquePonteira().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getEspelhosRetrovisoresConvexos().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEspelhos Retrovisores Convexos:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getEspelhosRetrovisoresConvexos().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getEspelhosRetrovisoresConvexos().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLimpadorParaBrisa().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLimpador Para Brisa:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLimpadorParaBrisa().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLimpadorParaBrisa().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLimpeza().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLimpeza:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLimpeza().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLimpeza().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getCaixaDeItinerario().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nCaixa de Itinerário:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getCaixaDeItinerario().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getCaixaDeItinerario().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getIluminacaoSalaoInterna().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nIluminação Salão Interna:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getIluminacaoSalaoInterna().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getIluminacaoSalaoInterna().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getSolicitacaoDeParada().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSolicitação de Parada:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getSolicitacaoDeParada().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getSolicitacaoDeParada().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLuzDoDegrau().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLuz do Degrau:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLuzDoDegrau().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLuzDoDegrau().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getComandosDoPainel().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nComandos do Painel:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getComandosDoPainel().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getComandosDoPainel().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getChaveDeSetaBuzina().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nChave de Buzina:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getChaveDeSetaBuzina().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getChaveDeSetaBuzina().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getDegraus().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nDegraus:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getDegraus().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getDegraus().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getPiso().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPiso:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getPiso().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getPiso().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getTampaDeInspecao().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTampa de Inspeção:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getTampaDeInspecao().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getTampaDeInspecao().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getTampaDoMotor().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTampa do Motor:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getTampaDoMotor().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getTampaDoMotor().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getRevestimentoInterno().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nRevestimento Interno:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getRevestimentoInterno().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getRevestimentoInterno().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getBalaustres().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBalaustres:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getBalaustres().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getBalaustres().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getDerrapante().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nDerrapante:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getDerrapante().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getDerrapante().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getPostoDeCobranca().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPosto de Cobrança:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getPostoDeCobranca().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getPostoDeCobranca().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getEscotilhasECupulas().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nEscotilhas e Cupulas:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getEscotilhasECupulas().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getEscotilhasECupulas().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getSaidaDeEmergencia().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSaida de Emergência:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getSaidaDeEmergencia().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getSaidaDeEmergencia().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getFaroisOculos().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nFarois Óculos:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getFaroisOculos().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getFaroisOculos().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLuzesDeSetaEDeEmergencia().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLuzes de Seta e de Emergência:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLuzesDeSetaEDeEmergencia().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLuzesDeSetaEDeEmergencia().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLanternasLentes().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLanternas Lentes:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLanternasLentes().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLanternasLentes().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLuzesDelimitadorasVigiasLentes().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLuzes de Limitadoras Vigias Lentes:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLuzesDelimitadorasVigiasLentes().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLuzesDelimitadorasVigiasLentes().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLuzDoFreioLentes().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLuz do Freio Lentes:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLuzDoFreioLentes().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLuzDoFreioLentes().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getBrakeLight().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nBrake Light:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getBrakeLight().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getBrakeLight().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLuzDeRe().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLuz de Ré:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLuzDeRe().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLuzDeRe().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getLuzDaPlaca().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nLuz da Placa:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getLuzDaPlaca().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getLuzDaPlaca().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getPartida().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPartida:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getPartida().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getPartida().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getExtintor().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nExtintor:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getExtintor().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getExtintor().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getTriangulo().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTriangulo:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getTriangulo().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getTriangulo().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getSilencioso().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nSilencioso:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getSilencioso().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getSilencioso().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getTuboDeDescarga().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nTudo de Descarga:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getTuboDeDescarga().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getTuboDeDescarga().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getProtecaoTuboDescarga().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nProteção Tudo Descarga:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getProtecaoTuboDescarga().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getProtecaoTuboDescarga().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getArticulacao().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nArticulação:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getArticulacao().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getArticulacao().get(a) + "\n");

                    }

                }

                if (inspecao.getGrupoB().getVazamentoExcessivo().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nVazamento Excessivo:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getVazamentoExcessivo().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getVazamentoExcessivo().get(a) + "\n");

                    }

                }

                //demais intens B

            }


        }else{

            tvInspecao.setText(tvInspecao.getText()+
            "\n\nObservações: "+
            "\nJustifica: "+ inspecao.getJustificativa());


        }





    }
}
