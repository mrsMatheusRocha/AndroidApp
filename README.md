# 🛡️ GeoShield - Painel Operacional (Defesa Civil)

![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android_Studio-Iguana+-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-Material_3-4285F4?style=for-the-badge&logo=android&logoColor=white)
![Status](https://img.shields.io/badge/Status-Global_Solution_FIAP-000000?style=for-the-badge&logo=fiat&logoColor=white)

Aplicativo Android nativo desenvolvido como parte da **Global Solution da FIAP**. O **GeoShield (Módulo Defesa Civil)** é uma ferramenta tática de interface gráfica reativa projetada para agentes em campo. O sistema permite a visualização, filtragem e mitigação de alertas climáticos e desastres ambientais em tempo real.

---

## 📸 Telas da Aplicação

<p align="center">
  <img src="https://via.placeholder.com/250x500.png?text=1.+Home+Screen" width="200" style="margin-right: 10px;">
  <img src="https://via.placeholder.com/250x500.png?text=2.+Lista+de+Alertas" width="200" style="margin-right: 10px;">
  <img src="https://via.placeholder.com/250x500.png?text=3.+Detalhes+do+Alerta" width="200">
</p>

---

## ✨ Arquitetura e Estrutura do Projeto

O projeto segue estritamente as boas práticas de desenvolvimento mobile contemporâneo, separando responsabilidades lógicas e visuais. A base de código está dividida nos seguintes pacotes principais:

* 📁 **`ui.theme`**: Concentra as definições de cores, formas e a tipografia base do sistema.
* 📁 **`ui.screens`**: Contém os componentes reativos (`@Composable`) das 3 telas principais do aplicativo.
* 📁 **`model`**: Define as entidades de dados (`Regiao` e `AlertaEvento`) e o repositório de *Mock Data* para testes de interface.
* 📁 **`navigation`**: Isola o `NavHost` e a lógica de roteamento entre telas, evitando acoplamento de navegação dentro das Views.

---

## 🎨 Identidade Visual e Branding

O aplicativo utiliza o **Material Design 3** em conjunto com uma tipografia customizada para transmitir a urgência e a clareza exigidas por um sistema de Defesa Civil:
* **Teko (Bold, 42sp):** Utilizada em títulos e *Headlines* principais, garantindo peso visual, impacto e legibilidade rápida (aspecto de "alerta/urgência").
* **Roboto (Normal, 16sp):** Aplicada no *Body* e em descrições extensas, garantindo o conforto visual na leitura de dados técnicos.

---

## 🚀 Funcionalidades e Interatividade (Jetpack Compose)

O sistema foi construído de forma **100% declarativa** e conta com 3 telas principais desenhadas para maximizar a eficiência do agente:

1. **Tela Inicial (Home):** Apresenta o *branding* do GeoShield e o ponto de entrada seguro para o painel de operações, utilizando os componentes de Scaffold e alinhamento do Compose.
2. **Tela de Alertas (AlertListScreen):** * Utiliza `LazyColumn` para renderização otimizada e performática em listas grandes.
   * **Interação de Estado:** Implementa um `FilterChip` interativo. Ao clicar em "Alta Gravidade", o Compose reage instantaneamente (`recomposition`) e filtra na tela apenas os alertas de nível 4 ou 5, poupando o tempo do agente.
3. **Detalhes da Ocorrência (AlertDetailScreen):**
   * Exibe o detalhamento completo do *Mock Data*, incluindo ID, data e a população afetada na região vulnerável.
   * **Ação Operacional:** Um botão de interação permite que o agente altere o estado do alerta para "Mitigado" (resolvido). A interface reage a essa mudança de estado, desabilitando o botão e alterando seu texto para confirmar o sucesso da operação de baixa.

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Android Studio (versão Hedgehog ou superior)** instalado.
2. Clone o repositório localmente:
   ```bash
   git clone https://github.com/mrsMatheusRocha/AndroidApp.git
   Abra a pasta do projeto no Android Studio.

3. Aguarde o Gradle Sync finalizar o download das dependências do Jetpack Compose e da Navigation Compose.

4. Inicie um Emulador (API 24+) ou conecte um dispositivo físico via USB/Wi-Fi.

5. Pressione Shift + F10 ou clique no botão Run (▶️).

---

## 👥 Equipe Desenvolvedora

Projeto desenhado e desenvolvido com foco em UI Reativa e Clean Architecture.

- Matheus Rocha Sousa 

- Luciano Henrique Gonçalves D'Oliveira
