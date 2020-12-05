package day4PassportProcessing

const val INPUT_TEST_1 =
    "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
    "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
    "\n" +
    "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
    "hcl:#cfa07d byr:1929\n" +
    "\n" +
    "hcl:#ae17e1 iyr:2013\n" +
    "eyr:2024\n" +
    "ecl:brn pid:760753108 byr:1931\n" +
    "hgt:179cm\n" +
    "\n" +
    "hcl:#cfa07d eyr:2025 pid:166559648\n" +
    "iyr:2011 ecl:brn hgt:59in"

const val INPUT_TEST_2 =
    "hgt:176cm\n" +
    "iyr:2013\n" +
    "hcl:#fffffd ecl:amb\n" +
    "byr:2000\n" +
    "eyr:2034\n" +
    "cid:89 pid:934693255\n" +
    "\n" +
    "hcl:#b5c3db ecl:grn hgt:155cm pid:#baec97 iyr:2017\n" +
    "byr:1939\n" +
    "eyr:2020\n" +
    "\n" +
    "pid:526669252 eyr:1972\n" +
    "hgt:152cm ecl:dne byr:1960 hcl:z iyr:2023\n" +
    "\n" +
    "eyr:2028 hcl:#c0946f hgt:73in byr:1926 ecl:#473aaf iyr:2016 pid:565318180\n" +
    "\n" +
    "pid:472686027 ecl:oth iyr:2019\n" +
    "cid:277 byr:1940\n" +
    "eyr:2030 hgt:170cm\n" +
    "hcl:#62e117\n" +
    "\n" +
    "ecl:oth\n" +
    "iyr:2017\n" +
    "pid:938461813 hcl:#733820 byr:1959 hgt:159cm eyr:2022\n" +
    "\n" +
    "iyr:2011 eyr:2021 hcl:z\n" +
    "ecl:hzl byr:2002 pid:17324328 cid:140\n" +
    "hgt:186cm\n" +
    "\n" +
    "byr:2022 pid:3164234967 iyr:1984\n" +
    "hgt:76cm hcl:6b3837\n" +
    "ecl:#fa362b\n" +
    "eyr:2037\n" +
    "\n" +
    "hcl:z eyr:1945\n" +
    "pid:9247286687 hgt:75cm\n" +
    "iyr:1934 cid:326 ecl:zzz\n" +
    "byr:2005\n" +
    "\n" +
    "byr:2005\n" +
    "ecl:lzr\n" +
    "eyr:2021 pid:152cm\n" +
    "cid:254 iyr:2020 hcl:z hgt:157cm\n" +
    "\n" +
    "iyr:2020 eyr:2020 hcl:#18171d ecl:gry pid:914128753 hgt:168cm\n" +
    "byr:2002\n" +
    "\n" +
    "hcl:#7d3b0c hgt:160cm eyr:2020 iyr:2015\n" +
    "pid:054067854 ecl:brn byr:2023\n" +
    "\n" +
    "hcl:#cfa07d hgt:157cm\n" +
    "byr:1994 eyr:2027 pid:344443856\n" +
    "iyr:2016\n" +
    "\n" +
    "pid:762423097\n" +
    "iyr:2014 hcl:#a97842 ecl:brn hgt:180cm byr:1927 eyr:2021\n" +
    "\n" +
    "pid:6645616064 hcl:#ceb3a1 byr:2030\n" +
    "eyr:2032 hgt:158cm iyr:2012\n" +
    "ecl:#e9619e\n" +
    "\n" +
    "eyr:2022\n" +
    "ecl:brn\n" +
    "byr:1986\n" +
    "hgt:161cm cid:99 pid:288726584 hcl:#6b5442 iyr:2019\n" +
    "\n" +
    "cid:75\n" +
    "pid:117771843\n" +
    "hgt:184cm byr:1937 ecl:brn\n" +
    "hcl:#d88fd9\n" +
    "iyr:2015 eyr:2027\n" +
    "\n" +
    "iyr:2016 hcl:#fffffd hgt:170cm eyr:2022 ecl:oth pid:629454113\n" +
    "byr:1952\n" +
    "\n" +
    "hcl:#c0946f iyr:2018 hgt:189cm\n" +
    "byr:1971 ecl:oth eyr:2029\n" +
    "pid:800207810\n" +
    "\n" +
    "eyr:2022 hcl:#7d3b0c pid:969986413\n" +
    "byr:1978 iyr:2020 hgt:186cm\n" +
    "ecl:gry\n" +
    "\n" +
    "hgt:171cm byr:1949 hcl:#341e13\n" +
    "ecl:amb eyr:2030 pid:359107274 iyr:2013\n" +
    "\n" +
    "pid:839751525 eyr:2024 byr:1921\n" +
    "iyr:2012 ecl:amb hcl:#b0ed6f hgt:154cm\n" +
    "\n" +
    "pid:32592758\n" +
    "byr:2009\n" +
    "hgt:107 iyr:2019 hcl:#866857\n" +
    "eyr:2036 ecl:amb\n" +
    "\n" +
    "eyr:2040 hcl:#733820 cid:199\n" +
    "byr:2027\n" +
    "pid:7791792988 ecl:blu iyr:2026\n" +
    "hgt:63cm\n" +
    "\n" +
    "iyr:2011 cid:119 pid:344693475\n" +
    "ecl:grn hgt:160cm eyr:2029 hcl:#346973 byr:1996\n" +
    "\n" +
    "hgt:161in byr:2025 cid:167 iyr:2024 eyr:2040 pid:034804648\n" +
    "hcl:#efcc98 ecl:oth\n" +
    "\n" +
    "ecl:#ba14f0 iyr:1935\n" +
    "hgt:60cm\n" +
    "byr:2003 eyr:1987\n" +
    "hcl:8e509b pid:161cm\n" +
    "\n" +
    "iyr:2018 pid:620508652 ecl:amb eyr:2023 hgt:183cm hcl:#a97842\n" +
    "byr:1967 cid:117\n" +
    "\n" +
    "eyr:2022 ecl:amb\n" +
    "pid:476049089 iyr:2012\n" +
    "hgt:165cm\n" +
    "byr:1955 hcl:#602927\n" +
    "\n" +
    "byr:2014 hcl:z iyr:2029 cid:279 pid:28914607 hgt:75cm ecl:xry\n" +
    "\n" +
    "hgt:156cm eyr:2023 iyr:2011 ecl:oth hcl:#7d3b0c pid:561313217 byr:1952\n" +
    "\n" +
    "iyr:2011 byr:1935\n" +
    "hcl:#cfa07d ecl:oth pid:830614209\n" +
    "eyr:2028 hgt:173cm\n" +
    "\n" +
    "iyr:2012 cid:210 eyr:2022\n" +
    "pid:652810130 hcl:#18171d ecl:grn byr:1960 hgt:152cm\n" +
    "\n" +
    "eyr:2026 pid:815848563 hgt:75in iyr:2019 ecl:gry byr:1947\n" +
    "hcl:#cfa07d\n" +
    "\n" +
    "cid:181 iyr:2012\n" +
    "eyr:2024 byr:1934 hcl:#c0946f\n" +
    "hgt:165cm ecl:oth pid:232944581\n" +
    "\n" +
    "cid:135 iyr:2020\n" +
    "byr:1971 hcl:#733820 pid:531877857 hgt:179cm eyr:2027 ecl:amb\n" +
    "\n" +
    "byr:1987 hcl:936807 eyr:2032 ecl:#4bec4a pid:605628619 cid:180 hgt:150in\n" +
    "iyr:2015\n" +
    "\n" +
    "hcl:b62ef0 ecl:#092141\n" +
    "pid:876635399 byr:1944 hgt:158cm iyr:2017 eyr:1924\n" +
    "\n" +
    "iyr:2016 pid:7039815301 byr:2014 hgt:150 eyr:2032 ecl:blu hcl:z\n" +
    "\n" +
    "byr:1979 eyr:2030 iyr:1978 hgt:63 pid:1554613758 hcl:z ecl:amb\n" +
    "\n" +
    "hgt:70cm hcl:e45897 iyr:2020 eyr:1977 ecl:dne pid:2878189427 byr:1973\n" +
    "\n" +
    "iyr:2003\n" +
    "hcl:#cfa07d\n" +
    "pid:260517078\n" +
    "byr:2030 hgt:175cm eyr:2020\n" +
    "ecl:brn\n" +
    "\n" +
    "pid:460604681 eyr:2022\n" +
    "cid:138 iyr:2016 hgt:163cm\n" +
    "byr:1922\n" +
    "hcl:#ceb3a1 ecl:oth\n" +
    "\n" +
    "hgt:167cm byr:2009 eyr:1975 cid:295 pid:174cm iyr:2029\n" +
    "hcl:z\n" +
    "\n" +
    "hgt:67in ecl:grn\n" +
    "eyr:2023\n" +
    "cid:122 pid:281246917 byr:1990 iyr:2011 hcl:#866857\n" +
    "\n" +
    "ecl:#ed7ddc byr:1922 cid:234 hcl:e61b1e iyr:1932 eyr:1996 pid:31344005 hgt:62cm\n" +
    "\n" +
    "byr:1949\n" +
    "cid:275 iyr:2017 ecl:grn\n" +
    "hgt:164cm eyr:2027 hcl:#18171d\n" +
    "pid:751342937\n" +
    "\n" +
    "ecl:blu hgt:162cm\n" +
    "pid:432600613 byr:1923 eyr:2029 iyr:2011 hcl:#623a2f cid:315\n" +
    "\n" +
    "iyr:2020\n" +
    "hcl:#b2bb11 pid:055891584 ecl:grn\n" +
    "hgt:67in\n" +
    "eyr:2029 byr:1937\n" +
    "\n" +
    "iyr:2012\n" +
    "hcl:#a97842 pid:325640714 ecl:blu hgt:185cm eyr:2024 byr:1971\n" +
    "\n" +
    "hcl:#b6652a pid:485327267\n" +
    "ecl:brn hgt:155cm eyr:2028\n" +
    "iyr:2019\n" +
    "\n" +
    "pid:902164867 hgt:77 cid:283 eyr:2027\n" +
    "iyr:2020 ecl:hzl byr:1935 hcl:#efcc98\n" +
    "\n" +
    "ecl:grn\n" +
    "hcl:#ceb3a1 byr:1977 hgt:165cm\n" +
    "pid:850700221 eyr:2030\n" +
    "iyr:2012\n" +
    "\n" +
    "byr:1989 ecl:brn eyr:2026 pid:919138357 iyr:2016\n" +
    "hcl:#623a2f cid:319 hgt:161cm\n" +
    "\n" +
    "iyr:2017\n" +
    "byr:1973 pid:293382118 hcl:#341e13 cid:143 ecl:hzl\n" +
    "hgt:166cm eyr:2022\n" +
    "\n" +
    "pid:517102798\n" +
    "hcl:f9d9dd\n" +
    "eyr:1933 iyr:2019 hgt:164cm\n" +
    "byr:2017 ecl:utc\n" +
    "\n" +
    "eyr:2023 pid:757868802 hcl:#18171d cid:244\n" +
    "hgt:156cm\n" +
    "ecl:blu iyr:2015 byr:1926\n" +
    "\n" +
    "eyr:2022\n" +
    "iyr:2020\n" +
    "hgt:158cm ecl:grn\n" +
    "byr:1988\n" +
    "pid:979194751 hcl:#888785\n" +
    "\n" +
    "eyr:2039\n" +
    "pid:3867868142 byr:1936 ecl:dne iyr:2022 hcl:4b43b8\n" +
    "hgt:115 cid:241\n" +
    "\n" +
    "iyr:2015 eyr:2026\n" +
    "hcl:#ceb3a1 pid:539099924\n" +
    "cid:234\n" +
    "ecl:brn\n" +
    "byr:1920 hgt:163cm\n" +
    "\n" +
    "cid:259 iyr:2020\n" +
    "pid:949453818 eyr:2022 hgt:181cm\n" +
    "byr:1997 ecl:blu hcl:#18171d\n" +
    "\n" +
    "byr:2016\n" +
    "iyr:2012\n" +
    "ecl:utc\n" +
    "hgt:68in eyr:1993\n" +
    "pid:1542134802 hcl:486699\n" +
    "cid:239\n" +
    "\n" +
    "iyr:2018\n" +
    "hgt:154cm ecl:brn byr:1970\n" +
    "eyr:2021 pid:581775861 hcl:#888785\n" +
    "\n" +
    "iyr:2012\n" +
    "eyr:2027 hgt:67cm hcl:#efcc98 ecl:zzz pid:312104916 byr:2020\n" +
    "\n" +
    "hcl:#b6652a ecl:hzl eyr:2023 iyr:2012 pid:513268492\n" +
    "hgt:159cm\n" +
    "\n" +
    "hgt:162in hcl:z\n" +
    "byr:2029\n" +
    "eyr:2023 ecl:#e2e7ab iyr:2016 pid:65979982\n" +
    "\n" +
    "cid:84 hgt:71in ecl:blu pid:982719716\n" +
    "eyr:2020 iyr:2014\n" +
    "\n" +
    "eyr:2028 hgt:181cm\n" +
    "ecl:hzl pid:255796693 hcl:#341e13 byr:1994 iyr:2011 cid:218\n" +
    "\n" +
    "ecl:blu\n" +
    "byr:2029 iyr:2017 pid:468504566 eyr:2020 hcl:z hgt:163cm\n" +
    "\n" +
    "hgt:158cm\n" +
    "eyr:2025 ecl:hzl cid:295 pid:601339484\n" +
    "hcl:#7d3b0c byr:1991 iyr:2013\n" +
    "\n" +
    "eyr:2028\n" +
    "iyr:2018 pid:2236240873\n" +
    "hgt:172cm\n" +
    "ecl:#0e337e hcl:#b6652a cid:108 byr:1930\n" +
    "\n" +
    "ecl:gry hcl:#888785\n" +
    "eyr:2020 pid:442479017 iyr:2016\n" +
    "\n" +
    "iyr:2014 ecl:grn\n" +
    "cid:313 eyr:2023\n" +
    "hgt:183cm\n" +
    "byr:1976\n" +
    "pid:499580308 hcl:#53efe6\n" +
    "\n" +
    "eyr:2034\n" +
    "cid:235 hcl:8f3cf5\n" +
    "byr:2027\n" +
    "hgt:161in pid:3259965094 ecl:xry iyr:2026\n" +
    "\n" +
    "eyr:1978 byr:1925 iyr:2018 hgt:170cm ecl:#0c94e8\n" +
    "pid:562699017 hcl:#816949\n" +
    "\n" +
    "eyr:2023 hcl:#866857 hgt:179cm\n" +
    "pid:785862442 iyr:2014 cid:165 ecl:amb byr:1939\n" +
    "\n" +
    "hgt:187cm\n" +
    "pid:64469711 ecl:gry eyr:2023 cid:225 hcl:#341e13 iyr:2011 byr:1958\n" +
    "\n" +
    "hgt:162cm byr:2028 ecl:#37e345\n" +
    "eyr:2037 hcl:19fb3d\n" +
    "iyr:2021\n" +
    "pid:#87921a\n" +
    "\n" +
    "eyr:2027 hcl:#18171d\n" +
    "byr:2002 ecl:gry iyr:2014\n" +
    "pid:561506850 hgt:177cm\n" +
    "\n" +
    "hgt:64cm pid:#a92686\n" +
    "eyr:2029 cid:122\n" +
    "byr:2026\n" +
    "iyr:2017 hcl:z ecl:grn\n" +
    "\n" +
    "eyr:2028 byr:2007 hgt:155cm ecl:#86fa1b hcl:#733820 pid:562889497\n" +
    "iyr:2019\n" +
    "\n" +
    "pid:880698787\n" +
    "byr:1992\n" +
    "hcl:#7d3b0c hgt:163cm ecl:hzl\n" +
    "iyr:2011 eyr:2021\n" +
    "\n" +
    "eyr:2020 byr:1994 iyr:2011 hgt:186cm pid:841855425 hcl:#cfa07d ecl:gry\n" +
    "\n" +
    "byr:1923 iyr:2015 ecl:amb pid:414655744\n" +
    "hcl:#b6652a\n" +
    "hgt:159cm\n" +
    "eyr:2026\n" +
    "\n" +
    "hgt:171cm ecl:amb pid:363065723 iyr:2020\n" +
    "cid:66 hcl:#b6652a eyr:2021\n" +
    "byr:1960\n" +
    "\n" +
    "eyr:2002\n" +
    "hcl:2627b2 ecl:#1bf21d pid:168cm byr:2024 iyr:2020\n" +
    "hgt:186in\n" +
    "\n" +
    "iyr:2011 byr:1924 eyr:2024\n" +
    "hcl:#b6652a ecl:brn\n" +
    "pid:794477411 hgt:162in\n" +
    "\n" +
    "hcl:z hgt:67cm\n" +
    "byr:2025\n" +
    "pid:582569979\n" +
    "iyr:2013\n" +
    "ecl:oth eyr:2025\n" +
    "\n" +
    "cid:50 hcl:931e2c\n" +
    "hgt:172in eyr:1994 iyr:2023\n" +
    "ecl:#cd2204\n" +
    "byr:2015\n" +
    "pid:157cm\n" +
    "\n" +
    "hgt:173cm eyr:2028\n" +
    "ecl:amb pid:569607283\n" +
    "byr:1942\n" +
    "iyr:2019\n" +
    "cid:228\n" +
    "hcl:#866857\n" +
    "\n" +
    "cid:109\n" +
    "ecl:oth eyr:1933 byr:1982 pid:173cm hcl:#b6652a hgt:174cm\n" +
    "iyr:2023\n" +
    "\n" +
    "cid:69 hcl:#9ad05b pid:341135641\n" +
    "byr:1968 ecl:brn\n" +
    "iyr:2012 hgt:156cm\n" +
    "eyr:2020\n" +
    "\n" +
    "hgt:176cm\n" +
    "byr:1954 ecl:blu\n" +
    "eyr:2020\n" +
    "pid:478462637 iyr:2019\n" +
    "hcl:#888785\n" +
    "\n" +
    "iyr:2026 hgt:193in\n" +
    "byr:2018 pid:162cm hcl:605e7f eyr:1948 ecl:utc\n" +
    "\n" +
    "byr:1962\n" +
    "eyr:2022 pid:445346117 iyr:2019 hgt:158cm hcl:#623a2f ecl:hzl\n" +
    "\n" +
    "cid:278 hgt:187cm eyr:2024 iyr:2016 byr:1964\n" +
    "ecl:grn pid:450739552 hcl:#733820\n" +
    "\n" +
    "ecl:grn byr:2000 eyr:2023\n" +
    "pid:344489911 hcl:#7d3b0c iyr:2011 hgt:177cm\n" +
    "\n" +
    "iyr:2015 hgt:180cm cid:190 hcl:#a97842 pid:359774842 eyr:2029 byr:2002 ecl:amb\n" +
    "\n" +
    "eyr:2027 iyr:2015 ecl:hzl\n" +
    "pid:082733109\n" +
    "byr:1975 hgt:191cm cid:251 hcl:#888785\n" +
    "\n" +
    "hcl:#c0946f iyr:2015\n" +
    "hgt:167cm byr:1990 ecl:amb pid:168cm eyr:2023\n" +
    "\n" +
    "ecl:gry eyr:2028\n" +
    "byr:1934 iyr:2013 hcl:#6b5442\n" +
    "pid:424412120 hgt:173cm\n" +
    "\n" +
    "pid:273352568\n" +
    "eyr:2024\n" +
    "iyr:2013 byr:1926 hcl:#602927\n" +
    "ecl:brn hgt:180cm\n" +
    "\n" +
    "hcl:#7d3b0c hgt:70in ecl:amb iyr:2019\n" +
    "byr:1937\n" +
    "eyr:2030 pid:309011548\n" +
    "\n" +
    "ecl:grn\n" +
    "hgt:64in pid:796889811 hcl:#18171d\n" +
    "byr:1929 eyr:2027\n" +
    "\n" +
    "ecl:amb hcl:#888785\n" +
    "pid:412449028 cid:316 byr:1982\n" +
    "iyr:2019 eyr:2030 hgt:193cm\n" +
    "\n" +
    "eyr:1927\n" +
    "hcl:z hgt:158cm byr:1930\n" +
    "ecl:lzr iyr:2018\n" +
    "cid:197\n" +
    "pid:0906120002\n" +
    "\n" +
    "ecl:grn byr:1970 hgt:181cm\n" +
    "pid:376212702 eyr:2030 iyr:2017 cid:266 hcl:#f8b0f5\n" +
    "\n" +
    "iyr:2018 hgt:73in pid:652356158 hcl:#c0946f\n" +
    "ecl:grn byr:1973\n" +
    "\n" +
    "cid:170 hcl:#b6652a byr:2011\n" +
    "ecl:gry iyr:2025 pid:#b6e567 hgt:67cm eyr:2016\n" +
    "\n" +
    "hgt:192cm ecl:amb eyr:2026 pid:201824712 hcl:#888785 byr:1966 iyr:2019\n" +
    "\n" +
    "iyr:2013 byr:1995 eyr:2028 hcl:#b6652a ecl:brn cid:53 pid:705606447 hgt:176cm\n" +
    "\n" +
    "hcl:#341e13 byr:1951\n" +
    "hgt:161cm pid:231973770 iyr:2015 ecl:hzl\n" +
    "eyr:2030\n" +
    "\n" +
    "cid:210 ecl:brn iyr:2017 eyr:2030\n" +
    "hgt:176cm hcl:#efcc98\n" +
    "byr:1965\n" +
    "\n" +
    "eyr:2020 hcl:#7d3b0c\n" +
    "pid:872088079 ecl:oth iyr:2017 byr:1920\n" +
    "hgt:180cm\n" +
    "\n" +
    "hcl:#0b540c iyr:2019\n" +
    "byr:1938\n" +
    "hgt:153cm ecl:gry pid:236785988\n" +
    "eyr:2020\n" +
    "\n" +
    "eyr:2020 hgt:184cm iyr:2019\n" +
    "pid:673186642 ecl:oth byr:1977 hcl:#866857\n" +
    "\n" +
    "eyr:2025\n" +
    "ecl:gry hcl:#341e13 byr:1970 iyr:2010 pid:972122542 hgt:184cm\n" +
    "\n" +
    "ecl:grn byr:1992 hgt:71in\n" +
    "iyr:2014 cid:254 hcl:#fffffd pid:749733013\n" +
    "eyr:2026\n" +
    "\n" +
    "cid:98 ecl:amb eyr:2022\n" +
    "hgt:169cm pid:022677680\n" +
    "byr:1937 iyr:2014 hcl:#e62c71\n" +
    "\n" +
    "hgt:192cm\n" +
    "iyr:2015\n" +
    "eyr:2028 ecl:oth pid:6000619833 hcl:#c0946f\n" +
    "byr:1930\n" +
    "\n" +
    "byr:1938 hcl:#efcc98 hgt:178cm iyr:1953 eyr:2038\n" +
    "ecl:brn pid:#cdc55a\n" +
    "\n" +
    "hgt:66in byr:1951 iyr:2016 hcl:#18171d\n" +
    "eyr:2027\n" +
    "ecl:lzr pid:834188980\n" +
    "\n" +
    "iyr:2012 eyr:2025\n" +
    "hcl:#7d3b0c pid:330325803 cid:166 hgt:186cm byr:1938\n" +
    "ecl:amb\n" +
    "\n" +
    "iyr:2015 hcl:#602927 cid:268 eyr:2021\n" +
    "ecl:amb hgt:186cm pid:318676962\n" +
    "\n" +
    "hcl:#3d6f3c iyr:2014 pid:665730784 cid:191 hgt:150cm byr:1981 ecl:oth eyr:2024\n" +
    "\n" +
    "ecl:grn hcl:#733820\n" +
    "eyr:2028 iyr:2010\n" +
    "hgt:162cm byr:1944 pid:872962499\n" +
    "\n" +
    "eyr:2028 byr:1974\n" +
    "ecl:brn\n" +
    "iyr:2010 hcl:#18171d hgt:160cm\n" +
    "\n" +
    "hcl:#602927\n" +
    "byr:1959 eyr:2027 iyr:2016 ecl:brn hgt:169cm pid:078503025\n" +
    "\n" +
    "hcl:#623a2f pid:326300051 hgt:153cm\n" +
    "byr:1973 iyr:2012\n" +
    "ecl:gry eyr:2026\n" +
    "\n" +
    "hgt:151cm\n" +
    "byr:1966 eyr:2029 pid:026952622 hcl:#18171d ecl:gry iyr:2010\n" +
    "\n" +
    "hcl:#7d3b0c byr:1974 pid:444713591 iyr:2017 eyr:2030\n" +
    "hgt:165cm ecl:oth\n" +
    "\n" +
    "iyr:2026 pid:184cm\n" +
    "ecl:gmt hcl:z hgt:71cm\n" +
    "eyr:2029\n" +
    "\n" +
    "cid:310 hcl:#fffffd byr:1998\n" +
    "pid:450705840 iyr:2015\n" +
    "ecl:grn eyr:2021 hgt:165cm\n" +
    "\n" +
    "byr:1939 hcl:#623a2f ecl:gry hgt:69in pid:539812641 eyr:2027 iyr:2013\n" +
    "\n" +
    "pid:207645014\n" +
    "iyr:2015\n" +
    "cid:314 ecl:oth\n" +
    "byr:1942\n" +
    "eyr:2027 hgt:186cm hcl:#fffffd\n" +
    "\n" +
    "ecl:#fb7e3d eyr:2031 iyr:1956\n" +
    "hgt:188 pid:160cm hcl:z byr:2027\n" +
    "\n" +
    "byr:1972 iyr:2020 eyr:2026 hcl:#b6652a pid:289088329 hgt:65in ecl:gry\n" +
    "\n" +
    "eyr:2027\n" +
    "hgt:59cm\n" +
    "byr:2022\n" +
    "pid:938063769 ecl:zzz iyr:2028 hcl:23c762\n" +
    "\n" +
    "byr:2004 hgt:74 iyr:2017\n" +
    "eyr:2040 ecl:blu pid:4611117799 cid:73 hcl:z\n" +
    "\n" +
    "ecl:brn byr:1962 cid:321\n" +
    "iyr:2019 eyr:2026\n" +
    "hgt:159cm\n" +
    "hcl:#667310 pid:439864945\n" +
    "\n" +
    "iyr:2026 eyr:2039 pid:633263851 cid:321 ecl:lzr hgt:166cm\n" +
    "byr:2023 hcl:fc3c63\n" +
    "\n" +
    "byr:1961 iyr:2010 ecl:blu\n" +
    "eyr:2023 pid:245858010\n" +
    "\n" +
    "hgt:193cm pid:821303249 eyr:2020 hcl:#6b5442 cid:130 byr:1946\n" +
    "\n" +
    "eyr:2026 ecl:brn\n" +
    "hcl:#733820 byr:1983 hgt:182cm pid:727380954 cid:188 iyr:2015\n" +
    "\n" +
    "hgt:152cm cid:206 iyr:2012 byr:1947 hcl:#888785 ecl:gry\n" +
    "pid:720312394 eyr:2023\n" +
    "\n" +
    "hgt:150cm ecl:gry pid:863712648\n" +
    "iyr:2019 cid:349 byr:1976 hcl:#602927 eyr:2022\n" +
    "\n" +
    "hgt:164in pid:953500867\n" +
    "eyr:2021\n" +
    "iyr:2014\n" +
    "hcl:z cid:343 ecl:amb\n" +
    "\n" +
    "byr:1981 pid:529710230 iyr:2013 eyr:2023\n" +
    "hcl:#c0946f ecl:amb\n" +
    "hgt:151cm\n" +
    "\n" +
    "pid:706204190 hgt:154cm cid:317\n" +
    "hcl:#602927 byr:1949 ecl:blu iyr:2010 eyr:2028\n" +
    "\n" +
    "iyr:2019 hcl:#0219e6\n" +
    "pid:850093151 ecl:gry\n" +
    "eyr:2030\n" +
    "byr:1938 hgt:177cm\n" +
    "\n" +
    "ecl:brn hcl:#efcc98 eyr:2029 byr:1963\n" +
    "hgt:185cm pid:611279647 iyr:2011\n" +
    "\n" +
    "ecl:blu eyr:2022 byr:1941 hgt:167cm\n" +
    "iyr:2012 hcl:#7d3b0c pid:415739564\n" +
    "cid:193\n" +
    "\n" +
    "eyr:2027 ecl:blu byr:1968 pid:479994566\n" +
    "hcl:#733820 hgt:151cm\n" +
    "iyr:2011\n" +
    "\n" +
    "pid:263729839 hgt:189cm eyr:2030 ecl:gry byr:2001 hcl:#602927\n" +
    "\n" +
    "byr:1985\n" +
    "ecl:amb pid:672663977 cid:139\n" +
    "hgt:159cm hcl:#733820 iyr:2018 eyr:2020\n" +
    "\n" +
    "byr:1998\n" +
    "hcl:#cfa07d eyr:2023 pid:255046063 iyr:2011 ecl:blu hgt:177cm\n" +
    "\n" +
    "ecl:oth\n" +
    "byr:1980 pid:253747166 eyr:2029\n" +
    "hcl:#6b5442 hgt:186cm\n" +
    "\n" +
    "eyr:2030 hcl:#866857\n" +
    "hgt:165cm\n" +
    "ecl:amb\n" +
    "iyr:2017 pid:241240220 cid:164 byr:2001\n" +
    "\n" +
    "byr:1994 hcl:#b6652a iyr:2015\n" +
    "pid:753831241\n" +
    "hgt:175cm\n" +
    "eyr:2027 ecl:blu\n" +
    "\n" +
    "hcl:#b6652a pid:471594512\n" +
    "byr:1961 ecl:hzl hgt:175cm\n" +
    "iyr:2020 eyr:2025\n" +
    "\n" +
    "byr:1987 pid:112366159\n" +
    "eyr:2028 hcl:22b2d7\n" +
    "hgt:64in cid:222\n" +
    "ecl:#b40dca iyr:2019\n" +
    "\n" +
    "iyr:2015 hcl:e1ed55 hgt:160in ecl:utc byr:2015 eyr:2036\n" +
    "\n" +
    "byr:1935\n" +
    "hcl:#7d3b0c hgt:152cm ecl:gry\n" +
    "pid:160090332 iyr:2020 eyr:2020\n" +
    "\n" +
    "pid:552779024 byr:1998 hgt:185cm ecl:gry eyr:2026 iyr:2013 hcl:#d46cd6\n" +
    "\n" +
    "ecl:oth pid:311860969\n" +
    "cid:57\n" +
    "hgt:60in\n" +
    "eyr:2026\n" +
    "hcl:#ceb3a1\n" +
    "byr:1961 iyr:2011\n" +
    "\n" +
    "eyr:2021 hgt:162cm cid:240\n" +
    "pid:259997995\n" +
    "hcl:#efcc98\n" +
    "ecl:gry byr:1962 iyr:2017\n" +
    "\n" +
    "hcl:#866857\n" +
    "iyr:2016\n" +
    "eyr:2029\n" +
    "ecl:blu byr:1927 cid:249 pid:665324615 hgt:65in\n" +
    "\n" +
    "byr:1931\n" +
    "cid:331\n" +
    "hgt:66in\n" +
    "ecl:grn iyr:2020 hcl:#efcc98 eyr:2025 pid:175780921\n" +
    "\n" +
    "hgt:98\n" +
    "eyr:2040 ecl:blu byr:2029\n" +
    "iyr:1967 hcl:0d76e9\n" +
    "pid:#c9053a cid:296\n" +
    "\n" +
    "pid:370918950\n" +
    "hcl:#602927\n" +
    "byr:1938\n" +
    "hgt:178cm iyr:2018 eyr:2030\n" +
    "ecl:oth\n" +
    "\n" +
    "hgt:185cm\n" +
    "eyr:1984 ecl:oth pid:851080398\n" +
    "hcl:z byr:2027 iyr:2017\n" +
    "\n" +
    "pid:095078224 byr:1957 hcl:#45bcf4 ecl:#f643f9 hgt:63cm eyr:2036 iyr:1978\n" +
    "\n" +
    "hcl:z\n" +
    "eyr:2023 ecl:oth hgt:162cm\n" +
    "iyr:2016 byr:1938 pid:#fdcddf\n" +
    "\n" +
    "hcl:#341e13 iyr:2013 hgt:189cm\n" +
    "pid:982271041 ecl:brn\n" +
    "byr:1930 eyr:2030\n" +
    "\n" +
    "eyr:2026\n" +
    "iyr:2012 hcl:#cfa07d cid:59 pid:105862717 ecl:blu\n" +
    "hgt:159cm byr:1943\n" +
    "\n" +
    "ecl:hzl\n" +
    "pid:604172804 iyr:2016 hgt:174cm cid:79 eyr:2025\n" +
    "hcl:#733820 byr:1994\n" +
    "\n" +
    "iyr:2011 pid:452628771 ecl:gry hgt:182cm hcl:#623a2f\n" +
    "eyr:2023\n" +
    "byr:1986\n" +
    "\n" +
    "hcl:#341e13 iyr:2010 byr:1946 eyr:2021\n" +
    "cid:350 pid:049684494 hgt:180cm\n" +
    "ecl:grn\n" +
    "\n" +
    "iyr:2020\n" +
    "hgt:173cm pid:384503937\n" +
    "byr:1986\n" +
    "hcl:#341e13\n" +
    "cid:113\n" +
    "eyr:2025 ecl:amb\n" +
    "\n" +
    "hgt:180cm byr:1949\n" +
    "hcl:#733820 iyr:2010 eyr:2030\n" +
    "cid:123 pid:065609606 ecl:oth\n" +
    "\n" +
    "iyr:2010 eyr:2028\n" +
    "pid:231750173\n" +
    "hgt:63in ecl:brn\n" +
    "byr:1948 hcl:#18171d\n" +
    "\n" +
    "iyr:2020 hcl:#623a2f\n" +
    "ecl:gry\n" +
    "byr:1922 pid:961213634 eyr:2022 hgt:177cm\n" +
    "\n" +
    "hcl:#18171d eyr:2020 iyr:2014 byr:1983\n" +
    "pid:183568344 hgt:72in\n" +
    "ecl:gry\n" +
    "\n" +
    "eyr:2023 pid:102781246 ecl:brn\n" +
    "hcl:#888785 byr:1929 hgt:167cm iyr:2010\n" +
    "\n" +
    "pid:362873066 byr:1994 hcl:#de545f iyr:2018 hgt:177cm ecl:blu cid:86\n" +
    "eyr:2024\n" +
    "\n" +
    "hcl:842f2d iyr:1983\n" +
    "byr:1954 eyr:2037\n" +
    "ecl:lzr pid:3915492573 hgt:166cm\n" +
    "\n" +
    "ecl:grn\n" +
    "hcl:#fffffd iyr:2014\n" +
    "hgt:173cm\n" +
    "byr:1939\n" +
    "pid:930650489\n" +
    "eyr:2025\n" +
    "\n" +
    "eyr:2028 ecl:brn hcl:#7d3b0c hgt:166cm byr:1938 pid:992958531 iyr:2011\n" +
    "\n" +
    "pid:101149939 eyr:2024 iyr:2018 hgt:165cm\n" +
    "ecl:hzl\n" +
    "hcl:#ceb3a1 cid:176\n" +
    "\n" +
    "cid:62\n" +
    "pid:651390352 hcl:#efcc98\n" +
    "iyr:2018\n" +
    "eyr:2027\n" +
    "ecl:brn\n" +
    "hgt:66in byr:1953\n" +
    "\n" +
    "hcl:#623a2f byr:1978\n" +
    "iyr:2013\n" +
    "hgt:180cm eyr:2027 ecl:amb pid:836425641\n" +
    "\n" +
    "pid:557464096 hgt:155cm ecl:blu cid:142 byr:1936 iyr:2010\n" +
    "hcl:#cfa07d eyr:2027\n" +
    "\n" +
    "ecl:gry iyr:2024 hcl:#341e13 pid:442593279 cid:314 hgt:186cm byr:1960\n" +
    "eyr:2022\n" +
    "\n" +
    "cid:123 iyr:2014\n" +
    "byr:2000\n" +
    "pid:878733390 eyr:2021 ecl:hzl hgt:162cm\n" +
    "\n" +
    "byr:1959 cid:259\n" +
    "pid:722895016\n" +
    "ecl:brn iyr:2018 eyr:2027 hgt:185cm\n" +
    "\n" +
    "pid:163697814 ecl:hzl\n" +
    "iyr:2013 byr:1932\n" +
    "hgt:68in cid:286 eyr:2025 hcl:#efcc98\n" +
    "\n" +
    "byr:1927\n" +
    "hgt:72cm ecl:oth\n" +
    "eyr:2021 hcl:#99e959\n" +
    "pid:669724466 iyr:2010\n" +
    "\n" +
    "byr:1943 iyr:2011 eyr:2024 pid:384419879 ecl:hzl hcl:#7d3b0c hgt:170cm\n" +
    "\n" +
    "pid:137944386 ecl:gry\n" +
    "byr:1953 hcl:#733820 iyr:2013 eyr:2025 hgt:184cm\n" +
    "\n" +
    "iyr:2017 eyr:2023 pid:288078785\n" +
    "hgt:179cm\n" +
    "byr:1993 hcl:#602927 ecl:hzl\n" +
    "\n" +
    "ecl:brn\n" +
    "hgt:187cm eyr:2024 byr:1971 iyr:2020 hcl:#b6652a pid:622975646\n" +
    "cid:290\n" +
    "\n" +
    "pid:371817422 ecl:blu byr:1964\n" +
    "iyr:2018\n" +
    "eyr:2021 cid:176\n" +
    "hgt:153cm hcl:#888785\n" +
    "\n" +
    "byr:2002\n" +
    "cid:256 iyr:2014 eyr:2024 ecl:blu hcl:#18171d hgt:187cm\n" +
    "pid:050022911\n" +
    "\n" +
    "hgt:178cm pid:211144001 eyr:2027 iyr:2013\n" +
    "byr:1947\n" +
    "hcl:#7d3b0c ecl:grn\n" +
    "\n" +
    "eyr:2025 ecl:blu pid:046417901 byr:1950\n" +
    "iyr:2015 hgt:165cm\n" +
    "hcl:#7d3b0c cid:128\n" +
    "\n" +
    "ecl:hzl eyr:2029\n" +
    "iyr:2015\n" +
    "hgt:171cm hcl:#341e13\n" +
    "pid:561680375 byr:1997\n" +
    "\n" +
    "byr:1948 iyr:2023 pid:17288381 hcl:6a34a3 ecl:#671ece eyr:2001\n" +
    "cid:152\n" +
    "\n" +
    "eyr:2036 hgt:141 iyr:1957 byr:1987 hcl:z\n" +
    "pid:86986187 ecl:utc\n" +
    "\n" +
    "eyr:2024 hcl:#b6652a iyr:2017 ecl:blu byr:1988 cid:348 hgt:152cm pid:068684272\n" +
    "\n" +
    "iyr:2011 pid:989825275\n" +
    "cid:78 hcl:#341e13 byr:1983 ecl:blu hgt:158cm eyr:2020\n" +
    "\n" +
    "ecl:grn hgt:187cm eyr:2027 iyr:2015\n" +
    "hcl:#866857 pid:240650427\n" +
    "byr:1940\n" +
    "cid:91\n" +
    "\n" +
    "hcl:#888785 cid:185 byr:1925\n" +
    "hgt:155cm iyr:2015 ecl:blu eyr:2027 pid:851697441\n" +
    "\n" +
    "iyr:2016 ecl:oth pid:056439470 byr:1985 eyr:2026\n" +
    "hgt:154cm hcl:#282539\n" +
    "\n" +
    "ecl:hzl hcl:#a97842\n" +
    "iyr:1944\n" +
    "pid:118846711 eyr:2026 byr:1922 hgt:185cm\n" +
    "\n" +
    "iyr:2020 hcl:#733820\n" +
    "pid:854531642 hgt:165cm\n" +
    "ecl:hzl eyr:2022\n" +
    "\n" +
    "iyr:2014\n" +
    "byr:1957 hcl:#7fa674 hgt:189cm\n" +
    "eyr:2023 pid:740871941 ecl:brn\n" +
    "\n" +
    "ecl:amb cid:349 hgt:170cm\n" +
    "byr:1952 hcl:#ceb3a1 iyr:2020\n" +
    "eyr:2026\n" +
    "pid:730499325\n" +
    "\n" +
    "eyr:2027 ecl:amb\n" +
    "byr:1975 pid:985687961\n" +
    "hcl:z hgt:157cm\n" +
    "iyr:2013\n" +
    "cid:133\n" +
    "\n" +
    "ecl:blu\n" +
    "hgt:193cm iyr:2015 hcl:#10f2ba byr:1989 pid:939704495 eyr:2021\n" +
    "\n" +
    "ecl:oth eyr:2025 hgt:69in iyr:2014 cid:258 pid:477970733 byr:1984 hcl:#b6652a\n" +
    "\n" +
    "hcl:z byr:2013\n" +
    "ecl:zzz\n" +
    "pid:1904741884 hgt:180 cid:138 eyr:1985 iyr:1935\n" +
    "\n" +
    "eyr:2025\n" +
    "iyr:2026 hgt:190in pid:#43ca33\n" +
    "ecl:#3e1ef1 hcl:#7d3b0c byr:2030\n" +
    "\n" +
    "eyr:2029 hgt:191cm\n" +
    "byr:1986 hcl:#ceb3a1 cid:327 pid:795060714 iyr:2012 ecl:hzl\n" +
    "\n" +
    "eyr:2025 iyr:2017 ecl:grn\n" +
    "hcl:z\n" +
    "pid:8886398 hgt:174cm byr:2016\n" +
    "\n" +
    "hcl:#a97842\n" +
    "eyr:2021 ecl:grn iyr:2013 pid:565234133 byr:1998\n" +
    "hgt:161cm\n" +
    "\n" +
    "eyr:2029 hgt:163cm byr:1933 cid:86 iyr:2011\n" +
    "ecl:grn\n" +
    "hcl:#fffffd\n" +
    "pid:818769307\n" +
    "\n" +
    "hgt:190cm eyr:2030 hcl:#af5b5d iyr:2011 ecl:brn pid:359524299 byr:1969\n" +
    "\n" +
    "ecl:amb iyr:2011 eyr:2022\n" +
    "cid:141\n" +
    "byr:1978 hgt:69in hcl:#fffffd pid:013006109\n" +
    "\n" +
    "ecl:blu hgt:164cm iyr:2019 eyr:2027 pid:899103430 hcl:#cfa07d\n" +
    "byr:1976\n" +
    "\n" +
    "eyr:1938\n" +
    "ecl:#a03c41 pid:708735698\n" +
    "iyr:2030\n" +
    "hgt:184cm hcl:#b6652a byr:2013\n" +
    "\n" +
    "ecl:hzl byr:1997 hcl:#a97842 cid:60 pid:172cm\n" +
    "eyr:2023 hgt:161in iyr:1936\n" +
    "\n" +
    "ecl:hzl\n" +
    "byr:1938 pid:094889181\n" +
    "hgt:162cm iyr:2020\n" +
    "eyr:2028\n" +
    "hcl:#623a2f\n" +
    "\n" +
    "hgt:162cm cid:86\n" +
    "hcl:#623a2f pid:738174580 ecl:brn byr:1980 eyr:2028 iyr:2014\n" +
    "\n" +
    "byr:2007 hgt:150in hcl:z\n" +
    "eyr:2032\n" +
    "ecl:#114f3b\n" +
    "iyr:2030 pid:5129772\n" +
    "\n" +
    "ecl:hzl iyr:2017\n" +
    "hcl:#18171d\n" +
    "pid:696283412 byr:1976 hgt:168cm\n" +
    "eyr:2028\n" +
    "\n" +
    "eyr:1922 ecl:#84b0d4 byr:2013 hcl:#ceb3a1 pid:150cm iyr:2030\n" +
    "hgt:71cm\n" +
    "\n" +
    "hgt:164cm byr:1949 ecl:gry eyr:2026\n" +
    "hcl:#623a2f\n" +
    "\n" +
    "ecl:oth\n" +
    "iyr:2013 hgt:166cm hcl:#50e385\n" +
    "pid:478852286\n" +
    "eyr:2030 byr:1930\n" +
    "\n" +
    "cid:129\n" +
    "iyr:2020 byr:1978 pid:907580992 eyr:1955\n" +
    "hcl:#602927\n" +
    "ecl:grn hgt:165cm\n" +
    "\n" +
    "ecl:blu iyr:2018 byr:1953\n" +
    "hgt:177cm pid:126681706 eyr:2025 hcl:#c0946f\n" +
    "\n" +
    "byr:1984 pid:275799917\n" +
    "ecl:oth hcl:#623a2f cid:348 iyr:2020\n" +
    "hgt:189cm eyr:2024\n" +
    "\n" +
    "iyr:2016\n" +
    "ecl:hzl byr:1954\n" +
    "hcl:#623a2f pid:810508839 eyr:2026\n" +
    "hgt:185cm\n" +
    "\n" +
    "byr:1967\n" +
    "eyr:2021 hcl:#ceb3a1\n" +
    "pid:406634908 hgt:158cm iyr:2018 ecl:hzl\n" +
    "\n" +
    "iyr:2019 eyr:2030 pid:995681076 hcl:#341e13\n" +
    "cid:101 hgt:162cm ecl:blu byr:1925\n" +
    "\n" +
    "eyr:2026 pid:272513479 hcl:#b6652a byr:1973 iyr:2016 ecl:amb hgt:182cm\n" +
    "\n" +
    "pid:298704871 eyr:2024 hcl:#efcc98 byr:1959\n" +
    "iyr:2014 hgt:191cm ecl:grn\n" +
    "\n" +
    "hgt:193cm pid:750729809 ecl:oth\n" +
    "cid:324\n" +
    "iyr:2011 hcl:#efcc98 byr:1954 eyr:2020\n" +
    "\n" +
    "byr:1966 iyr:2019 eyr:2025 ecl:#2df4b6\n" +
    "hgt:184cm pid:#fc17f4 cid:161 hcl:#602927\n" +
    "\n" +
    "byr:1955 hcl:299464 ecl:amb\n" +
    "hgt:157cm iyr:2017 eyr:2021\n" +
    "pid:239450987\n" +
    "\n" +
    "hgt:172cm\n" +
    "ecl:hzl\n" +
    "pid:839804598\n" +
    "hcl:#341e13 eyr:2030 byr:1964 iyr:2013\n" +
    "\n" +
    "iyr:2018 hgt:152cm byr:1948 hcl:#623a2f pid:400121515\n" +
    "ecl:blu\n" +
    "eyr:2020\n" +
    "\n" +
    "cid:296\n" +
    "ecl:grn\n" +
    "byr:1960 iyr:2028 pid:#1f4b95 eyr:2033 hcl:#602927\n" +
    "hgt:66cm\n" +
    "\n" +
    "iyr:1933 ecl:#232e20 pid:#d03ca7\n" +
    "eyr:2030 hcl:598ed6 hgt:154in byr:2011\n" +
    "\n" +
    "cid:247 ecl:grn iyr:2014\n" +
    "hgt:178cm\n" +
    "byr:1992 hcl:#602927 eyr:2021\n" +
    "pid:678964478\n" +
    "\n" +
    "iyr:2010 pid:623705680\n" +
    "ecl:hzl hgt:181cm byr:1980 hcl:#341e13 eyr:2028"
