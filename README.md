# MiniProject_Perfume
# 1. PREVIEW & 개요

Today To ME, **오나나**

오늘 나는 나에게 무엇을 선물할까?

뭔가 허전함을 느낄 때. 오늘 나는 나에게 부족한 2%를 채워줄 향수를 추천해드립니다.

당신의 상황과 취향에 맞는 향수를 통해 만족스러운 나날을 보내세요.


![슬라이드1](https://user-images.githubusercontent.com/67991236/105117331-aa04a400-5b0f-11eb-9b20-560cbcb017e4.JPG)






# 2. 프로젝트 요구사항

![슬라이드2](https://user-images.githubusercontent.com/67991236/105117348-aec95800-5b0f-11eb-9b36-78109ffdaf83.JPG)

- **취향에 맞는 흔하지 않은 향수를 소개**
- **여러 질문들을 통한 결론 도출 (점수 합계 계산)**

**자신만의 고유한 취향을 추구하게 된 현대사회**

현대 사회의 사람들은 생활 수준 향상과 더불어 자기 자신만의 고유한 취향을 추구하게 되었다. 그래서 내적, 외적인 면에서 관심과 투자가 늘어나고 있는데, 그 중심에 와인과 향수가 있다. 향수와 와인은 향기를 통해 그 사람의 취향과 이미지를 후각으로 전해주며 직접 보지도 않고 향기를 통해 상상을 할 수 있게 만들어준다.

**다양한 수요에 비해 단편적인 소비의 실태**

이러한 사회 흐름 속에서 향수와 와인 시장은 많은 잠재 가능성을 가지고 있지만, **유명 브랜드 회사들이 독점적으로 향수 시장을 이끌어가고 있는 실정에 국한**되어 사람들의 다양한 취향을 반영하고 있지않다. 또한 **자신의 취향이 어떤 지 잘 모르고 유명 브랜드 회사의 제품을 사용하는 경우**도 많다. 따라서 본 프로젝트는 개개인의 상황과 취향을 반영하여 제품을 추천해주는 것에 의미가 있으며, 다양한 브랜드의 제품을 알려주는 것에 의의가 있다.

<김민아, 향수의 사용 실태 및 구매 행동에 관한 연구, 석사학위 논문, 숙명여대,2015, 5p 참조>

# 3. 담당 기능

**김주연**

GUI, 향수 소개, 입출력 기능, 로직 설계

# 4. 개발 목표 및 설계 주안점

**개발 목표**

1. 사람들의 취향을 반영한 향수를 추천하며, 개개인의 취향을 알려주는 것에 목표가 있다.
2. 그 날의 기분이나 상황을 반영한 향수를 추천하여 개인의 기분을 완화시키거나 삶의 만족도를 높이는 것에 목표가 있다.

**설계 주안점**

1. 어떤 상황이나 어떤 성향인가에 따른 질문 세분화
2. 질문의 분류화를 통한 개인의 특성을 점수화하여 결론 도출


![슬라이드4](https://user-images.githubusercontent.com/67991236/105117378-ba1c8380-5b0f-11eb-9530-e8eddbc6baf1.JPG)

# 5. 핵심 구현 기술

**GuI 구현, 질문을 통한 점수 합계 계산**

1. 질문 1번 &2번 : 가격적인 부분에서 취향을 향유할 때 가용비용.
2. 질문 3번 &4번 : 내향적인 성향이 강한지 외향적인 성향이 강한지를 물어봄으로써 타인에게 잘보이고싶어서 구입하는 향수인지 아니면 혼자 즐기고싶어서 사용하는 것인지 알아봄.
3. 질문 5번 &6번 : 개성적인 부분에 대해 질문을 합니다. 자신의 개성이 얼마나 강한지에 따라 도전적인 향수를 택할 수 있느냐 없는냐를 알아봄.
4. 질문 7번 &8번 :  평소에 추구하는 온도에 대해 알아보고 그 온도에 따라 따뜻한 느낌의 향수를 추천할 것인지, 차가운 느낌의 향수를 추천할 것인지 결정.

![image](https://user-images.githubusercontent.com/67991236/105116990-1337e780-5b0f-11eb-89f4-28a46ac0e9c5.png)
![image](https://user-images.githubusercontent.com/67991236/105117014-1df27c80-5b0f-11eb-89cd-52df2272a060.png)
![image](https://user-images.githubusercontent.com/67991236/105117088-40849580-5b0f-11eb-903e-622064d02172.png)

![image](https://user-images.githubusercontent.com/67991236/105117642-2c8d6380-5b10-11eb-82aa-8e41d0996e50.png)
![image](https://user-images.githubusercontent.com/67991236/105117643-2e572700-5b10-11eb-821d-6f4b66d38372.png)
![image](https://user-images.githubusercontent.com/67991236/105117645-31521780-5b10-11eb-973e-e81bf55a1f62.png)

![image](https://user-images.githubusercontent.com/67991236/105117666-39aa5280-5b10-11eb-9c2b-90df498adda5.png)
![image](https://user-images.githubusercontent.com/67991236/105117672-3c0cac80-5b10-11eb-8817-c35e85910f30.png)
![image](https://user-images.githubusercontent.com/67991236/105117676-3e6f0680-5b10-11eb-85a7-5f7f576a152f.png)

![image](https://user-images.githubusercontent.com/67991236/105117688-4333ba80-5b10-11eb-8774-15c8e5e3f31e.png)
![image](https://user-images.githubusercontent.com/67991236/105117696-475fd800-5b10-11eb-87e1-0ac85fc15a50.png)


**gif파일 Gui에서 구현**


![image](https://user-images.githubusercontent.com/67991236/105117699-49c23200-5b10-11eb-8789-17fc2b9fbf3d.png)


**사용자 이름 입력받아 출력**

![image](https://user-images.githubusercontent.com/67991236/105118027-e97fc000-5b10-11eb-867d-c2804bbaaf96.png)
![image](https://user-images.githubusercontent.com/67991236/105118030-ebe21a00-5b10-11eb-8e7e-0428f04f6150.png)

# 6. 구현기간

## 1) 프로젝트 기획 기간

`2021.01.12 ~2021.01.13`    주제선정 아이디어 회의 및 Use Case 만들기

`2021.01.13 ~2021.01.15`    도메인 설계 

## 2) 프로젝트 구현 기간

`2021.01.15~2021.01.17`  구현(코딩) 테스트

`2021.01.17~2021.01.18`   final coding test
`2021.01.18~2021.01.20`   보고서 (영상, PPT) 작성

# 7. 사용 언어 및 도구

개발언어 : `java`

IDE : Eclipse

O/S : Windows 10

# 8. 프로젝트 참여 소감

 첫번째로 참여한 프로젝트였기때문에 

# 9. 별첨
