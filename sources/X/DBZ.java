package X;

public final class DBZ implements C28602E9t {
    public static final DBZ A00 = new Object();

    public BTJ BDI(Integer num) {
        C18070vi.A0d(num, 0);
        if (2 - num.intValue() != 0) {
            return new BTJ(C0J.A27, 0.0f);
        }
        return new BTJ(C0J.A2B, 1.0f);
    }

    public int BG2(Integer num) {
        C18070vi.A0d(num, 0);
        if (4 - num.intValue() == 0) {
            return 22;
        }
        return 16;
    }

    public void BLN(Integer num) {
        C18070vi.A0d(num, 0);
    }

    public float CNO(Integer num) {
        C18070vi.A0d(num, 0);
        switch (num.intValue()) {
            case 2:
            case 7:
                return 44.0f;
            case 3:
            case 22:
                return 36.0f;
            case 4:
            case 19:
                return 28.0f;
            case 5:
                return 70.0f;
            case 6:
            case 27:
                return 60.0f;
            case 8:
                return 14.0f;
            case 9:
            case 24:
                return 48.0f;
            case 10:
                return 0.0f;
            case 11:
                return 10.0f;
            case 12:
                return 112.0f;
            case 13:
                return 12.0f;
            case 14:
                return 132.0f;
            case 15:
                return 16.0f;
            case 16:
                return 18.0f;
            case 17:
            case 31:
                return 20.0f;
            case 18:
            case 30:
                return 24.0f;
            case 20:
                return 30.0f;
            case 23:
                return 40.0f;
            case 25:
                return 52.0f;
            case 26:
                return 56.0f;
            case 28:
                return 72.0f;
            case 29:
                return 8.0f;
            case 32:
                return 2.0f;
            default:
                return 32.0f;
        }
    }

