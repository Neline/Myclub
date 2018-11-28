package com.hbv1.myclub

import com.google.firebase.database.IgnoreExtraProperties

class Equipes {

    var nom: String? = ""
    var categ: String? = ""
    var div: Int = 0


    constructor() {
        // constructeurs pa default requis pour appel a DataSnapshot.getValue(User.class)
    }

    constructor(nomequipe: String?, categorie: String?, division: Int) {
        this.nom = nomequipe
        this.categ = categorie
        this.div = division
    }
}