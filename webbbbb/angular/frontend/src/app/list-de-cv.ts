export class ListDeCv {
  constructor(nomPrenom: String, age: number, region: String, etude: String, diplome: String, experience: String, coordonnees: String, recommandationsDePoste: String, email: String, specialite: String, commentaires: String, date: Date, entretienTelephonique: String) {
    this._nomPrenom = nomPrenom;
    this._age = age;
    this._region = region;
    this._etude = etude;
    this._diplome = diplome;
    this._experience = experience;
    this._coordonnees = coordonnees;
    this._recommandationsDePoste = recommandationsDePoste;
    this._email = email;
    this._specialite = specialite;
    this._commentaires = commentaires;
    this._date = date;
    this._entretienTelephonique = entretienTelephonique;
  }



  private _nomPrenom:String ;
  private _age:number;
  private _region:String ;
  private _etude:String ;
  private _diplome:String ;
  private _experience:String ;
  private _coordonnees:String ;


  get nomPrenom(): String {
    return this._nomPrenom;
  }

  set nomPrenom(value: String) {
    this._nomPrenom = value;
  }

  get age(): number {
    return this._age;
  }

  set age(value: number) {
    this._age = value;
  }

  get region(): String {
    return this._region;
  }

  set region(value: String) {
    this._region = value;
  }

  get etude(): String {
    return this._etude;
  }

  set etude(value: String) {
    this._etude = value;
  }

  get diplome(): String {
    return this._diplome;
  }

  set diplome(value: String) {
    this._diplome = value;
  }

  get experience(): String {
    return this._experience;
  }

  set experience(value: String) {
    this._experience = value;
  }

  get coordonnees(): String {
    return this._coordonnees;
  }

  set coordonnees(value: String) {
    this._coordonnees = value;
  }

  get recommandationsDePoste(): String {
    return this._recommandationsDePoste;
  }

  set recommandationsDePoste(value: String) {
    this._recommandationsDePoste = value;
  }

  get email(): String {
    return this._email;
  }

  set email(value: String) {
    this._email = value;
  }

  get specialite(): String {
    return this._specialite;
  }

  set specialite(value: String) {
    this._specialite = value;
  }

  get commentaires(): String {
    return this._commentaires;
  }

  set commentaires(value: String) {
    this._commentaires = value;
  }

  get date(): Date {
    return this._date;
  }

  set date(value: Date) {
    this._date = value;
  }

  get entretienTelephonique(): String {
    return this._entretienTelephonique;
  }

  set entretienTelephonique(value: String) {
    this._entretienTelephonique = value;
  }


  private _recommandationsDePoste:String ;

  private _email:String;
  private _specialite:String;
  private _commentaires:String;
  private _date:Date ;
  private _entretienTelephonique:String;


}
