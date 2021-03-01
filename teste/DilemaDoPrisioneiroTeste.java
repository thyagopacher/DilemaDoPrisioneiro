
import org.junit.Assert;
import org.junit.Test;

import com.DilemaDoPrisioneiro;
import com.DilemaDoPrisioneiro.Resposta;


/**
 * @author ThyagoHenrique
 *
 */
public class DilemaDoPrisioneiroTeste {

	@Test
	public void test() {
		Resposta respostaSuspeitoA = Resposta.NEGACAO;
		Resposta respostaSuspeitoB = Resposta.DELACAO;
		 
		DilemaDoPrisioneiro dp = new DilemaDoPrisioneiro();
		Assert.assertNotNull(dp);
		 
		int penaSuspeitoA = dp.calculaPena(respostaSuspeitoA, respostaSuspeitoB);
		int penaSuspeitoB = dp.calculaPena(respostaSuspeitoB, respostaSuspeitoA);
		 
		Assert.assertEquals(10, penaSuspeitoA);
		Assert.assertEquals(0, penaSuspeitoB);
	}

}
