
package com.sujansoft.cartoontubekids;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("GmgZhofovao", "খাঁচায় বন্দী ইঁদুর| টম এন্ড জেরি বাংলা কার্টুন", "জাদুকরী উড়ন্ত বিড়াল || টম এন্ড জেরি বাংলা কার্টুন");
		addVideoItem("dPHXp5SSsoI", "টম জেরির ঘুম নস্ট করল", "টম জেরির ঘুম নস্ট করল-bangla tom and jerry");
		addVideoItem("q1l54oU4X8E", "দেখুন কিভাবে  চুরি করে খাই টম আর বুলডগ", "দেখুন কিভাবে  চুরি করে খাই টম আর বুলডগ");
		addVideoItem("ON0XN7WVmt4", "জাদু গলাকাটা বিড়াল", "টম এন্ড জেরি বাংলা কার্টুন");
		addVideoItem("wL1TUysBy7o", "টম বিড়ালের জাদুর আয়না", "টম বিড়ালের জাদুর আয়না নিয়ে অবাক কান্ড");
		addVideoItem("K27ZldFSxMQ", " খাবার পেয়ে ইচ্চা মত খেলো জেরী", " খাবার পেয়ে ইচ্চা মত খেলো জেরী/bangla tom and jerry");
		addVideoItem("B2eQ-upEnV8", "খাচার ভিতর বসে  সপ্ন দেখছে টম", "bangla tom and jerry video");
		addVideoItem("o7xzmjhShWQ", "জেরী টম ও বুলডককে পাগল করে দিল", ".bagla tom and jerry");
		addVideoItem("1Mac0H8rdJs", "টমের কারনে বুলডগের আনন্দ নস্ট হয়ে গেল", "টমের কারনে বুলডগের আনন্দ নস্ট হয়ে গেল/bangla tom and jerry");
		addVideoItem("Rkrpj0BFiEY", "টম বুলডগকে চেপ্টা করে দিল", "টম বুলডগকে চেপ্টা করে দিল/bangla tom and jerry");
		addVideoItem("3YglSu05ptc", "বুলডগ টমকে খতম করে দিল", "বুলডগ টমকে খতম করে দিল/bangla tom and jerry video");
		addVideoItem("UVRYCukv6tw", "এরোপ্লেনে আফ্রিকা ভ্রমণ এরোপ্লেনে আফ্রিকা ভ্রমণ টম এন্ড জেরী", "bangla tom and jerry");
		addVideoItem("he6FBxiwX3s", "টম ও জেরীর বউয়ের অত্যাচার দেখুন আর হাসুন", "bangla tom and jerry");
		addVideoItem("6bDhX7tNsiY", "জেরী রোবট নস্ট করে ফেরল", "bangla tom and jerry");
		addVideoItem("AJtebZ_pC-4", "জেরী কথায় সে বুঝতে পারছে না", " Bagla tom and jerry");
		addVideoItem("PNotRuZyQeM", "ইঁদুর ও একজন বিজ্ঞানী গল্প || পৃথিবীর সেরা ইঁদুর", "Bagla tom and jerry");
		addVideoItem("1H0xrAhZ2ig", "টম ম্যাডাম কে ফুলের শুভেচ্ছা দিলো", "bangla tom and jerry");
		addVideoItem("aynnX-E7HpI", "টম গোছল করে স্মার্ট হয়ে গেল দেখুন  আর হাসুন", "bangla tom and jerry");
		addVideoItem("Vf0maxYB1ro", "টমের খেলা ধুলা দেখুন আর হাসুন ", "bangla tom and jerry");
		addVideoItem("hp3Hq8BVsIg", "যাদুর লাঠি ও যাদুর বই নিয়ে অবাগ কান্ড দেখুন", "bangla tom and jerry");
		addVideoItem("I_MeJiFFNv8", "ইঁদুর টমকে একটা জামা বানিয়ে দিলো ", "bangla tom and jerry");
		addVideoItem("_TVFO-oVe5w", " ইঁদুর টমকে উচিত শিক্ষা দিলো দেখুন আর হাসুন", "bangla tom and jerry video");
		addVideoItem("xBWJQ_3YpvQ", "বুড়ো টম বাচ্চাদের সাথে খেলতে গিয়ে অত্যাচারিত হলো ", "bangla tom and jerry video");
		addVideoItem("WvfhdxB7Ifc", "টম ও ইঁদুর লটারি জিতে কোটি পতি হয়ে গেল", "bagla tom and jerry");
		addVideoItem("zuXS0b1bYhg", "কোটি কোটি সৈন্য নিয়ে ইঁদুর ও টমের যুদ্ধ দেখুন", "bagla tom and jerry");
		addVideoItem("7x6VNZaHiRs", "সব ময়লা গুলি ইঁদুর আর গর্তের ভিতরে ঢুকিয়ে দিলো টম কান্ড দেখুন", "bagla tom and jerry");
		addVideoItem("KT8QISgH4zI", "ইঁদুর এর  অত্যাচারে টম এর জীবন শেষ  ", "bagla tom and jerry");
		addVideoItem("KT8QISgH4zI", "নিজের মেশিন এ নিজেই পিশে গেল টম দেখুন আর হাসুন", "bangla tom and jerry");
		addVideoItem("iiqwOlOKWLA", "টমেটো দিয়ে বডি বানালো টম দেখুন আর প্রাণ খুলে হাসুন", "bangla tom and jerry");
		addVideoItem("DVT9TTFcqFk", "ম্যাডাম টমকে সান্তনা দিলো ভয় পেয়োনা  ", "bangla tom and jerry video");
		addVideoItem("t0Q2otsqC4I", "Tom And Jerry Cartoon video ", "English tom and jerry");
		addVideoItem("ml-TkNmQJ48", " Very Funny Tom And Jerry Cartoon video", "Funny  tom and jerry video");
		addVideoItem("7fcP64w7eBE", "Funny Tom And Jerry Cartoon video ", "Funny tom and jerry video");
		addVideoItem("NACNH5FJRf0", "Tom and Jerry's magical adventures", " tom and jerry cartoon video");
		addVideoItem("bjF7z-VuSUI", "Tom And jerry best momonts", "tom and jerry Cartoon Video");
		addVideoItem("i3j2VsI8zEk", "Tom and jerry cartoon Video", "tom and jerry cartoon video for kids");
		addVideoItem("YPC1umSUNBA", "Tom and jerry The Butler  ", "tom and jerry cartoon video for kids");
		addVideoItem("9EpaAgXTPSc", "Tom and jerry with Smart Devices", "English tom and jerry cartoon video for kids");
		addVideoItem("0JwHzC_17Y8", "অতিথি পেঙ্গুইনের বাচ্চা", "bangla tom and jerry");
		addVideoItem("16coBRjiM0E", " বাড়ির মালিকের বিশ্বস্ত ইঁদুর-Cartoon video ", "bangla tom and jerry video");

		createPlayList("Tom And Jerry", R.drawable.tomjerry);
		//==========================================================================





		//==========================================================================
		addVideoItem("rtosYHvu5UE", "বিসমিল্লাহ্ বলো বিসমিল্লাহ্-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("JHgUk9Hh0sE", " অ তে অজু করে আমি নামাজ পড়তে যাই-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("aMKnCveaoD0", "সূরা ফাতিহা-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("RiTEz2KpwMk", "সূরা নাচ-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("B9ozfgJYgKE", "সূরা ফালাক -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("wz_a9uAPmB8", "সূরা ইখলাস -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("7Gg5uDJU_7U", "সূরা কাফিরুন-  Bengali cartoon video", " Islamic Cartoo video  for kids ");
		addVideoItem("anbqN4HnrUE", "বইয়ের রহস্য-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("iCaw18kaYrQ", "আবদুল বারীর রাগ দমন করল কিভাবে দেখুন-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("qMKbEuTPnpM", "Abdul Bari-English islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("Crxr9LHZpic", "Abdul Bari scared Dua -English islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("VLAgPwZdhys", "অপচয় করা কেমন-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("8_rpXmHDcuQ", "বড়দের কথা শুনতে হয় -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("JwE0I8hdnxw", "তাড়াহুড়া করে কোনো কিছু করা ভালো না -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("izjKmAJOuXA", "নামাযের প্রতি আগ্রহ-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("64BZrjzDBsM", "উদ্ভিদের গুরুত্ব-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("ep5UN4DYFQA", "ঘর থেকে বের হবার দোয়া-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("0jjon9r0ELk", "ঘরে এবং টয়লেটে ঢোকার দোয়া -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("UKmZLEEexiQ", "Dua Before Sleeping-English islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("hOQquuK_O_E", "দুধ খাওয়ার সুফল এবং আবদুল বারী দুধ খাওয়ার দোয়া-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("j4-gXos6EJg", "বিপদ মুসিবতের দোয়া -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("ZFCyS_v3U_k", " বৃষ্টির দোয়া -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("7FVCVAQRWbk", "Learn Salah - English islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("l4lrgqKnQE0", "Ayatul Kursi -English islamic cartoon video", "Bangla islamic cartoon videoe");
		addVideoItem("-ZyQ2ncN6WM", "সাইকেল-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("At50tKN01rY", "প্রতিবেশীর সাথে আচরন-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("ZaaKFPcBDxI", "আলিফ-বা-তা -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("yOWn-IXlSo8", "ববায়েজিদ বোস্তামীর মা অসুস্থ -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("EE9knGrcVMo", "আত্মীয় সাথে কেমন আচারন হওয়া ঊচিত-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("dbqR8Jh73ww", "মেইকআপ করা দেখে আরীবার কী হলো-Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("nND2NG4uvH0", "টয়লেট থেকে বের হওয়ার দোয়া -Bangla islamic cartoon video", "Bangla islamic cartoon video");
		addVideoItem("dbqR8Jh73ww", "Kaniz Fatima Bangla cartoon video- Ep01", "Islamic Cartoon video for kids");
		addVideoItem("VLAgPwZdhys", "Kaniz Fatima Bangla cartoon video- Ep02", " Islamic Cartoo video  for kids ");
		addVideoItem("D2WuGq1lPBI", "Kaniz Fatima Bangla cartoon video- Ep03", "Islamic cartoon video for kids");
		addVideoItem("cSyA0JVStFg", "Kaniz Fatima Bangla cartoon video- Ep04", "Islamic Cartoon video for kids");
		addVideoItem("8_rpXmHDcuQ", "Kaniz Fatima Bangla cartoon video- Ep05", " Islamic Cartoo video  for kids ");
		addVideoItem("2t-MSiZgw0k", "Abdul Bari Cartoon video for kids", "Islamic Cartoon video for kids");
		addVideoItem("6qtbiXxB-_c", "Abdul Bari Cartoon video for kids", " Islamic Cartoo video  for kids ");
		createPlayList("Islamic Cartoon", R.drawable.islamic);
		//==========================================================================


		//==========================================================================
		addVideoItem("IqIDIvZwluQ", " আয় আয় চাঁদ মামা টিপ দিয়ে যা| Bengali cartoon video", " Bengali Rhymes for kids ");
		addVideoItem("eW9B8CeR2HI", "আয় রে আয় টিয়ে নাও ভরা দিয়ে | Bangla Rhymes Cartoon Video", "Bengali Rhymes for kids");
		addVideoItem("RHCm00GWg14", "ABC Song Nursery Rhymes & Kids Songs", "ABC Song Nursery Rhymes & Kids Songs");
		addVideoItem("v9pDYRAt-WA", "অ আ ই ঈ | Bangla rhymes for children", "অ আ ই ঈ | Bangla rhymes for children");
		addVideoItem("IJfWQ9jtg1k", "ব্যঞ্জনবর্ণ -ক খ | Bangla Bornomala | Bangla Rhymes for Children ", " Bangla Rhymes for Children");
		addVideoItem("eG-Fre0G8OE", "আয় বৃষ্টি ছেপে | Bangali Rhymes for kids", "Bangali Rhymes by kids");
		addVideoItem("bE4NYNiuh-o", "আম পাতা জোড়া জোড়া | Bengali Rhymes for kids", "আম পাতা জোড়া জোড়া | Bengali Cartoon | Bengali Rhymes");
		addVideoItem("zeShI_3AFOw", "প্রথনা কবিতা /সুভিয়া কামাল ", "প্রথনা কবিতা /সুভিয়া কামাল Bangla Rhymes.bangla cartoon video");
		addVideoItem("hq3yfQnllfQ", "ABC Alphabet Songs with Sounds for Children", "ABC Alphabet Songs with Sounds for Children.Bangla cartoon video");
		addVideoItem("ACN_flSj2Q8", "টুইঙ্কল টুইঙ্কল লিটিল স্টার Bangla Rhymes Cartoon Video ", "Bangla rhymes for children");
		addVideoItem("zvK4CyVPZ8Q", "জনি জনি ইয়েস পাপা ইটিং সুগার নো পাপা।  Bangla Rhymes for kids", "Bangla rhymes for children");
		addVideoItem("FfF2qB75cTI", "কাঠবিড়ালী কাঠবিড়ালী পেয়েরা তুমি খাও| Bangali Rymes for Kids", "Bangla rhymes for children");
		addVideoItem("9pIBPWO0BTo", "ঘুম পাড়ানি মাসি পিসি মোদের বাড়ি এসো Bangla Rhymes Cartoon Video", "Bangla rhymes for children");
		addVideoItem("tKJYoWyF8hU", "তাই তাই তাই মামা বাড়ি যাই |Nursery Rhymes for Children", "Bangla rhymes for children");
		addVideoItem("95S00tAh25c", "আতা গাছে তোতা পাখি ডালিম গাছে মও | Bengali Rhymes Cartoon Video", "Bangla rhymes for children");
		addVideoItem("YbK0n7VapWY", "তাতির বাড়ি ব্যজ্ঞের বাসা খোলা ব্যজ্ঞের ছা.bangla rhymes Cartoon Video", "Bangla rhymes for children");
		addVideoItem("ZlgXnEE7AUs", "খোকন খোকন করে মায়/ Bangla Rhymes cartoon video", "Bangla rhymes for children");
		addVideoItem("McWMgRZ0n1M", "মেঘের কোলে রোদ বানন গাছের টুটি Bangla Rhymes Cartoon Video", "Bangla rhymes for children");
		addVideoItem("vZVuaPkegtw", "ভোর হলো দোর খোল খুকি মনি ঊঠোরে Bangla Rhymes Cartoon Video", "Bangla rhymes for children");
		addVideoItem("NkVac1bmlq0", " ঐ দেখা যায় তাল গাছ ঐ আমাদের গা| Bengali Rhymes Cartoon video", "Bangla rhymes for children");
		addVideoItem("adJyoRD3tBQ", " দোল দোল দোলনী | Bangla Cartoon/ Bangla Rhymes", "Bangla rhymes for children");
		addVideoItem("AU5v0U3GUNQ", "আইকুম বাইকুম ঘোড়া ডুম সাজে | Bangla Rhymes Cartoon video", "Bangla rhymes for children");
		addVideoItem("1EqC3atmmus", "নোটন নোটন পায়রা গুলি যোটন বেধেছে | Bengali Rhymes Cartoon Video ", "Bangla rhymes for children");
		addVideoItem("Q5F8cddL-kM", "খুখু গেছে জল আনতে Bangla Rhymes Cartoon video", "Bangla rhymes for children");
		addVideoItem("ayH7-u3QZLs", "বাচ্চার প্রথম দাঁত - Bengali Rhymes for Kids", "Bangla rhymes for children");
		addVideoItem("u4SW-fFlau8", "বাসের গান Bangla Rhymes", "Bangla rhymes for children");
		addVideoItem("Cw7SVkZbyhM", "English Rhymes Cartoon video ", "English CArtoon video for kids");
		addVideoItem("JOIQedNXZhM", "চাঁদ উঠেছে- Bengali Rhymes for Children", "Bangla rhymes for children");
		addVideoItem("OIMZ6O8BuTQ", "English Cartoon video for kids ", "Cartoon video for kids");
		addVideoItem("QpdzS9yGfjY", " আমাদের ছোট নদী-Bangla Rhymes Cartoon video", "Bangla Rhymes Cartoon video");
		addVideoItem("_ayI9tGlyNU", " শিশুদের ছড়া গান-Bangla Rhymes Cartoon video", "Bangla Rhymes Cartoon video");
		addVideoItem("2OiM37auWsU", "Bengali Rhymes for Children", "Bangla Rhymes Cartoon video");
		addVideoItem("solySWexkxc", "Bengali Rhymes for Children", "Bangla Rhymes Cartoon video");
		addVideoItem("9yX8TEagWfU", "আয় বৃষ্টি ঝেপে- Bengali Rhymes cartoon video", "Bangla Rhymes Cartoon video");
		addVideoItem("l2Sb1iEoq64", "বাবুরাম সাপুড়ে -Bengali Rhymes for Children", "Bangla Rhymes Cartoon video");
		addVideoItem("uYoEZxY1K8M", "ভোর হলো-Bangla Rhymes Cartoon video", "Bangla Rhymes Cartoon video");
		addVideoItem("2PoNNaKUVBc", "Rhymes cartoon video for kids", "Bangla Rhymes Cartoon video");
		addVideoItem("zBMQQ2LuLk8", " খোকা যাবে শ্বশুর বাড়ি-Bangla Rhymes Cartoon video", "Bangla Rhymes Cartoon video");
		addVideoItem("EfVkC8j_7C4", "Bangla rhymes cartoon video for kids", "Bangla Rhymes Cartoon video");
		createPlayList("Rhymes Cartoon", R.drawable.rhymes);
		//==========================================================================


		//==========================================================================
		addVideoItem("3aXRQO8QVIA", "মাকে সাহায্য করার গান -Bangla Song for Kids", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("QQsl7TDsnBw", "না না হ্যাঁ হ্যাঁ স্কুলে যাও- Bangla Song For Children", " Bangla and Hindi Cartoon song For Children");
		addVideoItem("x7T65awcO2g", "ব্যথা লাগার গান - Bangla Song For Children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("yXdS36cs5sI", "ছোট্ট সোনামনীর শরীর খারাপের গান- Bangla Song For Children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("1lozXlm4PxA", "ঘুম থেকে উঠে পরার গান Bangla Song for Children", " Bangla and Hindi Cartoon song For Children");
		addVideoItem("VYZG-ryc7Sg", "মাকে সাহায্য করার গান - Bangla Song for Kids", " Bangla and Hindi Cartoon song For Children");
		addVideoItem("wL0e0YtUsfQ", "বা বা কালো ভেড়া গান –Bangla Song for Kids", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("PPx1zdIbCI8", "Rhymes Songs for Children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("_CruaP0BNKQ", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("_iW_oePsXlI", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("ArWSw76xm1E", "Brush Karo,Cartoon song video", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("3bLfzgZ-wO8", "Ei Mom Jochonay | Madhubanti Mukherjee", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("qPna1ZlRxTo", " Hindi Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("9f9bjE032x0", "Hindi Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("4qNamJWBFW4", "Hindi Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("i7ygKQunfmE", "Hindi Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("61x47RsMJa0", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("t1Pdk4VxZsw", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("9yWMdCKCxow", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("4EbLaRp6K-M", "রামধনু -Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("McGqWDlt9hU", "মাকড়শা গান-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("NnJcTFs17tg", "রঙ খেলা নিয়ে গান-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("XUgqH6fcCUU", "এরগান-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("-VaoMnJRPVo", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("OTKiBXD9sgE", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("SeXKbT3Gf2c", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("7M40He2dQc0", "হেলো গান-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("Pi88Tx3xNlw", "সাতার কাটি-Cartoon video song for children", "   Bangla and Hindi Cartoon song For Children");
		addVideoItem("yXdS36cs5sI", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("Ku41O8ullM0", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("o_t7lC_cjVc", "Wheels on the Bus-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("tVSBhagoxLs", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("iJfSDBDw-eU", "Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("8moTJSxk744", "Bartolito-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("KTOwPz-zMWY", "Yes Yes Playground Song-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("3hEruhEQX88", "BabyShark-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("6VGywgGGvMc", "If You Are Happy-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("ObhXKcXqi2U", "Itsy-Bitsy Spider-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		addVideoItem("shXG8-THV28", "Booba-Cartoon video song for children", "Bangla and Hindi Cartoon song For Children");
		createPlayList("Song Cartoon", R.drawable.song);
		//==========================================================================


		//==========================================================================
		addVideoItem("wcm504w5x24", "চালাক ছাগল Bangla story cartoon video", "Storytime Adventures Ep. 1");
		addVideoItem("vTcQFGDbvWg", "ঐক্যই আমাদের শক্তি- Bangla story cartoon video", "Storytime Adventures Ep. 2 ");
		addVideoItem("A7BnLK2DcvA", "যাদুর চটি - Bangla story cartoon video", "Storytime Adventures Ep. 3");
		addVideoItem("f9DTW8hW0Ck", "বুদ্ধিমান খরগোশ - Bangla story cartoon video", "Storytime Adventures Ep. 4");
		addVideoItem("X36r5dx06T0", "রাজার ফুলদানি - Bangla story cartoon video", "Storytime Adventures Ep. 5");
		addVideoItem("cRwDgAcUG-Y", "ঠাকুরদা ইঁদুর আর চীনাবাদামের গল্প- bangla story cartoon video", "Storytime Adventures Ep. 6");
		addVideoItem("ry-gUSUOb3Y", "ছোট্ট বনপ্রহরী রা- bangla story cartoon video", "Storytime Adventures Ep. 7");
		addVideoItem("WbQf20QqHzk", "একটি আইসক্রিম-এর ট্রাক - Bangla story cartoon video", "Storytime Adventures Ep. 8");

		addVideoItem("hKIMt9DOORU", "একটা নেকড়ে আর একটা গাধার গল্প - bangla story cartoon video", "Storytime Adventures Ep. 9");
		addVideoItem("pqfkY2i3v28", "কচ্ছপেরা আর বাদরেরা - bangla story cartoon video", "Storytime Adventures Ep. 10");
		addVideoItem("dnpX9bVA6SI", "চাচা গেল ডাক্তারের কাছে  Bangla Stories", "  Bangla Stories Cartoon video");
		addVideoItem("fwlyni8VIK8", " চুচুর ঘর পরিষ্কার রাখা – Bangla Stories", " Bangla Stories Cartoon video");
		addVideoItem("-tXIfEwd3fM", "জিনিসের মুল্য দেওয়া কতটা জরুরি  Bangla Story cartoon video", "Bangla Stories cartoon video for kids");
		addVideoItem("2mWF3aul5Jo", "একতাই শক্তি– Bangla Stories cartoon video", " Bangla Story cartoon video for kids");
		addVideoItem("rkyom6q3KdM", "অহংকার পতনের মূল – Bangla Stories  cartoon video", " Bangla Stories cartoon video for kids");
		addVideoItem("lIu9WRC8HD8", "মজার মালাই এর হাড়ির গল্প   Bangla Stories cartoon video", "Bangla Stories cartoon video for kids");


		addVideoItem("fwnIj9gaNVY", "মোরগ হল ময়ূর মজার গল্প – Bangla Stories cartoon video", "Bangla Stories cartoon video for kids");
		addVideoItem("ZWsfXPpIeYA", "দাদু নাতিদের জন্য চকলেট নিয়ে আসলো – Bangla Stories cartoon video", "Bangla Stories cartoon video for kids");
		addVideoItem("r-R-mdDa8LM", "অনেক সুন্দর সুন্দর ফুল Bangla Stories cartoon video", "Bangla Stories cartoon video for kids");
		addVideoItem("3V8J5Pn3ZKc", "সাপ এর গর্ত – Bangla Stories cartoon video", " Bangla Stories cartoon video for kids");
		addVideoItem("pmjHfi-7VVQ", "কেকের পুরস্কার দিল – Bangla Stories cartoon video", "Bangla Stories cartoon video for kids");
		addVideoItem("-NQvFCUdONI", "খেলনা VS বই মজার গল্প – Bangla Stories cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("FWr9kMa8MCc", "খেলনার দেশ দেখে অবাক – Bangla Stories cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("Tht4PSaFmo8", "বেবির মেকাপ – Bangla Stories cartoon video", "Bangla Story cartoon video for kids");

		addVideoItem("yubPAStVu2s", "স্কুলের হোমওয়ার্ক – Bangla Stories cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("dzGqy_wtgmg", "ফল সবজি এবং পিজা বার্গার নিয়ে গল্প– Bangla Stories cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("vC3rRJNSrHo", "চিনকির আইডিয়া গল্প– Bangla Stories cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("9cMed2cXCKc", "ভুলে যাওয়া– Bangla Stories cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("FNg3v4qQbZU", "সত্যি কারের বন্ধু – Bangla Stories cartoon video", "Bangla Story cartoon video for kids");

		addVideoItem("1ErwNaRyZj8", "ড্রাকুলা রহস্য - Bangla Story Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("3qU3u6QB2b4", "অভিশাপ- Bangla Story Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("EoziEMFhiTQ", "ইন্সপেক্টর ভিকি - Bangla Story Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("dVmU02vcmQE", "সাপ লুডো-Bangla Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("g6uXfZjsatc", "প্রতিশোধ - Bangla story cartoon video ", "Bangla Story cartoon video for kids");
		addVideoItem("jCWMi4F5Dt8", "Planchette- Bangla Story cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("_ngQczZsEzo", "প্রায়শ্চিত্ত-Bangla Story Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("t_ldkeYB8Ec", "বন্ধ দরজা- Bangla Cartoon Story video", "Bangla Story cartoon video for kids");
		addVideoItem("BlntRb-Pykc", "ও তাহলে কে -Bangla story cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("niFoL1b7-u0", "নৈতিক গল্প -Bangla Story Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("GICdAOMymn0", "কাঁচা লঙ্কার ঝাল-Bangla Cartoon video", "Bangla Story cartoon video for kids");
		addVideoItem("otpE03Xy3VE", "সোনার কুড়াল-Bangla story cartoon video", "Bangla Story cartoon video for kids");
		
		createPlayList("Story", R.drawable.story);
		//==========================================================================




		//==========================================================================
		addVideoItem("ZKwgjJIzidg", "ঠাকুরমার ঝুলি যেমন-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("tUnLGN8BXU8", "ঠাকুরমা ফুসকা বুড়ি-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("k1YDRODZv3A", "রোগা ছেলে -Bangla  cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("SLfiwzws_Cw", "বধূর বুদ্ধি-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("sT33R8ch_es", "ছিপ দিয়ে বাঘ ধরা-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("iGZX7zo36X8", "চালাকি-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("1p8soiUt1ic", "কিপটা বুড়ির ছাতা-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("kGke1CRFLJ0", "গরিবের বউ -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("r9Zg-mZjlhE", "বাংলার জয় -Bangla  cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("IONMzy0nZJg", "ভন্ড ভিখারি -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("opDo9XF3tHY", "উপহার-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("XgnA07xtc38", "মাছ পাগলা-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("YVZopQfd9kE", "ঘর জামাই-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("aeESarm_t3Q", "ভাতের হোটেল-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("qkbX3pfeYig", "পরিচয় -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("-SDRLfcRU3Q", "মানুষের মত মানুষ -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("9p25BnZvu1E", "ভোজন প্রতিয়োগীতা-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("t-q_mzxjoVk", "মাছ ধরা-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("-rKZtq1Z714", "বিয়েবাড়িতে গন্ডগোল-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("K4SiXB0NG1g", "সেই মেয়েটি  -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("XwCfcokydHU", "মাছ চুরি-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("R_F0jZY0v7I", "ঘোচুদাদা জিন্দাবাদ-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("iI44d3Rknyo", "কিপটা টাকার থলি-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("osuL0-t-0S8", "গুলেদার  বিয়ে -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("Gi1R48VM2ig", "মানুষ চেনা -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("Yofuma93bOc", "বন্ধুর মতো বন্ধু-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("UwPdR0wr4VI", "উচিত শিক্ষা-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("RiKr0eZJl_4", "দরদী বন্ধু -Bnagla Cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("GQqOrpkc8GI", "ভালো মানুষ - Bangla cartoom video", "Thakurmar juli cartoon video for kids");
		addVideoItem("G6GEwZw3kmU", "ফুচকা নাকি তেঁতুল-Bamgla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("weH8w5OwOj0", "উচিত বুদ্ধি -Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		addVideoItem("dICCnVJOIRQ", "আবার যাবে শশুর বাড়ি-Bangla cartoon video", "Thakurmar juli cartoon video for kids");
		createPlayList("Thakumar jhuli", R.drawable.thakunar);
		//==========================================================================


		//==========================================================================








		addVideoItem("CORvSl_FaYw", "তুলির ঈদের ঢং ঢং শপিং- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("laScZxHZhOU", "মিনিষ্টার কাজের বুয়া Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("fgFQm-IcULg", "তুলির রোজার কাতুকুতু প্যাড়া ২- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("nuc_qZRTL5A", "একটি হরিণটা আঁকা যান - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("4EbLaRp6K-M", "রামধনু Cake - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("NburnGRnJis", "একটি বাঘ আঁকা যান- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("iGYX5EIRRho", "ফুটবল খেলা- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("GIcNPvdTzvM", "একটি আঁকা যান জলহস্তী - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("l1WAt1yPI8Y", "একটি ভালুক আঁকা যান - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("mxlVz7Qx3HE",  "বন্ধু ফলেদের গান- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("H81F1Uol7HU", "রেস গাড়ি- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("I57lJ4emIbk", "অপ্রয়োজনীয় জিনিসকে নষ্ট করোনা- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("eC2uVEacqpY", "সমুদ্র তীরের গান- বৃষ্টি তুমি চলে যাও- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("I57lJ4emIbk", "তুলির রোজার কাতুকুতু প্যাড়া- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("aBPGNLO382k", "তুলির স্কুল পরীক্ষার নমুনা- Cartoon video for kids", "Cartoon video for kids");

		createPlayList("Cartoon Hub",R.drawable.doreamon);

		//==========================================================================


		//==========================================================================
		addVideoItem("oRAKYK8aAGw", "Oggy and the Cockroaches Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("Dx42bNqQ6qk", "Moka's Fabulous Adventures 1 Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("A6MxImKN00k", "Moka's Fabulous Adventures 2 Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("G2NLwTmi5v4", "Moka's Fabulous Adventures 3 Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("DbKHNHRTw7g", " Journey to the Center - Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("OIW369Bkkzg", "OGGY COMPILATION - Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("lc_YR9fhHLU", "THE HIDDEN WORLD-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("9DYpfGXk3Q8", " OGGY GOES CRAZY-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("aQwaJFmMC_M", " Zig & Sharko- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("zKWwfjG-gYg", "Daddy Cool - Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("JucFwYRQI6E", "The Kiss -Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("u1RKuTcvONM", "  Double episode-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("vPgBtizWRkg", "CAVIAR ON THE HOUSE-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("05MQK4a_SPU", "The Kitchen Boy- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("b9_CZRQcR9Y", "Dee Dee's diet- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("qMCSdcp79K8", " Oggy and the Flour Man- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("y-uYVYG9rDg", "  GREAT YUMMY COMPILATION- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("Yb4JrIHYxdU", "Last Will - Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("BstW5GDKVMU", "Sports Fans-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("594ITLAyL1o", " Oggy Goes Green-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("6IjuzLviXoU", "OGGY HIPPIE- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("lc_YR9fhHLU", " THE HIDDEN WORLD- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("AY80izTJtPY", " GOLDEN EGGS - Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("DkOWS18Ui6Q", "BIGGEST FAN JACK- Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("DbKHNHRTw7g", "Journey to the Center-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("NYzKzn5MxKg", " OGGY LOST IN SPACE-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("oRAKYK8aAGw", " OGGY LOST IN SPACE-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("bhXERqugUrs", "DIWALI COMPILATION-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("vPgBtizWRkg", "CAVIAR ON THE HOUSE-Cartoon video", "Oggy and the Cockroaches Cartoon video");
		addVideoItem("ASEX1sPOTBA", " BEST HOLIDAYS - Cartoon video", "Oggy and the Cockroaches Cartoon video");
		createPlayList("Oggy And Cockroaches", R.drawable.ogg);
		//==========================================================================

		//==========================================================================
		addVideoItem("0XvuuA23H0o", "চানাচুরের সাথে- Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("9sCsl6NHg7E", "বল্টুর লাল শার্ট-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("NTx33zaGMEw", "বল্টুর বাবা মারা গিয়েছে-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("MqreWJCY8dY", "পিপড়া মারার সহজ উপায়-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("r60ypqCEsUk", "গার্লফ্রেন্ড vs বয়ফ্রেন্ড-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("JfLBlziAHvI", "স্যার এর মান সম্মান শেষ-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("YrnVjgJzSm0", "শিক্ষক VS ছাত্র-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("OfLbiNsstrE", "Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("76sqLnT8k_U", "বল্টুর ঈদের কেনাকাটা-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("TFW21ylLvU0", "MAKE JOKE OF-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("XP3QMwNg4BM", "MAKE JOKE OF-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("DGmc-BgGXwo", " Funny Cartoon Video For Kids", "Bangla Funny Cartoon Video");
		addVideoItem("MRNsspyfKP0", "Teffin Time- Funny Cartoon Video For Kids", "Bangla Funny Cartoon Video");
		addVideoItem("LDpi88e34c0", "A JOKE OF-Funny Cartoon Video For Kids", "Bangla Funny Cartoon Video");
		addVideoItem("y7mtqJF5GxU", "POLICE KI PITAI- Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("fHZGwFW8wew", "DABANG MASTER-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("lsZKk05342c", " FUNNY DESI COMEDY VIDEO", "Bangla Funny Cartoon Video");
		addVideoItem("7ASxqKfLqRo", " Funny Cartoon Video For Kids", "Bangla Funny Cartoon Video");
		addVideoItem("DcdfzL22WWg", "PAAGAL BETA- Funny Cartoon video", "Bangla Funny Cartoon Video");
		addVideoItem("NGcPmO9FKnE", "ইয়ামিন যখন স্কুলে যায়-Funny Cartoon video", "Bangla Funny Cartoon Video");
		addVideoItem("z6_bFB8driU", "ইয়ামিন যখন লুঙ্গী পরে -Funny vartoon video", "Bangla Funny Cartoon Video");
		addVideoItem("s0HIOnUFEk0", " দম ফাটানো হাসির কৌতুক- Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("HxxfnxOIzdo", "Oscar's Oasis-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("Q1R5Y1RGxSs", "MAKE JOKE OF-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("pZcnvIAL6Ys", "SCHOOL TIME-Cartoon Funny Video for kids", "Bangla Funny Cartoon Video");
		addVideoItem("EPr3UJgs_lI", "আম্মু আজকে গোসল করমু না শীত করে -Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("CORvSl_FaYw", "তুলির ঈদের ঢং ঢং শপিং-Bangla Funny Cartoon Video", "Bangla Funny Cartoon Video");
		addVideoItem("pWTtEn9pio4", "Funny Cartoon video for kids", "Bangla Funny Cartoon Video");
		createPlayList("Funny Cartoon", R.drawable.funny);
		//==========================================================================

		//==========================================================================
		addVideoItem("GK4YolHRKoc", "TooToo Boy - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("s7riFG9vcjA", " Videogyan Kids - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("GK4YolHRKoc", "TooToo Boy - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("s7riFG9vcjA", " Videogyan Kids - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("j9y3-6Crfy0", "Catching The Toy Store  - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("7v-cZO84p3c", "Keeping Baby Happy- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("_pc3Z6aZJOE", "The Cow - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("6thOQn2nErk", "Missing Things - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("x2Sj_TYA5Vo", "Stolen Eggs- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("pliff0t_bU0", "Toothpaste- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("HuRltvQFTN4", "Jump Up High - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("Z1jfFTJl3m8", "Cooling Issue- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("U6II6ddedjI", "Time Travel - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("nTlFgb8pe4s", "Running Shoes- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("go7FfufsMyA", "Packing In The Car - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("Hu7hq769ADo", "Hungry Monkey - Cartoon video for kids", "Cartoon video for kids");

		addVideoItem("sBPy2dga-H8", "অনাথ বৌমা- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("g8bjUDC7edE", "গাছে ঈদের উপহার- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("c0m5H1Mn_qE", "টুনির গ্যাস সিলিন্ডার- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("JWzReQaY38E", "কামরাঙ্গা বাড়ি - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("NSHSkWeB3Jw", "দুই সাবানের রাস্তা- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("JlDGAoK3U98", "দুই বোন - Cartoon video for kids", "Cartoon video for kids");

		addVideoItem("otpE03Xy3VE", "সোনার কুড়াল- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("skCozkmipV4", "ঘুষখর মাতবার  - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("GBIZK-uYb4E", "ফেরীওয়ালী - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("LFbizT7bJmw", "দুই হাড়ি - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("3mL4WcFdI18", "লাল কলা নীল কলা - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("4e0kdLen0Cc", "তরমুজের ছাতা - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("Fzmo9FT8SOI", "কলা পতার ঘর- Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("Pe6bBPegnBI", "মাছ চাষ - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("17P09FmfweI", "লিচু বাড়ি - Cartoon video for kids", "Cartoon video for kids");
		addVideoItem("VngqBxDBZEE", "আকশ বাড়ি - Cartoon video for kids", "Cartoon video for kids");
		createPlayList("Cartoon Video ", R.drawable.motu);
		//==========================================================================













	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

