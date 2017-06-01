package mobile.zxjt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testmatch {
	public static void main(String[] args) {
		String str = "{\"cljg\":[{\"code\":\"MP1B000000\",\"message\":\"证券帐户查询成功\"}],\"dlxx\":[{\"fxts\":\"\",\"gtmc\":\"北京2-预上线测试\",\"khbz\":\"\",\"khdm\":\"180300015626\",\"khsx\":\"0\",\"khxm\":\"测试626\",\"token\":\"\",\"wtrq\":\"20170406\",\"xtrq\":\"20170406\",\"xtzt\":\"0\",\"xtztsm\":\"正常运行\",\"yhdm\":\"\",\"yszjzh\":\"80316041\",\"yybdm\":\"1803\",\"yybjc\":\"深圳深南中路证券营业部\",\"zjdlrq\":\"2017-04-06\",\"zjdlsj\":\"13:44:26\",\"zjzh\":\"80316041\"}],\"gdlb\":[{\"gddm\":\"0002387275\",\"jysdm\":\"0\",\"jysjc\":\"深Ａ\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"0\",\"zdbzsm\":\"未指定\"},{\"gddm\":\"0506388697\",\"jysdm\":\"0\",\"jysjc\":\"深Ａ\",\"zcbz\":\"1\",\"zcbzsm\":\"从\",\"zdbz\":\"0\",\"zdbzsm\":\"未指定\"},{\"gddm\":\"A286552605\",\"jysdm\":\"1\",\"jysjc\":\"沪Ａ\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"1\",\"zdbzsm\":\"指定交易\"},{\"gddm\":\"0001234567\",\"jysdm\":\"2\",\"jysjc\":\"深Ｂ\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"0\",\"zdbzsm\":\"未指定\"},{\"gddm\":\"CB12345678\",\"jysdm\":\"3\",\"jysjc\":\"沪Ｂ\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"1\",\"zdbzsm\":\"指定交易\"},{\"gddm\":\"A286552605\",\"jysdm\":\"6\",\"jysjc\":\"沪港通\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"0\",\"zdbzsm\":\"未指定\"},{\"gddm\":\"0098015626\",\"jysdm\":\"4\",\"jysjc\":\"股转A\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"0\",\"zdbzsm\":\"未指定\"},{\"gddm\":\"0002387275\",\"jysdm\":\"9\",\"jysjc\":\"深港通\",\"zcbz\":\"0\",\"zcbzsm\":\"主\",\"zdbz\":\"0\",\"zdbzsm\":\"未指定\"}]}";
		String strReg = ".*code\":\"MP1B000000.*message\":\"证券帐户查询成功";
		Pattern pattern = Pattern.compile(strReg);
		Matcher mat = pattern.matcher(str);
		boolean b = mat.find();
		System.out.println(b);
	}
}
