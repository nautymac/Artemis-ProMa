# Artemis (ProMa)

3D streaming for lenticular 3D tablets, based on [Artemis](https://github.com/ClassicOldSong/moonlight-android) (a Moonlight Android fork). Stream your PC and watch it in 3D, glasses on. Confirmed working on the **IHQ Skyy 3D** and the **ProMa King Tablet**.

[한국어](#한국어) · [English](#english)

---

## 한국어

패키지 `com.limelight.noirdebug`. **IHQ Skyy 3D**, **ProMa King Tablet** 등 렌티큘러 3D 패널용입니다. Lume Pad 2·Red Magic용 CNSDK 스트리밍 앱은 별도 저장소 [`Lumelight-3D`](https://github.com/nautymac/Lumelight-3D)에 있습니다.

### 핵심 기능

**3D Source: 무엇을 3D로 만들지 고릅니다.** 설정 › 비디오 설정 › 3D Settings에서 호스트가 보내는 영상의 종류를 고릅니다.

- **Side by Side (host sends 3D)** — PC가 이미 SBS를 보낼 때 그대로 넘기고, ProMa 3D 서비스가 위빙합니다.
- **2D to 3D (AI)** — 일반 2D 화면을 AI(MiDaS)로 SBS로 만듭니다.

`Side by Side`는 스트림을 손대지 않고 그대로 넘기는 모드라서, 원래 SBS 입력이면 ProMa가 그대로 3D로 보여줍니다. 스트림 중 메뉴의 **Toggle 3D**로 언제든 2D와 3D를 오갈 수 있습니다. **Start Streams in 3D**를 켜면 연결되자마자 3D로 시작합니다.

- **3D Output = Side-by-Side (3D glasses)** 로 두면 앱이 SBS를 만들고 기기가 렌즈에 맞게 처리합니다.
- ProMa 말고 다른 렌티큘러 패널을 위해, 앱이 직접 컬럼을 엮는 위빙(2뷰·4뷰)도 들어 있습니다.
- 비디오 설정에 **3D Settings** 그룹이 따로 있습니다. 해상도·FPS·비트레이트 · 3D Settings · 고급 순서입니다.
- 커스텀 해상도에 입력한 값이 실제 스트림 해상도로 적용됩니다.

### 설치

[Releases](../../releases)에 디버그 서명 APK가 있습니다. 기기에 직접 설치해서 쓰세요.

### 직접 빌드

필요한 것: JDK 17, Android SDK와 NDK, `git submodule update --init --recursive`. 경로에 공백이 없어야 합니다(NDK 빌드가 처리하지 못합니다).

```
./gradlew assembleNonRoot_gameLenticularDebug
```

APK는 `app/build/outputs/apk/nonRoot_gameLenticular/debug/`에 나옵니다. CNSDK 등 독점 SDK가 전혀 필요 없어 클론만 하면 바로 빌드됩니다.

---

## English

Package `com.limelight.noirdebug`. For lenticular 3D panels — **IHQ Skyy 3D**, **ProMa King Tablet**, and others. The CNSDK streaming app for the Lume Pad 2 and Red Magic lives in a separate repository, [`Lumelight-3D`](https://github.com/nautymac/Lumelight-3D).

### Key features

**3D Source.** In Settings › Video Settings › 3D Settings, pick what kind of picture the host is sending.

- **Side by Side (host sends 3D)** — passed through as-is; the ProMa 3D service weaves it.
- **2D to 3D (AI)** — ordinary 2D is turned into SBS with AI (MiDaS).

`Side by Side` leaves the stream untouched, so when it's already SBS, the ProMa shows it in 3D as-is. **Toggle 3D** in the in-stream menu switches between 2D and 3D at any time. With **Start Streams in 3D** on, a stream starts in 3D as soon as it connects.

- With **3D Output = Side-by-Side (3D glasses)**, the app produces SBS and the device handles it for its lens.
- For other lenticular panels, the app can also weave columns itself (2-view and 4-view).
- Video Settings has its own **3D Settings** group, in the order Resolution · FPS · Bitrate · 3D Settings · Advanced.
- A custom resolution you enter is the resolution actually streamed.

### Install

Debug-signed APKs are on the [Releases](../../releases) page. Sideload onto the device.

### Building

You need JDK 17, the Android SDK and NDK, and `git submodule update --init --recursive`. The path must not contain spaces (the NDK build can't handle them).

```
./gradlew assembleNonRoot_gameLenticularDebug
```

The APK lands in `app/build/outputs/apk/nonRoot_gameLenticular/debug/`. No proprietary SDK is needed, so a plain clone builds straight away.

---

## Credits · License

- Based on [Artemis](https://github.com/ClassicOldSong/moonlight-android) by ClassicOldSong and [Moonlight](https://github.com/moonlight-stream/moonlight-android). Its original README is in [docs/artemis-upstream-readme.md](docs/artemis-upstream-readme.md).
- Licensed under GPL-3.0 ([LICENSE.txt](LICENSE.txt)).
