package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public final /* synthetic */ class DIY implements E5D {
    public final /* synthetic */ BZ9 A00;
    public final /* synthetic */ C25959CpR A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ DIY(BZ9 bz9, C25959CpR cpR, List list) {
        this.A00 = bz9;
        this.A02 = list;
        this.A01 = cpR;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.Bbw] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.Bcb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, X.Bbw] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, X.Bbw] */
    public final void accept(Object obj, Object obj2) {
        long j;
        Pair pair;
        NullPointerException nullPointerException;
        String str;
        C23021BZx bZx = (C23021BZx) obj;
        DIB dib = new DIB((TaskCompletionSource) obj2);
        String[] A1b = C108955ca.A1b(this.A02);
        C25959CpR cpR = this.A01;
        try {
            int i = cpR.A03;
            if (i != 1) {
                if (i != 2) {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                    ? obj3 = new Object();
                    obj3.A02 = -1;
                    obj3.A03 = 0;
                    obj3.A0C = false;
                    obj3.A04 = 0;
                    j = cpR.A04;
                    obj3.A01 = j;
                    obj3.A00 = i;
                    obj3.A06 = createPipe[0];
                    obj3.A07 = createPipe2[0];
                    obj3.A03 = 0;
                    obj3.A04 = cpR.A00;
                    Pair create = Pair.create(createPipe[1], createPipe2[1]);
                    if (create != null) {
                        pair = Pair.create(obj3, new C23429Bgu(create));
                    } else {
                        nullPointerException = null;
                    }
                } else {
                    C24950CRa cRa = cpR.A05;
                    if (cRa != null) {
                        File file = cRa.A03;
                        if (file == null) {
                            str = null;
                        } else {
                            str = file.getAbsolutePath();
                        }
                        Uri uri = cRa.A01;
                        ? obj4 = new Object();
                        obj4.A02 = -1;
                        obj4.A03 = 0;
                        obj4.A0C = false;
                        obj4.A04 = 0;
                        j = cpR.A04;
                        obj4.A01 = j;
                        obj4.A00 = i;
                        obj4.A06 = cRa.A02;
                        obj4.A05 = uri;
                        obj4.A09 = str;
                        obj4.A02 = cRa.A00;
                        obj4.A03 = 0;
                        obj4.A0C = false;
                        obj4.A04 = cpR.A00;
                        obj4.A0A = cpR.A01;
                        obj4.A0B = cpR.A02;
                        pair = Pair.create(obj4, C23430Bgv.A00);
                    } else {
                        nullPointerException = AnonymousClass000.A0s("File cannot be null for Payload.Type.FILE");
                    }
                }
                throw nullPointerException;
            }
            ? obj5 = new Object();
            obj5.A02 = -1;
            obj5.A03 = 0;
            obj5.A0C = false;
            obj5.A04 = 0;
            j = cpR.A04;
            obj5.A01 = j;
            obj5.A00 = 1;
            byte[] bArr = cpR.A07;
            if (bArr != null && bArr.length > 32768) {
                ? obj6 = new Object();
                obj6.A01 = new byte[0];
                obj6.A01 = bArr;
                obj5.A08 = obj6;
                bArr = Arrays.copyOf(bArr, 32768);
            }
            obj5.A0D = bArr;
            pair = Pair.create(obj5, C23430Bgv.A00);
            C26398Cyy cyy = (C26398Cyy) bZx.A04();
            C23199Bct bct = new C23199Bct((C24437C3n) null);
            bct.A00 = new C23416Bgh(dib);
            bct.A02 = A1b;
            bct.A01 = (C23143Bbw) pair.first;
            cyy.A01(2008, C26398Cyy.A00(bct, cyy));
            DRT drt = (DRT) pair.second;
            if (drt instanceof C23429Bgu) {
                Object obj7 = ((C23429Bgu) drt).zza;
                C25583CiN ciN = bZx.A01;
                if (ciN != null) {
                    C24877CNv cNv = cpR.A06;
                    C18210vx.A00(cNv);
                    InputStream inputStream = cNv.A00;
                    if (inputStream == null) {
                        ParcelFileDescriptor parcelFileDescriptor = cNv.A01;
                        C18210vx.A00(parcelFileDescriptor);
                        inputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                        cNv.A00 = inputStream;
                    }
                    Pair pair2 = (Pair) obj7;
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.first);
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.second);
                    Object obj8 = pair.first;
                    synchronized (ciN) {
                        AnonymousClass00O r0 = ciN.A00;
                        Long valueOf = Long.valueOf(j);
                        r0.put(valueOf, inputStream);
                        ciN.A01.put(valueOf, autoCloseOutputStream);
                        ciN.A02.put(valueOf, obj8);
                        ciN.A03.execute(new AnonymousClass3CE(autoCloseOutputStream, ciN, autoCloseOutputStream2, inputStream, 1, j));
                    }
                }
            }
        } catch (IOException e) {
            Object[] objArr = new Object[1];
            AnonymousClass3MX.A1S(objArr, 0, cpR.A04);
            Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", objArr), e);
            throw e;
        } catch (IOException e2) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
            dib.CKS(new Status(8013, "STATUS_PAYLOAD_IO_ERROR"));
        }
    }
}
