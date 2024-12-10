package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8p3  reason: invalid class name */
public abstract class AnonymousClass8p3 extends C123466Uo {
    public void A03(List list, Set set) {
        String str;
        StringBuilder A10;
        C18070vi.A0h(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C195749tq r1 = (C195749tq) it.next();
            Long l = r1.A07;
            AnonymousClass205 r7 = r1.A05;
            byte[] bArr = r1.A08;
            byte[] bArr2 = r1.A09;
            int i = r1.A01;
            if ((bArr2 == null && bArr == null) || l == null) {
                Log.w("TemporaryPlaceholderOrphanResolver/processOrphanBatch/some required fields are null for the orphan message");
            } else {
                AnonymousClass8pB r5 = (AnonymousClass8pB) this;
                if (i == 6 && bArr2 != null) {
                    C165308av r12 = (C165308av) C23577Bm6.A07(C165308av.DEFAULT_INSTANCE, bArr2);
                    if ((r12.bitField0_ & 4) != 0) {
                        C164128Xq r0 = r12.callLogMessageInfo_;
                        C164128Xq r13 = r0;
                        if (r0 == null) {
                            r0 = C164128Xq.DEFAULT_INSTANCE;
                        }
                        if ((r0.bitField0_ & 1) != 0) {
                            if (r13 == null) {
                                r13 = C164128Xq.DEFAULT_INSTANCE;
                            }
                            long j = r13.callLogRowId_;
                            C178119Bw A05 = r5.A00.A05(j);
                            if (A05 == null) {
                                A10 = AnonymousClass000.A10();
                                A10.append("MessageCallLogOrphanResolver/processOrphan/no existing call log for row id: ");
                                A10.append(j);
                            } else {
                                AnonymousClass22M r3 = new AnonymousClass22M(r7, A05);
                                C187329fd r11 = (C187329fd) r5.A03.get();
                                AnonymousClass1W6 A0c = C17880vN.A0c(r11.A02);
                                AnonymousClass205 r6 = r3.A0v;
                                AnonymousClass206 A0s = C108945cZ.A0s(r6, A0c);
                                if (A0s != null) {
                                    try {
                                        if (A0s.A0x != -1) {
                                            if (A0s instanceof C445623x) {
                                                r11.A00.BBY(r3);
                                            } else if (A0s.A0u == r3.A0u) {
                                                AnonymousClass206 A01 = AnonymousClass1W2.A01(r7, r5.A02);
                                                if (A01 == null) {
                                                    A10 = AnonymousClass000.A10();
                                                    A10.append("MessageCallLogOrphanResolver/processOrphan/the current fmessage for key: ");
                                                    A10.append(r7);
                                                    A10.append(".id is null");
                                                } else {
                                                    r3.A0y = A01.A0y;
                                                    r3.A0x = A01.A0x;
                                                    r5.A01.CQx(r3, 17);
                                                }
                                            }
                                            set.add(l);
                                        }
                                    } catch (AnonymousClass1T8 e) {
                                        StringBuilder A102 = AnonymousClass000.A10();
                                        A102.append("MessageOrderPreserver/updateMessage/Invalid fmessage.key: ");
                                        A102.append(r6.A01);
                                        C17900vP.A0X(e, ", exception: ", A102);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            str = A10.toString();
                            Log.e(str);
                        }
                    }
                    str = "MessageCallLogOrphanResolver/processOrphan/stanza data is invalid";
                    Log.e(str);
                }
            }
        }
    }
}