    public float CNZ(Integer num) {
        C18070vi.A0d(num, 0);
        switch (num.intValue()) {
            case 12:
            case 42:
                return 20.0f;
            case 13:
            case 20:
            case 27:
            case 36:
            case 37:
            case 41:
                return 12.0f;
            case 14:
            case 45:
                return 6.0f;
            case 18:
                return 75.0f;
            case 23:
            case 40:
                return 0.0f;
            case 24:
            case 34:
                return 52.0f;
            case 25:
                return 36.0f;
            case 31:
                return 5.0f;
            case 38:
            case 44:
                return 8.0f;
            case 46:
                return 14.0f;
            default:
                return 16.0f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        r6 = (com.facebook.dsp.core.typography.LineHeightValue) new com.facebook.dsp.core.typography.LineHeightMultiplierValue(r0);
        r3 = 13.0f;
        r5 = -0.04f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return new com.facebook.dsp.core.typography.TypographyData(r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL;
        r6 = (com.facebook.dsp.core.typography.LineHeightValue) new com.facebook.dsp.core.typography.LineHeightMultiplierValue(1.04f);
        r3 = 15.0f;
        r5 = -0.02f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.dsp.core.typography.TypographyData CQ2(java.lang.Integer r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            int r2 = r8.intValue()
            r1 = 1064682127(0x3f75c28f, float:0.96)
            r0 = 1065688760(0x3f851eb8, float:1.04)
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x002a;
                case 2: goto L_0x0011;
                case 3: goto L_0x0011;
                case 4: goto L_0x003b;
                case 5: goto L_0x004f;
                case 6: goto L_0x0057;
                case 7: goto L_0x006b;
                default: goto L_0x0011;
            }
        L_0x0011:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_DISPLAY_APP
            com.facebook.dsp.core.typography.ThemeFontWeight r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL
            com.facebook.dsp.core.typography.LineHeightMultiplierValue r6 = new com.facebook.dsp.core.typography.LineHeightMultiplierValue
            r6.<init>(r1)
            com.facebook.dsp.core.typography.LineHeightValue r6 = (com.facebook.dsp.core.typography.LineHeightValue) r6
            r3 = 1103101952(0x41c00000, float:24.0)
            r5 = 1039516303(0x3df5c28f, float:0.12)
        L_0x0021:
            com.facebook.dsp.core.typography.TypographyData r1 = new com.facebook.dsp.core.typography.TypographyData
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0027:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_TEXT_APP_REGULAR
            goto L_0x002c
        L_0x002a:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_TEXT_APP_BOLD
        L_0x002c:
            com.facebook.dsp.core.typography.ThemeFontWeight r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL
            com.facebook.dsp.core.typography.LineHeightMultiplierValue r6 = new com.facebook.dsp.core.typography.LineHeightMultiplierValue
            r6.<init>(r0)
            com.facebook.dsp.core.typography.LineHeightValue r6 = (com.facebook.dsp.core.typography.LineHeightValue) r6
            r3 = 1097859072(0x41700000, float:15.0)
            r5 = -1130113270(0xffffffffbca3d70a, float:-0.02)
            goto L_0x0021
        L_0x003b:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_TEXT_APP_BOLD
            com.facebook.dsp.core.typography.ThemeFontWeight r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL
            r0 = 1065361605(0x3f8020c5, float:1.001)
            com.facebook.dsp.core.typography.LineHeightMultiplierValue r6 = new com.facebook.dsp.core.typography.LineHeightMultiplierValue
            r6.<init>(r0)
            com.facebook.dsp.core.typography.LineHeightValue r6 = (com.facebook.dsp.core.typography.LineHeightValue) r6
            r3 = 1099431936(0x41880000, float:17.0)
            r5 = 1031127695(0x3d75c28f, float:0.06)
            goto L_0x0021
        L_0x004f:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_TEXT_APP_REGULAR
            com.facebook.dsp.core.typography.ThemeFontWeight r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            goto L_0x005e
        L_0x0057:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_TEXT_APP_BOLD
            com.facebook.dsp.core.typography.ThemeFontWeight r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL
            r0 = 1065856532(0x3f87ae14, float:1.06)
        L_0x005e:
            com.facebook.dsp.core.typography.LineHeightMultiplierValue r6 = new com.facebook.dsp.core.typography.LineHeightMultiplierValue
            r6.<init>(r0)
            com.facebook.dsp.core.typography.LineHeightValue r6 = (com.facebook.dsp.core.typography.LineHeightValue) r6
            r3 = 1095761920(0x41500000, float:13.0)
            r5 = -1121724662(0xffffffffbd23d70a, float:-0.04)
            goto L_0x0021
        L_0x006b:
            X.C0h r2 = X.C24368C0h.OPTIMISTIC_TEXT_APP_MEDIUM
            com.facebook.dsp.core.typography.ThemeFontWeight r4 = com.facebook.dsp.core.typography.ThemeFontWeight.NORMAL
            com.facebook.dsp.core.typography.LineHeightMultiplierValue r6 = new com.facebook.dsp.core.typography.LineHeightMultiplierValue
            r6.<init>(r1)
            com.facebook.dsp.core.typography.LineHeightValue r6 = (com.facebook.dsp.core.typography.LineHeightValue) r6
            r3 = 1098907648(0x41800000, float:16.0)
            r5 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBZ.CQ2(java.lang.Integer):com.facebook.dsp.core.typography.TypographyData");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a1, code lost:
        r1 = -2169879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a6, code lost:
        r1 = -14931149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ad, code lost:
        r1 = -5786689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b4, code lost:
        r1 = -12081670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bb, code lost:
        r1 = -14141117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c2, code lost:
        r1 = -15787746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c7, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02e1, code lost:
        return new X.D3N(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r1 = -13350828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r1 = 436207615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        r1 = -1024151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        r1 = -1727063778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014b, code lost:
        r1 = 1291845631;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        r1 = 872415231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        r1 = -8022620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ba, code lost:
        r1 = 1724633817;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ca, code lost:
        r1 = -3419431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01da, code lost:
        r1 = -12166551;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.D3N BFD(X.C0J r4) {
        /*
            r3 = this;
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x0077;
                case 1: goto L_0x000c;
                case 2: goto L_0x0011;
                case 3: goto L_0x02c6;
                case 4: goto L_0x00fe;
                case 5: goto L_0x00ee;
                case 6: goto L_0x0017;
                case 7: goto L_0x009a;
                case 8: goto L_0x001c;
                case 9: goto L_0x0021;
                case 10: goto L_0x0024;
                case 11: goto L_0x002b;
                case 12: goto L_0x0032;
                case 13: goto L_0x003a;
                case 14: goto L_0x0042;
                case 15: goto L_0x017e;
                case 16: goto L_0x02a5;
                case 17: goto L_0x02b1;
                case 18: goto L_0x02b1;
                case 19: goto L_0x004a;
                case 20: goto L_0x01d7;
                case 21: goto L_0x01c7;
                case 22: goto L_0x004f;
                case 23: goto L_0x0052;
                case 24: goto L_0x02c6;
                case 25: goto L_0x02a5;
                case 26: goto L_0x0057;
                case 27: goto L_0x005f;
                case 28: goto L_0x0067;
                case 29: goto L_0x006f;
                case 30: goto L_0x02a5;
                case 31: goto L_0x02a5;
                case 32: goto L_0x0176;
                case 33: goto L_0x0077;
                case 34: goto L_0x007c;
                case 35: goto L_0x00fe;
                case 36: goto L_0x01af;
                case 37: goto L_0x009a;
                case 38: goto L_0x0176;
                case 39: goto L_0x0176;
                case 40: goto L_0x0176;
                case 41: goto L_0x0176;
                case 42: goto L_0x0176;
                case 43: goto L_0x0176;
                case 44: goto L_0x0176;
                case 45: goto L_0x0176;
                case 46: goto L_0x0176;
                case 47: goto L_0x0176;
                case 48: goto L_0x0176;
                case 49: goto L_0x0176;
                case 50: goto L_0x0176;
                case 51: goto L_0x0176;
                case 52: goto L_0x0176;
                case 53: goto L_0x0176;
                case 54: goto L_0x0176;
                case 55: goto L_0x0176;
                case 56: goto L_0x0176;
                case 57: goto L_0x017e;
                case 58: goto L_0x0084;
                case 59: goto L_0x0088;
                case 60: goto L_0x0090;
                case 61: goto L_0x0095;
                case 62: goto L_0x010e;
                case 63: goto L_0x009a;
                case 64: goto L_0x00a2;
                case 65: goto L_0x00a7;
                case 66: goto L_0x02c6;
                case 67: goto L_0x00ac;
                case 68: goto L_0x00b0;
                case 69: goto L_0x00b8;
                case 70: goto L_0x00c0;
                case 71: goto L_0x00c8;
                case 72: goto L_0x00d0;
                case 73: goto L_0x0116;
                case 74: goto L_0x0176;
                case 75: goto L_0x00ee;
                case 76: goto L_0x00d8;
                case 77: goto L_0x00db;
                case 78: goto L_0x02a5;
                case 79: goto L_0x0176;
                case 80: goto L_0x00e1;
                case 81: goto L_0x00fe;
                case 82: goto L_0x0148;
                case 83: goto L_0x00e6;
                case 84: goto L_0x0176;
                case 85: goto L_0x00ee;
                case 86: goto L_0x00f3;
                case 87: goto L_0x00f7;
                case 88: goto L_0x00fe;
                case 89: goto L_0x0106;
                case 90: goto L_0x010a;
                case 91: goto L_0x010e;
                case 92: goto L_0x0116;
                case 93: goto L_0x011e;
                case 94: goto L_0x011e;
                case 95: goto L_0x0124;
                case 96: goto L_0x01a7;
                case 97: goto L_0x01af;
                case 98: goto L_0x012c;
                case 99: goto L_0x012c;
                case 100: goto L_0x0130;
                case 101: goto L_0x02a5;
                case 102: goto L_0x0138;
                case 103: goto L_0x0140;
                case 104: goto L_0x02c6;
                case 105: goto L_0x02c6;
                case 106: goto L_0x0171;
                case 107: goto L_0x0176;
                case 108: goto L_0x02c6;
                case 109: goto L_0x0171;
                case 110: goto L_0x017e;
                case 111: goto L_0x02a5;
                case 112: goto L_0x02a5;
                case 113: goto L_0x0148;
                case 114: goto L_0x0150;
                case 115: goto L_0x017e;
                case 116: goto L_0x0171;
                case 117: goto L_0x02c6;
                case 118: goto L_0x0155;
                case 119: goto L_0x017e;
                case 120: goto L_0x0171;
                case 121: goto L_0x02c6;
                case 122: goto L_0x015d;
                case 123: goto L_0x0162;
                case 124: goto L_0x02a5;
                case 125: goto L_0x02b1;
                case 126: goto L_0x016a;
                case 127: goto L_0x0176;
                case 128: goto L_0x0176;
                case 129: goto L_0x0171;
                case 130: goto L_0x017e;
                case 131: goto L_0x02c6;
                case 132: goto L_0x0176;
                case 133: goto L_0x01d7;
                case 134: goto L_0x017e;
                case 135: goto L_0x02c6;
                case 136: goto L_0x01d7;
                case 137: goto L_0x0183;
                case 138: goto L_0x01d7;
                case 139: goto L_0x018b;
                case 140: goto L_0x018b;
                case 141: goto L_0x018f;
                case 142: goto L_0x0197;
                case 143: goto L_0x02b1;
                case 144: goto L_0x019f;
                case 145: goto L_0x02b1;
                case 146: goto L_0x019f;
                case 147: goto L_0x01a7;
                case 148: goto L_0x01af;
                case 149: goto L_0x01b3;
                case 150: goto L_0x01b7;
                case 151: goto L_0x02a5;
                case 152: goto L_0x02b1;
                case 153: goto L_0x02b1;
                case 154: goto L_0x01bf;
                case 155: goto L_0x01bf;
                case 156: goto L_0x01c7;
                case 157: goto L_0x01cf;
                case 158: goto L_0x01d7;
                case 159: goto L_0x01df;
                case 160: goto L_0x01e7;
                case 161: goto L_0x01ef;
                case 162: goto L_0x01f7;
                case 163: goto L_0x02a5;
                case 164: goto L_0x01ff;
                case 165: goto L_0x0207;
                case 166: goto L_0x020f;
                case 167: goto L_0x0216;
                case 168: goto L_0x021e;
                case 169: goto L_0x0225;
                case 170: goto L_0x022d;
                case 171: goto L_0x0269;
                case 172: goto L_0x0235;
                case 173: goto L_0x023d;
                case 174: goto L_0x0245;
                case 175: goto L_0x024c;
                case 176: goto L_0x0254;
                case 177: goto L_0x025c;
                case 178: goto L_0x0263;
                case 179: goto L_0x0270;
                case 180: goto L_0x0277;
                case 181: goto L_0x027e;
                case 182: goto L_0x0285;
                case 183: goto L_0x028c;
                case 184: goto L_0x0293;
                case 185: goto L_0x0269;
                case 186: goto L_0x0270;
                case 187: goto L_0x0277;
                case 188: goto L_0x027e;
                case 189: goto L_0x0285;
                case 190: goto L_0x028c;
                case 191: goto L_0x0293;
                case 192: goto L_0x02b8;
                case 193: goto L_0x02b8;
                case 194: goto L_0x029a;
                case 195: goto L_0x02c6;
                case 196: goto L_0x029e;
                case 197: goto L_0x02a5;
                case 198: goto L_0x02a5;
                case 199: goto L_0x02aa;
                case 200: goto L_0x02b1;
                case 201: goto L_0x02b8;
                case 202: goto L_0x02bf;
                case 203: goto L_0x02c6;
                case 204: goto L_0x02c6;
                case 205: goto L_0x02c9;
                case 206: goto L_0x02d0;
                case 207: goto L_0x02d6;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x000c:
            r2 = 2132552499(0x7f1c2b33, float:2.0758387E38)
            goto L_0x01ba
        L_0x0011:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x02dc
        L_0x0017:
            r2 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x02bb
        L_0x001c:
            r2 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x02c2
        L_0x0021:
            r2 = -1
            goto L_0x02c2
        L_0x0024:
            r2 = -3155(0xfffffffffffff3ad, float:NaN)
            r1 = 2142198272(0x7faf5a00, float:NaN)
            goto L_0x02dc
        L_0x002b:
            r2 = -20041(0xffffffffffffb1b7, float:NaN)
            r1 = 2141850142(0x7faa0a1e, float:NaN)
            goto L_0x02dc
        L_0x0032:
            r2 = -5253121(0xffffffffffafd7ff, float:NaN)
            r1 = 2130725817(0x7f004bb9, float:1.7053436E38)
            goto L_0x02dc
        L_0x003a:
            r2 = -1643537(0xffffffffffe6ebef, float:NaN)
            r1 = -13943482(0xffffffffff2b3d46, float:-2.2761614E38)
            goto L_0x02dc
        L_0x0042:
            r2 = -4590166(0xffffffffffb9f5aa, float:NaN)
            r1 = 2130738462(0x7f007d1e, float:1.7079083E38)
            goto L_0x02dc
        L_0x004a:
            r2 = -9996150(0xffffffffff67788a, float:-3.0767754E38)
            goto L_0x01a2
        L_0x004f:
            r2 = -1
            goto L_0x02bb
        L_0x0052:
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            goto L_0x01da
        L_0x0057:
            r2 = -3545601(0xffffffffffc9e5ff, float:NaN)
            r1 = -16694347(0xffffffffff0143b5, float:-1.7182197E38)
            goto L_0x02dc
        L_0x005f:
            r2 = -5900656(0xffffffffffa5f690, float:NaN)
            r1 = -15967964(0xffffffffff0c5924, float:-1.8655476E38)
            goto L_0x02dc
        L_0x0067:
            r2 = -2105345(0xffffffffffdfdfff, float:NaN)
            r1 = -10811176(0xffffffffff5b08d8, float:-2.9114685E38)
            goto L_0x02dc
        L_0x006f:
            r2 = -6033178(0xffffffffffa3f0e6, float:NaN)
            r1 = -16231074(0xffffffffff08555e, float:-1.8121826E38)
            goto L_0x02dc
        L_0x0077:
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            goto L_0x01ca
        L_0x007c:
            r2 = 422856788(0x19344854, float:9.3203884E-24)
            r1 = 1712265502(0x660f191e, float:1.6894043E23)
            goto L_0x02dc
        L_0x0084:
            r2 = -3419431(0xffffffffffcbd2d9, float:NaN)
            goto L_0x009d
        L_0x0088:
            r2 = 1058810675(0x3f1c2b33, float:0.61003417)
            r1 = 654311423(0x26ffffff, float:1.7763567E-15)
            goto L_0x02dc
        L_0x0090:
            r2 = -2169879(0xffffffffffdee3e9, float:NaN)
            goto L_0x02bb
        L_0x0095:
            r2 = 859064404(0x33344854, float:4.1975298E-8)
            goto L_0x0127
        L_0x009a:
            r2 = -2169879(0xffffffffffdee3e9, float:NaN)
        L_0x009d:
            r1 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x02dc
        L_0x00a2:
            r2 = -15173646(0xffffffffff1877f2, float:-2.0266545E38)
            goto L_0x02c7
        L_0x00a7:
            r2 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            goto L_0x02a1
        L_0x00ac:
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            goto L_0x0101
        L_0x00b0:
            r2 = 872415231(0x33ffffff, float:1.1920928E-7)
            r1 = 352321535(0x14ffffff, float:2.5849393E-26)
            goto L_0x02dc
        L_0x00b8:
            r2 = 654311423(0x26ffffff, float:1.7763567E-15)
            r1 = 268435455(0xfffffff, float:2.5243547E-29)
            goto L_0x02dc
        L_0x00c0:
            r2 = 436207615(0x19ffffff, float:2.6469778E-23)
            r1 = 184549375(0xaffffff, float:2.4651902E-32)
            goto L_0x02dc
        L_0x00c8:
            r2 = 218103807(0xcffffff, float:3.9443043E-31)
            r1 = 100663295(0x5ffffff, float:2.4074123E-35)
            goto L_0x02dc
        L_0x00d0:
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r1 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x02dc
        L_0x00d8:
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x0101
        L_0x00db:
            r2 = 419430400(0x19000000, float:6.617445E-24)
            r1 = 419430400(0x19000000, float:6.617445E-24)
            goto L_0x02dc
        L_0x00e1:
            r2 = -9996150(0xffffffffff67788a, float:-3.0767754E38)
            goto L_0x02ad
        L_0x00e6:
            r2 = -16089857(0xffffffffff0a7cff, float:-1.8408248E38)
            r1 = -16089857(0xffffffffff0a7cff, float:-1.8408248E38)
            goto L_0x02dc
        L_0x00ee:
            r2 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x02a1
        L_0x00f3:
            r2 = -3667416(0xffffffffffc80a28, float:NaN)
            goto L_0x0111
        L_0x00f7:
            r2 = -10535(0xffffffffffffd6d9, float:NaN)
            r1 = 1727029097(0x66f05f69, float:5.6756398E23)
            goto L_0x02dc
        L_0x00fe:
            r2 = 421276467(0x191c2b33, float:8.073735E-24)
        L_0x0101:
            r1 = 436207615(0x19ffffff, float:2.6469778E-23)
            goto L_0x02dc
        L_0x0106:
            r2 = 639380275(0x261c2b33, float:5.418192E-16)
            goto L_0x0165
        L_0x010a:
            r2 = 1291845631(0x4cffffff, float:1.3421772E8)
            goto L_0x014b
        L_0x010e:
            r2 = -2345156(0xffffffffffdc373c, float:NaN)
        L_0x0111:
            r1 = -1024151(0xfffffffffff05f69, float:NaN)
            goto L_0x02dc
        L_0x0116:
            r2 = 1929379839(0x72ffffff, float:1.0141204E31)
            r1 = 1914448691(0x721c2b33, float:3.0932407E30)
            goto L_0x02dc
        L_0x011e:
            r2 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r1 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            goto L_0x02dc
        L_0x0124:
            r2 = 204752980(0xc344854, float:1.3888461E-31)
        L_0x0127:
            r1 = -1727063778(0xffffffff990f191e, float:-7.397999E-24)
            goto L_0x02dc
        L_0x012c:
            r2 = 2132552499(0x7f1c2b33, float:2.0758387E38)
            goto L_0x014b
        L_0x0130:
            r2 = 1929379839(0x72ffffff, float:1.0141204E31)
            r1 = 1929379839(0x72ffffff, float:1.0141204E31)
            goto L_0x02dc
        L_0x0138:
            r2 = -16745186(0xffffffffff007d1e, float:-1.7079083E38)
            r1 = -14101966(0xffffffffff28d232, float:-2.244017E38)
            goto L_0x02dc
        L_0x0140:
            r2 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r1 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            goto L_0x02dc
        L_0x0148:
            r2 = 1276914483(0x4c1c2b33, float:4.09387E7)
        L_0x014b:
            r1 = 1291845631(0x4cffffff, float:1.3421772E8)
            goto L_0x02dc
        L_0x0150:
            r2 = -1509949441(0xffffffffa5ffffff, float:-4.4408918E-16)
            goto L_0x02a6
        L_0x0155:
            r2 = 204752980(0xc344854, float:1.3888461E-31)
            r1 = 856627486(0x330f191e, float:3.3317626E-8)
            goto L_0x02dc
        L_0x015d:
            r2 = -1
            r1 = 855638016(0x33000000, float:2.9802322E-8)
            goto L_0x02dc
        L_0x0162:
            r2 = 872415231(0x33ffffff, float:1.1920928E-7)
        L_0x0165:
            r1 = 872415231(0x33ffffff, float:1.1920928E-7)
            goto L_0x02dc
        L_0x016a:
            r2 = 167772160(0xa000000, float:6.162976E-33)
            r1 = 822083583(0x30ffffff, float:1.862645E-9)
            goto L_0x02dc
        L_0x0171:
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            goto L_0x02a6
        L_0x0176:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x02dc
        L_0x017e:
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            goto L_0x02c7
        L_0x0183:
            r2 = 2144064217(0x7fcbd2d9, float:NaN)
            r1 = 2135317097(0x7f465a69, float:2.6365658E38)
            goto L_0x02dc
        L_0x018b:
            r2 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            goto L_0x01ca
        L_0x018f:
            r2 = -1291845633(0xffffffffb2ffffff, float:-2.980232E-8)
            r1 = -1291845633(0xffffffffb2ffffff, float:-2.980232E-8)
            goto L_0x02dc
        L_0x0197:
            r2 = 1913262871(0x720a1317, float:2.7348486E30)
            r1 = 1913262871(0x720a1317, float:2.7348486E30)
            goto L_0x02dc
        L_0x019f:
            r2 = -5786689(0xffffffffffa7b3bf, float:NaN)
        L_0x01a2:
            r1 = -8022620(0xffffffffff8595a4, float:NaN)
            goto L_0x02dc
        L_0x01a7:
            r2 = -8022620(0xffffffffff8595a4, float:NaN)
            r1 = -9996150(0xffffffffff67788a, float:-3.0767754E38)
            goto L_0x02dc
        L_0x01af:
            r2 = -2169879(0xffffffffffdee3e9, float:NaN)
            goto L_0x01da
        L_0x01b3:
            r2 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            goto L_0x01ca
        L_0x01b7:
            r2 = 1714702420(0x66344854, float:2.1284005E23)
        L_0x01ba:
            r1 = 1724633817(0x66cbd2d9, float:4.8126492E23)
            goto L_0x02dc
        L_0x01bf:
            r2 = 1711301856(0x660064e0, float:1.5158093E23)
            r1 = 1715971578(0x6647a5fa, float:2.3570316E23)
            goto L_0x02dc
        L_0x01c7:
            r2 = -3419431(0xffffffffffcbd2d9, float:NaN)
        L_0x01ca:
            r1 = -3419431(0xffffffffffcbd2d9, float:NaN)
            goto L_0x02dc
        L_0x01cf:
            r2 = -1380880(0xffffffffffeaedf0, float:NaN)
            r1 = -9404535(0xffffffffff707f89, float:-3.1967692E38)
            goto L_0x02dc
        L_0x01d7:
            r2 = -3419431(0xffffffffffcbd2d9, float:NaN)
        L_0x01da:
            r1 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            goto L_0x02dc
        L_0x01df:
            r2 = -920329(0xfffffffffff1f4f7, float:NaN)
            r1 = -10258294(0xffffffffff63788a, float:-3.0236063E38)
            goto L_0x02dc
        L_0x01e7:
            r2 = -394244(0xfffffffffff9fbfc, float:NaN)
            r1 = -12100758(0xffffffffff475b6a, float:-2.6499102E38)
            goto L_0x02dc
        L_0x01ef:
            r2 = -1380880(0xffffffffffeaedf0, float:NaN)
            r1 = -12890276(0xffffffffff3b4f5c, float:-2.489777E38)
            goto L_0x02dc
        L_0x01f7:
            r2 = -16752224(0xffffffffff0061a0, float:-1.7064808E38)
            r1 = -8209946(0xffffffffff82b9e6, float:NaN)
            goto L_0x02dc
        L_0x01ff:
            r2 = -1247745(0xffffffffffecf5ff, float:NaN)
            r1 = -16775100(0xffffffffff000844, float:-1.701841E38)
            goto L_0x02dc
        L_0x0207:
            r2 = -2294570(0xffffffffffdcfcd6, float:NaN)
            r1 = -16771576(0xffffffffff001608, float:-1.7025558E38)
            goto L_0x02dc
        L_0x020f:
            r2 = -3356(0xfffffffffffff2e4, float:NaN)
            r1 = -14219519(0xffffffffff270701, float:-2.2201744E38)
            goto L_0x02dc
        L_0x0216:
            r2 = -723969(0xfffffffffff4f3ff, float:NaN)
            r1 = -15203778(0xffffffffff18023e, float:-2.020543E38)
            goto L_0x02dc
        L_0x021e:
            r2 = -3850(0xfffffffffffff0f6, float:NaN)
            r1 = -13893364(0xffffffffff2c010c, float:-2.2863265E38)
            goto L_0x02dc
        L_0x0225:
            r2 = -2622216(0xffffffffffd7fcf8, float:NaN)
            r1 = -16706532(0xffffffffff01141c, float:-1.7157483E38)
            goto L_0x02dc
        L_0x022d:
            r2 = -133446(0xfffffffffffdf6ba, float:NaN)
            r1 = -14546174(0xffffffffff220b02, float:-2.153921E38)
            goto L_0x02dc
        L_0x0235:
            r2 = -3545601(0xffffffffffc9e5ff, float:NaN)
            r1 = -16769419(0xffffffffff001e75, float:-1.7029933E38)
            goto L_0x02dc
        L_0x023d:
            r2 = -5900656(0xffffffffffa5f690, float:NaN)
            r1 = -16437224(0xffffffffff053018, float:-1.7703704E38)
            goto L_0x02dc
        L_0x0245:
            r2 = -9287(0xffffffffffffdbb9, float:NaN)
            r1 = -11659768(0xffffffffff4e1608, float:-2.7393536E38)
            goto L_0x02dc
        L_0x024c:
            r2 = -2105345(0xffffffffffdfdfff, float:NaN)
            r1 = -13564293(0xffffffffff31067b, float:-2.35307E38)
            goto L_0x02dc
        L_0x0254:
            r2 = -206363(0xfffffffffffcd9e5, float:NaN)
            r1 = -11009506(0xffffffffff58021e, float:-2.8712424E38)
            goto L_0x02dc
        L_0x025c:
            r2 = -6033178(0xffffffffffa3f0e6, float:NaN)
            r1 = -16372424(0xffffffffff062d38, float:-1.7835134E38)
            goto L_0x02dc
        L_0x0263:
            r2 = -7862(0xffffffffffffe14a, float:NaN)
            r1 = -12247549(0xffffffffff451e03, float:-2.6201374E38)
            goto L_0x02dc
        L_0x0269:
            r2 = -16492597(0xffffffffff0457cb, float:-1.7591394E38)
            r1 = -16743685(0xffffffffff0082fb, float:-1.7082127E38)
            goto L_0x02dc
        L_0x0270:
            r2 = -16290519(0xffffffffff076d29, float:-1.8001257E38)
            r1 = -16017121(0xffffffffff0b991f, float:-1.8555774E38)
            goto L_0x02dc
        L_0x0277:
            r2 = -6209788(0xffffffffffa13f04, float:NaN)
            r1 = -2727680(0xffffffffffd66100, float:NaN)
            goto L_0x02dc
        L_0x027e:
            r2 = -9756931(0xffffffffff6b1efd, float:-3.1252948E38)
            r1 = -8033025(0xffffffffff856cff, float:NaN)
            goto L_0x02dc
        L_0x0285:
            r2 = -4519868(0xffffffffffbb0844, float:NaN)
            r1 = -642200(0xfffffffffff63368, float:NaN)
            goto L_0x02dc
        L_0x028c:
            r2 = -15767441(0xffffffffff0f686f, float:-1.9062185E38)
            r1 = -15953261(0xffffffffff0c9293, float:-1.8685298E38)
            goto L_0x02dc
        L_0x0293:
            r2 = -7712767(0xffffffffff8a5001, float:NaN)
            r1 = -4950272(0xffffffffffb47700, float:NaN)
            goto L_0x02dc
        L_0x029a:
            r2 = -12081670(0xffffffffff47a5fa, float:-2.6537817E38)
            goto L_0x02b4
        L_0x029e:
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
        L_0x02a1:
            r1 = -2169879(0xffffffffffdee3e9, float:NaN)
            goto L_0x02dc
        L_0x02a5:
            r2 = -1
        L_0x02a6:
            r1 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            goto L_0x02dc
        L_0x02aa:
            r2 = -8022620(0xffffffffff8595a4, float:NaN)
        L_0x02ad:
            r1 = -5786689(0xffffffffffa7b3bf, float:NaN)
            goto L_0x02dc
        L_0x02b1:
            r2 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
        L_0x02b4:
            r1 = -12081670(0xffffffffff47a5fa, float:-2.6537817E38)
            goto L_0x02dc
        L_0x02b8:
            r2 = -14141117(0xffffffffff283943, float:-2.2360762E38)
        L_0x02bb:
            r1 = -14141117(0xffffffffff283943, float:-2.2360762E38)
            goto L_0x02dc
        L_0x02bf:
            r2 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
        L_0x02c2:
            r1 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
            goto L_0x02dc
        L_0x02c6:
            r2 = -1
        L_0x02c7:
            r1 = -1
            goto L_0x02dc
        L_0x02c9:
            r2 = 1728053247(0x66ffffff, float:6.0446287E23)
            r1 = 1728053247(0x66ffffff, float:6.0446287E23)
            goto L_0x02dc
        L_0x02d0:
            r2 = -5285376(0xffffffffffaf5a00, float:NaN)
            r1 = -9166(0xffffffffffffdc32, float:NaN)
            goto L_0x02dc
        L_0x02d6:
            r2 = -7543191(0xffffffffff8ce669, float:NaN)
            r1 = -7543191(0xffffffffff8ce669, float:NaN)
        L_0x02dc:
            X.D3N r0 = new X.D3N
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBZ.BFD(X.C0J):X.D3N");
    }
}
