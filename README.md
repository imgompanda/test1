# 오늘의 한 문장 메모장 (Today One Line Memo)

## 프로젝트 개요

'오늘의 한 문장 메모장'은 사용자가 하루에 한 번만 메모를 작성할 수 있는 미니멀 안드로이드 애플리케이션입니다. 간단하고 직관적인 UI로 중요한 생각이나 순간을 기록하는데 집중할 수 있습니다.

## 🛠️ 개발 환경

- **Android Studio**: Koala (2024.1.x)
- **JDK**: OpenJDK 17.0.13 (Eclipse Adoptium)
- **Gradle**: 8.7
- **Kotlin**: 1.9.22
- **OS**: macOS 15.4 (Apple Silicon, aarch64)
- **Compose Compiler**: 1.5.1
- **Compose BOM**: 2024.06.00

## 프로젝트 설정입니다.

- **compileSdk**: 34 (Android 14)
- **minSdk**: 24 (Android 7.0 Nougat)
- **targetSdk**: 34 Android 14
- **앱 버전**: 1.0.0

## 주요 라이브러리

- **Jetpack Compose**: UI 구현 (BOM 2024.06.00)
- **Material3**: 머티리얼 디자인 컴포넌트
- **Navigation Compose**: 화면 간 네비게이션
- **Activity Compose**: Compose 통합
- **Material Icons Extended**:

## 기술 스택

- **UI 프레임워크**: Jetpack Compose
- **아키텍처**: MVVM (Model-View-ViewModel)
- **상태 관리**: ViewModel, LiveData/Flow (계획됨)
- **데이터 저장**: Room Database, SharedPreferences (계획됨)
- **의존성 주입**: Hilt

## 핵심 기능 (계획됨)

- **메모 작성 및 저장**: 간단한 형태의 텍스트 메모 기록
- **하루 한 번 제한**: SharedPreferences를 사용한 작성 횟수 제한
- **메모 기록 보기**: 이전에 작성한 메모 확인
- **최소한의 UI**: 미니멀리즘에 중점을 둔 사용자 인터페이스

## 현재 상태

현재 이 앱은 강의 및 테스트 목적으로 개발되었으며, UI 프레임워크와 기본 화면 구조만 구현되어 있습니다. 실제 기능은 아직 구현되지 않았습니다.

## 폴더 구조

```
app/
├── java/
│   ├── com.example.test2/                # 메인 패키지 (MainActivity)
│   └── com.example.todayonelinememo/     # 기능 모듈
│       ├── data/                        # 데이터 계층 (계획됨)
│       ├── ui/                          # UI 계층
│       │   ├── theme/                   # Compose 테마
│       │   └── view/                    # 화면 컴포넌트
│       └── util/                        # 유틸리티 (계획됨)
└── res/                                 # 리소스 파일
```

## 빌드 및 실행 방법

1. **Android Studio Koala** (2024.1.x) 이상 버전을 설치합니다.
2. 프로젝트를 클론 또는 다운로드합니다.
3. Android Studio에서 프로젝트를 엽니다.
4. Gradle 동기화를 실행합니다.
5. 에뮬레이터나 실제 기기에 앱을 설치하고 실행합니다.

## 강의 참고사항

이 프로젝트는 다음 강의 주제에 활용될 수 있습니다:

- Jetpack Compose 기본 UI 구현
- Material3 디자인 시스템 적용
- Navigation Compose를 통한 화면 전환
- MVVM 아키텍처 패턴 구현 (향후 추가 예정)
- 데이터 영속성 관리 (향후 추가 예정)

## 라이센스

개인 개발 및 교육 목적으로 제작되었습니다.

## 개발자 정보

- 개발자: [박형우]
- 이메일: [boroow051@gmail.com]

123123

- 개발 일자: 2025년 4월
