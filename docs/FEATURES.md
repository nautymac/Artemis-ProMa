# Artemis (ProMa) — 기능 안내

[한국어](#한국어) · [English](#english)

## 한국어

PC 화면을 스트리밍해서 **ProMa King에서 3D 안경을 끼고** 보는 앱.

### PC가 보내는 영상을 3D로 만드는 두 가지 방법

설정 › 비디오 설정 › 3D Settings › **3D Source**에서 고른다.

- **Side by Side (host sends 3D)** — PC가 이미 좌우로 나뉜 3D 화면을 보내고 있을 때, 그대로 넘기면 ProMa의 3D 기능이 위빙한다.
- **2D to 3D (AI)** — 평범한 2D 화면을 AI(MiDaS)가 자동으로 좌우 3D 화면으로 만들어준다.

`Side by Side`는 스트림을 그대로 넘기는 모드라서, 원래 3D로 보내던 영상은 그냥 3D로 보인다.

### 스트림 중에 바로 켜고 끄기

- **Toggle 3D** — 스트림 메뉴에서 3D와 평면 화면을 즉시 전환.
- **Start Streams in 3D** — 켜두면 연결되자마자 자동으로 3D로 시작.

### 다른 렌티큘러 패널도 지원

ProMa 전용 기능(Side-by-Side (3D glasses))과 별개로, 앱이 직접 화면을 엮어 짜는 위빙 기능도 들어 있다(2뷰·4뷰). ProMa가 아닌 다른 렌티큘러 3D 패널에서도 쓸 수 있다.

### 설정이 정리돼 있다

비디오 설정에서 해상도·FPS·비트레이트 다음에 **3D Settings**가 따로 묶여 있어서 찾기 쉽다. 커스텀 해상도를 입력하면 그 값 그대로 스트리밍된다.

---

## English

Stream your PC and watch it on a **ProMa King with 3D glasses**.

### Two ways to turn what the PC sends into 3D

Pick one in Settings › Video Settings › 3D Settings › **3D Source**.

- **Side by Side (host sends 3D)** — when the PC already sends a split 3D picture, it's passed straight through and the ProMa's own 3D handling weaves it.
- **2D to 3D (AI)** — ordinary 2D is automatically turned into a split 3D picture by AI (MiDaS).

`Side by Side` leaves the stream untouched, so anything already sent in 3D just shows in 3D.

### Switch on the fly

- **Toggle 3D** in the stream menu switches between 3D and flat at any time.
- **Start Streams in 3D** starts every stream already in 3D.

### Also works on other lenticular panels

Alongside the ProMa-specific mode (Side-by-Side (3D glasses)), the app can also weave the picture itself into columns (2-view and 4-view) — useful for lenticular 3D panels other than the ProMa.

### Settings kept tidy

Video Settings has a dedicated **3D Settings** group right after Resolution, FPS and Bitrate, so it's easy to find. A custom resolution you type in is the resolution actually streamed.
