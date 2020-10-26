package day07;

/**
 * @ClassName BaseEmployeeTest
 * @Description TODO
 * @Author lenovo
 * @Date 2020/10/26
 **/

public class BaseEmployeeTest {
    @Test
    public void print(){

    }
    @Test
    public void getSalary(){
        BaseEmployee be=new MarkEmployee("admin");
        assertEquals(3000,be.getSalary());
    }
}
