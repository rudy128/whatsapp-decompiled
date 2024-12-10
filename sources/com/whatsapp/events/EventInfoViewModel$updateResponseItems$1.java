package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E9;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass24H;
import X.AnonymousClass4YZ;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C22971Dz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C445823z;
import X.C49552Qx;
import X.C56862i9;
import X.C73353Va;
import X.C80883yF;
import X.C80893yG;
import X.C82954Cu;
import X.C98924rw;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$updateResponseItems$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$updateResponseItems$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $message;
    public int label;
    public final /* synthetic */ C73353Va this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$updateResponseItems$1(C445823z r2, C73353Va r3, C30391dr r4) {
        super(2, r4);
        this.$message = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventInfoViewModel$updateResponseItems$1(this.$message, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList A13;
        ArrayList A00;
        AnonymousClass4YZ r2;
        C82954Cu r4;
        UserJid A0I;
        ArrayList A132;
        Object A0I2;
        UserJid A0I3;
        boolean z;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList A133 = AnonymousClass000.A13();
            C445823z r1 = this.$message;
            if (r1.A0v.A02) {
                C56862i9 A002 = this.this$0.A06.A00(r1);
                this.this$0.A04.A0R(this.$message.A0v.A00);
                Set entrySet = A002.A00.entrySet();
                C18070vi.A0X(entrySet);
                C73353Va r5 = this.this$0;
                C445823z r42 = this.$message;
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Object obj2 = (UserJid) AnonymousClass000.A16(it).getKey();
                    if (r5.A04.A0R(r42.A0v.A00) && (obj2 instanceof PhoneUserJid)) {
                        obj2 = r5.A07.A0C((PhoneUserJid) obj2);
                    }
                    if (obj2 != null) {
                        A133.add(obj2);
                    }
                }
            }
            C73353Va r12 = this.this$0;
            AnonymousClass1G4 r28 = r12.A0E;
            C445823z r13 = this.$message;
            do {
                value = r28.getValue();
                AnonymousClass4YZ r27 = (AnonymousClass4YZ) value;
                A13 = AnonymousClass000.A13();
                AnonymousClass205 r122 = r13.A0v;
                AnonymousClass1BI r22 = r122.A00;
                if (r22 != null) {
                    Iterable A18 = r13.A18();
                    if (A18 == null) {
                        A18 = AnonymousClass000.A13();
                    }
                    List<AnonymousClass24H> A003 = C98924rw.A00(A18, 8);
                    ArrayList A134 = AnonymousClass000.A13();
                    ArrayList A135 = AnonymousClass000.A13();
                    ArrayList A136 = AnonymousClass000.A13();
                    ArrayList A137 = AnonymousClass000.A13();
                    ArrayList A138 = AnonymousClass000.A13();
                    ArrayList A139 = AnonymousClass000.A13();
                    LinkedHashSet A14 = C17880vN.A14();
                    int i = 1;
                    for (AnonymousClass24H r9 : A003) {
                        if (r9.A0v.A02) {
                            A0I3 = AnonymousClass11S.A01(r12.A00);
                        } else {
                            A0I3 = r9.A0I();
                        }
                        if (A0I3 != null) {
                            Long valueOf = Long.valueOf(r9.A0I);
                            C49552Qx r14 = r9.A02;
                            if (r14 != null) {
                                z = r12.A08.A03(r14, r9.A00);
                            } else {
                                z = false;
                            }
                            C80893yG r21 = new C80893yG(r22, A0I3, AnonymousClass00R.A00, valueOf, z);
                            C49552Qx r142 = r9.A02;
                            if (r142 != null) {
                                int ordinal = r142.ordinal();
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal == 3) {
                                            if (C22971Dz.A0d(r22) || r12.A05.A0N((AnonymousClass1E9) r22, A0I3)) {
                                                A138.add(r21);
                                            } else {
                                                A139.add(r21);
                                            }
                                        }
                                    } else if (C22971Dz.A0d(r22) || r12.A05.A0N((AnonymousClass1E9) r22, A0I3)) {
                                        A136.add(r21);
                                    } else {
                                        A137.add(r21);
                                    }
                                } else if (C22971Dz.A0d(r22) || r12.A05.A0N((AnonymousClass1E9) r22, A0I3)) {
                                    A134.add(r21);
                                    i += r9.A00 + 1;
                                } else {
                                    A135.add(r21);
                                }
                            }
                            A14.add(A0I3);
                        }
                    }
                    A134.addAll(A135);
                    ArrayList A1310 = AnonymousClass000.A13();
                    boolean z2 = r122.A02;
                    if (z2) {
                        A0I = AnonymousClass11S.A01(r12.A00);
                    } else {
                        A0I = r13.A0I();
                    }
                    if (A0I != null) {
                        A1310.add(new C80883yF(C18070vi.A0G(r12.A01, 2131890093), i));
                        AnonymousClass1BI r222 = r22;
                        A1310.add(new C80893yG(r222, A0I, AnonymousClass00R.A01, Long.valueOf(r13.A0I), false));
                    }
                    A1310.addAll(A134);
                    A13.addAll(A1310);
                    if (C18020vd.A05(C18040vf.A02, r12.A08.A03, 9278)) {
                        A138.addAll(A139);
                        ArrayList A1311 = AnonymousClass000.A13();
                        if (!A138.isEmpty()) {
                            A1311.add(new C80883yF(C18070vi.A0G(r12.A01, 2131890108), A138.size()));
                            A1311.addAll(A138);
                        }
                        A13.addAll(A1311);
                    }
                    A136.addAll(A137);
                    ArrayList A1312 = AnonymousClass000.A13();
                    if (!A136.isEmpty()) {
                        A1312.add(new C80883yF(C18070vi.A0G(r12.A01, 2131890114), A136.size()));
                        A1312.addAll(A136);
                    }
                    A13.addAll(A1312);
                    if (C22971Dz.A0d(r22)) {
                        if (z2) {
                            A0I2 = AnonymousClass11S.A01(r12.A00);
                        } else {
                            A0I2 = r13.A0I();
                        }
                        UserJid userJid = (UserJid) r22;
                        A132 = AnonymousClass000.A13();
                        if (!C18070vi.A18(userJid, A0I2) && !A14.contains(userJid)) {
                            A132.add(new C80883yF(C18070vi.A0G(r12.A01, 2131890115), 1));
                            UserJid userJid2 = userJid;
                            A132.add(new C80893yG(userJid2, userJid, AnonymousClass00R.A00, (Long) null, false));
                        }
                    } else {
                        A132 = AnonymousClass000.A13();
                        int size = A133.size() - A14.size();
                        if (!A133.isEmpty() && size > 0) {
                            A132.add(new C80883yF(C18070vi.A0G(r12.A01, 2131890115), size));
                            ArrayList A1313 = AnonymousClass000.A13();
                            Iterator it2 = A133.iterator();
                            while (it2.hasNext()) {
                                UserJid userJid3 = (UserJid) it2.next();
                                if (!A14.contains(userJid3)) {
                                    C80893yG r212 = new C80893yG(r22, userJid3, AnonymousClass00R.A00, (Long) null, false);
                                    if (r12.A05.A0N((AnonymousClass1E9) r22, userJid3)) {
                                        A132.add(r212);
                                    } else {
                                        A1313.add(r212);
                                    }
                                }
                            }
                            A132.addAll(A1313);
                        }
                    }
                    A13.addAll(A132);
                }
                A00 = C73353Va.A00(r13, r12);
                r2 = r27;
                r4 = r2.A01;
            } while (!r28.BFK(value, new AnonymousClass4YZ(r13, r4, A13, A00, r2.A04)));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventInfoViewModel$updateResponseItems$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
