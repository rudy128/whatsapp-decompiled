package X;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.thunderstorm.Hilt_ThunderstormReceiverBottomsheet;
import com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.6uE  reason: invalid class name and case insensitive filesystem */
public abstract class C136696uE {
    public void A00(AnonymousClass6ZE r9, String str) {
        if (this instanceof C114225qM) {
            C114225qM r2 = (C114225qM) this;
            C18070vi.A0d(str, 0);
            if (r9.A00 == 3) {
                AnonymousClass73G r5 = r2.A00;
                long currentTimeMillis = System.currentTimeMillis() - C17900vP.A01(r5.A02.A01);
                C108955ca.A1W("thunderstorm_logs: ThunderstormManager/ onBandwidthChanged/ high bandwidth: time since connection: %s", Locale.US, C108945cZ.A1b(r5.A0D.format(currentTimeMillis), new Object[1], 0, 1));
                Collection<C136046tB> A17 = C108955ca.A17(r5.A0E);
                if (!A17.isEmpty()) {
                    for (C136046tB r0 : A17) {
                        if (r0.A00 == 2) {
                            return;
                        }
                    }
                }
                r5.A02.A03 = Long.valueOf(currentTimeMillis);
                C131726lZ r02 = r5.A01;
                if (r02 == null) {
                    return;
                }
                if (r02.A00.A01 != null) {
                    C24521Kq r03 = C24521Kq.$redex_init_class;
                } else {
                    C18070vi.A11("waDebugBuildSharedPreferences");
                    throw null;
                }
            }
        } else {
            ((C114235qN) this).A00.A00(r9, str);
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [androidx.fragment.app.Fragment, com.whatsapp.thunderstorm.Hilt_ThunderstormReceiverBottomsheet, com.whatsapp.thunderstorm.ThunderstormReceiverBottomsheet, androidx.fragment.app.DialogFragment] */
    public void A01(C132576n4 r13, String str) {
        Object obj;
        Object obj2;
        if (this instanceof C114225qM) {
            C114225qM r5 = (C114225qM) this;
            C18070vi.A0d(str, 0);
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            C108955ca.A1W("onConnectionInitiated(endpointId=%s, endpointName=%s)", locale, C108945cZ.A1b(r13.A00, objArr, 1, 2));
            String A00 = r13.A00();
            C18070vi.A0X(A00);
            if (r13.A01) {
                AnonymousClass73G r11 = r5.A00;
                byte[] bArr = r13.A02;
                C18070vi.A0X(bArr);
                JsonReader jsonReader = new JsonReader(new StringReader(C108955ca.A13(bArr)));
                jsonReader.beginObject();
                String str2 = "";
                int i = 0;
                long j = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName != null) {
                        int hashCode = nextName.hashCode();
                        if (hashCode != -768809840) {
                            if (hashCode != -408388688) {
                                if (hashCode == 1564707966 && nextName.equals("num_files")) {
                                    i = jsonReader.nextInt();
                                }
                            } else if (nextName.equals("total_bytes")) {
                                j = jsonReader.nextLong();
                            }
                        } else if (nextName.equals("push_name")) {
                            str2 = jsonReader.nextString();
                        }
                    }
                    jsonReader.skipValue();
                }
                C18070vi.A0d(str2, 1);
                AnonymousClass6J2 r0 = r11.A0B;
                r0.A00 = i;
                r0.A02 = j;
                r11.A00 = 1;
                r11.A02.A00 = ((double) j) / 1000000.0d;
                C131726lZ r02 = r11.A01;
                if (r02 != null) {
                    ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = r02.A00;
                    C132106mD r7 = new C132106mD(thunderstormConnectionsInfoActivity, str);
                    ? hilt_ThunderstormReceiverBottomsheet = new Hilt_ThunderstormReceiverBottomsheet();
                    Bundle A0D = C17880vN.A0D();
                    A0D.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                    A0D.putInt("num_files", i);
                    A0D.putLong("total_bytes", j);
                    A0D.putString("authentication_pin", A00);
                    hilt_ThunderstormReceiverBottomsheet.A1R(A0D);
                    hilt_ThunderstormReceiverBottomsheet.A01 = r7;
                    thunderstormConnectionsInfoActivity.A03 = hilt_ThunderstormReceiverBottomsheet;
                    C20098A7b.A01(hilt_ThunderstormReceiverBottomsheet, thunderstormConnectionsInfoActivity.getSupportFragmentManager());
                    Iterator it = thunderstormConnectionsInfoActivity.A0K.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C140096zw.A00(obj2, str)) {
                            break;
                        }
                    }
                    C140096zw r1 = (C140096zw) obj2;
                    if (r1 != null) {
                        AnonymousClass3MX.A1K(r1.A02, 3);
                    }
                    ThunderstormConnectionsInfoActivity.A0c(thunderstormConnectionsInfoActivity, str, 1);
                    ThunderstormConnectionsInfoActivity.A0r(thunderstormConnectionsInfoActivity, true);
                    return;
                }
                return;
            }
            AnonymousClass73G r72 = r5.A00;
            r72.A00 = 2;
            C131726lZ r03 = r72.A01;
            if (r03 != null) {
                String A002 = r13.A00();
                C18070vi.A0X(A002);
                ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity2 = r03.A00;
                Iterator it2 = thunderstormConnectionsInfoActivity2.A0K.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (C140096zw.A00(obj, str)) {
                        break;
                    }
                }
                C140096zw r12 = (C140096zw) obj;
                if (r12 != null) {
                    r12.A03.A0E(C17890vO.A0R(thunderstormConnectionsInfoActivity2, A002, 1, 0, 2131896889));
                }
            }
            r72.A05(str);
            return;
        }
        C114235qN r14 = (C114235qN) this;
        if (r13.A01) {
            BZ9.A00(r14.A01, str);
        }
        r14.A00.A01(r13, str);
    }

    public void A02(CLM clm, String str) {
        C132906nq r0;
        long j;
        Object obj;
        AnonymousClass73G r3;
        Object obj2;
        String str2 = str;
        if (this instanceof C114225qM) {
            C114225qM r6 = (C114225qM) this;
            C18070vi.A0d(str, 0);
            Locale locale = Locale.US;
            Object[] A1b = AnonymousClass3MX.A1b(str, 0);
            int i = clm.A00.A00;
            C17880vN.A1T(A1b, i, 1);
            C108955ca.A1W("onConnectionResul(endpointId=%s, result=%s)", locale, Arrays.copyOf(A1b, 2));
            if (i != 0) {
                if (i == 13) {
                    r3 = r6.A00;
                    C131726lZ r1 = r3.A01;
                    if (r1 != null) {
                        r1.A00(str, 3);
                    }
                } else if (i == 8004) {
                    r3 = r6.A00;
                    C131726lZ r02 = r3.A01;
                    if (r02 != null) {
                        ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = r02.A00;
                        if (C108965cb.A0d(thunderstormConnectionsInfoActivity).A00 == 2) {
                            Iterator it = thunderstormConnectionsInfoActivity.A0K.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (C140096zw.A00(obj2, str)) {
                                    break;
                                }
                            }
                            C140096zw r4 = (C140096zw) obj2;
                            if (r4 != null) {
                                AnonymousClass3MX.A1K(r4.A06, 4);
                                C108955ca.A1C(thunderstormConnectionsInfoActivity, r4.A03, 2131896894);
                                if (!thunderstormConnectionsInfoActivity.A0D) {
                                    thunderstormConnectionsInfoActivity.A0A = C18460wS.A00;
                                    C108965cb.A0d(thunderstormConnectionsInfoActivity).A0C.A01();
                                }
                                thunderstormConnectionsInfoActivity.A4b(r4, str, false);
                            }
                            ThunderstormConnectionsInfoActivity.A0V(thunderstormConnectionsInfoActivity, str);
                            thunderstormConnectionsInfoActivity.A0I.removeCallbacks(thunderstormConnectionsInfoActivity.A07);
                        }
                    }
                } else {
                    return;
                }
                C136046tB r03 = (C136046tB) r3.A0E.get(str);
                if (r03 != null) {
                    r03.A00 = 0;
                    return;
                }
                return;
            }
            AnonymousClass73G r32 = r6.A00;
            C131726lZ r04 = r32.A01;
            if (r04 != null) {
                ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity2 = r04.A00;
                boolean A1T = AnonymousClass000.A1T(C108965cb.A0d(thunderstormConnectionsInfoActivity2).A00, 1);
                C18100vl r2 = thunderstormConnectionsInfoActivity2.A0L;
                AnonymousClass73G A10 = C108945cZ.A10(r2);
                int i2 = A10.A00;
                if (i2 == 1) {
                    r0 = A10.A0B;
                    j = r0.A02;
                } else if (i2 != 2) {
                    j = 0;
                } else {
                    r0 = A10.A0C;
                    j = r0.A02;
                }
                ThunderstormConnectionsInfoActivity.A0d(thunderstormConnectionsInfoActivity2, str2, 0, j, A1T);
                Iterator it2 = thunderstormConnectionsInfoActivity2.A0K.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (C140096zw.A00(obj, str)) {
                        break;
                    }
                }
                C140096zw r12 = (C140096zw) obj;
                if (r12 != null) {
                    AnonymousClass3MX.A1K(r12.A06, 2);
                    ThunderstormConnectionsInfoActivity.A0Q(thunderstormConnectionsInfoActivity2, r12);
                }
                if (C108945cZ.A10(r2).A00 == 2) {
                    thunderstormConnectionsInfoActivity2.A0I.removeCallbacks(thunderstormConnectionsInfoActivity2.A07);
                    if (thunderstormConnectionsInfoActivity2.A01 != null) {
                        C24521Kq r05 = C24521Kq.$redex_init_class;
                        AnonymousClass73G A102 = C108945cZ.A10(r2);
                        A102.A02.A05 = C108955ca.A0m();
                        C136046tB r06 = (C136046tB) A102.A0E.get(str);
                        if (r06 != null) {
                            r06.A00 = 2;
                        }
                        for (C25959CpR cpR : C108955ca.A17(A102.A0C.A01)) {
                            C18070vi.A0b(cpR);
                            AnonymousClass73G.A00(cpR, A102, str);
                        }
                    } else {
                        C18070vi.A11("waDebugBuildSharedPreferences");
                        throw null;
                    }
                }
            }
            r32.A04();
            if (r32.A03) {
                BZ9 bz9 = (BZ9) C108965cb.A0F(r32);
                bz9.A00.A01(bz9, "advertising");
                r32.A03 = false;
            }
            r32.A02.A01 = C108955ca.A0m();
            return;
        }
        C114235qN r13 = (C114235qN) this;
        if (clm.A00.A00 > 0) {
            BZ9.A01(r13.A01, str);
        }
        r13.A00.A02(clm, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r2 = r5.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C114225qM
            if (r0 == 0) goto L_0x0067
            r0 = r6
            X.5qM r0 = (X.C114225qM) r0
            r4 = 0
            X.C18070vi.A0d(r7, r4)
            X.73G r0 = r0.A00
            X.6lZ r0 = r0.A01
            if (r0 == 0) goto L_0x0064
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r3 = r0.A00
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0V(r3, r7)
            java.util.List r0 = r3.A0K
            java.util.Iterator r1 = r0.iterator()
        L_0x001c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r5 = r1.next()
            boolean r0 = X.C140096zw.A00(r5, r7)
            if (r0 == 0) goto L_0x001c
        L_0x002c:
            X.6zw r5 = (X.C140096zw) r5
            if (r5 == 0) goto L_0x0061
            X.1DT r2 = r5.A06
            java.lang.Number r0 = X.C108945cZ.A1C(r2)
            if (r0 == 0) goto L_0x0061
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0061
            X.1DT r1 = r5.A03
            r0 = 2131896893(0x7f122a3d, float:1.942866E38)
            X.C108955ca.A1C(r3, r1, r0)
            r0 = 4
            X.AnonymousClass3MX.A1K(r2, r0)
            r3.A4b(r5, r7, r4)
            X.73G r0 = X.C108965cb.A0d(r3)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0061
            X.1KB r1 = r3.A05
            r0 = 14
            X.7RC r0 = X.AnonymousClass7RC.A00(r3, r0)
            r1.CGP(r0)
        L_0x0061:
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0r(r3, r4)
        L_0x0064:
            return
        L_0x0065:
            r5 = 0
            goto L_0x002c
        L_0x0067:
            r1 = r6
            X.5qN r1 = (X.C114235qN) r1
            X.BZ9 r0 = r1.A01
            X.BZ9.A01(r0, r7)
            X.6uE r0 = r1.A00
            r0.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136696uE.A03(java.lang.String):void");
    }
}
