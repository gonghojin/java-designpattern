목적
---
구현체로부터 추상화를 분리시키다. 결과적으로 두 개로 독립적으로 만들어 진다.  
Bridge pattern은 상속보다는 조립을 선호한다. 해당 계층 구현체의 세부정보는 분리된 다른 계층의 객체에 push 된다.

의도
---
+ abstraction과 its implementation을 영구적으로 binding하지 않으려 할 때, 예를들면 implementation이 run-time 중 선택되거나 변경되어야 할 때
+ abstraction과 their implementations이 subclassing에 의해 확장할 수 있어야 한다.이 경우 Bridge 패턴을 사용하여 서로 다른 abstraction과 their implementations을 결합하고 독립적으로 확장 할 수 있습니다.
+ abstraction implementation의 변화가 client에게 영향을 주어서는 안 된다. 즉 해당 코드를 다시 컴파일 할 필요가 없다. 