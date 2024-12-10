package X;

import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2S3  reason: invalid class name */
public abstract class AnonymousClass2S3 {
    public void A00(CancellationSignal cancellationSignal, C193089pW r15, List list) {
        FileInputStream A18;
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (!cancellationSignal.isCanceled()) {
                File A01 = r15.A01(A0v);
                if (!A01.exists()) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("EntityTableImporter/Failed to import file '");
                    A10.append(A0v);
                    C17890vO.A19(A10, "'.");
                } else {
                    AnonymousClass2ZW r0 = new AnonymousClass2ZW(new C58232kM("deleted_ids"));
                    try {
                        A18 = C108945cZ.A18(A01);
                        JSONObject A012 = AnonymousClass1EY.A01(A18);
                        if (A012 != null) {
                            A18.close();
                            try {
                                ArrayList A00 = r0.A00.A00(A012);
                                if (this instanceof C45842Bw) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                C52882bd r3 = new C52882bd(this, i);
                                if (A00.size() <= 0) {
                                    continue;
                                } else if (!cancellationSignal.isCanceled()) {
                                    int i2 = 0;
                                    while (i2 < A00.size()) {
                                        List<Long> subList = A00.subList(i2, Math.min(A00.size(), i2 + 100));
                                        if (r3.A00 != 0) {
                                            Iterator it2 = subList.iterator();
                                            while (it2.hasNext()) {
                                                long A07 = C17890vO.A07(it2);
                                                C45842Bw r7 = (C45842Bw) r3.A01;
                                                r7.A00.A00.A08(r7.A02, A07);
                                            }
                                            C45842Bw r1 = (C45842Bw) r3.A01;
                                            C63632tR r5 = r1.A00.A00;
                                            String str = r1.A02;
                                            String str2 = r1.A01;
                                            if (!subList.isEmpty()) {
                                                C28791au A05 = r5.A00.A05();
                                                try {
                                                    StringBuilder A11 = AnonymousClass000.A11(str2);
                                                    A11.append(" IN ");
                                                    String A0y = AnonymousClass000.A0y(AnonymousClass1H2.A00(subList.size()), A11);
                                                    String[] strArr = new String[subList.size()];
                                                    int i3 = 0;
                                                    for (Long valueOf : subList) {
                                                        strArr[i3] = String.valueOf(valueOf);
                                                        i3++;
                                                    }
                                                    ((C28801av) A05).A02.A04(str, A0y, "BackupChangesStore/DELETE_ENTITIES", strArr);
                                                    A05.close();
                                                } catch (Throwable th) {
                                                    AnonymousClass0DT.A00(th, th);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            Iterator it3 = subList.iterator();
                                            while (it3.hasNext()) {
                                                ((C45832Bv) r3.A01).A00.A01.A08("message", C17890vO.A07(it3));
                                            }
                                            C56032gn r6 = ((C45832Bv) r3.A01).A00;
                                            ArrayList A0z = C17880vN.A0z(100);
                                            Iterator it4 = subList.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    long A072 = C17890vO.A07(it4);
                                                    if (cancellationSignal.isCanceled()) {
                                                        break;
                                                    }
                                                    AnonymousClass206 A02 = AnonymousClass1W2.A02(r6.A08, A072);
                                                    if (A02 != null) {
                                                        A0z.add(A02);
                                                    }
                                                } else {
                                                    if (A0z.size() > 0) {
                                                        r6.A05.A0V(A0z, 0);
                                                    }
                                                    Iterator it5 = A0z.iterator();
                                                    while (it5.hasNext()) {
                                                        r6.A04.A01(C17880vN.A0Y(it5).A0v);
                                                    }
                                                    Iterator it6 = subList.iterator();
                                                    while (it6.hasNext()) {
                                                        AnonymousClass206 A022 = AnonymousClass1W2.A02(r6.A08, C17890vO.A07(it6));
                                                        C55542fy r52 = r6.A02;
                                                        if (A022 == null) {
                                                            r52.A00++;
                                                        } else {
                                                            r52.A01++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i2 += subList.size();
                                    }
                                } else {
                                    return;
                                }
                            } catch (JSONException e) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("JsonEntitiesFileParser/Failed to process JSON file '");
                                throw new IOException(AnonymousClass001.A1H(A01.getName(), "'", A102), e);
                            }
                        } else {
                            throw new JSONException("Can't read JSON file.");
                        }
                    } catch (JSONException e2) {
                        StringBuilder A103 = AnonymousClass000.A10();
                        A103.append("JsonEntitiesFileParser/Failed to read JSON with entities from file '");
                        throw new IOException(AnonymousClass001.A1H(A01.getName(), "'", A103), e2);
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                }
            } else {
                return;
            }
        }
        return;
        throw th;
    }
}
