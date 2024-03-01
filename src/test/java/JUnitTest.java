import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2는 3이다.") // 테스트 이름
    @Test // 테스트 메서드
    public void junitTest(){
        int a=1;
        int b=2;
        int sum=3;

        // 값이 같은지 확인, 검증 메서드: assertEquals(), 첫번째 인수: 기대 값, 두번재 인수: 검증 값
        Assertions.assertEquals(sum,a+b);
    }

//    @DisplayName("1 + 3는 4이다")
//    @Test
//    public void junitFailedTest() {
//        int a = 1;
//        int b = 3;
//        int sum = 3;
//
//        Assertions.assertEquals(a + b, sum); // 실패하는 케이스
//    }
}