package com.whatsapp.contact.picker.viewmodels;

import X.A2B;
import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.AnonymousClass1MG;
import X.AnonymousClass1OS;
import X.AnonymousClass3U0;
import X.AnonymousClass4YN;
import X.AnonymousClass4ZN;
import X.C1402670q;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C34511kb;
import X.C61492pm;
import X.C72463Mc;
import X.C81673zc;
import com.whatsapp.util.Log;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$onSubmitRequested$1", f = "AddGroupParticipantsSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AddGroupParticipantsSelectorViewModel$onSubmitRequested$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $isSelectedContactsAlreadyInCommunity;
    public final /* synthetic */ List $selectedUserJids;
    public int label;
    public final /* synthetic */ AnonymousClass3U0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddGroupParticipantsSelectorViewModel$onSubmitRequested$1(AnonymousClass3U0 r2, List list, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$isSelectedContactsAlreadyInCommunity = z;
        this.$selectedUserJids = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AddGroupParticipantsSelectorViewModel$onSubmitRequested$1(this.this$0, this.$selectedUserJids, r6, this.$isSelectedContactsAlreadyInCommunity);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        Object[] objArr;
        AnonymousClass4ZN A02;
        int i2;
        int i3;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3U0 r2 = this.this$0;
            AnonymousClass1EC r1 = r2.A08;
            if (r1 == null || this.$isSelectedContactsAlreadyInCommunity) {
                AnonymousClass1G4 r4 = r2.A0A;
                do {
                } while (!r4.BFK(r4.getValue(), new AnonymousClass4YN((AnonymousClass1EC) null, (AnonymousClass4ZN) null, 1)));
            } else {
                AnonymousClass1E7 A0E = r2.A01.A0E(r1);
                A2B a2b = null;
                if (A0E != null) {
                    str = this.this$0.A02.A0I(A0E);
                } else {
                    str = null;
                }
                AnonymousClass3U0 r0 = this.this$0;
                boolean A1T = AnonymousClass000.A1T(r0.A03.A06(r0.A07), 3);
                if (C18020vd.A05(C18040vf.A02, this.this$0.A04, 5021)) {
                    AnonymousClass3U0 r02 = this.this$0;
                    C34511kb r22 = r02.A00;
                    AnonymousClass1EC r12 = r02.A08;
                    C18070vi.A0d(r12, 0);
                    AnonymousClass1MG r03 = r22.A08;
                    r03.A04();
                    C61492pm r04 = (C61492pm) r03.A01.get(r12);
                    if (r04 != null) {
                        a2b = r04.A01;
                    }
                }
                AnonymousClass3U0 r13 = this.this$0;
                List list = this.$selectedUserJids;
                if (A1T) {
                    int size = list.size();
                    if (a2b != null) {
                        A02 = C1402670q.A01(new Object[0], 2131755051, size);
                    } else {
                        if (r13.A0C) {
                            i = 2131888492;
                            if (str == null) {
                                i = 2131888493;
                                objArr = new Object[1];
                                C17880vN.A1T(objArr, size, 0);
                                A02 = C1402670q.A02(objArr, i);
                            }
                        } else {
                            Log.i("AddGroupParticipantsSelector/ Expected navigation to be launched from community home, but it was not.");
                            i = 2131887601;
                            if (str == null) {
                                i = 2131887602;
                                objArr = new Object[0];
                                A02 = C1402670q.A02(objArr, i);
                            }
                        }
                        objArr = new Object[]{str};
                        A02 = C1402670q.A02(objArr, i);
                    }
                } else {
                    int size2 = list.size();
                    if (a2b == null) {
                        i2 = 2131896570;
                        if (str != null) {
                            i3 = 2131896569;
                        }
                        objArr = new Object[0];
                        A02 = C1402670q.A02(objArr, i);
                    } else if (str != null) {
                        i3 = 2131896573;
                        if (size2 == 1) {
                            i3 = 2131896567;
                        }
                    } else {
                        i2 = 2131896572;
                        objArr = new Object[0];
                        A02 = C1402670q.A02(objArr, i);
                    }
                    objArr = new Object[]{str};
                    A02 = C1402670q.A02(objArr, i);
                }
                AnonymousClass3U0 r5 = this.this$0;
                AnonymousClass1G4 r42 = r5.A0A;
                do {
                } while (!r42.BFK(r42.getValue(), new AnonymousClass4YN(r5.A08, A02, 2)));
            }
            C72463Mc.A1E(new C81673zc(), this.this$0.A06, 90, 6, false);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AddGroupParticipantsSelectorViewModel$onSubmitRequested$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
