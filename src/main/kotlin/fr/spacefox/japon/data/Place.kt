package fr.spacefox.japon.data

enum class Place(val displayName: String, val iframeSrc: String, val link: String) {
    nagano(
        displayName = "Nagano",
        iframeSrc =
            "https://www.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=Nagano,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;aq=0&amp;oq=nagano&amp;sll=36.177791,137.80426&amp;sspn=1.877743,4.22699&amp;ie=UTF8&amp;hq=&amp;hnear=Nagano,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;t=p&amp;ll=37.405074,139.855957&amp;spn=6.979889,16.501465&amp;z=6&amp;output=embed",
        link =
            "https://www.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=Nagano,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;aq=0&amp;oq=nagano&amp;sll=36.177791,137.80426&amp;sspn=1.877743,4.22699&amp;ie=UTF8&amp;hq=&amp;hnear=Nagano,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;t=p&amp;ll=37.405074,139.855957&amp;spn=6.979889,16.501465&amp;z=6"
    ),
    matsumoto(
        displayName = "Matsumoto",
        iframeSrc =
            "https://www.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=Matsumoto,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;aq=0&amp;oq=matsumot&amp;sll=37.0625,-95.677068&amp;sspn=107.090143,270.527344&amp;ie=UTF8&amp;hq=&amp;hnear=Matsumoto,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;t=p&amp;ll=37.125286,138.22998&amp;spn=7.005806,16.45752&amp;z=6&amp;output=embed",
        link =
            "https://www.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=Matsumoto,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;aq=0&amp;oq=matsumot&amp;sll=37.0625,-95.677068&amp;sspn=107.090143,270.527344&amp;ie=UTF8&amp;hq=&amp;hnear=Matsumoto,+Pr%C3%A9fecture+de+Nagano,+Japon&amp;t=p&amp;ll=37.125286,138.22998&amp;spn=7.005806,16.45752&amp;z=6"
    ),
    himeji(
        displayName = "Himeji",
        iframeSrc =
            "https://www.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=Himeji,+Pr%C3%A9fecture+de+Hy%C5%8Dgo,+Japon&amp;aq=0&amp;oq=himeji&amp;sll=36.253133,138.850708&amp;sspn=3.751586,8.453979&amp;ie=UTF8&amp;hq=&amp;hnear=Himeji,+Pr%C3%A9fecture+de+Hy%C5%8Dgo,+Japon&amp;t=p&amp;ll=35.173808,135.834961&amp;spn=3.59183,8.22876&amp;z=7&amp;output=embed",
        link =
            "https://www.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=Himeji,+Pr%C3%A9fecture+de+Hy%C5%8Dgo,+Japon&amp;aq=0&amp;oq=himeji&amp;sll=36.253133,138.850708&amp;sspn=3.751586,8.453979&amp;ie=UTF8&amp;hq=&amp;hnear=Himeji,+Pr%C3%A9fecture+de+Hy%C5%8Dgo,+Japon&amp;t=p&amp;ll=35.173808,135.834961&amp;spn=3.59183,8.22876&amp;z=7"
    ),
    beppu(
        displayName = "Beppu",
        iframeSrc =
            "https://www.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=Beppu,+Pr%C3%A9fecture+d\'%C5%8Cita,+Japon&amp;aq=0&amp;oq=Beppu&amp;sll=34.678394,134.351807&amp;sspn=3.825721,8.453979&amp;t=p&amp;ie=UTF8&amp;hq=&amp;hnear=Beppu,+Pr%C3%A9fecture+d\'%C5%8Cita,+Japon&amp;ll=33.28462,131.495361&amp;spn=3.673271,8.22876&amp;z=7&amp;iwloc=A&amp;output=embed",
        link =
            "https://www.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=Beppu,+Pr%C3%A9fecture+d\'%C5%8Cita,+Japon&amp;aq=0&amp;oq=Beppu&amp;sll=34.678394,134.351807&amp;sspn=3.825721,8.453979&amp;t=p&amp;ie=UTF8&amp;hq=&amp;hnear=Beppu,+Pr%C3%A9fecture+d\'%C5%8Cita,+Japon&amp;ll=33.28462,131.495361&amp;spn=3.673271,8.22876&amp;z=7&amp;iwloc=A"
    ),
    hiroshima(
        displayName = "Hiroshima",
        iframeSrc =
            "https://www.google.com/maps?sll=37.06250000000001,-95.67706800000002&amp;sspn=76.93536935117227,102.44083790758059&amp;t=p&amp;q=hiroshima&amp;dg=opt&amp;ie=UTF8&amp;hq=&amp;hnear=Hiroshima,+Pr%C3%A9fecture+de+Hiroshima,+Japon&amp;ll=34.134542,132.890625&amp;spn=3.637121,8.22876&amp;z=7&amp;iwloc=A&amp;output=embed",
        link =
            "https://www.google.com/maps?sll=37.06250000000001,-95.67706800000002&amp;sspn=76.93536935117227,102.44083790758059&amp;t=p&amp;q=hiroshima&amp;dg=opt&amp;ie=UTF8&amp;hq=&amp;hnear=Hiroshima,+Pr%C3%A9fecture+de+Hiroshima,+Japon&amp;ll=34.134542,132.890625&amp;spn=3.637121,8.22876&amp;z=7&amp;iwloc=A&amp;source=embed"
    ),
    itsukushima(
        displayName = "Itsukushima (Miyajima)",
        iframeSrc =
            "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=Itsukushima-jinja,+Hatsukaichi,+Pr%C3%A9fecture+de+Hiroshima,+Japon&amp;aq=0&amp;oq=Itsukushima&amp;sll=37.0625,-95.677068&amp;sspn=58.72842,107.841797&amp;t=p&amp;ie=UTF8&amp;hq=Itsukushima-jinja,+Hatsukaichi,+Pr%C3%A9fecture+de+Hiroshima,+Japon&amp;ll=34.307711,132.409973&amp;spn=0.226874,0.514297&amp;z=11&amp;output=embed",
        link =
            "https://maps.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=Itsukushima-jinja,+Hatsukaichi,+Pr%C3%A9fecture+de+Hiroshima,+Japon&amp;aq=0&amp;oq=Itsukushima&amp;sll=37.0625,-95.677068&amp;sspn=58.72842,107.841797&amp;t=p&amp;ie=UTF8&amp;hq=Itsukushima-jinja,+Hatsukaichi,+Pr%C3%A9fecture+de+Hiroshima,+Japon&amp;ll=34.307711,132.409973&amp;spn=0.226874,0.514297&amp;z=11"
    ),
    kyoto(
        displayName = "Kyôto",
        iframeSrc =
            "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=kyoto&amp;aq=&amp;sll=37.0625,-95.677068&amp;sspn=61.452931,107.841797&amp;ie=UTF8&amp;hq=&amp;hnear=Kyoto,+Pr%C3%A9fecture+de+Kyoto,+Japon&amp;t=p&amp;ll=35.012002,135.966797&amp;spn=7.196108,16.45752&amp;z=6&amp;output=embed",
        link =
            "https://maps.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=kyoto&amp;aq=&amp;sll=37.0625,-95.677068&amp;sspn=61.452931,107.841797&amp;ie=UTF8&amp;hq=&amp;hnear=Kyoto,+Pr%C3%A9fecture+de+Kyoto,+Japon&amp;t=p&amp;ll=35.012002,135.966797&amp;spn=7.196108,16.45752&amp;z=6"
    ),
    nara(
        displayName = "Nara",
        iframeSrc =
            "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=nara&amp;t=p&amp;ie=UTF8&amp;hq=&amp;hnear=Nara,+Pr%C3%A9fecture+de+Nara,+Japon&amp;ll=34.669359,135.681152&amp;spn=3.613962,8.22876&amp;z=7&amp;output=embed",
        link =
            "https://maps.google.com/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=nara&amp;t=p&amp;ie=UTF8&amp;hq=&amp;hnear=Nara,+Pr%C3%A9fecture+de+Nara,+Japon&amp;ll=34.669359,135.681152&amp;spn=3.613962,8.22876&amp;z=7"
    ),
    tokyo(
        displayName = "Tôkyô",
        iframeSrc =
            "https://maps.google.fr/maps?f=q&amp;source=s_q&amp;hl=fr&amp;geocode=&amp;q=tokyo&amp;aq=&amp;sll=48.680792,2.502588&amp;sspn=3.315151,8.453979&amp;ie=UTF8&amp;hq=&amp;hnear=Tokyo,+Japon&amp;t=p&amp;ll=35.817813,139.658203&amp;spn=7.124687,16.45752&amp;z=6&amp;output=embed",
        link =
            "https://maps.google.fr/maps?f=q&amp;source=embed&amp;hl=fr&amp;geocode=&amp;q=tokyo&amp;aq=&amp;sll=48.680792,2.502588&amp;sspn=3.315151,8.453979&amp;ie=UTF8&amp;hq=&amp;hnear=Tokyo,+Japon&amp;t=p&amp;ll=35.817813,139.658203&amp;spn=7.124687,16.45752&amp;z=6"
    ),
    ;

    fun pages(): List<Page> = Page.entries.filter { it.place == this }

    fun imgCount(): Int = pages().sumOf { it.imgCount() }
}
