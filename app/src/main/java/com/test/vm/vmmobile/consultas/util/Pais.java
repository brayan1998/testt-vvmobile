package com.test.vm.vmmobile.consultas.util;

import com.test.vm.vmmobile.consultas.model.remote.response.PEN;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Pais implements Serializable{

    private name name;
    private List<String> tld;
    private String cca2;
    private String ccn3;
    private String cca3;
    private String cioc;
    private Boolean independent;
    private String status;
    private Boolean unMember;
    //private currencies currencies;
    HashMap<String, currencie> currencies = new HashMap<String, currencie>();
    private idd idd;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String  subregion;
    private languages languages;
    private translations translations;
    private List<Float> latlng;
    private String landlocked;
    private List<String> borders;
    private Float area;
    private demonyms demonyms;
    private  String flag;
    private maps maps;
    private String population;
    private gini gini;
    private String fifa;
    private car car;
    private List<String> timezones;
    private List<String> continents;
    private flags flags;
    private coatOfArms coatOfArms;
    private String startOfWeek;
    private capitalInfo capitalInfo;
    private postalCode postalCode;

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public Boolean getIndependent() {
        return independent;
    }

    public void setIndependent(Boolean independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getUnMember() {
        return unMember;
    }

    public void setUnMember(Boolean unMember) {
        this.unMember = unMember;
    }

    public HashMap<String, currencie> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(HashMap<String, currencie> currencies) {
        this.currencies = currencies;
    }

    public idd getIdd() {
        return idd;
    }

    public void setIdd(idd idd) {
        this.idd = idd;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public languages getLanguages() {
        return languages;
    }

    public void setLanguages(languages languages) {
        this.languages = languages;
    }

    public translations getTranslations() {
        return translations;
    }

    public void setTranslations(translations translations) {
        this.translations = translations;
    }

    public List<Float> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Float> latlng) {
        this.latlng = latlng;
    }

    public String getLandlocked() {
        return landlocked;
    }

    public void setLandlocked(String landlocked) {
        this.landlocked = landlocked;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }


    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public demonyms getDemonyms() {
        return demonyms;
    }

    public void setDemonyms(demonyms demonyms) {
        this.demonyms = demonyms;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public maps getMaps() {
        return maps;
    }

    public void setMaps(maps maps) {
        this.maps = maps;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public gini getGini() {
        return gini;
    }

    public void setGini(gini gini) {
        this.gini = gini;
    }

    public String getFifa() {
        return fifa;
    }

    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    public car getCar() {
        return car;
    }

    public void setCar(car car) {
        this.car = car;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public List<String> getContinents() {
        return continents;
    }

    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    public flags getFlags() {
        return flags;
    }

    public void setFlags(flags flags) {
        this.flags = flags;
    }

    public coatOfArms getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(coatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getStartOfWeek() {
        return startOfWeek;
    }

    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public capitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(capitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public postalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(postalCode postalCode) {
        this.postalCode = postalCode;
    }

    public name getName() {
        return name;
    }

    public void setName(name name) {
        this.name = name;
    }

    public List<String> getTld() {
        return tld;
    }

    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public static class languages {
        private String aym;
        private String que;
        private String spa;

        public String getAym() {
            return aym;
        }

        public void setAym(String aym) {
            this.aym = aym;
        }

        public String getQue() {
            return que;
        }

        public void setQue(String que) {
            this.que = que;
        }

        public String getSpa() {
            return spa;
        }

        public void setSpa(String spa) {
            this.spa = spa;
        }
    }

    public static class name {

        private String common;
        private String official;
        private nativeName nativeName;

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public nativeName getNativeName() {
            return nativeName;
        }

        public void setNativeName(nativeName nativeName) {
            this.nativeName = nativeName;
        }
    }

    public class nativeName {

        private aym aym;
        private que que;
        private spa spa;

        public aym getAym() {
            return aym;
        }

        public void setAym(aym aym) {
            this.aym = aym;
        }

        public que getQue() {
            return que;
        }

        public void setQue(que que) {
            this.que = que;
        }

        public spa getSpa() {
            return spa;
        }

        public void setSpa(spa spa) {
            this.spa = spa;
        }
    }

    public static class idd {
        private String root;
        private List<String> suffixes;


        public String getRoot() {
            return root;
        }

        public void setRoot(String root) {
            this.root = root;
        }

        public List<String> getSuffixes() {
            return suffixes;
        }

        public void setSuffixes(List<String> suffixes) {
            this.suffixes = suffixes;
        }
    }

    public static class currencie implements Serializable {

        private String name;
        private String symbol;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

    }

    public static class demonyms {
        private eng eng;
        private com.test.vm.vmmobile.consultas.model.remote.response.fra fra;

        public eng getEng() {
            return eng;
        }

        public void setEng(eng eng) {
            this.eng = eng;
        }

        public com.test.vm.vmmobile.consultas.model.remote.response.fra getFra() {
            return fra;
        }

        public void setFra(com.test.vm.vmmobile.consultas.model.remote.response.fra fra) {
            this.fra = fra;
        }
    }

    public static class eng{
        private String f;
        private String m;

        public String getF() {
            return f;
        }

        public void setF(String f) {
            this.f = f;
        }

        public String getM() {
            return m;
        }

        public void setM(String m) {
            this.m = m;
        }
    }

    public static class gini{


    }
    public static class car{
        private List<String> signs;
        private String side;

        public List<String> getSigns() {
            return signs;
        }

        public void setSigns(List<String> signs) {
            this.signs = signs;
        }

        public String getSide() {
            return side;
        }

        public void setSide(String side) {
            this.side = side;
        }
    }
    public static class flags{
        private String png;
        private String svg;

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }

        public String getSvg() {
            return svg;
        }

        public void setSvg(String svg) {
            this.svg = svg;
        }
    }
    public static class coatOfArms{
        private String png;
        private String svg;

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }

        public String getSvg() {
            return svg;
        }

        public void setSvg(String svg) {
            this.svg = svg;
        }
    }
    public static class capitalInfo{
        private List<Float> latlng;

        public List<Float> getLatlng() {
            return latlng;
        }

        public void setLatlng(List<Float> latlng) {
            this.latlng = latlng;
        }
    }
    public static class postalCode{
        private String format;
        private String regex;

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getRegex() {
            return regex;
        }

        public void setRegex(String regex) {
            this.regex = regex;
        }
    }


    public static class maps{
        private String googleMaps;
        private String openStreetMaps;

        public String getGoogleMaps() {
            return googleMaps;
        }

        public void setGoogleMaps(String googleMaps) {
            this.googleMaps = googleMaps;
        }

        public String getOpenStreetMaps() {
            return openStreetMaps;
        }

        public void setOpenStreetMaps(String openStreetMaps) {
            this.openStreetMaps = openStreetMaps;
        }
    }

    public static class translations implements  Serializable{
        public ara ara;
        public ces ces;
        public cym cym;
        public deu deu;
        public est est;
        public fin fin;
        public fra fra;
        public hrv hrv;
        public hun hun;
        public ita ita;
        public jpn jpn;
        public kor kor;
        public nld nld;
        public per per;
        public pol pol;
        public por por;
        public rus rus;
        public slk slk;
        public spa spa;
        public swe swe;
        public urd urd;
        public zho zho;

        public ara getAra() {
            return ara;
        }

        public void setAra(ara ara) {
            this.ara = ara;
        }

        public ces getCes() {
            return ces;
        }

        public void setCes(ces ces) {
            this.ces = ces;
        }

        public cym getCym() {
            return cym;
        }

        public void setCym(cym cym) {
            this.cym = cym;
        }

        public deu getDeu() {
            return deu;
        }

        public void setDeu(deu deu) {
            this.deu = deu;
        }

        public est getEst() {
            return est;
        }

        public void setEst(est est) {
            this.est = est;
        }

        public fin getFin() {
            return fin;
        }

        public void setFin(fin fin) {
            this.fin = fin;
        }

        public fra getFra() {
            return fra;
        }

        public void setFra(fra fra) {
            this.fra = fra;
        }

        public hrv getHrv() {
            return hrv;
        }

        public void setHrv(hrv hrv) {
            this.hrv = hrv;
        }

        public hun getHun() {
            return hun;
        }

        public void setHun(hun hun) {
            this.hun = hun;
        }

        public ita getIta() {
            return ita;
        }

        public void setIta(ita ita) {
            this.ita = ita;
        }

        public jpn getJpn() {
            return jpn;
        }

        public void setJpn(jpn jpn) {
            this.jpn = jpn;
        }

        public kor getKor() {
            return kor;
        }

        public void setKor(kor kor) {
            this.kor = kor;
        }

        public nld getNld() {
            return nld;
        }

        public void setNld(nld nld) {
            this.nld = nld;
        }

        public per getPer() {
            return per;
        }

        public void setPer(per per) {
            this.per = per;
        }

        public pol getPol() {
            return pol;
        }

        public void setPol(pol pol) {
            this.pol = pol;
        }

        public por getPor() {
            return por;
        }

        public void setPor(por por) {
            this.por = por;
        }

        public rus getRus() {
            return rus;
        }

        public void setRus(rus rus) {
            this.rus = rus;
        }

        public slk getSlk() {
            return slk;
        }

        public void setSlk(slk slk) {
            this.slk = slk;
        }

        public spa getSpa() {
            return spa;
        }

        public void setSpa(spa spa) {
            this.spa = spa;
        }

        public swe getSwe() {
            return swe;
        }

        public void setSwe(swe swe) {
            this.swe = swe;
        }

        public urd getUrd() {
            return urd;
        }

        public void setUrd(urd urd) {
            this.urd = urd;
        }

        public zho getZho() {
            return zho;
        }

        public void setZho(zho zho) {
            this.zho = zho;
        }
    }

    public static class ara extends DataUtil {
    }
    public static class ces extends DataUtil {
    }
    public static class cym extends DataUtil {
    }
    public static class deu extends DataUtil {
    }
    public static class est extends DataUtil {
    }
    public static class fin extends DataUtil {
    }
    public static class fra extends DataUtil {
    }
    public static class hrv extends DataUtil {
    }
    public static class hun extends DataUtil {
    }
    public static class ita extends DataUtil {
    }
    public static class jpn extends DataUtil {
    }
    public static class kor extends DataUtil {
    }
    public static class nld extends DataUtil {
    }
    public static class per extends DataUtil {
    }
    public static class pol extends DataUtil {
    }
    public static class por extends DataUtil {
    }
    public static class rus extends DataUtil {
    }
    public static class slk extends DataUtil {
    }
    public static class spa extends DataUtil {
    }
    public static class swe extends DataUtil {
    }
    public static class urd extends DataUtil {
    }
    public static class zho extends DataUtil {
    }
    public static class aym extends DataUtil {
    }
    public static class que extends DataUtil {
    }

    public static class DataUtil{
        private String official;
        private String common;

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }
}
