# [서퍼톤] codeSCH team - Server
2024.08.19 ~ 2024.08.20

<img src="https://github.com/user-attachments/assets/8245afce-22dc-4fa8-a96e-f31970cb71c1" width="600"/>
<br>

## 천원의 아침밥이란?
아침식사 결식률이 높은 대학생에게 양질의 아침식사를 천 원에 제공하여 젊은 층의 아침식사 습관화와 쌀 소비문화 확산을 농식품부와 대학이 함께 지원하는 서비스<br>
<img src="https://github.com/user-attachments/assets/6d97eccc-6604-4b2c-8995-e05f9a95c73b" width="800"/>
- 천원의 아침밥은 오전 8:00 ~ 10:00 까지 이용 가능하며, 순천향대의 경우 식당마다 100개로 제한
- 제한 수량이 소진 될 경우 조기 마감

<br>

## 천원의 아침밥의 문제점
1️⃣ 천원의 아침밥을 이용하기 위해 오픈 전부터 미리 줄을 서있어 제시간에 와도 못 먹는 상황 발생

2️⃣ 재고를 확인하려면  직접 매장 가서 확인해야 하는 불편함 발생

3️⃣ 이용하려 줄을 서서 기다렸지만, 선착순 안에 들지 못해 돌아가는 경험 존재

<br>

## 서비스 개발 목적 📍

- 학생들이 식당까지 직접 방문하지 않고 원하는 메뉴의 남은 수량을 실시간으로 확인
- 현장 QR 결제를 통해 보다 편리하고 정확한 이용자 수 체크 필요
- 급하게 나오는 학생들을 위해 한 화면에 실시간 날씨 정보 제공

<br>

<br>

## 서비스 ① - 온라인 QR 결제기능
- 매장에서 제시되는 QR 코드를 통해 원하는 메뉴 결제 가능
- QR 코드는 일정 시간 마다 갱신 -> 현장에 있는 인원만 결제 가능
- KG 이니시스 결제 대행 서비스를  통해 다양한 결제 옵션 제공
<img src="https://github.com/user-attachments/assets/2a6b1779-d8ae-453a-be00-45c6c25bd708" width="500">

<br>

<br>

## 서비스 ② - 실시간 인원 수 모니터링
1. 시영지기 현장에 있는 qr코드를 통해 결제
2. 결제 완료된 메뉴의 카운트 수가 실시간으로 증가
3. 결제가 정상적으로 이루어지면 서버로 결제 정보 전송
<img src="https://github.com/user-attachments/assets/e8d37f89-d1e5-40c6-ada5-94c15f8c90dd" width="500">

<br>

<br>

## 서비스 ③ - 실시간 날씨 정보 제공
실시간 날씨 정보를 제공하여 사용자에게 현재의 날씨 상태(맑음, 비, 눈 등), 온도, 강수량 등의 정보를 시각적으로 전달 
<img src="https://github.com/user-attachments/assets/42ff3db9-721a-4556-836c-adbdf60c9ab2" width="700">

<br>

<br>

## 서비스 시나리오
<img src="https://github.com/user-attachments/assets/9563676d-a4b9-4653-964b-38275afb8f12" width="700">

<br>

<br>

### 아키텍처
<img src="https://github.com/user-attachments/assets/88a85217-e66c-42c0-a494-d2d7011b1def" width="700">

<br>

<br>

### Awards and Activities

<b>2024 벤처 스타트업 아카데미 해커톤 대회 - 서퍼톤, Challenge the Code Wave 출전</b>

<br>

<b>2024 벤처스타트업아카데미 앱, 게임 개발 경진대회 ` 대상 ` 수상 🏆 </b>












