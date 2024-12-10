package X;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Csc  reason: case insensitive filesystem */
public class C26114Csc {
    public static final AtomicInteger A05 = new AtomicInteger(Integer.MIN_VALUE);
    public final Camera.Parameters A00;
    public final Camera A01;
    public final C22906BUr A02;
    public final int A03;
    public final C22903BUo A04;

    public static String A00(int i) {
        if (i == 0) {
            return "auto";
        }
        switch (i) {
            case 2:
                return "action";
            case 3:
                return "portrait";
            case 4:
                return "landscape";
            case 5:
                return "night";
            case 6:
                return "night-portrait";
            case 7:
                return "theatre";
            case 8:
                return "beach";
            case 9:
                return "snow";
            case 10:
                return "sunset";
            case 11:
                return "steadyphoto";
            case 12:
                return "fireworks";
            case 13:
                return "sports";
            case 14:
                return "party";
            case 15:
                return "candlelight";
            case 16:
                return "barcode";
            case 17:
                Rect rect = C26170Ctm.A00;
                return "hdr";
            default:
                return null;
        }
    }

    public boolean A02(CKJ ckj, Object obj) {
        C26132Csv csv;
        C22906BUr bUr;
        CKJ ckj2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        int i2 = ckj.A00;
        if (i2 != 2) {
            if (i2 == 3) {
                C28111Yx.A02(obj);
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (BE9.A1T(C25632CjI.A0a, this.A04) && !C25870Cne.A02(C26099CsJ.A06)) {
                    this.A00.setVideoStabilization(booleanValue);
                    bUr = this.A02;
                    ckj2 = C25971Cpe.A0Z;
                    csv = bool;
                }
                return false;
            } else if (i2 == 27) {
                C28111Yx.A02(obj);
                Number number = (Number) obj;
                this.A00.setGpsTimestamp(number.longValue());
                bUr = this.A02;
                ckj2 = C25971Cpe.A0I;
                csv = number;
            } else if (i2 == 42) {
                String str6 = (String) obj;
                this.A00.setGpsProcessingMethod(str6);
                this.A02.A06(C25971Cpe.A0H, str6);
                return true;
            } else if (i2 != 45) {
                if (i2 == 52) {
                    if (BE9.A1T(C25632CjI.A0F, this.A04)) {
                        C22906BUr bUr2 = this.A02;
                        CKJ ckj3 = C25971Cpe.A0l;
                        C28111Yx.A02((Object) null);
                        bUr2.A06(ckj3, (Object) null);
                        throw AnonymousClass000.A0s("getCaptureRequestKeys");
                    }
                } else if (i2 == 57) {
                    C28111Yx.A02(obj);
                    if (this.A03 == 1) {
                        if (BE9.A1T(C25632CjI.A0I, this.A04)) {
                            bUr = this.A02;
                            ckj2 = C25971Cpe.A0V;
                            csv = obj;
                        }
                    }
                } else if (i2 != 59) {
                    switch (i2) {
                        case 8:
                            C28111Yx.A02(obj);
                            Boolean bool2 = (Boolean) obj;
                            boolean booleanValue2 = bool2.booleanValue();
                            if (!C25870Cne.A02(C26099CsJ.A05)) {
                                this.A00.setRecordingHint(booleanValue2);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A0r;
                                csv = bool2;
                                break;
                            }
                            break;
                        case 9:
                            C28111Yx.A02(obj);
                            Number number2 = (Number) obj;
                            switch (number2.intValue()) {
                                case 0:
                                    str = "fixed";
                                    break;
                                case 1:
                                    str = "auto";
                                    break;
                                case 2:
                                    str = "macro";
                                    break;
                                case 3:
                                    str = "continuous-video";
                                    break;
                                case 4:
                                    str = "continuous-picture";
                                    break;
                                case 5:
                                    str = "edof";
                                    break;
                                case 6:
                                    str = "infinity";
                                    break;
                            }
                            if (A01(C25632CjI.A0s, this.A04, number2)) {
                                this.A00.setFocusMode(str);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A0D;
                                csv = number2;
                                break;
                            }
                            break;
                        case 10:
                            C28111Yx.A02(obj);
                            Number number3 = (Number) obj;
                            int intValue = number3.intValue();
                            if (intValue == 0) {
                                str2 = "off";
                            } else if (intValue == 1) {
                                str2 = "on";
                            } else if (intValue == 2) {
                                str2 = "auto";
                            } else if (intValue == 3) {
                                str2 = "torch";
                            } else if (intValue == 4) {
                                str2 = "red-eye";
                            }
                            if (A01(C25632CjI.A0r, this.A04, number3)) {
                                this.A00.setFlashMode(str2);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A0B;
                                csv = number3;
                                break;
                            }
                            break;
                        case 11:
                            C28111Yx.A02(obj);
                            Number number4 = (Number) obj;
                            int intValue2 = number4.intValue();
                            if (intValue2 == 0) {
                                str3 = "off";
                            } else if (intValue2 == 1) {
                                str3 = "50hz";
                            } else if (intValue2 == 2) {
                                str3 = "60hz";
                            } else if (intValue2 == 3) {
                                str3 = "auto";
                            }
                            if (A01(C25632CjI.A0m, this.A04, number4)) {
                                this.A00.setAntibanding(str3);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A00;
                                csv = number4;
                                break;
                            }
                            break;
                        case 12:
                            C28111Yx.A02(obj);
                            Number number5 = (Number) obj;
                            switch (number5.intValue()) {
                                case 0:
                                    str4 = "none";
                                    break;
                                case 1:
                                    str4 = "mono";
                                    break;
                                case 2:
                                    str4 = "negative";
                                    break;
                                case 3:
                                    str4 = "solarize";
                                    break;
                                case 4:
                                    str4 = "sepia";
                                    break;
                                case 5:
                                    str4 = "posterize";
                                    break;
                                case 6:
                                    str4 = "whiteboard";
                                    break;
                                case 7:
                                    str4 = "blackboard";
                                    break;
                                case 8:
                                    str4 = "aqua";
                                    break;
                                default:
                                    return false;
                            }
                            if (A01(C25632CjI.A0o, this.A04, number5)) {
                                this.A00.setColorEffect(str4);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A07;
                                csv = number5;
                                break;
                            }
                            break;
                        case 13:
                            C28111Yx.A02(obj);
                            Number number6 = (Number) obj;
                            int intValue3 = number6.intValue();
                            if (BE9.A1T(C25632CjI.A0G, this.A04)) {
                                this.A00.setExposureCompensation(intValue3);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A09;
                                csv = number6;
                                break;
                            }
                            break;
                        case 14:
                            C28111Yx.A02(obj);
                            Number number7 = (Number) obj;
                            int intValue4 = number7.intValue();
                            if (intValue4 > 0 && intValue4 <= 100) {
                                this.A00.setJpegQuality(intValue4);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A0a;
                                csv = number7;
                                break;
                            }
                        case 15:
                            C28111Yx.A02(obj);
                            Number number8 = (Number) obj;
                            int intValue5 = number8.intValue();
                            if (intValue5 > 0 && intValue5 <= 100) {
                                this.A00.setJpegThumbnailQuality(intValue5);
                                bUr = this.A02;
                                ckj2 = C25971Cpe.A0b;
                                csv = number8;
                                break;
                            }
                        default:
                            switch (i2) {
                                case 17:
                                    C28111Yx.A02(obj);
                                    Number number9 = (Number) obj;
                                    int intValue6 = number9.intValue();
                                    if (A01(C25632CjI.A0u, this.A04, number9)) {
                                        this.A00.setPictureFormat(intValue6);
                                        bUr = this.A02;
                                        ckj2 = C25971Cpe.A0i;
                                        csv = number9;
                                        break;
                                    }
                                    break;
                                case 18:
                                    C28111Yx.A02(obj);
                                    Number number10 = (Number) obj;
                                    int intValue7 = number10.intValue();
                                    if (A01(C25632CjI.A0w, this.A04, number10)) {
                                        this.A00.setPreviewFormat(intValue7);
                                        bUr = this.A02;
                                        ckj2 = C25971Cpe.A0m;
                                        csv = number10;
                                        break;
                                    }
                                    break;
                                case 19:
                                    C28111Yx.A02(obj);
                                    Number number11 = (Number) obj;
                                    int intValue8 = number11.intValue();
                                    if (A01(C25632CjI.A0y, this.A04, number11)) {
                                        this.A00.setPreviewFrameRate(intValue8);
                                        bUr = this.A02;
                                        ckj2 = C25971Cpe.A0o;
                                        csv = number11;
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case 21:
                                            C28111Yx.A02(obj);
                                            Number number12 = (Number) obj;
                                            int intValue9 = number12.intValue();
                                            Camera.Parameters parameters = this.A00;
                                            parameters.setRotation(intValue9);
                                            C22906BUr bUr3 = this.A02;
                                            bUr3.A06(C25971Cpe.A0g, number12);
                                            if (BEA.A1X(C25971Cpe.A0V, bUr3)) {
                                                if (BE9.A1T(C25632CjI.A0I, this.A04)) {
                                                    if (intValue9 == 90 || intValue9 == 270) {
                                                        parameters.set("snapshot-picture-flip", "flip-v");
                                                        return true;
                                                    }
                                                    parameters.set("snapshot-picture-flip", "flip-h");
                                                    return true;
                                                }
                                            }
                                            break;
                                        case 22:
                                            C28111Yx.A02(obj);
                                            Number number13 = (Number) obj;
                                            int intValue10 = number13.intValue();
                                            CSR csr = this.A04.A00;
                                            if (csr != null) {
                                                this.A00.set(csr.A03, (String) csr.A01.get(intValue10));
                                                bUr = this.A02;
                                                ckj2 = C25971Cpe.A0L;
                                                csv = number13;
                                                break;
                                            }
                                            break;
                                        case 23:
                                            C28111Yx.A02(obj);
                                            Number number14 = (Number) obj;
                                            String A002 = A00(number14.intValue());
                                            if (A002 != null) {
                                                if (A01(C25632CjI.A12, this.A04, number14)) {
                                                    this.A00.setSceneMode(A002);
                                                    bUr = this.A02;
                                                    ckj2 = C25971Cpe.A0s;
                                                    csv = number14;
                                                    break;
                                                }
                                            }
                                            break;
                                        case 24:
                                            C28111Yx.A02(obj);
                                            Number number15 = (Number) obj;
                                            switch (number15.intValue()) {
                                                case 1:
                                                    str5 = "auto";
                                                    break;
                                                case 2:
                                                    str5 = "incandescent";
                                                    break;
                                                case 3:
                                                    str5 = "fluorescent";
                                                    break;
                                                case 4:
                                                    str5 = "warm-fluorescent";
                                                    break;
                                                case 5:
                                                    str5 = "daylight";
                                                    break;
                                                case 6:
                                                    str5 = "cloudy-daylight";
                                                    break;
                                                case 7:
                                                    str5 = "twilight";
                                                    break;
                                                case 8:
                                                    str5 = "shade";
                                                    break;
                                                default:
                                                    return false;
                                            }
                                            if (A01(C25632CjI.A16, this.A04, number15)) {
                                                this.A00.setWhiteBalance(str5);
                                                bUr = this.A02;
                                                ckj2 = C25971Cpe.A0z;
                                                csv = number15;
                                                break;
                                            }
                                            break;
                                        case 25:
                                            C28111Yx.A02(obj);
                                            Number number16 = (Number) obj;
                                            int intValue11 = number16.intValue();
                                            if (BE9.A1T(C25632CjI.A0e, this.A04)) {
                                                this.A00.setZoom(intValue11);
                                                bUr = this.A02;
                                                ckj2 = C25971Cpe.A11;
                                                csv = number16;
                                                break;
                                            }
                                            break;
                                        default:
                                            List list = null;
                                            switch (i2) {
                                                case 30:
                                                    C28111Yx.A02(obj);
                                                    Number number17 = (Number) obj;
                                                    this.A00.setGpsAltitude(number17.doubleValue());
                                                    bUr = this.A02;
                                                    ckj2 = C25971Cpe.A0E;
                                                    csv = number17;
                                                    break;
                                                case 31:
                                                    C28111Yx.A02(obj);
                                                    Number number18 = (Number) obj;
                                                    this.A00.setGpsLongitude(number18.doubleValue());
                                                    bUr = this.A02;
                                                    ckj2 = C25971Cpe.A0G;
                                                    csv = number18;
                                                    break;
                                                case 32:
                                                    C28111Yx.A02(obj);
                                                    Number number19 = (Number) obj;
                                                    this.A00.setGpsLatitude(number19.doubleValue());
                                                    bUr = this.A02;
                                                    ckj2 = C25971Cpe.A0F;
                                                    csv = number19;
                                                    break;
                                                case 33:
                                                    C26132Csv csv2 = (C26132Csv) obj;
                                                    if (A01(C25632CjI.A0z, this.A04, csv2)) {
                                                        Camera.Parameters parameters2 = this.A00;
                                                        C28111Yx.A02(csv2);
                                                        parameters2.setPreviewSize(csv2.A02, csv2.A01);
                                                        this.A02.A06(C25971Cpe.A0q, csv2);
                                                        return true;
                                                    }
                                                    break;
                                                case 34:
                                                    C26132Csv csv3 = (C26132Csv) obj;
                                                    if (A01(C25632CjI.A0v, this.A04, csv3)) {
                                                        Camera.Parameters parameters3 = this.A00;
                                                        C28111Yx.A02(csv3);
                                                        parameters3.setPictureSize(csv3.A02, csv3.A01);
                                                        this.A02.A06(C25971Cpe.A0k, csv3);
                                                        return true;
                                                    }
                                                    break;
                                                case 35:
                                                    if (BE9.A1T(C25632CjI.A0F, this.A04)) {
                                                        Camera.Parameters parameters4 = this.A00;
                                                        C28111Yx.A02(obj);
                                                        parameters4.set("video-size", obj.toString());
                                                    }
                                                    this.A02.A06(C25971Cpe.A0y, obj);
                                                    return true;
                                                case 36:
                                                    C28111Yx.A02(obj);
                                                    C26132Csv csv4 = (C26132Csv) obj;
                                                    this.A00.setJpegThumbnailSize(csv4.A02, csv4.A01);
                                                    bUr = this.A02;
                                                    ckj2 = C25971Cpe.A0c;
                                                    csv = csv4;
                                                    break;
                                                case 37:
                                                    List list2 = (List) obj;
                                                    C22903BUo bUo = this.A04;
                                                    if (BE9.A1T(C25632CjI.A0U, bUo)) {
                                                        C28111Yx.A02(list2);
                                                        if (list2.size() <= BE9.A0B(C25632CjI.A0g, bUo)) {
                                                            Camera.Parameters parameters5 = this.A00;
                                                            if (!list2.isEmpty()) {
                                                                list = list2;
                                                            }
                                                            parameters5.setFocusAreas(list);
                                                            this.A02.A06(C25971Cpe.A0C, list2);
                                                            return true;
                                                        }
                                                    }
                                                    break;
                                                case 38:
                                                    List list3 = (List) obj;
                                                    C22903BUo bUo2 = this.A04;
                                                    if (BE9.A1T(C25632CjI.A0V, bUo2)) {
                                                        C28111Yx.A02(list3);
                                                        if (list3.size() <= BE9.A0B(C25632CjI.A0h, bUo2)) {
                                                            Camera.Parameters parameters6 = this.A00;
                                                            if (!list3.isEmpty()) {
                                                                list = list3;
                                                            }
                                                            parameters6.setMeteringAreas(list);
                                                            this.A02.A06(C25971Cpe.A0f, list3);
                                                            return true;
                                                        }
                                                    }
                                                    break;
                                                case 39:
                                                    int[] iArr = (int[]) obj;
                                                    List<int[]> A11 = BE6.A11(C25632CjI.A0x, this.A04);
                                                    if (!(A11 == null || iArr == null)) {
                                                        for (int[] iArr2 : A11) {
                                                            int i3 = iArr2[0];
                                                            int i4 = iArr[0];
                                                            if (i3 == i4 && iArr2[1] == (i = iArr[1])) {
                                                                this.A00.setPreviewFpsRange(i4, i);
                                                                this.A02.A06(C25971Cpe.A0n, iArr);
                                                                return true;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    throw BEA.A0h("Invalid Settings key: ", AnonymousClass000.A10(), i2);
                                            }
                                    }
                            }
                    }
                } else {
                    C22906BUr bUr4 = this.A02;
                    if (BEA.A1X(C25971Cpe.A0V, bUr4)) {
                        if (BE9.A1T(C25632CjI.A0I, this.A04)) {
                            C28111Yx.A02(obj);
                            Number number20 = (Number) obj;
                            int intValue12 = number20.intValue();
                            bUr4.A06(C25971Cpe.A0x, number20);
                            if (intValue12 == 90 || intValue12 == 270) {
                                this.A00.set("video-flip", "flip-v");
                                return true;
                            }
                            this.A00.set("video-flip", "flip-h");
                        }
                    }
                }
                return false;
            } else {
                C28111Yx.A02(obj);
                bUr = this.A02;
                ckj2 = C25971Cpe.A0N;
                csv = obj;
            }
            bUr.A06(ckj2, csv);
            return true;
        }
        C28111Yx.A02(obj);
        boolean A1Y = AnonymousClass000.A1Y(obj);
        if (BE9.A1T(C25632CjI.A0K, this.A04)) {
            int i5 = 0;
            if (A1Y) {
                i5 = 17;
            }
            this.A00.setSceneMode(A00(i5));
            this.A02.A06(C25971Cpe.A0s, Integer.valueOf(i5));
            if (A1Y) {
                A02(C25971Cpe.A0r, false);
                return true;
            }
        }
        return false;
        return true;
    }

    public C26114Csc(Camera.Parameters parameters, Camera camera, C22903BUo bUo, C22906BUr bUr, int i) {
        this.A01 = camera;
        this.A00 = parameters;
        this.A04 = bUo;
        this.A02 = bUr;
        this.A03 = i;
    }

    public static boolean A01(CKI cki, C25632CjI cjI, Object obj) {
        List list = (List) cjI.A02(cki);
        if (list == null || obj == null || !list.contains(obj)) {
            return false;
        }
        return true;
    }
}
