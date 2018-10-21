요약
---
다수의 세분화된 객체를 효울적으로 지원하기 위해서 공유를 사용한다.  
**유사한 객체와 가능한 한 많이 공유를 함으로써, 메모의 사용이나 계산 비용을 최소화 하기 위해서 사용한다.**  

응용
---


플라이급 패턴의 효율성은 사용 방법 및 위치에 크게 의존합니다. 다음 사항이 모두 해당되면 플라이급 패턴을 적용하십시오.

+ 응용 프로그램은 많은 수의 객체를 사용합니다.
+ 엄청난 양의 물체 때문에 스토리지 비용이 높습니다.
+ 대부분의 객체 상태는 외부 객체로 만들 수 있습니다.
+ 외래 상태가 제거되면 많은 객체 그룹이 비교적 소수의 공유 객체로 대체 될 수 있습니다.
+ 응용 프로그램은 객체 ID에 의존하지 않습니다. 플라이급 객체가 공유 될 수 있기 때문에, 신원 확인 테스트는 개념적으로 다른 객체에 대해 true를 반환합니다.

~~~
PotionFactory factory = new PotionFactory();
factory.createPotion(PotionType.INVISIBILITY).drink(); // You become invisible. (Potion=6566818)
factory.createPotion(PotionType.HEALING).drink(); // You feel healed. (Potion=648129364)
factory.createPotion(PotionType.INVISIBILITY).drink(); // You become invisible. (Potion=6566818)
factory.createPotion(PotionType.HOLY_WATER).drink(); // You feel blessed. (Potion=1104106489)
factory.createPotion(PotionType.HOLY_WATER).drink(); // You feel blessed. (Potion=1104106489)
factory.createPotion(PotionType.HEALING).drink(); // You feel healed. (Potion=648129364)
~~~
