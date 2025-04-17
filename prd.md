

⸻

✅ 1. Project Overview (프로젝트 개요)

앱 이름: My Device Info (또는 DeviceStatusViewer)
목적: 사용자의 디바이스 상태(배터리, 네트워크, OS 등)를 한눈에 보여주는 Android 앱
타깃 사용자: 일반 사용자, 개발자, 테스트 목적의 QA
사용 기술: Kotlin  기반 / MVVM 아키텍처

⸻

✅ 2. Core Functionality (핵심 기능)

기능 설명
🔋 배터리 정보 확인 배터리 잔량, 충전 상태 조회 (BatteryManager)
📶 네트워크 상태 확인 Wi-Fi 연결 여부, 네트워크 타입 (ConnectivityManager)
📱 디바이스 정보 모델명, 제조사, OS 버전, API 레벨 (Build.VERSION, Build.MODEL)
💾 저장 공간 조회 내부 저장소 총 용량 / 사용 가능 용량 (StatFs)
🌐 위치 권한 여부 위치 권한 허용 여부 확인 (권한 요청 UI 포함)

⚠️ 모든 기능은 시뮬레이터에서 동작 가능한 항목으로 구성

⸻

✅ 3. Docs


⸻

✅ 4. File Structure (폴더 구조)


.
├── app
│   ├── build.gradle  // 앱 레벨 build.gradle
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── mydeviceinfo
│   │   │   │               ├── data        // 데이터 처리 (Repository, DataSource)
│   │   │   │               ├── di          // 의존성 주입
│   │   │   │               ├── domain      // 비즈니스 로직 (UseCase, Model)
│   │   │   │               ├── presentation // UI 관련 (Activity, Fragment, ViewModel)
│   │   │   │               │   └── ui
│   │   │   │               │       └── main
│   │   │   │               │           ├── MainActivity.kt
│   │   │   │               │           └── MainViewModel.kt
│   │   │   │               └── util        // 유틸리티 클래스
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── values
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   └── ... (drawable, mipmap 등)
│   │   │   └── AndroidManifest.xml
│   │   └── ... (test, androidTest)
│   └── ...
├── build.gradle      // 프로젝트 레벨 build.gradle
├── .gitignore
└── README.md