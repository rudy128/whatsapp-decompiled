package com.whatsapp.conversation.banner.viewmodel;

import X.AnonymousClass1D6;
import X.AnonymousClass1DF;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4W8;
import X.AnonymousClass4XJ;
import X.AnonymousClass4YW;
import X.AnonymousClass5Q3;
import X.C108485bm;
import X.C108915cV;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C25691Pg;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C34081jt;
import X.C41561wd;
import X.C94404kZ;
import X.C94414ka;
import X.C98514rH;
import java.util.TreeSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class ConversationBannersViewModel extends AnonymousClass1J2 {
    public final AnonymousClass4XJ A00;
    public final TreeSet A01 = new TreeSet();
    public final C18100vl A02 = AnonymousClass1DF.A01(AnonymousClass5Q3.A00);
    public final C108485bm A03 = AnonymousClass4W8.A01(C25691Pg.DROP_OLDEST, 100);
    public final AnonymousClass1G1 A04 = new C34081jt((AnonymousClass1OB) null, (AnonymousClass1G1) this.A02.getValue());
    public final C18600wl A05;

    @DebugMetadata(c = "com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel$1", f = "ConversationBannersViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L_0x0032
                if (r0 != r4) goto L_0x0041
                java.lang.Object r3 = r6.L$0
                X.DXm r3 = (X.C27177DXm) r3
                X.C30691eM.A01(r7)
            L_0x0010:
                boolean r0 = X.AnonymousClass000.A1Y(r7)
                if (r0 == 0) goto L_0x003e
                java.lang.Object r0 = r3.A00()
                X.1D6 r0 = (X.AnonymousClass1D6) r0
                java.lang.Object r2 = r0.first
                X.5cV r2 = (X.C108915cV) r2
                java.lang.Object r1 = r0.second
                com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel r0 = com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel.this
                com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel.A00(r2, r0, r1)
            L_0x0027:
                r6.L$0 = r3
                r6.label = r4
                java.lang.Object r7 = r3.A01(r6)
                if (r7 != r5) goto L_0x0010
                return r5
            L_0x0032:
                X.C30691eM.A01(r7)
                com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel r0 = com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel.this
                X.5bm r0 = r0.A03
                X.DXm r3 = r0.Bh9()
                goto L_0x0027
            L_0x003e:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0041:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.banner.viewmodel.ConversationBannersViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ConversationBannersViewModel(AnonymousClass4XJ r4, C18600wl r5) {
        C18070vi.A0d(r5, 2);
        this.A00 = r4;
        this.A05 = r5;
        AnonymousClass3MW.A1X(r5, new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
    }

    public static final void A00(C108915cV r14, ConversationBannersViewModel conversationBannersViewModel, Object obj) {
        TreeSet treeSet;
        C108915cV r0;
        C108915cV r2;
        AnonymousClass1D6 A012;
        C108915cV r5 = r14;
        Object obj2 = obj;
        if (r14.BEC(obj2)) {
            synchronized (conversationBannersViewModel) {
                treeSet = conversationBannersViewModel.A01;
                C98514rH r02 = (C98514rH) C29431cG.A0Y(treeSet);
                if (r02 != null) {
                    r0 = r02.A00;
                } else {
                    r0 = null;
                }
            }
            if (r14.equals(r0)) {
                AnonymousClass1G4 A17 = AnonymousClass3MW.A17(conversationBannersViewModel.A02);
                do {
                } while (!A17.BFK(A17.getValue(), new AnonymousClass4YW((C108915cV) null, r5, new C94414ka(r14, conversationBannersViewModel, 4), new C94414ka(r14, conversationBannersViewModel, 5), obj2)));
                return;
            }
            synchronized (conversationBannersViewModel) {
                C98514rH r03 = (C98514rH) C29431cG.A0Y(treeSet);
                if (r03 != null) {
                    r2 = r03.A00;
                } else {
                    r2 = null;
                }
            }
            if (r2 == null) {
                A012 = AnonymousClass1D6.A01((Object) null, r14);
            } else if (r14.compareTo(r2) == 0) {
                A012 = AnonymousClass1D6.A01((Object) null, r2);
            } else if (r14.compareTo(r2) < 0) {
                A012 = AnonymousClass1D6.A01(r2, r14);
            } else {
                A012 = new AnonymousClass1D6((Object) null, (Object) null);
            }
            Comparable comparable = (Comparable) A012.first;
            Object obj3 = A012.second;
            C98514rH r04 = new C98514rH(r14, obj2);
            synchronized (conversationBannersViewModel) {
                treeSet.remove(r04);
                treeSet.add(r04);
            }
            if (obj3 != null) {
                AnonymousClass1G4 A172 = AnonymousClass3MW.A17(conversationBannersViewModel.A02);
                do {
                } while (!A172.BFK(A172.getValue(), new AnonymousClass4YW((C108915cV) comparable, r5, new C94414ka(comparable, conversationBannersViewModel, 1), new C94414ka(r5, conversationBannersViewModel, 2), obj2)));
                return;
            }
            return;
        }
        AnonymousClass1G4 A173 = AnonymousClass3MW.A17(conversationBannersViewModel.A02);
        do {
        } while (!A173.BFK(A173.getValue(), new AnonymousClass4YW(r5, (C108915cV) null, new C94414ka(r14, conversationBannersViewModel, 3), new C94404kZ(2), (Object) null)));
    }

    public void A0S() {
        this.A03.BF8((Throwable) null);
    }
}
