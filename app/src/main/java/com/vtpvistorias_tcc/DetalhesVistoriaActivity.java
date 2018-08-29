package com.vtpvistorias_tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.activity.SelecionarFichaActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;

public class DetalhesVistoriaActivity extends AppCompatActivity implements View.OnClickListener{

    private Inspecao inspecao;
    private TextView detalhesVistoriaTextView;
    private String detalhesVistoria;
    private Button salvarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_vistoria);

        detalhesVistoriaTextView = findViewById(R.id.detalhesVistoriaTextView);
        salvarButton = findViewById(R.id.salvarButton);

        Intent i = getIntent();

        inspecao = (Inspecao) i.getSerializableExtra("inspecao");

        pegarDados();

        salvarButton.setOnClickListener(this);



    }

    public void pegarDados(){


        //verifica se a ficha A1 foi iniciada
        if (inspecao.getGrupoA1()!=null){

            //Coloca no Text View o titulo da Ficha
            detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Grupo A1:\n\n");
            //1 - SISTEMA E CARROCERIA NÍVEL B
            //TACOGRAFO
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getTacografo().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Tacografo:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getTacografo().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getTacografo().get(a)+"\n");

                }//fim for

            }//fim if do item

            //PISO
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getPiso().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Piso:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getPiso().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getPiso().get(a)+"\n");

                }//fim for

            }//fim if do item

            //QUEBRA SOL
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getQuebraSol().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Quebra-sol:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getQuebraSol().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getQuebraSol().get(a)+"\n");

                }//fim for

            }//fim if do item

            //DESEMBAÇADOR PARA-BRISA
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getDesembacadorParaBrisa().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Desembaçador Para-Brisa:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getDesembacadorParaBrisa().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getDesembacadorParaBrisa().get(a)+"\n");

                }//fim for

            }//fim if do item

            //BANCOS ALTOS SIMPLES
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getBancosAltosSimples().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Bancos Altos simples:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getBancosAltosSimples().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getBancosAltosSimples().get(a)+"\n");

                }//fim for

            }//fim if do item

            //RADIO COMUNICAÇÃO
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getRadioComunicacao().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Rádio comunicação:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getRadioComunicacao().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getRadioComunicacao().get(a)+"\n");

                }//fim for

            }//fim if do item

            //BRAKE LIGHT
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getBrakeLight().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Brake Light:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getBrakeLight().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getBrakeLight().get(a)+"\n");

                }//fim for

            }//fim if do item

            //COMUNICAÇÃO VISUAL INTERNA/ADESIVOS
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getComunicacaoVisualInternaAdesivos().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Comunicação visual interna/adesivos:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getComunicacaoVisualInternaAdesivos().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getComunicacaoVisualInternaAdesivos().get(a)+"\n");

                }//fim for

            }//fim if do item

            //2 - ACESSIBILIDADE E MOBILIDADE NÍVEL A
            //AREA PARA CADEIRA DE RODAS
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getAreaParaCadeiraDeRodas().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Área para cadeira de rodas:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getAreaParaCadeiraDeRodas().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getAreaParaCadeiraDeRodas().get(a)+"\n");

                }//fim for

            }//fim if do item

            //AREA PARA MANOBRAS
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getAreaParaManobras().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Área para manobras:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getAreaParaManobras().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getAreaParaCadeiraDeRodas().get(a)+"\n");

                }//fim for

            }//fim if do item

            //PORTAS
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getPortas().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Portas:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getPortas().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getPortas().get(a)+"\n");

                }//fim for

            }//fim if do item

            //ELEVADOR
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getElevador().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Elevador:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getElevador().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getElevador().get(a)+"\n");

                }//fim for

            }//fim if do item

            // ITENS DE SEGURANÇA
            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getItensDeSeguranca().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Itens de segurança:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getItensDeSeguranca().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getItensDeSeguranca().get(a)+"\n");

                }//fim for

            }//fim if do item


        }//fim if da ficha

        //inicio ficha A mesmo aspectos do item acima
        if (inspecao.getGrupoA()!=null){

            detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"\nGrupo A:\n\n");
            //1 - SISTEMA DE FREIO
            //VALVULA PEDAL
            if(inspecao.getGrupoA().getValvulaPedal().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Valvula Pedal:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getValvulaPedal().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getValvulaPedal().get(a)+"\n");

                }

            }

            //ALMOFADA PEDAL
            if(inspecao.getGrupoA().getAlmofadaPedal().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Almofada Pedal:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getAlmofadaPedal().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getAlmofadaPedal().get(a)+"\n");

                }

            }

            //FREIO DE ESTACIONAMENTO
            if(inspecao.getGrupoA().getFreioDeEstacionamento().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Freio de estacionamento:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getFreioDeEstacionamento().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getFreioDeEstacionamento().get(a)+"\n");

                }

            }

            //VARÃO DO FREIO DE MÃO
            if(inspecao.getGrupoA().getVaraoDoFreioDeMao().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Varão freio de mão:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getVaraoDoFreioDeMao().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getVaraoDoFreioDeMao().get(a)+"\n");

                }

            }

            //CATRACAS AUTOMATICA/MECANICA
            if(inspecao.getGrupoA().getCatracasAutomaticaMecanica().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Catracas Automatica/Mecanica:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getCatracasAutomaticaMecanica().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getCatracasAutomaticaMecanica().get(a)+"\n");

                }

            }

            //PINO DA CATRACA
            if(inspecao.getGrupoA().getPinoDaCatraca().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Pino da catraca:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getPinoDaCatraca().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getPinoDaCatraca().get(a)+"\n");

                }

            }

            //LONAS DE FREIO
            if(inspecao.getGrupoA().getLonasDeFreio().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Lonas de freio:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getLonasDeFreio().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getLonasDeFreio().get(a)+"\n");

                }

            }

            //CILINDRO PNEUMATICOS
            if(inspecao.getGrupoA().getCilindrosPneumaticos().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Cilindros pneumaticos:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getCilindrosPneumaticos().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getCilindrosPneumaticos().get(a)+"\n");

                }

            }

            //SERVO DO FREIO
            if(inspecao.getGrupoA().getServoDoFreio().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Servo do freio:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getServoDoFreio().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getServoDoFreio().get(a)+"\n");

                }

            }

            //CILINDRO DE RODA
            if(inspecao.getGrupoA().getCilindroDeRoda().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Cilindro de roda:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getCilindroDeRoda().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getCilindroDeRoda().get(a)+"\n");

                }

            }

            //CILINDRO MESTRE
            if(inspecao.getGrupoA().getCilintroMestre().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Cilindro mestre:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getCilintroMestre().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getCilintroMestre().get(a)+"\n");

                }

            }

            //FLEXIVEL DA RODA
            if(inspecao.getGrupoA().getFlexivelDaRoda().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Flexível da roda:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getFlexivelDaRoda().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getFlexivelDaRoda().get(a)+"\n");

                }

            }

            //VALVULAS TUBULAR RESERVATÓRIO
            if(inspecao.getGrupoA().getValvulasTubularReservatorio().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Valvulas tubular reservatório:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getValvulasTubularReservatorio().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getValvulasTubularReservatorio().get(a)+"\n");

                }

            }
            //2 - SISTEMA DE SUSPENSÃO
            //AMORTECEDOR
            if(inspecao.getGrupoA().getAmortecedor().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Amortecedor:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getAmortecedor().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getAmortecedor().get(a)+"\n");

                }

            }

            //SUPORTE DO AMORTECEDOR
            if(inspecao.getGrupoA().getSuporteDoAmortecedor().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Suporte do amortecedor:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getSuporteDoAmortecedor().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getSuporteDoAmortecedor().get(a)+"\n");

                }

            }

            //BUCHA DO AMORTECEDOR
            if(inspecao.getGrupoA().getBuchaDoAmortecedor().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Bucha do amortecedor:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBuchaDoAmortecedor().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBuchaDoAmortecedor().get(a)+"\n");

                }

            }

            //FEIXE DE MOLAS
            if(inspecao.getGrupoA().getFeixeDeMolas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Feixe de molas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getFeixeDeMolas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getFeixeDeMolas().get(a)+"\n");

                }

            }

            //BUCHA DAS MOLAS
            if(inspecao.getGrupoA().getBuchaDasMolas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Bucha das molas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBuchaDasMolas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBuchaDasMolas().get(a)+"\n");

                }

            }

            //ESPIGÃO DAS MOLAS
            if(inspecao.getGrupoA().getEspigaoDasMolas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Espigão das molas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getEspigaoDasMolas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getEspigaoDasMolas().get(a)+"\n");

                }

            }

            //GRAMPO DAS MOLAS
            if(inspecao.getGrupoA().getGrampoDasMolas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Grampo das molas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getGrampoDasMolas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getGrampoDasMolas().get(a)+"\n");

                }

            }

            //SUPORTE DAS MOLAS
            if(inspecao.getGrupoA().getSuporteDasMolas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Suporte das molas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getSuporteDasMolas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getSuporteDasMolas().get(a)+"\n");

                }

            }

            //ALGEMA (JUMELO)
            if(inspecao.getGrupoA().getAlgema().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Algema (jumelo):\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getAlgema().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getAlgema().get(a)+"\n");

                }

            }

            //PINO DO SUPORTE DA MOLA
            if(inspecao.getGrupoA().getPinoDoSuporteDaMola().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Pino do suporte da mola:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getPinoDoSuporteDaMola().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getPinoDoSuporteDaMola().get(a)+"\n");

                }

            }

            //MOLA HELICOIDAL
            if(inspecao.getGrupoA().getMolaHelicoidal().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Mola Helicoidal:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getMolaHelicoidal().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getMolaHelicoidal().get(a)+"\n");

                }

            }

            //SUPORTE E PARAFUSO DA MOLA HELICOIDAL
            if(inspecao.getGrupoA().getSuporteEParafusoDaMolaHelicoidal().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Suporte e parafuso da mola helicoidal:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getSuporteEParafusoDaMolaHelicoidal().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getSuporteEParafusoDaMolaHelicoidal().get(a)+"\n");

                }

            }

            //BOLSÃO DE AR
            if(inspecao.getGrupoA().getBolsaoDeAr().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Bolsão de Ar:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBolsaoDeAr().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBolsaoDeAr().get(a)+"\n");

                }

            }

            //VALVULA DE NÍVEL
            if(inspecao.getGrupoA().getValvulaDeNivel().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Valvula de nível:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getValvulaDeNivel().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getValvulaDeNivel().get(a)+"\n");

                }

            }

            //BARRA ESTABILIZADORA
            if(inspecao.getGrupoA().getBarraEstabilizadora().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Barra estabilizadora:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBarraEstabilizadora().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBarraEstabilizadora().get(a)+"\n");

                }

            }

            //BUCHA DA BARRA ESTABILIZADORA
            if(inspecao.getGrupoA().getBuchaDaBarraEstabilizadora().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Bucha da barra estabilizadora:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBuchaDaBarraEstabilizadora().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBuchaDaBarraEstabilizadora().get(a)+"\n");

                }

            }

            //BANANA BEAN
            if(inspecao.getGrupoA().getBananaBean().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Banana Bean:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBananaBean().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBananaBean().get(a)+"\n");

                }

            }

            //HASTE/SUPORTE DE REAÇÃO TRASEIRA
            if(inspecao.getGrupoA().getHasteSuporteDeReacaoTraseira().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Haste/Suporte de reação traseira:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getHasteSuporteDeReacaoTraseira().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getHasteSuporteDeReacaoTraseira().get(a)+"\n");

                }

            }
            //3 - SISTEMA DE TRAÇÃO
            //EIXO CARDAN
            if(inspecao.getGrupoA().getEixoCardan().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Eixo Cardan:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getEixoCardan().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getEixoCardan().get(a)+"\n");

                }

            }
            //4 - SISTEMA RODANTE
            //PNEUS
            if(inspecao.getGrupoA().getPneus().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Pneus:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getPneus().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getPneus().get(a)+"\n");

                }

            }

            //RODAS
            if(inspecao.getGrupoA().getRodas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Rodas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getRodas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getRodas().get(a)+"\n");

                }

            }
            //5 - SISTEMA DE EIXO DIANTEIRO/DIREÇÃO
            //CAIXA DE DIREÇÃO
            if(inspecao.getGrupoA().getCaixaDeDirecao().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Caixa de direção:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getCaixaDeDirecao().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getCaixaDeDirecao().get(a)+"\n");

                }

            }

            //SUPORTE DA CAIXA
            if(inspecao.getGrupoA().getSuporteDaCaixa().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Suporte da caixa:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getSuporteDaCaixa().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getSuporteDaCaixa().get(a)+"\n");

                }

            }

            //BRAÇO TERMINAL DA CAIXA
            if(inspecao.getGrupoA().getBracoTerminalDaCaixa().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Braço terminal da caixa:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getAmortecedor().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getAmortecedor().get(a)+"\n");

                }

            }

            //AMORTECEDOR/DIREÇÃO
            if(inspecao.getGrupoA().getAmortecedorDirecao().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Amortecedor Direção:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getAmortecedorDirecao().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getAmortecedorDirecao().get(a)+"\n");

                }

            }

            //EIXO DIANTEIRO (VIGA)
            if(inspecao.getGrupoA().getEixoDianteiro().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Eixo dianteiro (viga):\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getEixoDianteiro().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getEixoDianteiro().get(a)+"\n");

                }

            }

            //ROLAMENTO DE MANGA DO EIXO
            if(inspecao.getGrupoA().getRolamentoDaMangaDoEixo().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Rolamento de manga do eixo:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getRolamentoDaMangaDoEixo().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getRolamentoDaMangaDoEixo().get(a)+"\n");

                }

            }

            //PARAFUSO DO BATENTE DA MANGA
            if(inspecao.getGrupoA().getParafusoDoBatenteDaManga().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Parafuso do batente da manga:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getParafusoDoBatenteDaManga().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getParafusoDoBatenteDaManga().get(a)+"\n");

                }

            }

            //BRAÇO DO EIXO DIANTEIRO
            if(inspecao.getGrupoA().getBracoDoEixoDianteiro().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Braço do eixo dianteiro:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBracoDoEixoDianteiro().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBracoDoEixoDianteiro().get(a)+"\n");

                }

            }

            //TERMINAIS DA BARRA LONGA
            if(inspecao.getGrupoA().getTerminaisDaBarraLonga().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Terminais da barra longa:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getTerminaisDaBarraLonga().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getTerminaisDaBarraLonga().get(a)+"\n");

                }

            }

            //BRAÇO INTERMEDIARIO
            if(inspecao.getGrupoA().getBracoIntermediario().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Braço intermediario:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getBracoIntermediario().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getBracoIntermediario().get(a)+"\n");

                }

            }

            //HASTE/SUPORTE DE REAÇÃO
            if(inspecao.getGrupoA().getHasteSuporteDeReacao().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Haster/Suporte de reação:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getHasteSuporteDeReacao().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getHasteSuporteDeReacao().get(a)+"\n");

                }

            }

            //6 - SISTEMA CHASSI-PLATAFORMA
            //TANQUE DE COMBUSTÍVEL
            if(inspecao.getGrupoA().getTanqueDeCombustivel().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Tanque de combustível:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getTanqueDeCombustivel().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getTanqueDeCombustivel().get(a)+"\n");

                }

            }

            //CINTA/SUPORTE DO TANQUE
            if(inspecao.getGrupoA().getCintaSuporteDoTanque().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Cinta/Suporte do tanque:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getCintaSuporteDoTanque().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getCintaSuporteDoTanque().get(a)+"\n");

                }

            }

            //ESTRUTURA DOS DEGRAUS
            if(inspecao.getGrupoA().getEstruturaDosDegraus().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Estrutura dos degraus:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getEstruturaDosDegraus().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getEstruturaDosDegraus().get(a)+"\n");

                }

            }

            //CHASSIS E PLATAFORMA
            if(inspecao.getGrupoA().getChassisEPlataforma().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Chassi e Plataforma:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getChassisEPlataforma().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getChassisEPlataforma().get(a)+"\n");

                }

            }

            //SISTEMA DE SEGURANÇA DO CINTO DO MOTORISTA E BLOQUEIO PORTAS
            if(inspecao.getGrupoA().getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Sistema de segurança do cinto do motorista e bloqueio de portas:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().size();a++){

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().get(a)+"\n");

                }

            }


        }

        if (inspecao.getGrupoB()!=null) {

            detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "\nGrupo :B\n\n");

            if (inspecao.getGrupoB().getParaBrisa().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Para Brisa:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getParaBrisa().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getParaBrisa().get(a) + "\n");

                }

            }

            //VIDRO TRASEIRO
            if (inspecao.getGrupoB().getVidroTraseiro().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Vidro traseiro:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getVidroTraseiro().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getVidroTraseiro().get(a) + "\n");

                }

            }

            //ESTRUTURA
            if (inspecao.getGrupoB().getEstrutura().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Estrutura:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getEstrutura().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getEstrutura().get(a) + "\n");

                }

            }

            //ÓCULOS
            if (inspecao.getGrupoB().getOculos().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Óculos:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getOculos().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getOculos().get(a) + "\n");

                }

            }

            //REVESTIMENTO EXTERNO/CHAPARIA
            if (inspecao.getGrupoB().getRevestimentoExternoChaparia().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Revestimento externo/chaparia:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getRevestimentoExternoChaparia().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getRevestimentoExternoChaparia().get(a) + "\n");

                }

            }

            //BANCOS
            if (inspecao.getGrupoB().getBancos().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Bancos:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getBancos().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getBancos().get(a) + "\n");

                }

            }

            //BANCOS PASSAGEIROS
            if (inspecao.getGrupoB().getBancosPassageiros().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Bancos dos passageiros:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getBancosPassageiros().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getBancosPassageiros().get(a) + "\n");

                }

            }

            //SISTEMAS DE PORTA MANCAL
            if (inspecao.getGrupoB().getSistemasDePortasMancal().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Sistemas de portas mancal:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getSistemasDePortasMancal().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getSistemasDePortasMancal().get(a) + "\n");

                }

            }

            //FOLHA DAS PORTAS/REVESTIMENTOS
            if (inspecao.getGrupoB().getFolhasDasPortasRevestimento().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Folha das portas/revestimento:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getFolhasDasPortasRevestimento().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getFolhasDasPortasRevestimento().get(a) + "\n");

                }

            }

            //BORRACHA DAS PORTAS
            if (inspecao.getGrupoB().getBorrachaDasPortas().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Borracha das portas:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getBorrachaDasPortas().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getBorrachaDasPortas().get(a) + "\n");

                }

            }

            //TAMPÃO PISTÃO DAS PORTAS
            if (inspecao.getGrupoB().getTampaoPistaoDasPortas().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Tampão e pistão das portas:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getTampaoPistaoDasPortas().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getTampaoPistaoDasPortas().get(a) + "\n");

                }

            }

            //CILINDRO DAS PORTAS
            if (inspecao.getGrupoB().getCilindroDasPortas().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Cilindro das portas:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getCilindroDasPortas().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getCilindroDasPortas().get(a) + "\n");

                }

            }

            //JANELA LATERAL DO MOTORISTA
            if (inspecao.getGrupoB().getJanelaLateralDoMotorista().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Janela lateral do motorista:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getJanelaLateralDoMotorista().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getJanelaLateralDoMotorista().get(a) + "\n");

                }

            }

            //QUADRO DA JANELA
            if (inspecao.getGrupoB().getQuadroDaJanela().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Quadro da janela:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getQuadroDaJanela().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getQuadroDaJanela().get(a) + "\n");

                }

            }

            //SEPARADOR/LIMITADOR/PUXADOR
            if (inspecao.getGrupoB().getSeparadorLimitadorPuxador().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Separador/Limitador/Puxador:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getSeparadorLimitadorPuxador().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getSeparadorLimitadorPuxador().get(a) + "\n");

                }

            }

            //PARA-CHOQUE/PONTEIRA
            if (inspecao.getGrupoB().getParachoquePonteira().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Para-choque/Ponteira:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getParachoquePonteira().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getParachoquePonteira().get(a) + "\n");

                }

            }

            //ESPELHOS RETROVISORES CONVEXOS
            if (inspecao.getGrupoB().getEspelhosRetrovisoresConvexos().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Espelho retrovisores convexos:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getEspelhosRetrovisoresConvexos().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getEspelhosRetrovisoresConvexos().get(a) + "\n");

                }

            }

            //LIMPADOR PARA-BRISA
            if (inspecao.getGrupoB().getLimpadorParaBrisa().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Limpador/Para-brisa:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLimpadorParaBrisa().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLimpadorParaBrisa().get(a) + "\n");

                }

            }

            //LIMPEZA
            if (inspecao.getGrupoB().getLimpeza().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Limpeza:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLimpeza().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLimpeza().get(a) + "\n");

                }

            }

            //2 - ILUMINAÇÃO INTERNA
            //CAIXA DE ITINERÁRIO
            if (inspecao.getGrupoB().getCaixaDeItinerario().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Caixa de itinerário:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getCaixaDeItinerario().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getCaixaDeItinerario().get(a) + "\n");

                }

            }

            //ILUMINAÇÃO SALÃO/INTERNA
            if (inspecao.getGrupoB().getIluminacaoSalaoInterna().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Iluminação salão/interna:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getIluminacaoSalaoInterna().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getIluminacaoSalaoInterna().get(a) + "\n");

                }

            }

            //SOLICITAÇÃO DE PARADA
            if (inspecao.getGrupoB().getSolicitacaoDeParada().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Solicitação de parada:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getSolicitacaoDeParada().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getSolicitacaoDeParada().get(a) + "\n");

                }

            }

            //LUZ DO DEGRAU
            if (inspecao.getGrupoB().getLuzDoDegrau().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Luz do degrau:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLuzDoDegrau().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLuzDoDegrau().get(a) + "\n");

                }

            }

            //3 - POSTO DE COMANDO
            //COMANDOS DO PAINEL
            if (inspecao.getGrupoB().getComandosDoPainel().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Comandos do painel:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getComandosDoPainel().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getComandosDoPainel().get(a) + "\n");

                }

            }

            //CHAVE DE SETA/BUZINA
            if (inspecao.getGrupoB().getChaveDeSetaBuzina().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Chave de seta/buzina:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getChaveDeSetaBuzina().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getChaveDeSetaBuzina().get(a) + "\n");

                }

            }

            //4 - INTERIOR DO VEÍCULO
            //DEGRAUS
            if (inspecao.getGrupoB().getDegraus().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Degraus:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getDegraus().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getDegraus().get(a) + "\n");

                }

            }

            //PISO
            if (inspecao.getGrupoB().getPiso().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Piso:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getPiso().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getPiso().get(a) + "\n");

                }

            }

            //TAMPA DE INSPEÇÃO
            if (inspecao.getGrupoB().getTampaDeInspecao().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Tampa de inspeção:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getTampaDeInspecao().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getTampaDeInspecao().get(a) + "\n");

                }

            }

            //TAMPA DO MOTOR
            if (inspecao.getGrupoB().getTampaDoMotor().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Tampa do motor:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getTampaDoMotor().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getTampaDoMotor().get(a) + "\n");

                }

            }

            //REVESTIMENTO INTERNO
            if (inspecao.getGrupoB().getRevestimentoInterno().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Revestimento interno:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getRevestimentoInterno().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getRevestimentoInterno().get(a) + "\n");

                }

            }

            //BALAÚSTRES
            if (inspecao.getGrupoB().getBalaustres().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Balaústres:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getBalaustres().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getBalaustres().get(a) + "\n");

                }

            }

            //DERRAPANTE
            if (inspecao.getGrupoB().getDerrapante().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Derrapante:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getDerrapante().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getDerrapante().get(a) + "\n");

                }

            }

            //POSTO DE COBRANÇA
            if (inspecao.getGrupoB().getPostoDeCobranca().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Posto de cobrança:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getPostoDeCobranca().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getPostoDeCobranca().get(a) + "\n");

                }

            }

            //ESCOTILHAS E CUPULAS
            if (inspecao.getGrupoB().getEscotilhasECupulas().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Escotilhas e cúpulas:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getEscotilhasECupulas().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getEscotilhasECupulas().get(a) + "\n");

                }

            }

            //SAÍDA DE EMERGENCIA
            if (inspecao.getGrupoB().getSaidaDeEmergencia().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Saída de emergência:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getSaidaDeEmergencia().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getSaidaDeEmergencia().get(a) + "\n");

                }

            }

            //5 - ILUMINAÇÃO EXTERNA/SINALIZAÇÃO
            //FARÓIS/ÓCULOS
            if (inspecao.getGrupoB().getFaroisOculos().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Faróis/Óculos:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getFaroisOculos().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getFaroisOculos().get(a) + "\n");

                }

            }

            //LUZES DE SETA E DE EMERGÊNCIA
            if (inspecao.getGrupoB().getLuzesDeSetaEDeEmergencia().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Luzes de seta e emergência:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLuzesDeSetaEDeEmergencia().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLuzesDeSetaEDeEmergencia().get(a) + "\n");

                }

            }

            //LANTERNAS/LENTES
            if (inspecao.getGrupoB().getLanternasLentes().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Lanternas/lentes:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLanternasLentes().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLanternasLentes().get(a) + "\n");

                }

            }


            //LUZES DELIMITADORAS/VIGIAS/LENTES
            if (inspecao.getGrupoB().getLuzesDelimitadorasVigiasLentes().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Luzes delimitadoras/vigias/lentes:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLuzesDelimitadorasVigiasLentes().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLuzesDelimitadorasVigiasLentes().get(a) + "\n");

                }

            }

            //LUZ DO FREIO/LENTES
            if (inspecao.getGrupoB().getLuzDoFreioLentes().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Luz do freio/lentes:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLuzDoFreioLentes().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLuzDoFreioLentes().get(a) + "\n");

                }

            }

            //BRAKE-LIGHT
            if (inspecao.getGrupoB().getBrakeLight().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Brake-Light:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getBrakeLight().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getBrakeLight().get(a) + "\n");

                }

            }

            //LUZ DE RÉ
            if (inspecao.getGrupoB().getLuzDeRe().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Luz de ré:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLuzDeRe().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLuzDeRe().get(a) + "\n");

                }

            }

            //LUZ DA PLACA
            if (inspecao.getGrupoB().getLuzDaPlaca().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Luz da placa:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getLuzDaPlaca().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getLuzDaPlaca().get(a) + "\n");

                }

            }

            //6 - SISTEMA ELÉTRICO
            //PARTIDA
            if (inspecao.getGrupoB().getPartida().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Partida:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getPartida().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getPartida().get(a) + "\n");

                }

            }

            //7 - EQUIPAMENTOS DE SEGURANÇA
            //EXTINTOR
            if (inspecao.getGrupoB().getExtintor().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Extintor:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getExtintor().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getExtintor().get(a) + "\n");

                }

            }

            //TRIÂNGULO
            if (inspecao.getGrupoB().getTriangulo().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Triângulo:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getTriangulo().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getTriangulo().get(a) + "\n");

                }

            }

            //8 - SISTEMA CARROCERIA - EXTERNA
            //SILENCIOSO
            if (inspecao.getGrupoB().getSilencioso().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Silencioso:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getSilencioso().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getSilencioso().get(a) + "\n");

                }

            }

            //TUBO DE DESCARGA
            if (inspecao.getGrupoB().getTuboDeDescarga().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Tubo de descarga:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getTuboDeDescarga().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getTuboDeDescarga().get(a) + "\n");

                }

            }

            //PROTEÇÃO TUBO DESCARGA
            if (inspecao.getGrupoB().getProtecaoTuboDescarga().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Proteção tubo descarga:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getProtecaoTuboDescarga().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getProtecaoTuboDescarga().get(a) + "\n");

                }

            }

            //ARTICULAÇÃO
            if (inspecao.getGrupoB().getArticulacao().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Articulação:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getArticulacao().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getArticulacao().get(a) + "\n");

                }

            }

            //VAZAMENTO EXCESSIVO
            if (inspecao.getGrupoB().getVazamentoExcessivo().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Vazamento excessivo:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getVazamentoExcessivo().size(); a++) {

                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getVazamentoExcessivo().get(a) + "\n");

                }

            }

        }



    }

    public void salvarDados(){

        inspecao.setDataHoraRegistro(getPegaDataAtual());

        inspecao.salvar();
    }

    public String getPegaDataAtual() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

        //Calendar calendar = Calendar.getInstance();
        //Date date = new Date();
        //calendar.setTime(date);
        //return calendar.getTime();
        return dateFormat.format(date);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.salvarButton:

                salvarDados();

                Toast.makeText(getApplicationContext(), "Salvo Com Sucesso", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(), SelecionarFichaActivity.class);

                startActivity(i);


                break;
        }
    }
}
