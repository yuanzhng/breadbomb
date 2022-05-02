package com.example.breadbomb;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Locale;

public class breadController {
    @FXML
    private Label promptlbl;

    @FXML
    private TextField inputfld;

    @FXML
    private Label scorefld;

    private int score = 0;

    private String prompt;

    private String order;

    private String[] dictionary = {"hello"};

    private String[] possibleOrders = {""};

    private String[] possiblePrompts = {"AA", "AB", "AC", "AD", "AF", "AG", "AH", "AI", "AK", "AL", "AM", "AN", "AP",
            "AR", "AS", "AT", "AV", "AW", "BA", "BE", "BI", "BL", "BO", "BU", "CA", "CE", "CH", "CI", "CO", "CU",
            "DA", "DE", "DI", "DO", "EA", "EB", "EC", "ED", "EF", "EG", "EL", "EM",
    "EN", "EG", "EH", "EL", "EM", "EN", "EP", "ER", "ES", "ET", "EW", "FA", "FE", "FI", "FO", "HA", "HE", "HI", "HM", "HT", "HU",
    "IA", "IF", "IH", "IL", "IM", "IN", "IP", "IR", "IS", "IT", "IV", "IV", "KA", "KE", "KI", "KO", "LA", "LE", "LI", "LO", "LU", "MA",
    "ME", "MI", "MM", "MO", "NA"};
/*

            NE

    NI

    NN

    NO

    NS

    OD

    OH

    OO

    OP

    OR

            PA

    PE

    PI

    PO

    PL

    PH

    RA

            RE

    RI

            RO

    RR

    RW

    SA

            SE

    SI

    SO

    ST

    SU

            TA

    TE

    TH

    TS

    TW

    UD

    UM

    UR

            US

    UT

    VA

    VE

    VI

    VO

    WA

    WE

    WO

    WT

    AAH

            AAL

    ABA

            ADA

    ADE

    AEA

    AGU

            AHA

    AHE

            AHI

    AHO

            AHU

    AKI

            ARA

    ARI

            ATE

    ATI

            ATO

    ATU

            AVA

    AVU

            BAW

    BEM

            CWM

    CIN

            DAA

    DEH

            DNA

    DSO

    ECA

            ECE

    EDE

            EDO

    EES

            EFA

    EFE

            EGE

    EHO

            ELA

    ELE

            ELI

    ELO

            ENA

    ENE

            ENO

    ENU

            EMA

    EOA

            EPA

    ERO

            ERI

    ESA

            ESE

    ETA

            ETE

    EVE

            EWA

    FAA

    GHH

    IAM

            ICA

    IES

    IKD

    ILI

            IRA

    IRI

            ISA

    ISI

            ITI

    KUA

            LAA

    LAG

            LAR

    LED

            LEG

    LEH

            LES

    LIL

            LIN

    LOM

            LOT

    LUA

            LUO

    MMM

            MOO

    NED

            NES

    NRO

    OIE

            OCO

    OHA

            ONI

    OMI

            OPI

    ORA

            ORE

    ORI

            PIC

    PIN

            RAA

    REE

            RAE

    RER

            RET

    SAA

    SAP

            SAS

    SES

            TAA

    TER

            TAP

    TFE

            TIN

    TOT

    TVA

    UCA

            UGA

    UGI

            UIL

    ULA

            URI

    VAN

    VEF

    VEL
    A

    F

    H

            I
    BR

            CK

    CS

            DD

    DR

            GN

    KD

            LC

    MN

            MP

    MS

            NC

    ND

            RB

    RZ

            SM

    UA

            UE

    UF

            XP

    XT */

    public void initialize() {
        newPrompt();
    }
    public void newPrompt() {
        inputfld.setText("");
        int i = (int) (Math.random() * (possiblePrompts.length - 1));
        this.prompt = possiblePrompts[i];
        promptlbl.setText(prompt);
    }

    public boolean isIn(String s) {

        if (s.contains(prompt)) {
            return true;
        }
        return false;
    }

    public void check() {
        String ipt = inputfld.getText();
        if (ipt.contains(prompt.toLowerCase(Locale.ROOT))) {
            score++;
            scorefld.setText(Integer.toString(score));
            newPrompt();
        } else {
            inputfld.setText("");
            scorefld.setText("Doesn't contain prompt!");
        }
    }

    public void newOrder() {

    }


}