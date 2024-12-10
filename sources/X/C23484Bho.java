package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.Bho  reason: case insensitive filesystem */
public abstract class C23484Bho extends DK6 {
    public static Map zzd = AnonymousClass8BR.A17();
    public C25840Cmu zzb = C25840Cmu.A05;
    public int zzc = -1;

    public static void A04(Object[] objArr) {
        objArr[0] = "zzc";
        objArr[1] = "zzd";
    }

    public static void A05(Object[] objArr) {
        objArr[0] = "zzc";
        objArr[1] = "zzd";
        objArr[2] = "zze";
        objArr[3] = "zzf";
    }

    public final /* synthetic */ C23484Bho CTl() {
        return (C23484Bho) A06(6);
    }

    public static final void A03(StringBuilder sb, int i, String str, Object obj) {
        String A00;
        if (obj instanceof List) {
            Iterator A13 = AnonymousClass8BR.A13(obj);
            while (A13.hasNext()) {
                A03(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                A03(sb, i, str, A15.next());
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                DSO dso = DSO.A00;
                A00 = CBI.A00(new C23452BhH(((String) obj).getBytes(C25462CgF.A00)));
            } else if (obj instanceof DSO) {
                sb.append(": \"");
                A00 = CBI.A00((DSO) obj);
            } else {
                if (obj instanceof C23484Bho) {
                    sb.append(" {");
                    A02((DK6) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A03(sb, i4, "key", entry.getKey());
                    A03(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    AnonymousClass8BS.A1D(obj, sb);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v15, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v22, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v29, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v36, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v43, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v50, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v57, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v64, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v71, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v78, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v85, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v92, types: [java.lang.Object, X.Cp6, X.E2C] */
    /* JADX WARNING: type inference failed for: r3v99, types: [java.lang.Object, X.Cp6, X.E2C] */
    public Object A06(int i) {
        ? cp6;
        ? cp62;
        ? cp63;
        ? cp64;
        ? cp65;
        ? cp66;
        ? cp67;
        ? cp68;
        ? cp69;
        ? cp610;
        ? cp611;
        ? cp612;
        ? cp613;
        ? cp614;
        ? cp615;
        if (this instanceof C23478Bhi) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23468BhX();
                case 3:
                    Object[] objArr = new Object[6];
                    A05(objArr);
                    objArr[4] = "zzg";
                    objArr[5] = "zzh";
                    return new DK5(C23478Bhi.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", objArr);
                case 4:
                    return C23478Bhi.zzi;
                case 5:
                    synchronized (C23478Bhi.class) {
                        C25943Cp9 cp9 = C25940Cp6.A01;
                        cp615 = new C25940Cp6(C23478Bhi.zzi);
                        C23478Bhi.zzj = cp615;
                    }
                    return cp615;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23476Bhg) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23467BhW();
                case 3:
                    Object[] objArr2 = new Object[5];
                    A05(objArr2);
                    objArr2[4] = "zzg";
                    return new DK5(C23476Bhg.zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", objArr2);
                case 4:
                    return C23476Bhg.zzh;
                case 5:
                    synchronized (C23476Bhg.class) {
                        C25943Cp9 cp92 = C25940Cp6.A01;
                        cp614 = new C25940Cp6(C23476Bhg.zzh);
                        C23476Bhg.zzi = cp614;
                    }
                    return cp614;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23473Bhd) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23466BhV();
                case 3:
                    Object[] A1a = AnonymousClass8BR.A1a();
                    A04(A1a);
                    A1a[2] = "zze";
                    return new DK5(C23473Bhd.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", A1a);
                case 4:
                    return C23473Bhd.zzf;
                case 5:
                    synchronized (C23473Bhd.class) {
                        C25943Cp9 cp93 = C25940Cp6.A01;
                        cp613 = new C25940Cp6(C23473Bhd.zzf);
                        C23473Bhd.zzg = cp613;
                    }
                    return cp613;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23472Bhc) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23465BhU();
                case 3:
                    Object[] A1a2 = AnonymousClass8BR.A1a();
                    A04(A1a2);
                    A1a2[2] = "zze";
                    return new DK5(C23472Bhc.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", A1a2);
                case 4:
                    return C23472Bhc.zzf;
                case 5:
                    synchronized (C23472Bhc.class) {
                        C25943Cp9 cp94 = C25940Cp6.A01;
                        cp612 = new C25940Cp6(C23472Bhc.zzf);
                        C23472Bhc.zzg = cp612;
                    }
                    return cp612;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23481Bhl) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23481Bhl();
                case 2:
                    return new C23464BhT();
                case 3:
                    Object[] objArr3 = new Object[7];
                    A05(objArr3);
                    objArr3[4] = "zzg";
                    objArr3[5] = "zzh";
                    objArr3[6] = "zzi";
                    return new DK5(C23481Bhl.zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", objArr3);
                case 4:
                    return C23481Bhl.zzj;
                case 5:
                    synchronized (C23481Bhl.class) {
                        C25943Cp9 cp95 = C25940Cp6.A01;
                        cp611 = new C25940Cp6(C23481Bhl.zzj);
                        C23481Bhl.zzk = cp611;
                    }
                    return cp611;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23477Bhh) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23463BhS();
                case 3:
                    Object[] objArr4 = new Object[7];
                    A04(objArr4);
                    objArr4[2] = DK1.A00;
                    objArr4[3] = "zze";
                    objArr4[4] = "zzf";
                    objArr4[5] = "zzh";
                    objArr4[6] = "zzg";
                    return new DK5(C23477Bhh.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", objArr4);
                case 4:
                    return C23477Bhh.zzi;
                case 5:
                    synchronized (C23477Bhh.class) {
                        C25943Cp9 cp96 = C25940Cp6.A01;
                        cp610 = new C25940Cp6(C23477Bhh.zzi);
                        C23477Bhh.zzj = cp610;
                    }
                    return cp610;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23475Bhf) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23475Bhf();
                case 2:
                    return new C23462BhR();
                case 3:
                    Object[] objArr5 = new Object[5];
                    A05(objArr5);
                    objArr5[4] = C23483Bhn.class;
                    return new DK5(C23475Bhf.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", objArr5);
                case 4:
                    return C23475Bhf.zzg;
                case 5:
                    synchronized (C23475Bhf.class) {
                        C25943Cp9 cp97 = C25940Cp6.A01;
                        cp69 = new C25940Cp6(C23475Bhf.zzg);
                        C23475Bhf.zzh = cp69;
                    }
                    return cp69;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23480Bhk) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23461BhQ();
                case 3:
                    Object[] objArr6 = new Object[7];
                    A05(objArr6);
                    objArr6[4] = "zzg";
                    objArr6[5] = "zzh";
                    objArr6[6] = "zzi";
                    return new DK5(C23480Bhk.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", objArr6);
                case 4:
                    return C23480Bhk.zzj;
                case 5:
                    synchronized (C23480Bhk.class) {
                        C25943Cp9 cp98 = C25940Cp6.A01;
                        cp68 = new C25940Cp6(C23480Bhk.zzj);
                        C23480Bhk.zzk = cp68;
                    }
                    return cp68;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23479Bhj) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23484Bho();
                case 2:
                    return new C23460BhP();
                case 3:
                    Object[] objArr7 = new Object[10];
                    A04(objArr7);
                    objArr7[2] = DK0.A00;
                    objArr7[3] = "zze";
                    objArr7[4] = C26944DJz.A00;
                    objArr7[5] = "zzf";
                    objArr7[6] = C26943DJy.A00;
                    objArr7[7] = "zzg";
                    objArr7[8] = "zzh";
                    objArr7[9] = "zzi";
                    return new DK5(C23479Bhj.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", objArr7);
                case 4:
                    return C23479Bhj.zzj;
                case 5:
                    synchronized (C23479Bhj.class) {
                        C25943Cp9 cp99 = C25940Cp6.A01;
                        cp67 = new C25940Cp6(C23479Bhj.zzj);
                        C23479Bhj.zzk = cp67;
                    }
                    return cp67;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23483Bhn) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23483Bhn();
                case 2:
                    return new C23459BhO();
                case 3:
                    Object[] objArr8 = new Object[11];
                    A05(objArr8);
                    objArr8[4] = "zzg";
                    objArr8[5] = C26942DJx.A00;
                    objArr8[6] = "zzh";
                    objArr8[7] = "zzi";
                    objArr8[8] = "zzj";
                    objArr8[9] = "zzk";
                    objArr8[10] = C23476Bhg.class;
                    return new DK5(C23483Bhn.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", objArr8);
                case 4:
                    return C23483Bhn.zzl;
                case 5:
                    synchronized (C23483Bhn.class) {
                        C25943Cp9 cp910 = C25940Cp6.A01;
                        cp66 = new C25940Cp6(C23483Bhn.zzl);
                        C23483Bhn.zzm = cp66;
                    }
                    return cp66;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23482Bhm) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23482Bhm();
                case 2:
                    return new C23458BhN();
                case 3:
                    Object[] objArr9 = new Object[10];
                    A05(objArr9);
                    objArr9[4] = C26941DJw.A00;
                    objArr9[5] = "zzg";
                    objArr9[6] = "zzh";
                    objArr9[7] = "zzi";
                    objArr9[8] = "zzj";
                    objArr9[9] = "zzk";
                    return new DK5(C23482Bhm.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", objArr9);
                case 4:
                    return C23482Bhm.zzl;
                case 5:
                    synchronized (C23482Bhm.class) {
                        C25943Cp9 cp911 = C25940Cp6.A01;
                        cp65 = new C25940Cp6(C23482Bhm.zzl);
                        C23482Bhm.zzm = cp65;
                    }
                    return cp65;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof BhZ) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new BhZ();
                case 2:
                    return new C23457BhM();
                case 3:
                    Object[] A1b = AnonymousClass3MW.A1b();
                    A1b[0] = "zzc";
                    A1b[1] = C23473Bhd.class;
                    return new DK5(BhZ.zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A1b);
                case 4:
                    return BhZ.zzd;
                case 5:
                    synchronized (BhZ.class) {
                        C25943Cp9 cp912 = C25940Cp6.A01;
                        cp64 = new C25940Cp6(BhZ.zzd);
                        BhZ.zze = cp64;
                    }
                    return cp64;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else if (this instanceof C23474Bhe) {
            switch (CFD.A00[i - 1]) {
                case 1:
                    return new C23474Bhe();
                case 2:
                    return new C23456BhL();
                case 3:
                    Object[] objArr10 = new Object[6];
                    A04(objArr10);
                    objArr10[2] = DK2.A00;
                    objArr10[3] = "zze";
                    objArr10[4] = DK3.A00;
                    objArr10[5] = "zzf";
                    return new DK5(C23474Bhe.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", objArr10);
                case 4:
                    return C23474Bhe.zzg;
                case 5:
                    synchronized (C23474Bhe.class) {
                        C25943Cp9 cp913 = C25940Cp6.A01;
                        cp63 = new C25940Cp6(C23474Bhe.zzg);
                        C23474Bhe.zzh = cp63;
                    }
                    return cp63;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C17880vN.A0y();
            }
        } else {
            boolean z = this instanceof C23470Bha;
            int[] iArr = CFD.A00;
            if (z) {
                switch (iArr[i - 1]) {
                    case 1:
                        return new C23470Bha();
                    case 2:
                        return new C23455BhK();
                    case 3:
                        Object[] A1b2 = AnonymousClass3MW.A1b();
                        A1b2[0] = "zzc";
                        A1b2[1] = DK2.A00;
                        return new DK5(C23470Bha.zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", A1b2);
                    case 4:
                        return C23470Bha.zze;
                    case 5:
                        synchronized (C23470Bha.class) {
                            C25943Cp9 cp914 = C25940Cp6.A01;
                            cp62 = new C25940Cp6(C23470Bha.zze);
                            C23470Bha.zzf = cp62;
                        }
                        return cp62;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C17880vN.A0y();
                }
            } else {
                switch (iArr[i - 1]) {
                    case 1:
                        return new C23471Bhb();
                    case 2:
                        return new C23454BhJ();
                    case 3:
                        Object[] A1a3 = AnonymousClass8BR.A1a();
                        A04(A1a3);
                        A1a3[2] = "zze";
                        return new DK5(C23471Bhb.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1a3);
                    case 4:
                        return C23471Bhb.zzf;
                    case 5:
                        synchronized (C23471Bhb.class) {
                            C25943Cp9 cp915 = C25940Cp6.A01;
                            cp6 = new C25940Cp6(C23471Bhb.zzf);
                            C23471Bhb.zzg = cp6;
                        }
                        return cp6;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C17880vN.A0y();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C25660Cjq.A02.A00(cls).CT5(this, obj);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = C25660Cjq.A02.A00(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public static Object A00(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw BE6.A0o("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BE6.A0o("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final String A01(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        for (int i = 0; i < str.length(); i++) {
            A10.append(Character.toLowerCase(BEA.A00(str, A10, i)));
        }
        return A10.toString();
    }

    public static void A02(C28663EDa eDa, StringBuilder sb, int i) {
        String str;
        int ordinal;
        Object obj;
        Method method;
        String A01;
        HashMap A11 = C17880vN.A11();
        HashMap A112 = C17880vN.A11();
        TreeSet treeSet = new TreeSet();
        for (Method A1O : eDa.getClass().getDeclaredMethods()) {
            BEB.A1O(A1O, treeSet, A112, A11);
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (A0v.startsWith("get")) {
                str = A0v.substring(3);
            } else {
                str = A0v;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String A0e = BEB.A0e(BEA.A0k(str), str.substring(1, str.length() - 4));
                method = (Method) A11.get(A0v);
                if (method != null && method.getReturnType().equals(List.class)) {
                    A01 = A01(A0e);
                    A03(sb, i, A01, A00(method, eDa, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String A0e2 = BEB.A0e(BEA.A0k(str), str.substring(1, str.length() - 3));
                method = (Method) A11.get(A0v);
                if (method != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && BE7.A1Y(method)) {
                    A01 = A01(A0e2);
                    A03(sb, i, A01, A00(method, eDa, new Object[0]));
                }
            }
            String valueOf = String.valueOf(str);
            if (A112.get(BE9.A0o("set", valueOf, valueOf.length())) != null && (!str.endsWith("Bytes") || !A11.containsKey(BEB.A0e("get", str.substring(0, str.length() - 5))))) {
                String A0e3 = BEB.A0e(BEA.A0k(str), str.substring(1));
                Method method2 = (Method) A11.get(BEB.A0e("get", str));
                String valueOf2 = String.valueOf(str);
                Method method3 = (Method) A11.get(BE9.A0o("has", valueOf2, valueOf2.length()));
                if (method2 != null) {
                    Object A00 = A00(method2, eDa, new Object[0]);
                    if (method3 == null) {
                        if (A00 instanceof Boolean) {
                            ordinal = AnonymousClass000.A1Y(A00);
                        } else if (A00 instanceof Integer) {
                            ordinal = AnonymousClass000.A0M(A00);
                        } else if (A00 instanceof Float) {
                            ordinal = (AnonymousClass000.A04(A00) > 0.0f ? 1 : (AnonymousClass000.A04(A00) == 0.0f ? 0 : -1));
                        } else if (A00 instanceof Double) {
                            ordinal = (AnonymousClass8BR.A00(A00) > 0.0d ? 1 : (AnonymousClass8BR.A00(A00) == 0.0d ? 0 : -1));
                        } else {
                            if (A00 instanceof String) {
                                obj = "";
                            } else if (A00 instanceof DSO) {
                                obj = DSO.A00;
                            } else if (A00 instanceof C28663EDa) {
                                if (A00 == ((E5U) A00).CTl()) {
                                }
                            } else if (A00 instanceof Enum) {
                                ordinal = ((Enum) A00).ordinal();
                            }
                            if (A00.equals(obj)) {
                            }
                        }
                        if (ordinal == 0) {
                        }
                    } else if (!AnonymousClass000.A1Y(A00(method3, eDa, new Object[0]))) {
                    }
                    A03(sb, i, A01(A0e3), A00);
                }
            }
        }
        C25840Cmu cmu = ((C23484Bho) eDa).zzb;
        if (cmu != null) {
            for (int i2 = 0; i2 < cmu.A00; i2++) {
                A03(sb, i, String.valueOf(cmu.A03[i2] >>> 3), cmu.A04[i2]);
            }
        }
    }

    public String toString() {
        StringBuilder A0t = BEA.A0t(super.toString());
        A02(this, A0t, 0);
        return A0t.toString();
    }
}
