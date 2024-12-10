package X;

import java.io.IOException;

/* renamed from: X.BeN  reason: case insensitive filesystem */
public final class C23273BeN extends C23267BeH {
    public static final C23273BeN zzb;
    public EE6 zzd = C23269BeJ.A02;

    public static C23273BeN A01(byte[] bArr) {
        C24209BxL e;
        byte[] bArr2 = bArr;
        int length = bArr.length;
        C25938Cp4 cp4 = C25938Cp4.A01;
        C23273BeN beN = new C23273BeN();
        try {
            E9l A00 = C25658Cjo.A02.A00(beN.getClass());
            A00.CTf(new C25571CiA(cp4), beN, bArr2, 0, length);
            A00.CTb(beN);
            return beN;
        } catch (C24209BxL e2) {
            e = e2;
            e.zza = beN;
            throw e;
        } catch (DZV e3) {
            e = new C24209BxL(e3.getMessage());
            e.zza = beN;
            throw e;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C24209BxL) {
                throw e4.getCause();
            }
            e = new C24209BxL(e4);
            e.zza = beN;
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            e = new C24209BxL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            e.zza = beN;
            throw e;
        }
    }

    static {
        C23273BeN beN = new C23273BeN();
        zzb = beN;
        beN.zzd &= Integer.MAX_VALUE;
        C23267BeH.zzb.put(C23273BeN.class, beN);
    }
}
