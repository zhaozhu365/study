package study.zhaozhu.written_examination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindCoder {
	public static void main(String[] args) {
		
		final String regex = "coder";
		
		String s1 = "coder";
		String s2 = "codercoder";
		String s3 = "im a codercoder";
		String s4 = "im a code";
		
		
//		System.out.println(s1.split(regex).length);
//		System.out.println(s2.split(regex).length);
//		System.out.println(s3.split(regex).length);
//		
//		s1.indexOf(regex);
		
		String[] ss = {s1, s2, s3, s4};
		
		String[] ss2 = {"coder","tsfncoderfykdqcoderysjcodermrrscodermrcoderthswcodernicoderdjfcoderitktccoderavqtcoderkcoderjmdacoderncoderxzksacoderncoderlmxhcodereyuzcoder","bjcodermqkgacoderbbacoderykcoderycoderutmlscodercxecoderkcodergcoderunsrcoderkhcoderzcoderaafcoderayvcoderkzjcoderacoderacoderrcoderibpycoder","jvcoderhcoderblcoderyjcoderaoycodersadxccodermxrcoderkbmyncoderfocoderqcoder","qfpcodermcoderyjftcoderfghfcoderocoderuxcoderblngccoderpjshcoderjyprcoderkcoderprucodersumcoder","ihcoderfawecodertpvmfcoderxcoderjbdcoderqcoderpfcaqcoder","nycoder","ffgicoderxecoderpqzcoderwjcoder","yjscoderbcoderahncodercrbzcoderfvetcodergmzpqcoderqzeocoderdmpcoderqqajcoderhhjacoderpcoderwycoderpyzcoder","csbcoder","znpcoderwfcoderbhcodertygmcoderzccoderglwtlcoderekcoderpjvvcoderfucodervhcoderlgqlkcoderhzasfcoderacoderlgnycoderslrdqcoderknbbcoderzdexcoderbmapocodercivvcoder","wwcoderwcoderzcodericoderyhcoderojldcoderzitcoder","bcoderpbbecoderccoderikcoder","ciuwgcoderlwecodergcoderubfccodersrgscoderbjbeacodergyvcodertqccoder","lnmgcoderatcoderofcoderbjcoder","itqocoderbatccoderxfnajcoderhlicoderltmocoderchrncodernzcoderlkgucoderucoderrkakqcoderiezcoderrucoderccodernkicoder","nlxuocoderiwcoderoacjcoderoncodergdpmcoderkldbrcoderlxfjwcoderzhcoderzfecodertcoderrmcodercrjcodericoderqquazcodereowmcodergrjcoderpqaaucodergbhvrcoder","sjecoderuudacoderkntcoderjmdncoderbrcoderopqcoderaqcoderwcoderpcoderiycoderuwcoderecoderxubncoderhkbcodersxjcoderykwldcoderqwagcoderwcodervfcoderucoder","prcoderroobcoderpellcoderfycoderzcoderycoderbmwucoderbzbhcoderypqwscoderincodergapycoderzfcoderuocoderqdxrcoderlnihjcoderkcoder","qcoderfufjocoderntsrjcoder","kzjbwcoderxkrohcodermnjcodermsvmcoderbgcoderjqiuhcoder","swfcoderjycoderrjdgpcoder","nhzwcoderqlbmcoderwqqecodertkgdwcoderbcoderbpscodersvcoderyiikcoder","jcoderfyvycoderxxcoderucoderrcoderxuublcoderuncoderecoderdehycodergqgycodervcoderqcodertvjpbcoderbcoderhecoderecoder","ccoderlftwcoderjoffcodercviecoderczcodervliucoderkkubcoderrwrmcoderpcoderpcoderbspucodercwcoderfgeozcodercgiqhcoderkcoderunmccoderecoderpcoderjcodergcoder","tkcoderlecoderlszcoder","dxrvcoderugkcoderxpfmcodernsvdrcodercpooxcoderfxcoderqdocoderivjigcoderjvcoderqpcoderqfbcoder","htdecoderrvcoderrcoderudnljcodervsicoderglrmcoderrcoderpfscoderiltvscoderxpkijcodertcoderwcodertqwswcoderqoopcoderjcsyacodermdjcoderhsxkcodernlcoderjbvcoder","mvkwcoderileitcodereyqcoderpwpzcoderuzcodertlqzcoderepxucoderdzaucoderezcoderjcacoderycoder","icodercozcoderhcoderrwmndcodernyocgcoderbhpbcoderkdghbcoderiscoderkbrqncoderqcoder","wnytccoder","pucodervcoderuwzqcoderqlcoderxecoderhamcoderqclgfcoderhcoderoicoderxcoderamlfbcoder","kkcoderjpvjcoderucoderfecoderrcoderxhxicoder","wqhhcoderpjfcoderncoderbcccoderzwyedcoderheqcoderuacoderaifrbcoderxcoderwcocodertlzscodernrdxncoderuhfeacoderdvcoderhjleicoderpcoderbbgcoderrvypicoderdpcoder","apcoderqpyycodereahpcodernwghkcoderntcoderykcodergpoxcoderpgwcodernqwbcoderjdddicoderbgknkcoder","vgvcoderudncoderikpexcoder","cjecoderykhcoderoybtcoderdbdppcoderxxdqcoderhduqhcoderevibcoderffvsqcoderkzcoderkcoderddltcoder","ipdicodernnecodermcoderhfajrcodergogcoderfcodercdghfcoderdcodertixqcodervcoderhcwcoderkccoderohygccoderhcodercecoderpxcoderzcoderucoder","oicodertcycoderlvwqwcoderkefcoderwfrcoderoorcoderhawcodertuxtrcoderolpcodericoderwzlcoderhxicoderxcoderhcoderbmfifcodernabcodertcoderxpqcoder","dcoderkzbykcoderbcoderwuxrocoderamqhgcodertfzvcodermicoderjcoderjccjfcoder","vzcoderluvthcoderawavcoder","mpsbcoderehqcodercmcodervfiwicoderyduxzcoderebyvfcodermnkjhcoderslzlcoderfbcoderyrgvecoderetcodervxcoderncdsccoderpscoder","zhcodermzcoderxwyecoderjbhvdcoderzzvzcoderxrcoder","lzncoderjrlcoderdcoderdrcoderqyjcoderymdcodereywcoderymrcoder","jcoderindrfcoderecoderilqpcoderyucoderppjzcoderhcoderocoderhcodertcodermpyscoder","ncoderawjcycoderkcoderoiycoderspbxcoderalunccodersqcoderhodmbcoderktcoder","xcodermnixicodergcoderiomcoderhhpcoderkccoderocodernuracoderrzccoderyhstcoderbqxcodercxjowcodergvcoderlxpcoderiucodersixdcodermscoderhcoderktkpcodervovgtcoder","yrsincoderksxyfcoderqdcoderqxunfcoderdmmcoderzcoderwqcacoder","cjicoderxcoderukdcoderjihqrcodermzrglcoderncoderchlocoderfcoderwlcoderxsypcoderjcoderwrxcoder","hacodershniacoder","ycoderycoderniadncoderajscoderdcodermcoderycoderzhcoderkepowcoder","ztcoderkiruycodertglncoderzcoderoafcoderuvbhcodervbicoderkpkppcoderqcoder","fdcoderopnspcoderxghcodericoderpcoder","omptlcoderfxcoderjvecoderpudlqcoderzpjcoderxccodersnhcoderscoderpaucoderocoderytcoder","rcoderascoderjcoderzhsrccoderjccodereanxbcodergqajcoderggwpmcoderxcoderordcocoder","kcoderdcoderdmffycoderbkzxcoderojcoderilcoderucoderdypkdcoder","zmbyucoderzhcodermhsbicoderwjecoderqwmqjcoderitzwcoderebhcoderandiucoderpiajcoderyycoderznbhfcoder","vslcoderzjscodervxftcoderfjygcodermvcoderdhncodergpnvcoderbecoderkhcoderfnecoderjveqcoderacoderemwcoderthgvcoderqewcoderljufbcoderynpecoderxlpcoder"};
		for (String s : quna2.findCoder(ss2, 58)) {
			System.out.println(s);
		}
		
		
	}
	
	
	
}

class quna2 {
	public static String[] findCoder(String[] A, int n) {
		// write code here
		String coder = "coder";
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (A[i].toLowerCase().contains(coder)) {
				String temp = A[i].toLowerCase();
				int start = 0;
				while (temp.indexOf(coder,start)>=0 && start<temp.length()) {
					count++;
					start = temp.indexOf(coder,start) + coder.length();
				}
				map.put(i, count);
			}

		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		Comparator<Map.Entry<Integer, Integer>> cop = new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		};
		Collections.sort(list, cop);
		String[] B = new String[map.size()];
		int i = 0;
		for (Map.Entry<Integer, Integer> m : list) {
			int index = m.getKey();
			B[i] = A[index];
			i++;
		}
		return B;
	}
}
