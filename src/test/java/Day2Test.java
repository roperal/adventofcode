import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Day2Test {
    @Test
    public void should_return_all_different_characters_given_a_word() {
        Day2 day2 = new Day2();
        String[] characters = (String[]) day2.getCharacters("abcdeabbcc").toArray(new String[0]);
        Assert.assertEquals(5L, characters.length);
        Assert.assertEquals("a", characters[0]);
        Assert.assertEquals("b", characters[1]);
        Assert.assertEquals("c", characters[2]);
        Assert.assertEquals("d", characters[3]);
        Assert.assertEquals("e", characters[4]);

        characters = (String[]) day2.getCharacters("alicia").toArray(new String[0]);
        Assert.assertEquals(4L, characters.length);
        Assert.assertEquals("a", characters[0]);
        Assert.assertEquals("c", characters[1]);
        Assert.assertEquals("i", characters[2]);
        Assert.assertEquals("l", characters[3]);

        characters = (String[]) day2.getCharacters("abaco").toArray(new String[0]);
        Assert.assertEquals(4L, characters.length);
        Assert.assertEquals("a", characters[0]);
        Assert.assertEquals("b", characters[1]);
        Assert.assertEquals("c", characters[2]);
        Assert.assertEquals("o", characters[3]);
    }

    @Test
    public void should_return_plus_1_for_each_time_a_word_have_the_same_letter_two_times() {
        Day2 day2 = new Day2();
        List<String> inputList = Arrays.asList(new String[] {
            "abcdef",
            "bababc",
            "abbcde",
            "abcccd",
            "aabcdd",
            "abcdee",
            "ababab"
        });
        int frequency = day2.getNumberOfLettersThatRepeatNTimesInAWord(inputList, 2);
        Assert.assertEquals(4L, frequency);
    }

    @Test
    public void should_return_plus_1_for_each_time_a_word_have_the_same_letter_three_times() {
        Day2 day2 = new Day2();
        List<String> inputList = Arrays.asList("abcdef",
                "bababc",
                "abbcde",
                "abcccd",
                "aabcdd",
                "abcdee",
                "ababab");
        int frequency = day2.getNumberOfLettersThatRepeatNTimesInAWord(inputList, 3);
        Assert.assertEquals(3L, frequency);
    }

    @Test
    public void should_return_12_for_example_input_when_checksum() {
        Day2 day2 = new Day2();
        List<String> inputList = Arrays.asList("abcdef",
                "bababc",
                "abbcde",
                "abcccd",
                "aabcdd",
                "abcdee",
                "ababab");
        int checksum = day2.getChecksum(inputList);
        Assert.assertEquals(12L, checksum);
    }

    @Test
    public void should_return_7904_for_problem_input_when_checksum() {
        Day2 day2 = new Day2();
        List<String> inputList = Arrays.asList("qwubbihrkplymcraxefntvdzns",
                "qwugbihrkplyzcjahefttvdzns",
                "qwugbihrkplymcjoxrsotvdzns",
                "qwugbphrkplympjaxmfotvdzns",
                "qwugbghrkpltbcjaxefotvdzns",
                "qwubbihrwpuymcjaxefotvdzns",
                "qiugpihrkplymcwaxefotvdzns",
                "qwugbihrkplymcjavefotvotns",
                "qwugbihrkpvymcjaxefotvnzes",
                "qwvgbihrkpltmcnaxefotvdzns",
                "qwugvihrkplymvjaxefotvczns",
                "qwugbihrkplymwjazefotvyzns",
                "qwugbihrkplbmcjbxefttvdzns",
                "qhugbihrkplymcjaxefotnazns",
                "qwugbihrkpyyacjacefotvdzns",
                "qwugsihrkpsymcjaxafotvdzns",
                "qwugbihriplymcjixefosvdzns",
                "qwuibihrkjlvmcjaxefotvdzns",
                "qwugbjhrgplymcjaxefotvdzys",
                "qwugnimrkplymcjayefotvdzns",
                "qwumjihrkplymcjexefotvdzns",
                "qwugbihukptymcjaxefotvvzns",
                "qwughthrgplymcjaxefotvdzns",
                "qlugbihrkplymcjbxhfotvdzns",
                "qhugbiyrkplymcjaxefotvdzes",
                "qwugbihrkvlymcjaxecotvtzns",
                "qwugbihrkphymcjaxefitvizns",
                "qwugbbhdtplymcjaxefotvdzns",
                "qwugbihrkplymceaxefotvltns",
                "mwugbihrkptymcpaxefotvdzns",
                "qwugbihrdplymcvaxefotvdwns",
                "qwugbihrkplymcjaxekhtvhzns",
                "qjugbihrkplyjcjaxefonvdzns",
                "qwugbihrjplymcjaxefgtudzns",
                "qlugbihrkplymcjaxefztvdpns",
                "qwugbihrkclyvpjaxefotvdzns",
                "qwugbihrsplymnjhxefotvdzns",
                "qwudbihrbxlymcjaxefotvdzns",
                "qwugbihrkplymcjxxefatvdzng",
                "qwujbihrkplyqdjaxefotvdzns",
                "qwugnihrkplamcjaxefotvmzns",
                "qwugnihrkplymcjajekotvdzns",
                "qwugbihrkslymcjamsfotvdzns",
                "fwugbihrkplymcjaxetotvdzne",
                "qwughihrkplyucfaxefotvdzns",
                "qwuebihrkplymcraxefotvdzgs",
                "qwugbinrkplymcjaxefodvdznh",
                "qwudbihrkplymcjsxefotvjzns",
                "qwlgbihrkzlymcjixefotvdzns",
                "qwugbihckpoymcpaxefotvdzns",
                "qwfgbibskplymcjaxefotvdzns",
                "qwugbihrkplymczaxdfotvuzns",
                "qwugbihwkplymcjaxepxtvdzns",
                "qwubbihrkplymcjaxefntfdzns",
                "qwunbihrkpaymcjaxefotvdzni",
                "qwugfihrkplymujaxefotvdzni",
                "qwugrihrkplymkjaxxfotvdzns",
                "ztugbihrkplymcjaxefotvdznt",
                "qwugbihrkplvmcjaxefotvdzph",
                "qwugtinrfplymcjaxefotvdzns",
                "qwugbihrkplamcjkmefotvdzns",
                "qwtgbihryplymcjaxeeotvdzns",
                "qwugbiazkplymhjaxefotvdzns",
                "pwugbihrkplymklaxefotvdzns",
                "wwugbihkxplymcjaxefotvdzns",
                "dwugbihrgpdymcjaxefotvdzns",
                "qwulbihrkplymcjaxefoqvqzns",
                "qvugbihrkplyhcjtxefotvdzns",
                "qwugbihrkplymcjaxcfotvfzjs",
                "qwugbihrkpkymyjaxdfotvdzns",
                "qwugbinrkplymcjswefotvdzns",
                "qcuguiqrkplymcjaxefotvdzns",
                "qwugbihlkplyccjaxefrtvdzns",
                "qwugbihpkplomcjaxefotvdhns",
                "qwggbphrkplymcjaxbfotvdzns",
                "qwuipihrkplymcjaxefotvdznt",
                "qwugbihrhplyccjaxeforvdzns",
                "qwugbdhrkplymcjdxefotvdznv",
                "qwugbihrkplymcjaxefotvbfos",
                "qwugtihrkplymcocxefotvdzns",
                "qwugbihrkpljmcjaxwfovvdzns",
                "qwugbnhrkplymcjaxefotvdxnm",
                "qwugbihrkpeymcjauefotvlzns",
                "qwugbihjkplymcraxefftvdzns",
                "qwugbghrkplymcjaxefotvizni",
                "qwwgbihrkplymcjrxefotvrzns",
                "qwugbihrkplymzjawexotvdzns",
                "qwugnihrkplymcjpxnfotvdzns",
                "qwugbihrkdlytcjaxecotvdzns",
                "qwugbihrkacymdjaxefotvdzns",
                "qlugbehrkplymcjaxzfotvdzns",
                "fwugbihrkplymcjamefotldzns",
                "qwugbihrkplymcjarefotlszns",
                "qwsgbihrkpnymcjfxefotvdzns",
                "awuubihrkplymcjaxefrtvdzns",
                "qwngbihrkpjtmcjaxefotvdzns",
                "qwugbihrkpltmkjaxefytvdzns",
                "ewugbihrkplymcjvxefotvdzus",
                "qwugbihrpplymcjaxsfmtvdzns",
                "qwrgbihrmplymcjaxefutvdzns",
                "qwugbihrknxymcwaxefotvdzns",
                "qwugbnurkplymcjabefotvdzns",
                "qwugbihrkphomfjaxefotvdzns",
                "qwugbchrkplymcjaxefctvdens",
                "qwugbidrkplymcjaxefotwwzns",
                "qwggbohrkplgmcjaxefotvdzns",
                "nwkgbihrkplymcjaxqfotvdzns",
                "qwuibihrkpnymajaxefotvdzns",
                "qwugsihrzplymujaxefotvdzns",
                "qwugbihrkplumcgaxefodvdzns",
                "qwugbqhrkplymcjaxefotvddts",
                "qwugbiorkpvyacjaxefotvdzns",
                "bjugbihukplymcjaxefotvdzns",
                "qwugbyhrkplymxjaxexotvdzns",
                "vwugbihrkplymcraxefotgdzns",
                "qwugbihrkplymjwaxeaotvdzns",
                "qwpsbihrkplykcjaxefotvdzns",
                "qwugbqhrkplymcjaxefotgdzno",
                "qwugbjhrkplymcjaxefatvczns",
                "qwuglihrkclymcjvxefotvdzns",
                "qjugbihrkpsymcjajefotvdzns",
                "qwugbinrkptymcjaxedotvdzns",
                "qwurbihrkglymcjaxefomvdzns",
                "qfugbihrsxlymcjaxefotvdzns",
                "lwuggihrkplymcjaxefotvdzds",
                "qwugbihrkplymcjhxwfjtvdzns",
                "qwugbhjrkplymcjaxefotvdyns",
                "qwugbihrkplymcjoxefepvdzns",
                "awwgbihryplymcjaxefotvdzns",
                "qpugbihrkplymcjaxekorvdzns",
                "qwulbihrkplymcuapefotvdzns",
                "qwugbwhrkplymljaxefotvdrns",
                "qwugxihrkplymjjalefotvdzns",
                "qwugbmhrkplymcjyxefotvdnns",
                "qwugbihrkplymcjnxgfotsdzns",
                "qwygbihrkplsmczaxefotvdzns",
                "qwugbihrkplymqjaxefovgdzns",
                "qwuwbihrkplymcjaxefktvdznu",
                "qwugbihrkplyfcjaxeoowvdzns",
                "qwufbiyrkplymcjaxedotvdzns",
                "qwusbirrkplymcjaxefotvdlns",
                "qwurbihroplymtjaxefotvdzns",
                "qiugbihrkplymcjaxefvtvmzns",
                "qwugrihrkflymcjaxefotvdzls",
                "qwugbimrzplymcoaxefotvdzns",
                "qyugbiwrkplymcjasefotvdzns",
                "qwubbihrkpiymcjaxefotvdzws",
                "qwugbilrkplymjjgxefotvdzns",
                "qwugbihykplympjaxefotgdzns",
                "qwugmxhrkplymcjaxefotvdins",
                "qwfjbahrkplymcjaxefotvdzns",
                "owuzbihrkplymcbaxefotvdzns",
                "qwugbihrkilymcjaxefotsdzvs",
                "qwugbwhrkplymcpzxefotvdzns",
                "qwugbihrkplymcjlcefotvdjns",
                "kwugbihrkplymcjaxefotvhdns",
                "qwulbihrkplymcfwxefotvdzns",
                "qwxabihrkplyhcjaxefotvdzns",
                "qwugbihrzpoymcjaxefotqdzns",
                "qwugbihrknlymcjabefovvdzns",
                "qyugbihrkplymclaxefotvgzns",
                "qwugbxhrkpgymcjaxefotvdlns",
                "qwuplihrkplymcjaxefhtvdzns",
                "qwugbihruplymcjaxefotmdzps",
                "qwugkihrkplymcqtxefotvdzns",
                "qwugbihrkplymcjaxeyodvszns",
                "qwukbihrkplymojaxefotvczns",
                "nwugbihrkplymcjaxrfothdzns",
                "qwugbihrkklymcjaxqfotvdzcs",
                "qwugbihrkplemcjaxefotvufns",
                "qwugbihrkplymcjaxbfitvdzne",
                "qwugbizrkplymcjaxgfotvdhns",
                "qwulbihrxplymcjaxefolvdzns",
                "jwugbihckpoymcpaxefotvdzns",
                "qwugeihrkplymbjcxefotvdzns",
                "qwuxbihbkplymcjaxeuotvdzns",
                "qwugbshrkplyvcjlxefotvdzns",
                "qwugbimrjplymcjaxtfotvdzns",
                "qwugzikrkplymcjaxefxtvdzns",
                "qwugbihrkplymcjaxefftvdgnq",
                "qwugbihnkilymcjaxemotvdzns",
                "qfugbihrkplyfcjadefotvdzns",
                "qwugbihrkplymrsaxefwtvdzns",
                "qwugfihrkpsymckaxefotvdzns",
                "qwulbihrkplymyjaxefotvdkns",
                "quugbikrkpkymcjaxefotvdzns",
                "qwugbihfgplymdjaxefotvdzns",
                "qougbihrkplemcjaqefotvdzns",
                "qwugbihrkplemcjjxefotvdyns",
                "qfuhbikrkplymcjaxefotvdzns",
                "qhugbihrcplymcjaxefrtvdzns",
                "qwugbmhnkplymcjnxefotvdzns",
                "qwugbihrkplymmjaaefofvdzns",
                "qwugbihrtplykcjaxefoxvdzns",
                "qwugbihrkmvymcjaxefetvdzns",
                "qwugbfjrkplymcjaxefotadzns",
                "qwuibihrrplymcjaxefotvdznv",
                "qwcgbihrkjlymcjzxefotvdzns",
                "qwugbihrkplymcjuxefytvzzns",
                "qwkgwihrkllymcjaxefotvdzns",
                "qwugbihrkplymcpaxgfogvdzns",
                "qwuvbihrkplymcdaxefotvdmns",
                "qwtgbihrkplqmcjgxefotvdzns",
                "qwuglihrkplnmcjaxefptvdzns",
                "qbugbihrkplymcjawefotidzns",
                "qwegbihrvplymcjaxefqtvdzns",
                "qwugbihrgqlyncjaxefotvdzns",
                "qwugbihrpplymcjaxefotvdeqs",
                "qwugbihrkplypzjaxefbtvdzns",
                "qwugbihrkpkyncjanefotvdzns",
                "qwugbshrkplymcjaxefotfdzys",
                "qwugbihrkpymmcjaxefotzdzns",
                "qwugbphrkplymcjaxefotvdzru",
                "qyugbihrkplamcjjxefotvdzns",
                "qwugbihrmphymcjaxefotedzns",
                "qwuafihrkplymcjaxefozvdzns",
                "qwugwihrkplymcjaxwfotvdzws",
                "qwugbihrkzlymcjaxjfotvdznz",
                "uwugsihrkplypcjaxefotvdzns",
                "qwugbihrkplymcjaxefotudzur",
                "qwugbihrkplymcjoxefotfdzng",
                "qwugbihxkplymcjamebotvdzns",
                "qpugvihrkplymcjaxefotvdzhs",
                "qwugbihrkplyocgaxefotvdzss",
                "qwugbihrkplymcpaqekotvdzns",
                "qwunbihrkplymclaxefitvdzns",
                "qzugbihrkplsmcjaxebotvdzns",
                "qvugbihrkplymcjsxefotvmzns",
                "qwugbihrkprymcyaxkfotvdzns",
                "qwugbihukplymcjaxefotzlzns",
                "qwusbihrkplymcjaxwfotxdzns",
                "qwugbihrwplymcjaxefbtcdzns",
                "qwugbihrkplymcjpxefotkdons",
                "qwugbihrkhlymcjaxefohvwzns",
                "qwukbihrkplymxjaxefotvdzms",
                "qwugbiprkplsmcjaxefotvdznm",
                "qwugbqhrkplymcjawwfotvdzns",
                "qwugbihrkprymcjaxefotvdxnb",
                "qwugbihrkplymcjaxefoivpzos",
                "qwugbuhrkplymcjaxefotvdzsb",
                "qwugblhrcplymcjaxefotvdyns",
                "qtuabihrkplymejaxefotvdzns",
                "qwucbihrkplyvcjaxefotvdznu",
                "rwugbyhrkplymcjaxefotvdzrs",
                "qruybihrkpsymcjaxefotvdzns",
                "qwugbihrjpwymcjaxejotvdzns",
                "qwugbihshplymcjaxefoavdzns",
                "vwugbihrkplymwjaxefotvdznc",
                "qwugbihrkpmymcjvxcfotvdzns",
                "qkxgbihrkplymcjnxefotvdzns");

        int checksum = day2.getChecksum(inputList);
        Assert.assertEquals(7904L, checksum);
    }
}
