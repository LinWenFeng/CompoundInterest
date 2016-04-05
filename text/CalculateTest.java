
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import JSQ.Calculate;

public class CalculateTest {

	Calculate calculate=new Calculate(null);
	
	@Test
	public void testSimpleInterest() {
		double a,b,c,d,e,f,g,h;
		a=calculate.simpleInterest(1, -100, 110, 10);//存款为负数
		b=calculate.simpleInterest(1, 100, -110, 10);//本息为负数
		c=calculate.simpleInterest(1, 110, 100, 10);//存款比本息还高
		d=calculate.simpleInterest(1, 100, 110, 200);//利率过高
		e=calculate.simpleInterest(1, 100, 110, -30);//利率为负数
		f=calculate.simpleInterest(2, 100, 110, 10);//年限过高
		g=calculate.simpleInterest(2, 100, -10, 10);//年限为负数
		h=calculate.simpleInterest(1, 100, 110, 10);//正确输入
		assertThat(a,is(0.0));
		assertThat(b,is(0.0));
		assertThat(c,is(0.0));
		assertThat(d,is(0.0));
		assertThat(e,is(0.0));
		assertThat(f,is(0.0));
		assertThat(g,is(0.0));
		assertThat(h,is(1.0));
	}

	@Test
	public void testCompoundInterest() {
		
	}

}
