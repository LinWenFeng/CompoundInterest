package JSQ;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Calculate {
	Double capital,sum,rate,year,value;
	JPanel pane;
	boolean flag;
	DecimalFormat df = new DecimalFormat( "0.0000 ");
	public Calculate(JPanel jPanel) {
		pane=jPanel;
	}
	public double simpleInterest(int functionselect,double t1_value,double t2_value,double t3_value) {
		flag=assignedBranchAndJudge(functionselect, t1_value, t2_value, t3_value);
		if(flag)
		{
		switch (functionselect) {
		case 1:
			year=(sum/capital-1)/(rate/100);
			value=year;
			break;
		case 2:
			capital=sum/(year*rate/100+1);
			value=capital;
			break;
		case 3:
			rate=(sum/capital-1)/year*100;
			value=rate;
			break;
		case 4:
			sum=capital*(1+rate/100*year);
			value=capital;
			break;
		default:
			break;
			}
		return Double.parseDouble(df.format(value));
		}
		else
			return 0;
	}
	public double  compoundInterest(int functionselect,double t1_value,double t2_value,double t3_value) {
		flag=assignedBranchAndJudge(functionselect, t1_value, t2_value, t3_value);
		if(flag)
		{
		switch (functionselect) {
		case 1:
			year=Math.log(sum/capital)/Math.log(1+rate/100);
			value=year;
			break;
		case 2:
			capital=sum/Math.pow((1+rate/100),year);
			value=capital;
			break;
		case 3:
			rate=(Math.pow((sum/capital),1/year)-1)*100;
			value=rate;
			break;
		case 4:
			sum=capital*Math.pow((1+rate/100),year);
			value=sum;
			break;
		case 5:
			sum=capital*Math.pow((1+rate/1200),year*12)*(rate/1200)
								/(Math.pow((1+rate/1200),year*12)-1);
			value=sum;
			break;
		default:
			break;
		}
		return Double.parseDouble(df.format(value));
		}
		else 
			return 0;
	}
	public boolean assignedBranchAndJudge(int functionselect, double t1_value,
			double t2_value, double t3_value) {
		boolean jg = true;
		switch (functionselect) {
		case 1:
			capital=t1_value;
			sum=t2_value;
			rate=t3_value;
			if(capital<=0)
			{
				JOptionPane.showMessageDialog(pane, "存款输入有误");
				jg=false;
			}
			else if(sum<=0)
			{
				JOptionPane.showMessageDialog(pane, "本息输入有误");
				 jg=false;
			}
			else if(capital>=sum){
				JOptionPane.showMessageDialog(pane, "本息或存款输入有误");
				jg=false;
			}
			else if(rate<=0||rate>100){
				JOptionPane.showMessageDialog(pane, "利率输入有误");
				jg=false;
			}
			break;
		case 2:
			sum=t1_value;
			year=t2_value;
			rate=t3_value;
			if(sum<=0)
			{
				JOptionPane.showMessageDialog(pane, "本息输入有误");
				jg=false;
			}
			else if(year<=0||year>=100)
			{
				JOptionPane.showMessageDialog(pane, "年限 输入有误");
				jg=false;
			}
			else if(rate<0||rate>100){
				JOptionPane.showMessageDialog(pane, "利率输入有误");
				jg=false;
			}
			break;
		case 3:
			capital=t1_value;
			sum=t2_value;
			year=t3_value;
			if(capital<=0)
			{
				JOptionPane.showMessageDialog(pane, "存款输入有误");
				jg=false;
			}
			else if(capital>=sum){
				JOptionPane.showMessageDialog(pane, "本息输入有误");
				jg=false;
			}
			else if(sum<=0)
			{
				JOptionPane.showMessageDialog(pane, "本息输入有误");
				 jg=false;
			}
			else if(year<=0||year>=100)
			{
				JOptionPane.showMessageDialog(pane, "年限 输入有误");
				jg=false;
			}
			break;
		case 4:
		case 5:
			capital=t1_value;
			year=t2_value;
			rate=t3_value;
			if(capital<=0)
			{
				JOptionPane.showMessageDialog(pane, "存款输入有误");
				jg=false;
			}
			else if(year<=0||year>=100)
			{
				JOptionPane.showMessageDialog(pane, "年限 输入有误");
				jg=false;
			}
			else if(rate<=0||rate>=100){
				JOptionPane.showMessageDialog(pane, "利率输入有误");
				jg=false;
			}
			break;
		default:
			break;
		}
		return jg;
	}
	
}
