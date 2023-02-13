package fr.spacefox.japon.data

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.*

enum class Page(
    val category: Category,
    val date: LocalDate,
    val place: Place,
    val title: String,
    val content: Array<Content>
) {
    ryokannagano(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 22),
        place = Place.nagano,
        title = "Un ryokan (旅館), à Nagano",
        content =
            arrayOf(
                Text(
                    "Un ryokan est une auberge traditionnelle. Enfin, celle-ci n’en était pas vraiment une dans le sens où il n’y avait pas toutes les coutumes, mais surtout le bâtiment."),
                Image("quotidien", "Nagano 24", "L’entrée de la chambre"),
                Image("quotidien", "Nagano 25", "La chambre"),
                Image("quotidien", "Nagano 26", "L’alcôve dans la chambre"),
                Image("quotidien", "Nagano 27", "Un genre de pièce au fond"),
                Image(
                    "quotidien",
                    "Nagano 28",
                    "Ce bâtiment est un vrai labyrinthe, avec par exemple ce genre d’escaliers"),
            ),
    ),
    zenkoji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.MAY, 22),
        place = Place.nagano,
        title = "Zenkô-ji (善光寺), Nagano",
        content =
            arrayOf(
                Text(
                    """Le Zenkô-ji est un temple bouddhiste de la ville de Nagano. Pour plus de détails, voyez avec <a href="https://fr.wikipedia.org/wiki/Zenk%C5%8D-ji">Wikipédia</a> ou votre source d’information préférée."""),
                Image(
                    "temples",
                    "Zenko-ji 03",
                    "On y accède par l’inévitable allée touristique. Il n’y a pas grand monde dans cette ville de province à cette époque de l’année"),
                Image("temples", "Zenko-ji 15", "La porte est… imposante."),
                Text(
                    """Ensuite on passe devant les 6 <a href="https://fr.wikipedia.org/wiki/Ksitigarbha#Roku_Jiz.C5.8D">Roku Jizô</a>, ce qui donne l’occasion de jouer au jeu des différences :"""),
                Image("temples", "Zenko-ji 05", ""),
                Image("temples", "Zenko-ji 06", ""),
                Image("temples", "Zenko-ji 07", ""),
                Image("temples", "Zenko-ji 08", ""),
                Image("temples", "Zenko-ji 09", ""),
                Image("temples", "Zenko-ji 10", ""),
                Text(
                    "Puis devant un bronze de Nurebotoke, qui protège le temple de l’incendie (quand on sait qu’à peu près tous les monuments du Japon ont été incendiés et reconstruits plusieurs fois, sa présence ne surprend pas)"),
                Image("temples", "Zenko-ji 21", ""),
                Image("temples", "Zenko-ji 11", "On arrive enfin à l’immense bâtiment principal"),
                Image("temples", "Zenko-ji 12", ""),
                Image("temples", "Zenko-ji 13", ""),
                Image("temples", "Zenko-ji 16", ""),
                Image("temples", "Zenko-ji 17", ""),
                Image("temples", "Zenko-ji 18", ""),
                Image("temples", "Zenko-ji 19", ""),
                Text(
                    "Comme dans l’immense majorité des temples bouddhistes, on ne photographie pas l’intérieur."),
                Image(
                    "temples", "Zenko-ji 20", "Dans les jardins alentours, on trouve des annexes"),
                Image("temples", "Zenko-ji 14", "Et, entre autres, la cloche principale"),
                Image("temples", "Zenko-ji 01", "En partant, on tombe sur un Mujina en prière"),
                Image("temples", "Zenko-ji 02", ""),
            ),
    ),
    wtfnagano(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 22),
        place = Place.nagano,
        title = "Curiosités de Nagano",
        content =
            arrayOf(
                Image("wtf", "WTF 29", "UNIX - salon et spa"),
                Image("wtf", "WTF 32", "Prévention de l’incendie"),
                Image("wtf", "WTF 31", """Happy Singer - 800 yens "seulement"…"""),
                Image("wtf", "Matsumoto 046", "L’un des bus municipaux de Nagano"),
                Image(
                    "wtf",
                    "Matsumoto 044",
                    "À Nagano, on fait des plaques d’égout à l’effigie du symbole locale (une grosse pomme) et surtout on les colorie"),
                Image(
                    "wtf",
                    "Matsumoto 045",
                    "Ou alors, on a la plaque commémorative des jeux olympiques"),
            ),
    ),
    boissonsjaponaises(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 22),
        place = Place.nagano,
        title = "Boissons japonaises",
        content =
            arrayOf(
                Text(
                    "Il y aurait environ un distributeur automatique (自動販売機) pour 23 japonais au Japon. La plupart d’entre eux sont des distributeurs de boissons, bien pratique en été. On y trouve bien plus que le sempiternel cola. Bien <em>trop</em> de trucs en fait…"),
                Image("wtf", "WTF 35", "La boisson Dragon Ball"),
                Image(
                    "wtf",
                    "WTF 30",
                    "Boisson à la viande ou réduction dans un restau du coin ? Je ne sais pas trop, je n’ai pas testé - mais je n’ai vu cette chose qu’à Nagano, ce qui serait plutôt rassurant…"),
                Text(
                    "Renseignements pris, il s’agirait simplement du thé. Le reste signifie que ça passe bien après un barbecue, ou quelque chose du genre."),
            ),
    ),
    memoriauxzenkoji(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 22),
        place = Place.nagano,
        title = "Hommages",
        content =
            arrayOf(
                Text(
                    """A <a href="/page/zenkoji#content">Zenkô-ji</a>, outre le temple, on trouve divers mémoriaux, parfois surprenants…"""),
                Image("wtf", "WTF 33", "Mémorial pour les pins et leurs aiguilles"),
                Text(
                    "<em>Ce monument a été construit en 1956 pour honorer l’esprit des pins et de leurs aiguilles. Chaque 8 avril se tient un rituel annuel pour qu’ils reposent en paix.</em>"),
                Image("wtf", "WTF 34", "Monument à la chanson « Hato Poppo » (Pigeons mignons)"),
                Text(
                    "<em>Ceci est un monument à la chanson pour enfants « Hatto Poppo » (Pigeons mignons), texte de Higashi Kume et musique de Taki Rentaro. Il a été dit que Higashi Kume a écrit ce poème après avoir vu les pigeons de Zenkô-ji. Higashi Kume a écrit elle-même le texte sur le monument, et le dessin a été réalisé par Suzuki Manpei, natif de Nagano. Une compilation des chansons de Higashi Kume et Taki Rentaro appelée « Songs for kindergarteners » a été publiée en 1901.</em>"),
                Image("wtf", "WTF 36", "Tombe des outils"),
                Text(
                    "<em>Sous ces pierres sont enterrés les outils utilisés pour la construction du présent Hall Principal. En enterrant ces outils, les constructeurs du Zenkô-ji ont prié pour que les esprits des outils reposent en paix.</em>"),
                Text("Les monuments en eux-mêmes n’ont aucun intérêt, donc pas de photos."),
            ),
    ),

    /*
     * Matsumoto
     */

    sanctuairesmatsumoto(
        category = Category.shinto,
        date = LocalDate.of(2013, Month.MAY, 23),
        place = Place.matsumoto,
        title = "Sanctuaires shinto à Matsumoto",
        content =
            arrayOf(
                Image("shinto", "Matsumoto 037", "Un grand sanctuaire en centre ville"),
                Image(
                    "shinto",
                    "Matsumoto 038",
                    "Et un petit perdu dans la forêt d’une colline d’un village à côté"),
            ),
    ),
    matsumotojo(
        category = Category.chateaux,
        date = LocalDate.of(2013, Month.MAY, 23),
        place = Place.matsumoto,
        title = "Le Matsumoto-jô (松本城)",
        content =
            arrayOf(
                Text(
                    """Voilà un beau château noir (ce qui lui vaut son surnom de « corbeau ) planté au milieu des montagnes - à tel point qu’on se demande si le seigneur local n’a pas dit <em>« Quelle belle vue ! Construisez-moi un château ici que je puisse en profiter ! »</em>.</p><p>Plus de détails <a href="https://fr.wikipedia.org/wiki/Matsumoto-j%C5%8D">sur Wikipédia</a>."""),
                Image("chateaux", "Matsumoto 074", "Le donjon vu des jardins"),
                Image("chateaux", "Matsumoto 084", ""),
                Image("chateaux", "Matsumoto 079", "On approche de l’enceinte intérieure"),
                Image("chateaux", "Matsumoto 078", ""),
                Image("chateaux", "Matsumoto 077", "Entre la première et la seconde porte"),
                Image(
                    "chateaux",
                    "Matsumoto 080",
                    "Depuis les jardins, le château est un peu timide"),
                Image("chateaux", "Matsumoto 083", ""),
                Image("chateaux", "Matsumoto 081", "On s’approche…"),
                Image("chateaux", "Matsumoto 082", ""),
                Text(
                    "Pas de photos à l’intérieur, c’est fort dommage, il y a des trucs rigolos. Comme les escaliers. Les japonais ont un problème avec les escaliers, j’y reviendrai. Là y’avait un étage haut comme un étage normal et demie. Donc ils ont du agrandir l’escalier. Non pas en rajoutant des marches, mais en <strong>agrandissant</strong> les marches - et en conservant l’encombrement horizontal de l’escalier normal. Ce qui donne donc un truc hybride escalier / échelle, très raide avec des marches qui approchent les 40 cm de haut…"),
                Image(
                    "chateaux",
                    "Matsumoto 085",
                    "Il y a un pont pour traverser à un endroit - en zigzag, histoire de confusionner l’agresseur et le touriste. La zone était en restauration"),
                Image(
                    "chateaux",
                    "Matsumoto 075",
                    "Pour finir, deux détails du toit, dont un avec le shachihoko protecteur anti-incendie (je ne sais plus si c’est le mâle ou le femelle par contre, il faudrait regarder sur un plan)"),
                Image("chateaux", "Matsumoto 076", ""),
            ),
    ),
    jardinsmatsumoto(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.MAY, 23),
        place = Place.matsumoto,
        title = "Dans les jardins de Matsumoto",
        content =
            arrayOf(
                Image("jardins", "Matsumoto 070", "Dans le parc du Matsumoto-jô"),
                Image("jardins", "Matsumoto 071", ""),
                Image("jardins", "Matsumoto 072", ""),
                Image("jardins", "Matsumoto 073", "Dans un village à côté"),
            ),
    ),
    vuesmatsumoto(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 23),
        place = Place.matsumoto,
        title = "Vues de Mastumoto et des environs",
        content =
            arrayOf(
                Text(
                    """Depuis les <a href="/page/wtfmatsumoto#content">bancs « pour admirer la vue »</a> sur le pont"""),
                Image("quotidien", "Matsumoto 039", ""),
                Image("quotidien", "Matsumoto 040", ""),
                Text(
                    """Si on recule un peu lorsqu’on est dans le <a href="/page/sanctuairesmatsumoto#content">sanctuaire du centre-ville</a>"""),
                Image("quotidien", "Matsumoto 041", ""),
                Text(
                    """Depuis le 7ème étage du <a href="/page/matsumotojo#content">château</a> (il y a bien 7 étages, il y en a un caché)"""),
                Image("quotidien", "Matsumoto 069", ""),
                Image(
                    "quotidien",
                    "Matsumoto 042",
                    "Vue sur le village à côté de Matsumoto, depuis la colline"),
                Image("quotidien", "Matsumoto 043", ""),
            ),
    ),
    wtfmatsumoto(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 23),
        place = Place.matsumoto,
        title = "Curiosités de Matsumoto",
        content =
            arrayOf(
                Image("wtf", "Matsumoto 048", "On a trouvé Charlie !"),
                Text(
                    """Comme l’indique le petit logo, ces bancs sont là pour <a href="/page/vuesmatsumoto#content">admirer les montagnes</a>"""),
                Image("wtf", "Matsumoto 047", ""),
                Image(
                    "wtf",
                    "Matsumoto 049",
                    "Oui. Le logo de Matsumoto a un chapeau en forme de montagnes. Attendez de voir celui de Himeji."),
                Text(
                    "Au Matsumoto-jô, il y a des consignes (comme à peu près partout en fait). Sauf qu’il y en a des cassées, qu’on ne peut pas le savoir avant d’avoir essayé et que si on tombe dessus, ben… tant pis. Pas de remboursement possible."),
                Image("wtf", "Matsumoto 050", ""),
                Image("wtf", "Matsumoto 051", "Et en cas d’incendie ?"),
                Image("wtf", "Matsumoto 052", "Un immeuble de zombies ?"),
            ),
    ),
    campninja(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 23),
        place = Place.matsumoto,
        title = "Camp d’entraînement ninja",
        content =
            arrayOf(
                Text(
                    "Soit les jeux pour gamins japonais sont des outils de torture sadiques qui doivent provoquer des morts, soit c’était un camp d’entraînement ninja."),
                Text(
                    """Étant donné qu’on a vu personne, c’était un camp d’entraînement ninja, puisque par définition on ne voit pas les ninjas. Quoique prétende la série de petits panneaux « 3 à 12 ans », mais doit-on croire quelqu’un qui a <a href="/page/wtfmatsumoto#content">une montagne sur la tête</a> ?"""),
                Image("wtf", "Matsumoto 053", """Déjà on y accède par un "escalier""""),
                Image("wtf", "Matsumoto 054", "L’échelle horizontale, mais d’un accès… spécial ?"),
                Image("wtf", "Matsumoto 055", "J’ai moyennement confiance en ce pont…"),
                Text(
                    "Il faut marcher sur ces poteaux. Non seulement ils oscillent latéralement, mais en plus la corde qui les relie ne les maintient pas à distances égales, donc ils oscillent aussi d’avant en arrière. A moins de faire moins de 1m40, on ne peut pas se tenir aux poteaux latéraux."),
                Image(
                    "wtf",
                    "Matsumoto 056",
                    " Je suis totalement incapable de venir à bout d’un tel obstacle"),
                Image("wtf", "Matsumoto 057", "Un peu de classique"),
                Image(
                    "wtf",
                    "Matsumoto 058",
                    "Vous aussi, marchez sur une corde raide avec seulement des bouts de ficelle qui pendouillent pour vous retenir"),
                Image(
                    "wtf",
                    "Matsumoto 059",
                    "Apprenez à vous glissez silencieusement le long d’un mur…"),
                Image("wtf", "Matsumoto 060", "… ou d’un filet."),
                Image(
                    "wtf",
                    "Matsumoto 061",
                    "Passages d’obstacles. Ici, c’est soit raide, soit compliqué"),
                Image("wtf", "Matsumoto 062", ""),
                Image(
                    "wtf",
                    "Matsumoto 063",
                    "Accrochez-vous au premier, puis au second, etc. jusqu’au dernier. Pour vous donner une idée de la difficulté, je dois sauter pour attendre le plus haut alors que je mesure 1,87 m…"),
                Image(
                    "wtf",
                    "Matsumoto 064",
                    "Ceci fait, on peut courir sur une poutre qui bouge latéralement et d’avant en arrière, sans rien pour se retenir (c’est beaucoup plus difficile qu’il n’y paraît). Et comme motivation, celui qui se loupe tombe dans le ravin"),
                Image("wtf", "Matsumoto 068", "Au moins, on a le choix pour grimper à ce toboggan"),
                Text("Pas assez fun ? Il y a <strong>l’autre<.strong> toboggan."),
                Image("wtf", "Matsumoto 065", ""),
                Image("wtf", "Matsumoto 066", ""),
                Image("wtf", "Matsumoto 067", ""),
            ),
    ),
    wtfhimejo(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Curiosités de Himeji",
        content =
            arrayOf(
                Image(
                    "wtf",
                    "Himeji 114",
                    "Shiro-robot ! (Pris à la volée par la fenêtre du train, d’où la masse de câbles devant…)"),
                Image(
                    "wtf",
                    "Himeji 115",
                    "Dans le jardin du château de Himeji, il est interdit de fumer le kiseru (pipe japonaise), de manger des boulettes sur un bâtonnet et de boire du saké. Quelle précision !"),
                Image("wtf", "Himeji 118", "Le logo de Himeji"),
                Text(
                    "Oui, c’est un blob avec une paire de fleurs de cerisiers dans les cheveux et avec un donjon sur la tête.</p><p>On pouvait l’acheter en peluche, mais hélas beaucoup trop cher."),
                Text(
                    "<strong>L’apocalypse selon les Japonais :</strong><br/>Dans l’hôtel à Himeji, des bouquins. Parmi les bouquins, un Nouveau Testament, en japonais et en anglais (à côté d’un bouquin de méditations bouddhistes). Comme dans tout Nouveau Testament, on trouve l’Apocalypse, fort à propos placée page 666."),
                Image("wtf", "Beppu1 132", ""),
            ),
    ),
    veritesamourails(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "La vérité sur les samouraïs",
        content =
            arrayOf(
                Text(
                    "Le samouraï se protège la tête avec un casque, qui permet aussi d’effrayer l’ennemi de part son design horrible et surprenant. Ou parfois, de le faire mourir de rire.</p><p>Par exemple, nous avons ce modèle de cornes géantes et rouges, spécial pour samouraïs cocus - pensez à l’enlever <em>avant</em> de passer dans une porte."),
                Image("wtf", "Himeji 116", ""),
                Text(
                    "Un modèle possédait des cornes bien plus grandes mais hélas totalement impossible à prendre en photo, parasité par le manque de lumière et les reflets de la vitrine.</p><p>Pour les amateurs de nourriture, voici les modèles à coquillage géant, ou où deux demi-coquilles d’oeuf (sans doute d’autruche, vue la taille :"),
                Image("wtf", "Himeji 117", ""),
            ),
    ),
    ideestrains(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Les bonnes idées des trains Japonais",
        content =
            arrayOf(
                Image(
                    "quotidien",
                    "Himeji 104",
                    "Une tablette dans un Shinkansen. Une idée (parmi tant d’autres) à transmettre à la SNCF pour leurs TGV"),
                Image("quotidien", "Beppu1 129", "Indications au sol pour les Shinkansen"),
            ),
    ),
    videosurveillance(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Souriez, vous êtes filmés !",
        content =
            arrayOf(
                Text("Parc du château de Himeji :"),
                Image(
                    "quotidien",
                    "Himeji 107",
                    "Notez le petit essuie-glace de la caméra, le projecteur et le haut-parleur permettant de communiquer avec le quidam malintentionné pris sur le fait"),
                Text(
                    "D’une manière générale, le Japon est un pays sûr, mais très vidéo-surveillé."),
            ),
    ),
    vuehimeji(
        category = Category.panoramiques,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Vue sur Himeji",
        content =
            arrayOf(
                Image(
                    "quotidien",
                    "Himeji 106",
                    "Vue générale sur Himeji depuis le château."),
            ),
    ),
    kansai(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Quelque part dans le Kansaï (関西地方)…",
        content =
            arrayOf(
                Image("quotidien", "Himeji 105", ""),
                Text(
                    "En fait, la vie d’un Japonais ressemble souvent à ça. Coincé dans un minuscule appartement d’un énorme immeuble d’habitation, dans l’une des rares plaines (surpeuplées) du Japon. Les étendues d’eau au premier plan sont des rizières - le moindre mètre carré de terrain plat disponible a été transformé en rizière."),
            ),
    ),
    jardinshimejijo(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Jardins du Himeji-jô",
        content =
            arrayOf(
                Image("jardins", "Himeji 112", ""),
                Image("jardins", "Himeji 113", ""),
            ),
    ),
    himejijo(
        category = Category.chateaux,
        date = LocalDate.of(2013, Month.MAY, 24),
        place = Place.himeji,
        title = "Le Himeji-jô (姫路城)",
        content =
            arrayOf(
                Text(
                    """Le superbe <a href="https://fr.wikipedia.org/wiki/Himeji-j%C5%8D">château du héron blanc</a> était malheureusement en restauration au moment de la visite. Le toit du donjon et les murs qui n’étaient pas en pierre ont été entièrement démontées et mises à nu - pudique, le donjon s’est donc enveloppé dans un échafaudage géant. L’opération est lourde et doit être refaite tous les 50 ans en ce qui concerne les murs…"""),
                Image("chateaux", "Himeji 086", ""),
                Image("chateaux", "Himeji 089", ""),
                Image(
                    "chateaux",
                    "Himeji 094",
                    "À l’arrière du donjon, un pont et un ascenceur géant pour les matériaux, visibles derrière ce pavillon"),
                Text(
                    "Du coup, la visite est un peu amputée, même si l’échafaudage se visite, contient des explications intéressantes sur la restauration et un point de vue à peu près inexploitable pour cause de moult reflets.</p><p>Ça n’empêche pas le reste du domaine d’être visible, et il y a déjà de quoi faire (même si niveau superficie visitable, on reste très loin des grands châteaux français)."),
                Image("chateaux", "Himeji 087", "Une porte"),
                Image(
                    "chateaux",
                    "Himeji 088",
                    "Un mur d’enceinte, conçu pour des guerres sans armes de siège ni armes à feu de puissance. On devine les meurtrières, qui sont petites et de formes géométriques (ronds, carrés, triangles)"),
                Image(
                    "chateaux",
                    "Himeji 090",
                    "La barrière et l’arbre donnent une idée des murs à escalader avant d’arriver aux murs blancs (eux munis de mâchicoulis) "),
                Image("chateaux", "Himeji 101", ""),
                Image(
                    "chateaux",
                    "Himeji 100",
                    "Une fois qu’on est arrivés au bout d’un mur… ben y’en a un autre. Ce truc est un labyrinthe, pour pouvoir tirer sur les ennemis le plus longtemps possible."),
                Image("chateaux", "Himeji 095", ""),
                Text(
                    """<a href="/page/matsumotojo#content">Comme à Matsumoto</a>, il y a des shachihokos protecteurs anti-incendie. Ici les trois dernières générations qui datent des trois dernières réfections du toit. En cadeau, un jeu des différences !"""),
                Image("chateaux", "Himeji 091", ""),
                Image("chateaux", "Himeji 092", ""),
                Image("chateaux", "Himeji 093", ""),
                Image("chateaux", "Himeji 098", "Diverses tours"),
                Image("chateaux", "Himeji 099", ""),
                Image(
                    "chateaux",
                    "Himeji 096",
                    "Au détour d’un coude, on a une vue sur les montagnes et la ville environnantes"),
                Image(
                    "chateaux",
                    "Himeji 097",
                    "Du haut du château, une vue sur le Long Couloir (ne rigolez pas, c’est son vrai nom, et il le porte bien, puisqu’il fait environ 300 mètres…) avec le pavillon de la princesse au bout (en bas à droite sur la photo)"),
                Image("chateaux", "Himeji 102", "Le même vu de l’intérieur"),
                Image("chateaux", "Himeji 103", ""),
            ),
    ),
    himejibeppu(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 25),
        place = Place.beppu,
        title = "Entre Himeji et Beppu",
        content =
            arrayOf(
                Image("quotidien", "Beppu1 128", "Gare shinkansen"),
                Image(
                    "quotidien",
                    "Beppu1 130",
                    "Des montagnes et des rizières dans tout ce qui est plat, un paysage caractéristique du Japon (en tous cas des morceaux qu’on traverse en shinkansen)"),
                Image(
                    "quotidien",
                    "Beppu1 131",
                    "Appartements japonais. Oui, on voit bien 25 appartements sur cette photo…"),
            ),
    ),
    enfersbeppu(
        category = Category.nature,
        date = LocalDate.of(2013, Month.MAY, 25),
        place = Place.beppu,
        title = "Les Enfers de Beppu",
        content =
            arrayOf(
                Text(
                    """<a href="https://fr.wikipedia.org/wiki/Beppu">Beppu</a> est une ville thermale équipée de tout le confort moderne. À domicile sont fournis l’eau froide, l’électricité, les égouts, la vapeur soufrée et l’odeur d’œuf pas tout à fait frais (disponible selon le sens du vent).</p><p>On y trouve aussi et surtout moult sources chaudes qui ont fait la réputation de la ville ; celles « tièdes » où l’on peut se baigner, et les « chaudes » où seuls les démons peuvent se baigner, d’où leur nom de « Enfers »."""),
                Image("nature", "Beppu1 137", "D’ailleurs, on y trouve pas mal de démons"),
                Text(
                    "<em>Sérieusement, j’espère que le kami planqué dans cette chose n’y est pas allé de lui-même…</em>"),
                Image(
                    "nature",
                    "Beppu1 136",
                    "Les 8 principaux ne sont pas d’intérêt égal. Par exemple, ça peut surtout faire du bruit et de la fumée"),
                Image(
                    "nature",
                    "Beppu1 135",
                    "On en trouve aussi avec des nuances de bleu intéressantes"),
                Image("nature", "Beppu1 139", ""),
                Image("nature", "Beppu1 142", ""),
                Image("nature", "Beppu1 146", ""),
                Image(
                    "nature",
                    "Beppu1 145",
                    "Le japonais est quelqu’un de pragmatique. Non seulement ces trucs sont jolis, mais en plus on peut y faire cuire œufs, flans et sorcières (ce dernier type de cuisson est passé de mode)"),
                Image(
                    "nature",
                    "Beppu1 140",
                    "Le kami qui habite ce rocher n’a pas vraiment de chance. Non seulement il doit subir des hordes de touristes, mais en plus la jolie eau bleue qui entoure sa demeure est à environ 95 °C - pas très pratique pour sortir."),
                Image("nature", "Beppu1 154", "On y trouve aussi du rouge"),
                Image("nature", "Beppu1 141", "Du <em>très</em> rouge"),
                Image("nature", "Beppu1 152", "Et un genre de… truc gris bloblottant"),
                Image(
                    "nature",
                    "Beppu1 138",
                    "Pourquoi s’embêter avec de l’eau ? La vapeur se suffit très bien à elle-même !"),
                Image(
                    "nature",
                    "Beppu1 153",
                    "Pour vider les enfers et les nettoyer, tirez la bonde."),
                Image("nature", "Beppu1 143", "Et dans tout ça, des gens festoient."),
            ),
    ),
    sanctuairebeppu(
        category = Category.shinto,
        date = LocalDate.of(2013, Month.MAY, 25),
        place = Place.beppu,
        title = "Visite d’un sanctuaire Shinto (神社)",
        content =
            arrayOf(
                Text(
                    """Tiens, ne serait-ce pas <a href="https://fr.wikipedia.org/wiki/Torii">un torii</a> là au bord de cet <a href="/page/enfersbeppu#content">Enfer de Beppu</a> ?"""),
                Image("shinto", "Beppu1 126", ""),
                Image("shinto", "Beppu1 119", "Allons voir ! On commence par le torii principal"),
                Image("shinto", "Beppu1 120", "Le bassin et les louches pour se purifier"),
                Image(
                    "shinto",
                    "Beppu1 121",
                    "Une lanterne. Je serais curieux de savoir combien il y a de lanternes au Japon."),
                Image("shinto", "Beppu1 125", "Une allée de torii avec des étendards sur le côté"),
                Image("shinto", "Beppu1 122", ""),
                Image(
                    "shinto",
                    "Beppu1 123",
                    "Une bestiole protectrice, qui ne fait pas partie de la paire de komainu protecteurs habituels (et d’ailleurs absents dans ce sanctuaire)"),
                Image(
                    "shinto",
                    "Beppu1 124",
                    "Par respect pour le kami local (et aussi un peu parce que mes photos en clair-obscur violent sont complètement foireuses…) le sanctuaire principal ne sera pas illustré. Pour vous consoler, voici une photo d’un tout petit sanctuaire en arrière-plan"),
            ),
    ),
    tanuki(
        category = Category.shinto,
        date = LocalDate.of(2013, Month.MAY, 25),
        place = Place.beppu,
        title = "Un tanuki",
        content =
            arrayOf(
                Text(
                    """Au détour du jardin d’un <a href="/page/enfersbeppu#content">Enfer de Beppu</a>, un <a href="https://fr.wikipedia.org/wiki/Tanuki">tanuki</a> à taille humaine."""),
                Image("shinto", "Beppu1 127", ""),
                Text("Oui, ce sont bien ses couilles…"),
            ),
    ),
    naturebeppu(
        category = Category.nature,
        date = LocalDate.of(2013, Month.MAY, 25),
        place = Place.beppu,
        title = "La nature à Beppu",
        content =
            arrayOf(
                Text("""En bordure d’un <a href="/page/enfersbeppu#content">enfer</a>"""),
                Image("nature", "Beppu1 155", ""),
                Image("nature", "Beppu1 137", ""),
                Image("nature", "Beppu1 144", "Les collines alentours"),
                Image("nature", "Beppu1 147", ""),
                Image(
                    "nature",
                    "Beppu1 148",
                    "Dans une serre (quitte à avoir le chauffage par le sol…), des lotus"),
                Image("nature", "Beppu1 149", ""),
                Image("nature", "Beppu1 150", ""),
                Image("nature", "Beppu1 151", "Et une orchidée (phalaenopsis pour les intimes)"),
            ),
    ),
    sourcesbeppu(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 26),
        place = Place.beppu,
        title = "Les hauteurs de Beppu et les onsens",
        content =
            arrayOf(
                Text(
                    """Les <a href="/page/enfersbeppu#content">Enfers de Beppu</a> se trouvent en fait dans la partie haute de la ville, dans laquelle on trouve aussi un grand nombre d’<a href="https://fr.wikipedia.org/wiki/Onsen">onsens</a> de toutes sortes : du plus simple - parfois une simple mare volcanique en plein air vaguement aménagée jusqu’au complexe luxueux qui atteint la dizaine de bains. La plupart restent simples et très peu chers.</p<p>Évidemment, il est complètement impossible de prendre la moindre photo de ces bains - l’extérieur n’a aucun intérêt, et l’intérieur ne se photographie pas, pour les raisons l’on imagine.</p><p>Par contre, ils sont tous très agréables (surtout ceux en plein air, mais attention aux coups de soleil !)."""),
                Image(
                    "quotidien",
                    "Beppu2 163",
                    "Au pied de ce complexe, un ensemble de cahutes pas vraiment ancestrales, qui servent de sauna."),
                Image("quotidien", "Beppu2 162", "Vue rapprochée"),
                Image(
                    "quotidien",
                    "Beppu2 164",
                    "L’une d’elles est laissée ouverte pour les visiteurs"),
                Image(
                    "quotidien",
                    "Beppu2 166",
                    "Beppu étant construite sur un volcan, on trouve des infiltrations de soufre sur les trottoirs"),
                Image(
                    "quotidien",
                    "Beppu2 167",
                    "En fait, il y a des canalisations de vapeurs soufrées"),
                Image(
                    "quotidien",
                    "Beppu2 168",
                    "En plus d’éviter les fuites en pleine rue, ces canalisations mênent à ces genres de cheminées dans lesquelles on peut faire cuire des oeufs ou des flans (les spécialités locales)"),
                Text(
                    "Ajoutez les tremblements de terre, les tsunamis (dans la ville basse) et les typhons, et vous comprendrez que construire à Beppu ne doit pas être quelque chose de très simple. En plus de tout ça, il faut s’imaginer que toute la ville haute sent l’oeuf pas très frais (selon le sens du vent, c’est plus ou moins prenant)"),
                Image("quotidien", "Beppu2 169", "L’un des ruisseaux qui dévalent la montagne"),
                Image(
                    "quotidien",
                    "Beppu2 165",
                    "Une des nombreuses statues qui veillent sur l’habitant et le touriste"),
            ),
    ),
    naturehautbeppu(
        category = Category.nature,
        date = LocalDate.of(2013, Month.MAY, 26),
        place = Place.beppu,
        title = "Les collines au-dessus de Beppu",
        content =
            arrayOf(
                Image("nature", "Beppu2 178", "Le jardin des onsens tout en haut de la ville"),
                Image(
                    "nature",
                    "Beppu2 179",
                    "Si on se retourne, on voit ça - je ne sais pas pourquoi ils ont rasé la colline en face…"),
                Image("nature", "Beppu2 180", "La végétation est vite luxuriante dans le coin"),
                Image("nature", "Beppu2 181", ""),
            ),
    ),
    wtfbeppu(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 26),
        place = Place.beppu,
        title = "Curiosités de Beppu",
        content =
            arrayOf(
                Image(
                    "wtf",
                    "Beppu1 133",
                    "Au Japon, des personnages de mangas accueillent les voyageurs dans les gares"),
                Image(
                    "wtf",
                    "Beppu2 171",
                    "C’est spécialement vrai à Beppu, où ils ont institutionalisé le truc."),
                Image(
                    "wtf",
                    "Beppu2 170",
                    "Oui, c’était bien Yatterman en yukata. Et voici Doronjo."),
                Image("wtf", "Beppu2 176", "Et même toute la bande, soyons fous !"),
                Image(
                    "wtf",
                    "Beppu2 175",
                    "Statue au fondateur de la ville de Beppu. Oui, il a un bébé accroché au pan de sa veste. Je n’ai pas l’explication."),
                Image("wtf", "Beppu2 172", "Logo dans le bus qui monte au quartier des onsens"),
                Image(
                    "wtf",
                    "Beppu2 174",
                    "En parlant de bus, voici le bouton pour demander au conducteur de s’arrêter"),
                Text(
                    """Les japonais aiment bien avoir un personnage rigolo pour représenter leur ville (par exemple, <a href="/page/wtfmatsumoto#content">Matsumoto</a> ou <a href="/page/wtfhimejo#content">Himeji</a>). Sauf qu’à Beppu, quelqu’un a cru intelligent d’essayer de placer <strong>tous</strong> les symboles de la ville.</p><p>On obtient donc un chat qui roule à vélo avec un sac à dos, qui a un nez en forme de symbole « onsen », avec une bassine pour se laver sur la tête, laquelle contient une serviette et un thermomètre en forme de tour de Beppu ; et qui aime toutes les spécialités locales."""),
                Image("wtf", "Beppu2 177", ""),
                Image("wtf", "Beppu2 173", "Le design, jusque dans les codes barre."),
            ),
    ),
    memorialpaix(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.MAY, 27),
        place = Place.hiroshima,
        title = "Le Parc du Mémorial de la Paix de Hiroshima (広島平和記念公園)",
        content =
            arrayOf(
                Text(
                    """Puisqu’on ne peut pas photographier dans le musée du mémorial, voici quelques photos du <a href="https://fr.wikipedia.org/wiki/Parc_du_Mémorial_de_la_Paix_de_Hiroshima">parc du Mémorial de la Paix de Hiroshima</a>."""),
                Image(
                    "jardins",
                    "Hiroshima1 199",
                    "Vue depuis l’un des deux bras de rivière qui entoure le parc. Ce dernier est à droite."),
                Image(
                    "jardins",
                    "Hiroshima1 210",
                    "L’axe principal du parc est défini par l’alignement du musée du mémorial (derrière), du cénotaphe, de la flamme de la paix et du dôme de Genbaku."),
                Image("jardins", "Hiroshima1 211", "Le cénotaphe"),
                Image(
                    "jardins",
                    "Hiroshima1 212",
                    "La flamme de la paix, qui ne sera éteinte que lorsque sera éradiquée la dernière arme nucléaire (ce qui ne semble pas prêt d’arriver…)"),
                Image(
                    "jardins",
                    "Hiroshima1 198",
                    "Le dôme de Genbaku. À ce moment là, bardé des échaffaudages des conservateurs : il a résisté à la bombe, mais a plus de mal à passer les années."),
                Text(
                    "Dans le parc, on trouve énormément de monuments à différentes catégories de victimes - chaque corporation ayant fait ériger le sien. En voici quelques-uns."),
                Image(
                    "jardins",
                    "Hiroshima1 205",
                    "Sans doute le plus célèbre, le monument de la paix des enfants"),
                Image("jardins", "Hiroshima1 204", "Vue rapprochée"),
                Image("jardins", "Hiroshima1 206", "La cloche de la paix"),
                Image(
                    "jardins",
                    "Hiroshima1 207",
                    "En plus des très nombreux enfants (qui pour beaucoup travaillaient), Hiroshima avait une forte communauté coréenne"),
                Image("jardins", "Hiroshima1 202", ""),
                Image("jardins", "Hiroshima1 200", ""),
                Image("jardins", "Hiroshima1 201", ""),
                Image("jardins", "Hiroshima1 203", ""),
                Image("jardins", "Hiroshima1 208", ""),
                Image("jardins", "Hiroshima1 209", ""),
            ),
    ),
    hiroshima(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 27),
        place = Place.hiroshima,
        title = "Dans la ville de Hiroshima",
        content =
            arrayOf(
                Image("quotidien", "Hiroshima1 187", "Le boulevard de la Paix au crépuscule"),
                Image("quotidien", "Hiroshima1 188", "Un bateau-restaurant"),
                Image(
                    "quotidien",
                    "Hiroshima1 186",
                    "Vue depuis la fenêtre de la chambre de l’auberge de jeunesse."),
                Image(
                    "quotidien",
                    "Hiroshima1 190",
                    "Hiroshima est, paraît-il, une sorte de musée des tramways. Je veux bien le croire. Celui-ci est utilisé en service quotidien."),
                Image(
                    "quotidien",
                    "Hiroshima1 189",
                    "La spécialité de Hiroshima est l’okonomiyaki (お好み焼き). Dans ce bâtiment, on trouve trois étages entiers de petits restaurants d’okomiyakis !"),
                Image("quotidien", "Hiroshima1 184", "Passage piétons, vide…"),
                Image("quotidien", "Hiroshima1 185", "… et avec les piétons dessus."),
            ),
    ),
    wtfhiroshima(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 27),
        place = Place.hiroshima,
        title = "Curiosités de Hiroshima",
        content =
            arrayOf(
                Image(
                    "wtf",
                    "Hiroshima1 193",
                    "Il me semble que Hiroshima doit être visité par tout élève Japonais au moins une fois pendant sa scolarité."),
                Image(
                    "wtf",
                    "Hiroshima1 194",
                    "Les primaires en sortie scolaire ont rarement l’uniforme (mauvais exemple ici), mais presque toujours une casquette de couleur vive."),
                Image("wtf", "Hiroshima1 191", "Enseigne de magasin"),
                Image("wtf", "Hiroshima1 192", "Une autre enseigne"),
                Image("wtf", "Hiroshima1 195", "D’une certaine manière, ça paraît logique…"),
                Image("wtf", "Hiroshima1 196", "Choc des cultures ?"),
                Image(
                    "wtf",
                    "Hiroshima1 197",
                    "Venez boire un verre en jouant à la NES (ou la SNES si vous voulez faire moderne) !"),
                Image(
                    "wtf",
                    "Hiroshima2 233",
                    "Un panneau indicateur en pleine forêt. Pourquoi pas. Mais qui est assez tordu pour y avoir accroché une collection de DVD pornographiques ?!"),
            ),
    ),
    mitaki(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 28),
        place = Place.hiroshima,
        title = "Balade à Mitaki",
        content =
            arrayOf(
                Text(
                    """On nous avait conseillé, compte tenu des circonstances et ce ce qu’il y avait d’ouvert, d’aller faire un tour à Mitaki. Mitaki, c’est une ville de la banlieue de Hiroshima (10 minutes en train) où l’on trouve <a href="/page/templesmitaki#content">un complexe de temples</a>, et une montagne avec un point de vue sur Hiroshima. Nous y sommes donc allés."""),
                Image(
                    "quotidien",
                    "Hiroshima2 213",
                    "Le train à la gare de Mitaki. Il n’a a qu’une voie, qui se dédouble pour permettre le croisement dans les gares. Le quai unique est au milieu, on est obligés de traverser la voie pour entrer et sortir de la gare."),
                Image("quotidien", "Hiroshima2 214", ""),
                Image("quotidien", "Hiroshima2 215", "La ville derrière la colline"),
                Image("quotidien", "Hiroshima2 216", "Vue sur Hiroshima"),
                Text(
                    "À l’inverse de la veille où l’on a cuit, il faisait chaud mais couvert et très humide ce jour là (il a même délugé l’après-midi, la saison des pluies étant arrivée puis repartie en avance). D’où la piètre qualité de la vue."),
            ),
    ),
    mitakiforet(
        category = Category.nature,
        date = LocalDate.of(2013, Month.MAY, 28),
        place = Place.hiroshima,
        title = "Sur le Mitaki-Yama",
        content =
            arrayOf(
                Image(
                    "nature",
                    "Hiroshima2 217",
                    "Le plan de Mitaki. Les japonais semblant incapables de réaliser un plan clair, nous n’avons jamais trouvé mieux…"),
                Image("nature", "Hiroshima2 218", "Un jardin"),
                Text(
                    "Une forêt de bambous, c’est superbe mais horriblement compliqué pour que ça rende quelque chose en photo…"),
                Image("nature", "Hiroshima2 219", ""),
                Image("nature", "Hiroshima2 220", ""),
            ),
    ),
    templesmitaki(
        category = Category.temples,
        date = LocalDate.of(2013, Month.MAY, 28),
        place = Place.hiroshima,
        title = "Le complexe de temples de Mitaki",
        content =
            arrayOf(
                Text(
                    "Le complexe de temples de Mitaki comprends principalement des temples bouddhistes, mais aussi des temples shintô et des cimetières. Le tout est d’un calme absolu mais manque cruellement d’explications."),
                Image(
                    "temples",
                    "Hiroshima2 229",
                    "Le plan du complexe. À l’ombre sous un toit, donc tellement sombre qu’illisible sans le photographier."),
                Image("temples", "Hiroshima2 228", "Un gardien"),
                Text("L’entrée."),
                Image("temples", "Hiroshima2 221", ""),
                Image("temples", "Hiroshima2 222", ""),
                Image("temples", "Hiroshima2 223", ""),
                Image("temples", "Hiroshima2 224", "L’allée principale"),
                Image("temples", "Hiroshima2 225", ""),
                Image("temples", "Hiroshima2 226", ""),
                Image("temples", "Hiroshima2 227", ""),
                Image("temples", "Hiroshima2 230", "À l’assaut de la montagne"),
                Image("temples", "Hiroshima2 231", "Une pagode (à droite sur le plan)"),
                Image(
                    "temples",
                    "Hiroshima2 232",
                    "Derrière la pagode, un cimetière (en réalité, il y a des petits cimetières de ce genre un peu partout dans le complexe"),
            ),
    ),
    itsukushimaville(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 29),
        place = Place.itsukushima,
        title = "Itsukushima et ses cerfs Sika",
        content =
            arrayOf(
                Text(
                    """<a href="https//fr.wikipedia.org/wiki/Itsukushima">Itsukushima</a>, plus connue sous le nom de Miyajima, est une île-sanctuaire Shintô. On y trouve en particulier le très célèbre <a href="/page/sanctuairemiyajima#content">Itsukushima-jinja</a> (sanctuaire d’Itsukushima), qui est l’une des vues les plus célèbres du Japon."""),
                Image("quotidien", "Miyajima 261", "Vu sur la ville"),
                Text(
                    """L’île est célèbre pour ses cervidés semi-sauvages. Enfin, « sauvages » parce qu’ils ne sont pas réellemnt apprivoisés, mais vivent librement. Ce qui ne les empêchent pas de traîner en ville et de quémander de la nourriture au touristes (ce qui pose quelques problèmes).</p><p>Contrairement à ce qu’on peut lire ou croire, ce ne sont pas des daims mais des <a href="https//fr.wikipedia.org/wiki/Cerf_Sika">cerfs Sika</a> (le cousin japonais)."""),
                Image("quotidien", "Miyajima 259", "*Rumine*"),
                Image("quotidien", "Miyajima 260", "Je VEUX cette feuille !"),
                Image("quotidien", "Miyajima 262", ""),
                Image("quotidien", "Miyajima 263", ""),
                Image("quotidien", "Miyajima 264", "Vue sur Hiroshima depuis le ferry du retour."),
            ),
    ),
    sanctuairemiyajima(
        category = Category.shinto,
        date = LocalDate.of(2013, Month.MAY, 29),
        place = Place.itsukushima,
        title = "Itsukushima-jinja (厳島神社)",
        content =
            arrayOf(
                Text(
                    """Est-il vraiment nécessaire de présenter le <a href="https//fr.wikipedia.org/wiki/Sanctuaire_d’Itsukushima">Itsukushima-jinja</a> (sanctuaire d’Itsukushima), étant donné qu’il s’agit de l’une des trois vues les plus célèbres du Japon ?"""),
                Image(
                    "shinto",
                    "Miyajima 234",
                    "Arrivée depuis le ferry, en provenance de Hiroshima."),
                Image("shinto", "Miyajima 235", ""),
                Image(
                    "shinto",
                    "Miyajima 236",
                    "Le grand torii de l’entrée terrestre (moderne : historiquement il fallait passer en barque sous le torii flottant)."),
                Image("shinto", "Miyajima 237", "Les deux gardiens"),
                Image("shinto", "Miyajima 238", ""),
                Image("shinto", "Miyajima 240", "Le très fameux torii flottant"),
                Image("shinto", "Miyajima 241", ""),
                Image("shinto", "Miyajima 248", ""),
                Image("shinto", "Miyajima 242", "Le sanctuaire flottant"),
                Image("shinto", "Miyajima 243", ""),
                Image("shinto", "Miyajima 244", ""),
                Image("shinto", "Miyajima 246", ""),
                Image("shinto", "Miyajima 247", ""),
                Image("shinto", "Miyajima 250", ""),
                Image(
                    "shinto",
                    "Miyajima 249",
                    "Les chrétiens ont de l’eau bénite, les shintos du saké béni…"),
                Image("shinto", "Miyajima 239", "Une lanterne à l’extérieur"),
                Image("shinto", "Miyajima 245", "Une lanterne du temple"),
                Text(
                    "Et maintenant la triste vérité : les images telles que vous les avez vues n’existent que la moitié du temps. Parce qu’en réalité tout ça est posé sur le fond, et ne donne l’illusion de flotter qu’à marée haute. L’autre moitié du temps, la marée est basse et ces endroits célèbrissimes ressemblent à ceci :"),
                Image("shinto", "Miyajima 252", ""),
                Image("shinto", "Miyajima 255", ""),
                Image("shinto", "Miyajima 253", ""),
                Image("shinto", "Miyajima 254", ""),
                Image(
                    "shinto",
                    "Miyajima 251",
                    "En bonus, un sanctuaire tout neuf sur les hauteurs de l’île."),
            ),
    ),
    montmisen(
        category = Category.nature,
        date = LocalDate.of(2013, Month.MAY, 29),
        place = Place.itsukushima,
        title = "À l’assaut du Mont Misen (弥山)",
        content =
            arrayOf(
                Text(
                    "Le Mont Misen (弥山) est tout simplement le point culminant de l’île d’Itsukushima. Il culmine à 535 mètres."),
                Image("nature", "Miyajima 294", "Ceci n’est pas le sommet principal."),
                Text(
                    "Le concept est le suivant : on monte en téléphérique, et on descend à pieds. Depuis le sommet, la vue est superbe quoique brumeuse :"),
                Image("nature", "Miyajima 305", "La mer intérieure"),
                Image("nature", "Miyajima 306", "La ville"),
                Image("nature", "Miyajima 309", "Le sanctuaire"),
                Text(
                    "Ce qui n’est <strong>pas</strong> indiqué, c’est qu’il y a deux pièges. Le premier est que le téléphérique mène à un sommet secondaire, il faut descendre ~100 m puis remonter ~150 m pour arriver au vrai sommet (en dénivelé). Le second est que les 535 mètres de descente ne sont pas constitués par un chemin, mais par une série presque ininterrompue d’escaliers. Et d’escaliers japonais…"),
                Image("nature", "Miyajima 299", ""),
                Image("nature", "Miyajima 300", ""),
                Image("nature", "Miyajima 301", ""),
                Image("nature", "Miyajima 302", ""),
                Image("nature", "Miyajima 303", ""),
                Image("nature", "Miyajima 304", ""),
                Image(
                    "nature",
                    "Miyajima 298",
                    "Ici on prévoit les grosses pluies (logique, quand il y a plusieurs cyclones par an…)"),
                Image("nature", "Miyajima 307", "Cascades"),
                Image("nature", "Miyajima 310", ""),
                Image("nature", "Miyajima 308", "Soudain, au milieu du chemin"),
            ),
    ),
    jardinssanctuaire(
        category = Category.nature,
        date = LocalDate.of(2013, Month.MAY, 29),
        place = Place.itsukushima,
        title = "Les jardins du sanctuaire",
        content =
            arrayOf(
                Text(
                    """Dans les jardins du <a href="/page/sanctuairemiyajima#content">Itsukushima-jinja</a>."""),
                Image("jardins", "Miyajima 297", "Bizarrement ce pont est connu."),
                Image(
                    "jardins",
                    "Miyajima 296",
                    "Érable du Japon. Symbole de l’île, qui doit être bien plus joli en automne."),
                Image("jardins", "Miyajima 295", "Un jardin d’un restaurant."),
            ),
    ),
    templesmiyajima(
        category = Category.temples,
        date = LocalDate.of(2013, Month.MAY, 29),
        place = Place.itsukushima,
        title = "Les temples d’Itsukushima",
        content =
            arrayOf(
                Text(
                    "Si Miyajima est très connue pour ses temples shintô (et le fait que l’île entière est considérée comme un sanctuaire), on trouve aussi pas mal de temples bouddhistes, surtout dans les hauteurs."),
                Image(
                    "temples",
                    "Miyajima 265",
                    "Au moins, les escaliers des temples sont réguliers…"),
                Image("temples", "Miyajima 266", ""),
                Image("temples", "Miyajima 269", ""),
                Image("temples", "Miyajima 267", "On peut passer en-dessous de ce temple"),
                Image("temples", "Miyajima 268", ""),
                Image("temples", "Miyajima 270", ""),
                Image("temples", "Miyajima 271", ""),
                Image("temples", "Miyajima 272", ""),
                Image("temples", "Miyajima 273", ""),
                Image("temples", "Miyajima 274", ""),
                Image("temples", "Miyajima 275", ""),
                Image("temples", "Miyajima 276", ""),
            ),
    ),
    wtfmiyajima(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 29),
        place = Place.itsukushima,
        title = "Curiosités d’Itsukushima",
        content =
            arrayOf(
                Image("wtf", "Miyajima 278", "Peut-être l’immeuble le plus étroit du Japon."),
                Image(
                    "wtf",
                    "Miyajima 279",
                    "Puisque le cerf a décidé de squatter, il sera sur la photo de classe…"),
                Image(
                    "wtf",
                    "Miyajima 293",
                    "Souvent, et en particulier lors des voyages scolaires, les primaires (équivalent CP --> 6ème inclus en France) ne sont pas en uniforme. Par contre, ils ont le sac de l’école. Car oui, les sacs de ces demoiselles sont bien le modèle de scolaire…"),
                Image("wtf", "Miyajima 280", "Ce cheval est un kami…"),
                Image("wtf", "Miyajima 281", ""),
                Image(
                    "wtf",
                    "Miyajima 282",
                    "L’une des moult affiches publicitaires des produits locaux"),
                Image(
                    "wtf",
                    "Miyajima 283",
                    """"Si ça existe, il existe aussi une version Hello Kitty". Ici les gâteaux-momiji (feuille d’érable) locaux."""),
                Image("wtf", "Miyajima 286", "La version pour amoureux"),
                Image(
                    "wtf",
                    "Miyajima 284",
                    "La plus grande spatule à riz du monde : 7,7 m de long, 2,7 m de large, 2,5 tonnes."),
                Image("wtf", "Miyajima 285", "Un dragon !"),
                Image(
                    "wtf",
                    "Miyajima 287",
                    "Une longue vue ? Une table d’orientation ? Un tube métallique, c’est tellement plus simple !"),
                Image("wtf", "Miyajima 288", "Le maillon faible."),
                Image("wtf", "Miyajima 292", "Arbre, tu es ivre !"),
                Image("wtf", "Miyajima 289", "Explications à l’aquarium de l’île."),
                Image("wtf", "Miyajima 290", ""),
                Image("wtf", "Miyajima 291", "Je n’aimerais pas poser le pied sur cet oursin…"),
            ),
    ),
    jardinkyoto(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.MAY, 30),
        place = Place.kyoto,
        title = "Un jardin à Kyôto",
        content =
            arrayOf(
                Text(
                    "Un jardin à Kyôto dont j’ai totalement oublié le nom - les plus motivés pourront rechercher les jardins du côté de la gare centrale, il était par là…</p><p>Il aurait sans doute été beaucoup plus joli si le temps avait été plus clément."),
                Image("jardins", "Kyoto1 315", "Vue générale"),
                Image("jardins", "Kyoto1 316", ""),
                Image("jardins", "Kyoto1 317", "Pont, tu es ivre !"),
                Image("jardins", "Kyoto1 321", "Un autre pont, beaucoup plus compliqué."),
                Image(
                    "jardins",
                    "Kyoto1 318",
                    "Nichée de grues (floues par manque de lumière et de matériel)"),
                Image("jardins", "Kyoto1 319", "Le plan d’eau…"),
                Image("jardins", "Kyoto1 320", "… est couvert de nénuphars !"),
                Image("jardins", "Kyoto1 322", "Proche du jardin, une fontaine-lotus-géant."),
            ),
    ),
    higashihonganji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.MAY, 30),
        place = Place.kyoto,
        title = "Le Higashi Hongan-ji (東本願寺)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https://fr.wikipedia.org/wiki/Higashi_Hongan-ji">Higashi Hongan-ji (東本願寺)</a>, ou « temple oriental du vœu originel », est l’un des deux temples dominants de la secte bouddhiste Jôdo shinshū au Japon et à l’étranger. Ce serait la plus grande construction en bois au monde (mais le <a href="/page/todaiji#content">Tôdai-ji</a> revendique aussi ce titre).</p><p>Malheureusement, il était en rénovation, à l’exception du <a href="https://fr.wikipedia.org/wiki/Honden">honden</a>."""),
                Image(
                    "temples",
                    "Kyoto1 323",
                    "Et je veux bien croire l’histoire de la taille (les personnages donnent une vague idée de l’échelle)."),
                Image(
                    "temples",
                    "Kyoto1 324",
                    "Photo prise à hauteur d’yeux (les miens, donc ceux d’un type de 1,87 m)."),
                Image("temples", "Kyoto1 325", "Intéressant système de gouttières."),
                Image("temples", "Kyoto1 326", "Un dragon !"),
            ),
    ),
    garekyoto(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 30),
        place = Place.kyoto,
        title = "Kyôto, sa gare ferroviaire et ses rues",
        content =
            arrayOf(
                Text(
                    """La <a href="https//fr.wikipedia.org/wiki/Gare_de_Kyoto">gare de Kyôto</a> est un OVNI assez surprenant."""),
                Image("quotidien", "Kyoto1 312", "Vue sur le hall principal."),
                Image(
                    "quotidien",
                    "Kyoto1 314",
                    "Le grand escalier, qui va des étages 4 à 11. Oui, ce sont des diodes dans les marches. Et oui, les motifs changent."),
                Image("quotidien", "Kyoto1 313", "Depuis le haut du même escalier."),
                Text(
                    "La vue ne donne rien, à cause de la saleté des vitres qui donnent sur la ville ; et une vue de l’extérieur de la gare demandait un point de vue ou du matériel que je n’avais pas pour rendre quelque chose."),
                Image(
                    "quotidien",
                    "Kyoto1 311",
                    "En réalité, Kyôto est plutôt un dédale de rues de ce genre."),
            ),
    ),
    nara(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Nara (奈良市)",
        content =
            arrayOf(
                Text(
                    """<a href="https://fr.wikipedia.org/wiki/Nara">Nara</a>, près de <a href="place/kyoto#content">Kyôto</a>, fut la première capitale fixe du Japon. Elle a conservé un patrimoine historique très important."""),
                Image("quotidien", "Nara 346", "Vue générale"),
                Image("quotidien", "Nara 347", ""),
                Image("quotidien", "Nara 348", "Une ruelle"),
                Image(
                    "quotidien",
                    "Nara 349",
                    "La gare JR. Contrairement au reste du Japon, le Kansai a beaucoup de compagnies de chemin de fer privées."),
                Image(
                    "quotidien",
                    "Nara 350",
                    "La ligne JR Nara <---> Kyôto, l’un des rares endroits sans passage à niveau visible."),
            ),
    ),
    jardinisuien(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Le jardin Isuien (依水園)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https://fr.wikipedia.org/wiki/Jardin_Isuien">jardin Isuien (依水園)</a> est sans doute le plus connu des jardins japonais à Nara, et l’un des plus beaux exemples de <a href="https://fr.wikipedia.org/wiki/Shakkei#Les_paysages_emprunt.C3.A9s">paysage emprunté</a> existant."""),
                Image("jardins", "Nara 351", "La mare"),
                Image("jardins", "Nara 352", ""),
                Image(
                    "jardins",
                    "Nara 353",
                    "Vue générale. Le jardin est en pleine ville, la limite jardin / paysage lointain se voit mieux sur la photo qu’en vrai."),
                Image(
                    "jardins",
                    "Nara 354",
                    "Une autre vue générale. Le toit est celui du musée attenant, hors du jardin."),
                Image("jardins", "Nara 355", ""),
                Image("jardins", "Nara 356", ""),
            ),
    ),
    parcdescerfs(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Le parc des cerfs et la forêt primaire de Kasugayama",
        content =
            arrayOf(
                Text(
                    """Les différents sites historiques de Nara sont entourés par un immense parc, le parc des cerfs, et prolongés par la forêt primaire de Kasugayama.</p><p>Contrairement à <a href="/page/itsukushimaville#content">leurs cousins de Miyajima</a>, les <a href="https//fr.wikipedia.org/wiki/Cerf_Sika">cerfs Sika</a> de Nara sont apprivoisés depuis plus de mille ans."""),
                Image("jardins", "Nara 364", "Conséquence : ces cerfs sont tout sauf farouches."),
                Image("jardins", "Nara 365", "… non, impossible de parler d’une bête sauvage."),
                Image("jardins", "Nara 357", "La rue pittoresque de Nara"),
                Text(
                    """Un bâtiment dont j’ai oublié la fonction, entre le temple et le <a href="/page/kasugataisha#content">Kasuga-taisha</a>."""),
                Image("jardins", "Nara 358", ""),
                Image("jardins", "Nara 359", "Un palier ? Pour quoi faire ?"),
                Image("jardins", "Nara 360", ""),
                Image("jardins", "Nara 366", "L’étang à l’entrée est plein de tortues."),
                Text("L’arrière du parc est en fait le début de la forêt primaire."),
                Image("jardins", "Nara 361", ""),
                Image("jardins", "Nara 362", ""),
                Image("jardins", "Nara 363", ""),
            ),
    ),
    kasugataisha(
        category = Category.shinto,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Le Kasuga-taisha (春日大社)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https://fr.wikipedia.org/wiki/Kasuga-taisha">Kasuga-taisha (春日大社)</a> est un santuraire shintô de Nara. Il est situé dans le <a href="/page/parcdescerfs#content">parc des cerfs</a> et est célèbre pour ses milliers de lanternes."""),
                Image("shinto", "Nara 343", "L’arrivée au sanctuaire."),
                Image(
                    "shinto",
                    "Nara 340",
                    "En fait, ici poussent deux arbres qui ne sont pas sensés pouvoir pousser ensemble."),
                Image(
                    "shinto",
                    "Nara 342",
                    "Vue générale du sanctuaire. On voit bien les deux arbres qui partient du même endroit."),
                Image("shinto", "Nara 341", "Oui, le bâtiment a été construit autour de l’arbre."),
                Image("shinto", "Nara 339", ""),
                Text(
                    "près les lanternes en pierre de l’extérieur, les lanternes en bronze de l’intérieur :"),
                Image("shinto", "Nara 338", ""),
                Image("shinto", "Nara 337", ""),
                Image("shinto", "Nara 336", ""),
                Image("shinto", "Nara 332", "Plus qu’un sanctuaire, c’est un complexe :"),
                Image("shinto", "Nara 335", ""),
                Image("shinto", "Nara 334", "Le kami local semble très apprécié"),
                Image(
                    "shinto",
                    "Nara 333",
                    "Il paraît que plus les kamis sont petits, plus ils sont susceptibles. Je n’irais pas taquiner celui-ci…"),
                Image("shinto", "Nara 331", "Gros plan sur une lanterne"),
                Image("shinto", "Nara 344", "Un dragon !"),
            ),
    ),
    todaiji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Le Tôdai-ji (東大寺)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https://fr.wikipedia.org/wiki/Tôdai-ji">Tôdai-ji (東大寺)</a> est le principal et plus connu temple bouddhiste de Nara."""),
                Image(
                    "temples",
                    "Nara 367",
                    "Vendredi, outre les touristes on trouve beaucoup de scolaires."),
                Text(
                    """Le bâtiment principal, le <a href="https://fr.wikipedia.org/wiki/Daibutsu-den">Daibutsu-den (大仏殿)</a>, se dispute avec le <a href="/page/higashihonganji#content">Higashi Hongan-ji</a> pour le titre de <em>« plus grande construction en bois du monde »</em>."""),
                Image("temples", "Nara 368", ""),
                Image("temples", "Nara 369", ""),
                Image("temples", "Nara 370", "La cour"),
                Image("temples", "Nara 381", ""),
                Image(
                    "temples",
                    "Nara 371",
                    "L’immense, très connue et très compliquée à photographier statue de Bouddha Vairocana"),
                Image("temples", "Nara 373", ""),
                Image("temples", "Nara 372", "À côté, un plus petit Bouddha."),
                Image("temples", "Nara 378", "Idem de l’autre côté"),
                Image("temples", "Nara 374", "Le gardien de gauche…"),
                Image("temples", "Nara 375", "… et celui de droite."),
                Image(
                    "temples", "Nara 376", "Mais pourquoi diable tous ces enfants font la queue ?"),
                Text(
                    "Pour passer dans ce trou, dont la taille est celle d’une narine du grand Bouddha. On dit qu’y arriver est gage de bonheur (mais ça nécessite d’etre un jeune enfant, ou de petit calibre et très souple)."),
                Image("temples", "Nara 377", ""),
                Image("temples", "Nara 379", ""),
                Image(
                    "temples",
                    "Nara 380",
                    "Binzuru - le guérisseur : en le touchant où l’on est malade, la maladie disparaît."),
            ),
    ),
    kofukuji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Le Kôfuku-ji (興福寺)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https://fr.wikipedia.org/wiki/Kôfuku-ji">Kôfuku-ji (興福寺)</a> est un autre temple de Nara, malheureusement en travaux lorsque j’y étais."""),
                Image("temples", "Nara 384", "La pagode"),
                Image("temples", "Nara 382", "Une cloche géante"),
                Image("temples", "Nara 383", "Un mini-Bouddha dans une niche de pierre"),
            ),
    ),
    wtfnara(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 31),
        place = Place.nara,
        title = "Curiosités de Nara",
        content =
            arrayOf(
                Text(
                    """Un escalier à l’intérieur du <a href="place/todaiji#content">Tôdai-ji</a>."""),
                Image("wtf", "Nara 388", ""),
                Text(
                    """À l’extérieur du <a href="place/kofukuji#content">Kôfuku-ji</a>. C’est un vrai escalier, les natifs ont l’air de le trouver normal."""),
                Image("wtf", "Nara 397", ""),
                Text(
                    """Ceci est une réponse à la question <em>« Pourquoi y a-t-il si peu de gens sur tes photos ? »</em>. Parce que par exemple, ici, je voulais photographier le cerf tranquillement installé au milieu de la foule, mais impossible de le faire : ces collégiennes ont insisté pour que je prenne cette photo."""),
                Image("wtf", "Nara 386", ""),
                Text(
                    "Vendeur de gâteaux pour cerfs. Parfois on voit les touristes les manger. Et il y a toujours un troupeau de cerfs gourmands qui ont parfaitement compris où les touristes achètent ces friandises.</p><p>À noter qu’à défaut de gâteaux, le cerf s’intéresse aussi aux papiers, aux tissus et à tout ce qui ressemble à une feuille ou une gaufrette - parfois au grand dam des enfants et au péril de l’intégrité de leurs goûters."),
                Image("wtf", "Nara 387", ""),
                Image("wtf", "Nara 396", "Ils peuvent se montrer très insistants."),
                Text(
                    "Nara est une ville magique : quand vous avez nourri les cerfs, câjolé les cerfs et admiré les cerfs, vous pouvez acheter leur peau et leurs bois."),
                Image("wtf", "Nara 392", ""),
                Image("wtf", "Nara 389", "… sisi, ça se vends…"),
                Image("wtf", "Nara 398", "Ceci aussi."),
                Image(
                    "wtf",
                    "Nara 390",
                    "Cela dit, la mascotte de la ville explique bien des choses."),
                Image(
                    "wtf",
                    "Nara 385",
                    "On peut être dans une ville historique et voir des sculptudes d’un goût étrange dans la rue."),
                Image("wtf", "Nara 400", "Si on lève les yeux, ce n’est pas beaucoup mieux."),
                Image("wtf", "Nara 391", ""),
                Image("wtf", "Nara 393", "Ce caillou a l’air sacré."),
                Image("wtf", "Nara 399", """Restau "français" (pas testé)"""),
                Image(
                    "wtf",
                    "Nara 394",
                    "Toutes ces plaquettes votives pour demander l’amour ! C’est-y pas mignon ! Mais, qu’aperçois-je au fond ? Allons voir…"),
                Image(
                    "wtf",
                    "Nara 395",
                    "… Oui. Ce sont bien des plaquettes votives. Avec des paires de nichons et ce qui ressemble à des penis habillés de kimonos. Je vous laisse imaginer le genre de demandes que l’on peut faire au kami sur ce genre de plaquette…"),
            ),
    ),
    nijojo(
        category = Category.chateaux,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Le Nijô-jô (二条城)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https//fr.wikipedia.org/wiki/Nijô-jô">Nijô-jô (二条城)</a> est un ancien palais impérial de Kyôto. Il est connu entre autres pour son parquet rossignol : toutes les lattes grincent volontairement à peine on y touche, et produisent des sons différents.</p><p>Malheureusement on ne peut pas photographier l’intérieur. Par contre, on peut en visiter <a href="/page/nijojojardins#content">les jardins</a>."""),
                Image("chateaux", "Kyoto2 448", "L’extérieur, côté cour."),
                Image("chateaux", "Kyoto2 449", "L’extérieur, côté jardin"),
                Image("chateaux", "Kyoto2 447", "Un détail"),
                Image("chateaux", "Kyoto2 446", "Un pavillon dans un jardin"),
            ),
    ),
    nijojojardins(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Les jardins du Nijô-jô (二条城)",
        content =
            arrayOf(
                Text(
                    """Tout simplement les jardins du <a href="/page/nijojo#content">Nijô-jô</a>."""),
                Image(
                    "jardins",
                    "Kyoto2 405",
                    "Vue d’un bout du jardin, d’une partie du château. Kyôto en arrière-plan."),
                Image("jardins", "Kyoto2 406", "Un angle de la muraille intérieure."),
                Image("jardins", "Kyoto2 402", ""),
                Image("jardins", "Kyoto2 403", ""),
                Image("jardins", "Kyoto2 407", ""),
                Image("jardins", "Kyoto2 404", "Cet étang m’a l’air poissonneux."),
            ),
    ),
    pavillondor(
        category = Category.temples,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Le Kinkaku-ji (金閣寺) « Temple du pavillon d’or »",
        content =
            arrayOf(
                Text(
                    """Le <a href="https//fr.wikipedia.org/wiki/Kinkaku-ji">Kinkaku-ji (金閣寺)</a>, ce qui signifie <em>"Temple du pavillon d’or"</em>, est l’un des temples les plus connues de Kyôto, et donc l’une des attractions les plus touristiques."""),
                Image(
                    "temples",
                    "Kyoto2 417",
                    "LA vue standard. Puisque prise du point de vue prévu à cet effet près de l’entrée."),
                Image("temples", "Kyoto2 419", "Vu sous un autre angle"),
                Text(
                    "En fait, ce truc est spécialement conçu pour impressionné (cf l’article Wikipédia pour les détails). Et ça marche. Conséquence : ça grouille de monde, donc prendre une photo potable est très difficile. Pour vous donner une idée, voici ce que je voyais en reculant de quelques pas après avoir pris la première photo :"),
                Image("temples", "Kyoto2 418", ""),
                Image("temples", "Kyoto2 420", "Vue générale du chemin…"),
            ),
    ),
    ryoanji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Le Ryôan-ji (竜安寺 / 龍安寺)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https//fr.wikipedia.org/wiki/Ryôan-ji">Ryôan-ji (竜安寺 / 龍安寺)</a> est un monastère Zen de Kyôto."""),
                Image("temples", "Kyoto2 421", "Une porte du monastère"),
                Image("jardins", "Kyoto2 409", "Vue du jardin sec"),
                Image("jardins", "Kyoto2 410", ""),
                Image("jardins", "Kyoto2 411", "Version miniature du jardin sec"),
                Image("jardins", "Kyoto2 412", "Les jardins"),
                Image("jardins", "Kyoto2 413", ""),
                Text(
                    "La vérité sur le jardin sec Zen : il grouillait de monde, dont pas mal de scolaires bavards. Mais le pire restait sans doute la paire de vieilles peaux françaises qui n’arrêtaient pas de râler très fort que tous ces jeunes troublaient le calme des lieux…"),
                Image("jardins", "Kyoto2 408", ""),
            ),
    ),
    ninnaji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Le Ninna-ji (仁和寺)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https//fr.wikipedia.org/wiki/Ninna-ji">Ninna-ji (仁和寺)</a> est un temple de Kyôto. Pour une fois, on peut photographier l’intérieur ! Et bien sûr, il possède <a href="/page/ninnajijardins#content">un jardin</a>."""),
                Image("temples", "Kyoto2 422", ""),
                Image("temples", "Kyoto2 423", ""),
                Image("temples", "Kyoto2 424", ""),
                Image("temples", "Kyoto2 426", ""),
                Image("temples", "Kyoto2 427", ""),
                Image("temples", "Kyoto2 431", ""),
            ),
    ),
    ninnajijardins(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Les jardins du Ninna-ji (仁和寺)",
        content =
            arrayOf(
                Text(
                    """Tout simplement les jardins du <a href="/page/ninnaji#content">Ninna-ji (仁和寺)</a> ."""),
                Image("jardins", "Kyoto2 414", ""),
                Image("jardins", "Kyoto2 415", ""),
                Image("temples", "Kyoto2 425", ""),
                Image("temples", "Kyoto2 429", ""),
                Image("temples", "Kyoto2 428", ""),
                Image("temples", "Kyoto2 430", ""),
                Image("jardins", "Kyoto2 416", ""),
            ),
    ),
    myoshinji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.JUNE, 1),
        place = Place.kyoto,
        title = "Le complexe de Myôshin-ji (妙心寺)",
        content =
            arrayOf(
                Text(
                    """Le complexe de <a href="https//en.wikipedia.org/wiki/Myôshin-ji">Myôshin-ji (妙心寺)</a> est un complexe de temples Rinzai Zen.</p><p>Ce fut sans doute l’une des expériences les plus bizarres du séjour : le lieu est bien indiqué sur le plan, mais une fois qu’on y arrive… plus rien. Pas une explication. Personne. Et contrairement aux autres temples de la journées, cela ne ressemble pas à un musée ou à un temple antique.</p><p>Pour commencer, le complexe est un dédale d’allées dans ce style :"""),
                Image("temples", "Kyoto2 432", ""),
                Image("temples", "Kyoto2 433", ""),
                Image("temples", "Kyoto2 434", ""),
                Image(
                    "temples",
                    "Kyoto2 435",
                    "Un temple. Ils sont tous fermés au public, ce sont de vrais temples, en foncitonnement."),
                Image("temples", "Kyoto2 436", ""),
                Image("temples", "Kyoto2 437", "Détail"),
                Image("temples", "Kyoto2 438", "Passage entre deux temples, ou temple double ?"),
                Image("temples", "Kyoto2 439", ""),
            ),
    ),
    fushimiinari(
        category = Category.shinto,
        date = LocalDate.of(2013, Month.JUNE, 2),
        place = Place.kyoto,
        title = "Le Fushimi Inari taisha (伏見稲荷大社)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https//fr.wikipedia.org/wiki/Fushimi_Inari">Fushimi Inari taisha (伏見稲荷大社)</a> est un sanctuaire Shinto de Kyôto. Il est très connu pour ses allées de <em>torii</em> qui courent jusqu’en haut de la montagne."""),
                Image("shinto", "Kyoto3 475", ""),
                Image("shinto", "Kyoto3 476", "L’entrée du sanctuaire"),
                Image("shinto", "Kyoto3 495", ""),
                Image("shinto", "Kyoto3 482", ""),
                Text(
                    "On trouve beaucoup de statues du renard Inari (稲荷神), qui est selon les sources le <em>kami</em> lui-même ou le gardien du temple."),
                Image("shinto", "Kyoto3 478", ""),
                Image("shinto", "Kyoto3 479", ""),
                Image("shinto", "Kyoto3 480", ""),
                Image("shinto", "Kyoto3 481", ""),
                Image("shinto", "Kyoto3 492", ""),
                Image("shinto", "Kyoto3 493", ""),
                Image("shinto", "Kyoto3 494", ""),
                Image("shinto", "Kyoto3 484", ""),
                Image(
                    "shinto", "Kyoto3 487", "Les plaquettes votives sont aussi en forme de renard"),
                Image("shinto", "Kyoto3 485", "Les fameuses allées de torii"),
                Image("shinto", "Kyoto3 488", ""),
                Image("shinto", "Kyoto3 489", "Les textes sont les noms des donateurs"),
                Image(
                    "shinto",
                    "Kyoto3 486",
                    "Vous pouvez acheter le vôtre pour agrandir la collection (divisez les prix par 130 pour convertir en euros)"),
                Image("shinto", "Kyoto3 483", "Des plaquettes votives en forme de torii"),
                Image("shinto", "Kyoto3 477", ""),
                Image("shinto", "Kyoto3 490", ""),
            ),
    ),
    kiyomizydera(
        category = Category.temples,
        date = LocalDate.of(2013, Month.JUNE, 2),
        place = Place.kyoto,
        title = "Le Kiyomizu-dera (清水寺)",
        content =
            arrayOf(
                Text(
                    """Le <a href="https//fr.wikipedia.org/wiki/Kiyomizu-dera">Kiyomizu-dera (清水寺)</a> est l’un des temples bouddhiques les plus connus de Kyôto."""),
                Image("temples", "Kyoto3 467", "Vue générale"),
                Image("temples", "Kyoto3 466", "Vue plus rapprochée"),
                Image("temples", "Kyoto3 462", "Ce que l’on voit depuis la plate-forme"),
                Image(
                    "temples",
                    "Kyoto3 465",
                    "Le bâtiment principal est entouré de tout un complexe"),
                Image(
                    "temples",
                    "Kyoto3 463",
                    "La chute Otowa-no-taki et l’impressionnante queue pour y accéder"),
                Image(
                    "temples",
                    "Kyoto3 464",
                    "À l’intérieur du bâtiment principal. L’espèce de chaudron est en réalité une sorte de gong."),
            ),
    ),
    dimanchekyoto(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 2),
        place = Place.kyoto,
        title = "Un dimanche à Kyôto",
        content =
            arrayOf(
                Image("quotidien", "Kyoto3 452", "Vue générale de Kyôto"),
                Image("quotidien", "Kyoto3 453", ""),
                Text(
                    """<a href="https//fr.wikipedia.org/wiki/Gion">Gion (祇園)</a> est un ancien quartier de Kyôto, connu entre autres pour ses Geishas."""),
                Image("quotidien", "Kyoto3 458", ""),
                Image("quotidien", "Kyoto3 459", ""),
                Image("quotidien", "Kyoto3 460", ""),
                Image(
                    "quotidien",
                    "Kyoto3 454",
                    "Ce ne sont pas des Geishas mais de jeunes femmes déguisées pour faire plaisir aux touristes. Les authentiques Geishas sont invisibles."),
                Text(
                    "Le dimanche, on voit beaucoup de femmes en kimono (surtout dans les endroits touristiques ou on peut en louer). C’est très rare la semaine, et le samedi ce sont surtout de vieilles femmes."),
                Image("quotidien", "Kyoto3 456", ""),
                Text(
                    """Un coin curieux : un grand complexe de sanctuaires shinto, qui laisse une impression de « banlieue pavillonnaire pour <em>kamis</em> »…"""),
                Image("shinto", "Kyoto3 497", ""),
                Image("shinto", "Kyoto3 496", ""),
                Image("quotidien", "Kyoto3 455", "Kyôto est une ville touristique…"),
                Image("quotidien", "Kyoto3 472", ""),
                Image("quotidien", "Kyoto3 451", "Les inévitables escaliers"),
                Image("nature", "Kyoto3 461", "Forêt près de Kyôto"),
                Image(
                    "quotidien",
                    "Kyoto3 457",
                    "Ici, l’on prends les tremblements de terre au sérieux."),
            ),
    ),
    wtfkyoto(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.MAY, 30),
        place = Place.kyoto,
        title = "Curiosités de Kyôto",
        content =
            arrayOf(
                Image(
                    "wtf",
                    "Kyoto1 327",
                    "Gouttières en cuivre. C’est joli mais nécessite d’avoir les moyens."),
                Image(
                    "wtf",
                    "Kyoto1 328",
                    "Le temps de lire les noms, on a déjà dépassé le panneau."),
                Image(
                    "wtf",
                    "Kyoto1 329",
                    "Ceci est une pompe à essence normale en ville au Japon. La photo est bien dans le bon sens."),
                Image(
                    "wtf",
                    "Kyoto1 330",
                    """Lycéenne typique. Le Japon, le pays où se promener avec un parapluie et une foultitude de peluches accrochées au sac est considéré comme "normal"."""),
                Image(
                    "wtf",
                    "Kyoto2 440",
                    "Jeu dans le jardin du temple du pavillon d’or : il s’agit de lancer une pièce dans un bol"),
                Image(
                    "wtf",
                    "Kyoto2 441",
                    "Même les indications de toilettes ont des habits traditionnels ici…"),
                Image(
                    "wtf",
                    "Kyoto2 442",
                    "Au détour d’un couloir, dans un temple classé au patrimoine mondial de l’humanité par l’UNESCO."),
                Image("wtf", "Kyoto2 443", "Souriez !"),
                Image(
                    "wtf",
                    "Kyoto2 444",
                    "C’est bien la peine de faire autant de fleur pour obtenir cette cerise…"),
                Image("wtf", "Kyoto2 445", "Un volet d’un temple du complexe de Myôshin-ji."),
                Image(
                    "wtf",
                    "Kyoto3 468",
                    "Interlude… (ceux qui ont vu des animés dans le japon contemporai comprendront)"),
                Image("wtf", "Kyoto3 489", "Une gouttière. Sisi."),
                Image("wtf", "Kyoto3 470", """Quand on appuie sur ce katana, il fait "pouet !"…"""),
                Image("wtf", "Kyoto3 471", "Qu’a donc fait ce pauvre pigeon ?"),
                Image("wtf", "Kyoto3 474", "Plot de signalisation du quartier de Gion."),
                Image("wtf", "Kyoto3 473", "Hmmmm…"),
            ),
    ),
    kanda(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 3),
        place = Place.tokyo,
        title = "Le quartier de Kanda et les alentours du palais impérial",
        content =
            arrayOf(
                Image("quotidien", "Tokyo 502", "Des immeubles tous neufs !"),
                Image("quotidien", "Tokyo 532", ""),
                Image("quotidien", "Tokyo 503", "Un peu plus loin, les douves du palais impérial"),
                Image(
                    "quotidien",
                    "Tokyo 504",
                    "Le très grand torii du très controversé Yasukuni-jinja"),
                Image(
                    "quotidien",
                    "Tokyo 506",
                    """Le cahier des charges de se sanctuaire devait être "Impressionnez !""""),
                Image("quotidien", "Tokyo 505", "Une statue du même sanctuaire"),
            ),
    ),
    metrotokyo(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 3),
        place = Place.tokyo,
        title = "Le métro de Tôkyô",
        content =
            arrayOf(
                Text(
                    "Le métro de Tôkyô est sans doute le plus compliqué du monde. Plusieurs opérateurs, plans de lignes abscons, manque total d’homogénéité qui rend le repérage assez délicat."),
                Image(
                    "quotidien",
                    "Tokyo 509",
                    "Sur certaines lignes, on a même de la publicité sur les poignées"),
                Text(
                    "Sans doute la ligne la plus compliquée du métro le plus compliqué du monde. La ligne de métro se transforme en train aux deux bouts, tous les métros ne vont pas dans les mêmes directions, n’ont pas les mêmes terminus et ne s’arrêtent pas à toutes les stations."),
                Image("quotidien", "Tokyo 518", ""),
                Image("wtf", "Tokyo 584", ""),
            ),
    ),
    asakusa(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 4),
        place = Place.tokyo,
        title = "Asakusa (浅草)",
        content =
            arrayOf(
                Text("Asakusa (浅草) est un quartier de Tôkyô."),
                Image("quotidien", "Tokyo 528", ""),
                Image("quotidien", "Tokyo 530", "Rues typiques"),
                Image("quotidien", "Tokyo 531", ""),
                Image("quotidien", "Tokyo 529", "Le siège de la brasserie Asahi"),
            ),
    ),
    sensoji(
        category = Category.temples,
        date = LocalDate.of(2013, Month.JUNE, 4),
        place = Place.tokyo,
        title = "Le Sensô-ji (浅草寺)",
        content =
            arrayOf(
                Text(
                    """Le Sensô-ji (浅草寺) est un temple bouddhique très touristique du <a href="/page/asakusa#content">quartier d’Asakusa</a>."""),
                Image("temples", "Tokyo 572", "L’une des lanternes géantes caractéristiques."),
                Image(
                    "temples",
                    "Tokyo 573",
                    "Les marchands du temple. Habituels au Japon, mais pas dans ces proportions."),
                Image("temples", "Tokyo 575", ""),
                Image("temples", "Tokyo 576", "Les jardins"),
                Image("temples", "Tokyo 574", "La pagode"),
                Image("temples", "Tokyo 577", ""),
            ),
    ),
    skytree(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 4),
        place = Place.tokyo,
        title = "La Tokyo Skytree (東京スカイツリー) et Sumida",
        content =
            arrayOf(
                Text(
                    """La <a href="https//fr.wikipedia.org/wiki/Tokyo_Skytree">Tokyo Skytree (東京スカイツリー)</a> est une tour de radiodiffusion du quartier de Sumida. C’est aussi la 2ème plus haute structure au monde encore debout en 2013, juste derrière la Burj Khalifa, avec 643 mètres."""),
                Image("quotidien", "Tokyo 521", "La Tôkyô Skytree"),
                Image("quotidien", "Tokyo 523", ""),
                Image("quotidien", "Tokyo 527", ""),
                Image("quotidien", "Tokyo 524", "Sumida"),
                Image("quotidien", "Tokyo 522", ""),
                Image("quotidien", "Tokyo 525", ""),
                Image("quotidien", "Tokyo 526", ""),
            ),
    ),
    jardinsimperial(
        category = Category.jardins,
        date = LocalDate.of(2013, Month.JUNE, 5),
        place = Place.tokyo,
        title = "Les jardins du Palais Impérial",
        content =
            arrayOf(
                Image("jardins", "Tokyo 554", ""),
                Image("jardins", "Tokyo 555", ""),
                Image("jardins", "Tokyo 557", ""),
                Image("jardins", "Tokyo 561", ""),
                Image("jardins", "Tokyo 563", ""),
                Image("jardins", "Tokyo 567", ""),
                Image("jardins", "Tokyo 568", ""),
                Image("jardins", "Tokyo 556", "Japon ou Bretagne ?"),
                Image("jardins", "Tokyo 560", ""),
                Image("jardins", "Tokyo 562", ""),
                Image("jardins", "Tokyo 564", ""),
                Image("jardins", "Tokyo 558", "Les jardins sont encerclés d’immeubles modernes…"),
                Image("jardins", "Tokyo 566", ""),
                Image("jardins", "Tokyo 569", ""),
                Image(
                    "jardins",
                    "Tokyo 570",
                    "Il y en avait des parterres entiers, mais il aurait fallu être là deux semaines plus tôt pour en profiter vraiment"),
                Image("jardins", "Tokyo 571", ""),
                Image("jardins", "Tokyo 565", "Une salle de concerts. Mais… pourquoi ?!"),
            ),
    ),
    akihabara(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.JUNE, 5),
        place = Place.tokyo,
        title = "Akihabara (秋葉原)",
        content =
            arrayOf(
                Text(
                    """<a href="https//fr.wikipedia.org/wiki/Akihabara">Akihabara (秋葉原)</a> est un quartier très particulier de Tôkyô. Connu depuis des décennies pour ses magasins d’électronique, on y trouve aussi un nombre incalculable de magasins de jeux, de vidéos, de mangas, de gadgets en tous genre dont raffolent les <em>otakus</em>, des maid cafés et des magasins de porno / sex shops en tous genre."""),
                Image("quotidien", "Tokyo 533", "Façades d’immeubles"),
                Image("quotidien", "Tokyo 535", ""),
                Image(
                    "quotidien",
                    "Tokyo 534",
                    "Devantures de Maid Cafés (on ne photographie pas les maids, même dans la rue)"),
                Image("quotidien", "Tokyo 537", ""),
                Image("quotidien", "Tokyo 536", "Il y a beaucoup de monde ici…"),
                Image("quotidien", "Tokyo 508", "Dans un magasin"),
                Image("quotidien", "Tokyo 559", "Dans la rue…"),
                Image("quotidien", "Tokyo 507", "Dans un magasin"),
                Text(
                    """Curieusement, ce masque Krauser (Detroit Metal City) a été trouvé à <a href="/page/asakusa#content">Asakusa</a>…"""),
                Image("wtf", "Tokyo 587", ""),
                Image(
                    "wtf",
                    "Tokyo 594",
                    "Par contre on y trouve bien ce mélange improbable entre Krauser et Hatsune Miku de Vocaloid…"),
            ),
    ),
    museeghibli(
        category = Category.seulementaujapon,
        date = LocalDate.of(2013, Month.JUNE, 6),
        place = Place.tokyo,
        title = "Le musée Ghibli",
        content =
            arrayOf(
                Text(
                    "Le principal inconvénient de ce musée, c’est qu’y aller relève de l’expédition (achat des billets, temps de trajet jusqu’à Mitaka, dans la banlieue de Tôkyô, contraintes horaires sur la visite). Peu de photos : on ne photographie pas l’intérieur."),
                Image(
                    "quotidien",
                    "Tokyo 538",
                    "Indications depuis la gare. Ah oui, c’est à 1,2 km de la gare. En fait, le transport depuis le centre de Tôkyô coûte plus cher que le billet."),
                Image("quotidien", "Tokyo 539", ""),
                Image(
                    "quotidien",
                    "Tokyo 540",
                    "Tant qu’à être le principal intérêt de la ville, Ghibli en a designé le blason"),
                Image("quotidien", "Tokyo 541", "L’entrée, enfin !"),
                Image("quotidien", "Tokyo 542", "Le bâtiment ressemble à… lui-même."),
                Image("quotidien", "Tokyo 543", "Sur les toits, un robot du Château dans le Ciel…"),
                Image("quotidien", "Tokyo 544", ""),
                Image("quotidien", "Tokyo 546", ""),
                Image(
                    "quotidien",
                    "Tokyo 545",
                    "… et un cube étrange (et des gamins, parce que ça grouille littéralement de gamins)"),
                Text(
                    """Boutique Ghibli (en fait celle de <a href="/page/skytree#content">Sumida</a>)"""),
                Image("quotidien", "Tokyo 519", ""),
                Image("quotidien", "Tokyo 520", ""),
            ),
    ),
    odaiba(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 7),
        place = Place.tokyo,
        title = "Odaiba (お台場)",
        content =
            arrayOf(
                Text(
                    "Odaiba (お台場) est une île artificielle de la baie de Tôkyô. On y trouve un complexe de bains publics, d’immenses centres commerciaux, des tours d’habitation et le siège de la Fuji TV. On y accède par le Rainbow Bridge. Un autre intérêt est l’excellente vue sur Tôkyô."),
                Image("quotidien", "Tokyo 549", "Le Rainbow Bridge"),
                Image("quotidien", "Tokyo 551", ""),
                Image("quotidien", "Tokyo 549", "Depuis l’ancien fort"),
                Image("quotidien", "Tokyo 550", "Vue sur Tôkyô"),
                Image("quotidien", "Tokyo 553", "Les locaux de la Fuji TV"),
                Image("quotidien", "Tokyo 552", "Une statue de la Liberté ?!"),
                Image("quotidien", "Tokyo 547", "D’immenses tours d’habitations"),
                Image(
                    "wtf",
                    "Tokyo 598",
                    """Les centres commerciaux sont en fait sans aucun intérêt, et ne vendent pratiquement que des fringues à l’occidentale. Par contre, l’ambiance "luxe" peut être… surprenante !"""),
            ),
    ),
    wtftokyo(
        category = Category.quotidien,
        date = LocalDate.of(2013, Month.JUNE, 3),
        place = Place.tokyo,
        title = "Curiosités de Tôkyô",
        content =
            arrayOf(
                Image("wtf", "Tokyo 578", "Automobilistes, lisez vite !"),
                Image("wtf", "Tokyo 579", "Soudain, une école chic libère ses élèves."),
                Image(
                    "wtf",
                    "Tokyo 580",
                    """"Sens interdit de 0 à 12 h et aliens de 12 à 13 h" ?!"""),
                Image("wtf", "Tokyo 581", "Intéressant concept d’adaptateur électrique…"),
                Image("wtf", "Tokyo 582", ""),
                Image("wtf", "Tokyo 583", ""),
                Image("wtf", "Tokyo 585", "Un genre de crèche ou de maternelle"),
                Image("wtf", "Tokyo 586", "Si, ça roule…"),
                Image("wtf", "Tokyo 588", ""),
                Image("wtf", "Tokyo 589", ""),
                Image(
                    "wtf",
                    "Tokyo 590",
                    """« La pizzeria sous le pont de chemin de fer », c’est une vraie adresse."""),
                Image("wtf", "Tokyo 591", "Troupeau de toupies à béton"),
                Image("wtf", "Tokyo 592", """« Interdit de tourner à droite », en somme."""),
                Image("wtf", "Tokyo 593", "L’alliance de la tradition et de la modernité"),
                Image("wtf", "Tokyo 595", "Ce carillon vous donne l’heure."),
                Image("wtf", "Tokyo 596", "Entrée d’un neko café (café avec des chats)"),
                Image("wtf", "Tokyo 597", "Bateau du maître des takoyaki (boulettes de poulpe)."),
            ),
    ),
    francisla(
        category = Category.francisla,
        date = LocalDate.of(2013, Month.MAY, 21),
        place = Place.nagano,
        title = "La page de Francis-La",
        content =
            arrayOf(
                Text(
                    """Prêt pour une bonne nuit de sommeil dans le <a href="/page/ryokannagano#content">ryokan de Nagano</a>."""),
                Image("francisla", "Francis-la 157", ""),
                Text(
                    """Une Guiness à deux pas du <a href="/page/matsumotojo#content">château de Matsumoto</a>."""),
                Image("francisla", "Francis-la 158", ""),
                Text(
                    """Dans le bus pour <a href="/page/vuesmatsumoto#content">les hauteurs de Mastumoto</a>."""),
                Image("francisla", "Francis-la 159", ""),
                Text("""L’entrée du <a href="/page/himejijo#content">château de Himeji</a> !"""),
                Image("francisla", "Francis-la 160", ""),
                Text(
                    """Paré pour faire un tour aux <a href="/page/sourcesbeppu#content">onsens de Beppu</a> !"""),
                Image("francisla", "Francis-la 161", ""),
                Text("""Devant le <a href="/page/memorialpaix#content">dôme de Genbaku</a>."""),
                Image("francisla", "Francis-la 183", ""),
                Text(
                    """Devant le <a href="/page/sanctuairemiyajima#content">torii flottant de l’Itsukushima-jinja</a>."""),
                Image("francisla", "Miyajima 256", ""),
                Text("Non ?"),
                Image("francisla", "Miyajima 257", ""),
                Text("""Téléphérique pour le <a href="/page/montmisen#content">Mont Misen</a>."""),
                Image("francisla", "Miyajima 258", ""),
                Text(
                    """De retour de <a href="place/nara#content">Nara</a>, c’est Francis-La qui conduit le train !"""),
                Image("francisla", "Nara 345", ""),
                Text(
                    """Le vélo, moyen de transport idéal à <a href="place/kyoto#content">Kyôto</a> (et très utilisé un peu partout au Japon)."""),
                Image("francisla", "Kyoto2 401", ""),
                Text(
                    """Francis-la et sa nouvelle amie 雛菊 (Hinagiku), une renarde qu’il a rencontrée au <a href="/page/fushimiinari#content">Fushimi Inari taisha (伏見稲荷大社)</a>"""),
                Image("francisla", "Kyoto3 450", ""),
                Text(
                    """Francis-la et Hinagiku dans les <a href="/page/jardinsimperial#content">jardins du Palais Impérial</a>."""),
                Image("francisla", "Tokyo 498", ""),
                Text("""Francis-la à <a href="/page/asakusa#content">Asakusa</a>."""),
                Image("francisla", "Tokyo 499", ""),
                Image("francisla", "Tokyo 500", ""),
                Text("""En route pour le <a href="/page/museeghibli#content">musée Ghibli</a> !"""),
                Image("francisla", "Tokyo 501", ""),
            ),
    ),
    ;

    fun dateHuman(): String = humanFormatter.format(date)

    fun timestamp(): String = machineFormatter.format(date)

    fun imgCount(): Int = content.count { it is Image }
}

private val machineFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.FRANCE)
private val humanFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE)
