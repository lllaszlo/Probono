# Probono

First of all you should align the wedriver in the @BeforeClass section --> "d:\\Repositories\\chromedriver.exe"

Each test annotation is a different combination of inputs. You can easily create such a test by using the FillInput funcions:

 - kompetenciak: range of parameter is from 1 to 33. Each number means a different type of competence, see below:
	1	Az alkotmányjog és az államtan közszolgálati kompetenciái
	2	A kormányzás hatékonyságának (feltételei, modelljei) közszolgálati kompetenciái
	3	A közigazgatás szervezetrendszerének és működésének közszolgálati kompetenciái
	4	Az EU kormányzási mechanizmusa és a nemzeti közigazgatás közötti kapcsolat közszolgálati kompetenciái
	5	A szervezeti-személyi hatékonyság és a teljesítményfejlesztés közszolgálati kompetenciái
	6	A közszolgáltatás-szervezés, a közfeladat-ellátás stratégiai szervezési ismereteinek közszolgálati kompetenciái
	7	Közrend és közbiztonság, kriminálpolitika közszolgálati kompetenciái
	8	Honvédelem, védelempolitika közszolgálati kompetenciái
	9	Gazdaságpolitika közszolgálati kompetenciái
	10	Foglalkoztatáspolitika közszolgálati kompetenciái
	11	Versenyképesség és innováció közszolgálati kompetenciái
	12	Környezeti fenntarthatósági politika közszolgálati kompetenciái
	13	Szociális védelem és biztonság közszolgálati kompetenciái
	14	Közoktatás-politika közszolgálati kompetenciái
	15	Innováció, kutatásfejlesztés közszolgálati kompetenciái
	16	Összehasonlító kormányzástan közszolgálati kompetenciái
	17	Közigazgatás-fejlesztés, hatékonyság- és hatáselemzés közszolgálati kompetenciái
	18	Nemzetközi gazdasági kapcsolatok közszolgálati kompetenciái
	19	Helyi önkormányzás, helyi közszolgálat-fejlesztés, és helyi demokrácia közszolgálati kompetenciái
	20	Államháztartási, közpénzügyi és gazdálkodási ismeretek közszolgálati kompetenciái
	21	Vezetésszervezéssel kapcsolatos kompetenciafejlesztő tréning közszolgálati kompetenciái
	22	Fejlesztésmenedzsment közszolgálati kompetenciái
	23	Közigazgatási hatósági és bírósági eljárásjog közszolgálati kompetenciái
	24	Szakigazgatási ismeretek közszolgálati kompetenciái
	25	Közigazgatási informatikai alkalmazások közszolgálati kompetenciái
	26	Közszolgálati kommunikáció és ügyfélkapcsolatok közszolgálati kompetenciái
	27	Stratégia és irányítás vezetői kompetenciái
	28	Emberek vezetésének vezetői kompetenciái
	29	Vezetői kommunikáció kompetenciái
	30	Vezetői készségek, a vezető személyiség kompetenciái
	31	Oktatói
	32	Szakértői
	33	Vizsgáztatói 

 - oraszam: 5 different possibilities can be selected, you can use these numbers to select them:
		8 = 1-8 óra
        9 = 9-16 óra
        17 = 17-32 óra
        33 = 33-64 óra
        65 = 65- óra 

 - tanulmanyiPontszam: also 5 different possibilities can be selected, you can use these numbers to select them:
		8 = 1-8 tanulmányi pont
        9 = 9-16 tanulmányi pont
        17 = 17-32 tanulmányi pont
        33 = 33-64 tanulmányi pont
        65 = 65- tanulmányi pont

 - koltseg: 3 different possibilities can be selected, you can use these words to select them:
		norm = normatíva terhére
        nem = nem ismert
        terit = térítéses

 - programCsoport: 2 different possibilities can be selected, you can use these words to select them:
		bel = belső
        k = közszolgálati

 - szervezetreKorlatozott: 2 different possibilities can be selected, you can use these words to select them:
		igen = igen
        nem = nem

 - telepules: you can type the name of the city you want e.g.  budapest,  debrecen etc

if you want to use the ELearning, jelenleti, blended, targyevbenIndul options, you can use these functions, otherwise leave them out
