package com.whatsapp.group;

import X.AUA;
import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.AnonymousClass8GR;
import X.C179639It;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1", f = "GroupPendingRequestsViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
public final class GroupPendingRequestsViewModel$sendAction$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C179639It $action;
    public final /* synthetic */ int $position;
    public final /* synthetic */ AUA $row;
    public int label;
    public final /* synthetic */ AnonymousClass8GR this$0;

    @DebugMetadata(c = "com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1$1", f = "GroupPendingRequestsViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public static final Integer A00(int i) {
            int i2;
            for (Integer num : AnonymousClass00R.A00(5)) {
                switch (num.intValue()) {
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                if (i2 == i) {
                    return num;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public final C30391dr create(Object obj, C30391dr r8) {
            AnonymousClass8GR r3 = r6;
            return new AnonymousClass1(r4, aua, r3, r8, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0143, code lost:
            r1 = new java.lang.Object[0];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0151, code lost:
            r1 = new java.lang.Object[]{r9};
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0155, code lost:
            r5.A0E(new X.C185919dM(r1, r4, false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x018f, code lost:
            r4 = new X.C185919dM(new java.lang.Object[0], r1, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a2, code lost:
            r4 = new X.C185919dM(new java.lang.Object[0], r1, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a9, code lost:
            r5.A0E(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r1 = r22
                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                r3 = r21
                int r0 = r3.label
                r13 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0014
                if (r0 != r13) goto L_0x000f
                goto L_0x0085
            L_0x000f:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0014:
                X.C30691eM.A01(r1)
                X.8GR r0 = r6     // Catch:{ 4tV -> 0x01ce }
                X.9fY r11 = r0.A0D     // Catch:{ 4tV -> 0x01ce }
                X.AUA r0 = r5     // Catch:{ 4tV -> 0x01ce }
                X.9tC r12 = r0.A05     // Catch:{ 4tV -> 0x01ce }
                X.9It r10 = r4     // Catch:{ 4tV -> 0x01ce }
                r3.label = r13     // Catch:{ 4tV -> 0x01ce }
                X.00H r6 = r11.A03     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r1 = X.C17890vO.A0T(r6)     // Catch:{ 4tV -> 0x01ce }
                X.1MD[] r8 = new X.AnonymousClass1MD[r13]     // Catch:{ 4tV -> 0x01ce }
                com.whatsapp.jid.UserJid r7 = r12.A04     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r5 = "jid"
                X.1MD r0 = new X.1MD     // Catch:{ 4tV -> 0x01ce }
                r0.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r5)     // Catch:{ 4tV -> 0x01ce }
                r9 = 0
                r8[r9] = r0     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r0 = "participant"
                X.1ca r7 = X.AnonymousClass8BR.A0k(r0, r8)     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r0 = r10.value     // Catch:{ 4tV -> 0x01ce }
                X.1ca r5 = new X.1ca     // Catch:{ 4tV -> 0x01ce }
                r5.<init>((X.C29621ca) r7, (java.lang.String) r0, (X.AnonymousClass1MD[]) r2)     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r0 = "membership_requests_action"
                X.1ca r8 = new X.1ca     // Catch:{ 4tV -> 0x01ce }
                r8.<init>((X.C29621ca) r5, (java.lang.String) r0, (X.AnonymousClass1MD[]) r2)     // Catch:{ 4tV -> 0x01ce }
                r0 = 4
                X.1MD[] r7 = new X.AnonymousClass1MD[r0]     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r5 = "xmlns"
                java.lang.String r0 = "w:g2"
                X.C17880vN.A1Q(r5, r0, r7, r9)     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r0 = "id"
                X.C17880vN.A1Q(r0, r1, r7, r13)     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r5 = "type"
                java.lang.String r0 = "set"
                X.C17890vO.A12(r5, r0, r7)     // Catch:{ 4tV -> 0x01ce }
                X.1EC r0 = r12.A01     // Catch:{ 4tV -> 0x01ce }
                X.1ca r16 = X.C29621ca.A00(r0, r8, r7)     // Catch:{ 4tV -> 0x01ce }
                X.3Dp r9 = X.C108975cc.A0k(r3)     // Catch:{ 4tV -> 0x01ce }
                X.1OZ r14 = X.C17880vN.A0U(r6)     // Catch:{ 4tV -> 0x01ce }
                X.AcW r8 = new X.AcW     // Catch:{ 4tV -> 0x01ce }
                r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 4tV -> 0x01ce }
                r19 = 2000(0x7d0, double:9.88E-321)
                r18 = 351(0x15f, float:4.92E-43)
                r15 = r8
                r17 = r1
                r14.A0N(r15, r16, r17, r18, r19)     // Catch:{ 4tV -> 0x01ce }
                java.lang.Object r1 = r9.A00()     // Catch:{ 4tV -> 0x01ce }
                if (r1 != r4) goto L_0x0088
                return r4
            L_0x0085:
                X.C30691eM.A01(r1)     // Catch:{ 4tV -> 0x01ce }
            L_0x0088:
                X.B5E r1 = (X.B5E) r1     // Catch:{ 4tV -> 0x01ce }
                boolean r0 = r1 instanceof X.AUF     // Catch:{ 4tV -> 0x01ce }
                if (r0 == 0) goto L_0x00ba
                X.8GR r7 = r6     // Catch:{ 4tV -> 0x01ce }
                X.AUA r6 = r5     // Catch:{ 4tV -> 0x01ce }
                X.9It r0 = r4     // Catch:{ 4tV -> 0x01ce }
                int r1 = r8     // Catch:{ 4tV -> 0x01ce }
                int r0 = r0.statusOnSuccess     // Catch:{ 4tV -> 0x01ce }
                java.lang.Integer r0 = A00(r0)     // Catch:{ 4tV -> 0x01ce }
                r6.A04 = r0     // Catch:{ 4tV -> 0x01ce }
                X.1wy r0 = r7.A0H     // Catch:{ 4tV -> 0x01ce }
                X.AnonymousClass3MX.A1K(r0, r1)     // Catch:{ 4tV -> 0x01ce }
                X.1DT r0 = r7.A04     // Catch:{ 4tV -> 0x01ce }
                r0.A0E(r2)     // Catch:{ 4tV -> 0x01ce }
                X.9tC r5 = r6.A05     // Catch:{ 4tV -> 0x01ce }
                X.10I r4 = r7.A0J     // Catch:{ 4tV -> 0x01ce }
                r1 = 2
                X.7Pj r0 = new X.7Pj     // Catch:{ 4tV -> 0x01ce }
                r0.<init>(r7, r5, r1)     // Catch:{ 4tV -> 0x01ce }
                r4.CGF(r0)     // Catch:{ 4tV -> 0x01ce }
                X.AnonymousClass8GR.A00(r6, r7, r13)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x01df
            L_0x00ba:
                boolean r0 = r1 instanceof X.AUD     // Catch:{ 4tV -> 0x01ce }
                if (r0 == 0) goto L_0x0161
                X.8GR r8 = r6     // Catch:{ 4tV -> 0x01ce }
                X.AUA r7 = r5     // Catch:{ 4tV -> 0x01ce }
                X.AUD r1 = (X.AUD) r1     // Catch:{ 4tV -> 0x01ce }
                int r4 = r8     // Catch:{ 4tV -> 0x01ce }
                X.9Iv r1 = r1.A00     // Catch:{ 4tV -> 0x01ce }
                r7.A02 = r1     // Catch:{ 4tV -> 0x01ce }
                int r0 = r1.statusMapping     // Catch:{ 4tV -> 0x01ce }
                java.lang.Integer r0 = A00(r0)     // Catch:{ 4tV -> 0x01ce }
                r7.A04 = r0     // Catch:{ 4tV -> 0x01ce }
                X.9Iv r0 = X.C179659Iv.A05     // Catch:{ 4tV -> 0x01ce }
                if (r1 != r0) goto L_0x015e
                X.1DT r0 = r8.A02     // Catch:{ 4tV -> 0x01ce }
                java.util.List r0 = X.AnonymousClass3MW.A10(r0)     // Catch:{ 4tV -> 0x01ce }
                if (r0 == 0) goto L_0x00e1
                r0.remove(r4)     // Catch:{ 4tV -> 0x01ce }
            L_0x00e1:
                X.1wy r0 = r8.A0G     // Catch:{ 4tV -> 0x01ce }
            L_0x00e3:
                X.AnonymousClass3MX.A1K(r0, r4)     // Catch:{ 4tV -> 0x01ce }
                X.1DT r0 = r8.A04     // Catch:{ 4tV -> 0x01ce }
                r0.A0E(r2)     // Catch:{ 4tV -> 0x01ce }
                X.1E7 r1 = r7.A07     // Catch:{ 4tV -> 0x01ce }
                X.1Me r0 = r8.A07     // Catch:{ 4tV -> 0x01ce }
                java.lang.String r9 = r0.A0L(r1)     // Catch:{ 4tV -> 0x01ce }
                if (r9 == 0) goto L_0x00ff
                X.9Iv r0 = r7.A02     // Catch:{ 4tV -> 0x01ce }
                int r0 = r0.ordinal()     // Catch:{ 4tV -> 0x01ce }
                r6 = 0
                switch(r0) {
                    case 1: goto L_0x012c;
                    case 2: goto L_0x0126;
                    case 3: goto L_0x0126;
                    case 4: goto L_0x0146;
                    case 5: goto L_0x0132;
                    case 6: goto L_0x0138;
                    case 7: goto L_0x013e;
                    case 8: goto L_0x0120;
                    default: goto L_0x00ff;
                }     // Catch:{ 4tV -> 0x01ce }
            L_0x00ff:
                java.lang.Integer r1 = r7.A04     // Catch:{ 4tV -> 0x01ce }
                java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ 4tV -> 0x01ce }
                if (r1 == r0) goto L_0x010d
                java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ 4tV -> 0x01ce }
                if (r1 == r0) goto L_0x010d
                java.lang.Integer r0 = X.AnonymousClass00R.A0Y     // Catch:{ 4tV -> 0x01ce }
                if (r1 != r0) goto L_0x011a
            L_0x010d:
                X.9tC r5 = r7.A05     // Catch:{ 4tV -> 0x01ce }
                X.10I r4 = r8.A0J     // Catch:{ 4tV -> 0x01ce }
                r1 = 2
                X.7Pj r0 = new X.7Pj     // Catch:{ 4tV -> 0x01ce }
                r0.<init>(r8, r5, r1)     // Catch:{ 4tV -> 0x01ce }
                r4.CGF(r0)     // Catch:{ 4tV -> 0x01ce }
            L_0x011a:
                r0 = 0
                X.AnonymousClass8GR.A00(r7, r8, r0)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x01df
            L_0x0120:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131891064(0x7f121378, float:1.9416837E38)
                goto L_0x0143
            L_0x0126:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131891059(0x7f121373, float:1.9416827E38)
                goto L_0x0151
            L_0x012c:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131891063(0x7f121377, float:1.9416835E38)
                goto L_0x0151
            L_0x0132:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131891041(0x7f121361, float:1.941679E38)
                goto L_0x0151
            L_0x0138:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131886689(0x7f120261, float:1.9407964E38)
                goto L_0x0143
            L_0x013e:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131891047(0x7f121367, float:1.9416803E38)
            L_0x0143:
                java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ 4tV -> 0x01ce }
                goto L_0x0155
            L_0x0146:
                X.9It r1 = r7.A03     // Catch:{ 4tV -> 0x01ce }
                X.9It r0 = X.C179639It.A02     // Catch:{ 4tV -> 0x01ce }
                if (r1 != r0) goto L_0x00ff
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r4 = 2131891042(0x7f121362, float:1.9416793E38)
            L_0x0151:
                java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ 4tV -> 0x01ce }
                r1[r6] = r9     // Catch:{ 4tV -> 0x01ce }
            L_0x0155:
                X.9dM r0 = new X.9dM     // Catch:{ 4tV -> 0x01ce }
                r0.<init>(r1, r4, r6)     // Catch:{ 4tV -> 0x01ce }
                r5.A0E(r0)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x00ff
            L_0x015e:
                X.1wy r0 = r8.A0H     // Catch:{ 4tV -> 0x01ce }
                goto L_0x00e3
            L_0x0161:
                boolean r0 = r1 instanceof X.AUG     // Catch:{ 4tV -> 0x01ce }
                if (r0 == 0) goto L_0x01ad
                X.8GR r8 = r6     // Catch:{ 4tV -> 0x01ce }
                X.AUA r7 = r5     // Catch:{ 4tV -> 0x01ce }
                X.AUG r1 = (X.AUG) r1     // Catch:{ 4tV -> 0x01ce }
                X.1DT r0 = r8.A04     // Catch:{ 4tV -> 0x01ce }
                r0.A0E(r2)     // Catch:{ 4tV -> 0x01ce }
                java.lang.Integer r0 = r1.A00     // Catch:{ 4tV -> 0x01ce }
                int r0 = r0.intValue()     // Catch:{ 4tV -> 0x01ce }
                r6 = 0
                switch(r0) {
                    case 0: goto L_0x017e;
                    case 1: goto L_0x0184;
                    case 2: goto L_0x018a;
                    case 3: goto L_0x0197;
                    case 4: goto L_0x019d;
                    case 5: goto L_0x019d;
                    default: goto L_0x017a;
                }     // Catch:{ 4tV -> 0x01ce }
            L_0x017a:
                X.AnonymousClass8GR.A00(r7, r8, r6)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x01df
            L_0x017e:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r1 = 2131891062(0x7f121376, float:1.9416833E38)
                goto L_0x018f
            L_0x0184:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r1 = 2131891060(0x7f121374, float:1.941683E38)
                goto L_0x018f
            L_0x018a:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r1 = 2131891061(0x7f121375, float:1.9416831E38)
            L_0x018f:
                java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ 4tV -> 0x01ce }
                X.9dM r4 = new X.9dM     // Catch:{ 4tV -> 0x01ce }
                r4.<init>(r0, r1, r13)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x01a9
            L_0x0197:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r1 = 2131891065(0x7f121379, float:1.941684E38)
                goto L_0x01a2
            L_0x019d:
                X.1wy r5 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r1 = 2131891064(0x7f121378, float:1.9416837E38)
            L_0x01a2:
                java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ 4tV -> 0x01ce }
                X.9dM r4 = new X.9dM     // Catch:{ 4tV -> 0x01ce }
                r4.<init>(r0, r1, r6)     // Catch:{ 4tV -> 0x01ce }
            L_0x01a9:
                r5.A0E(r4)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x017a
            L_0x01ad:
                boolean r0 = r1 instanceof X.AUE     // Catch:{ 4tV -> 0x01ce }
                if (r0 == 0) goto L_0x01df
                X.8GR r8 = r6     // Catch:{ 4tV -> 0x01ce }
                X.AUA r7 = r5     // Catch:{ 4tV -> 0x01ce }
                X.1DT r0 = r8.A04     // Catch:{ 4tV -> 0x01ce }
                r0.A0E(r2)     // Catch:{ 4tV -> 0x01ce }
                X.1wy r6 = r8.A0F     // Catch:{ 4tV -> 0x01ce }
                r5 = 2131891064(0x7f121378, float:1.9416837E38)
                r4 = 0
                java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ 4tV -> 0x01ce }
                X.9dM r0 = new X.9dM     // Catch:{ 4tV -> 0x01ce }
                r0.<init>(r1, r5, r4)     // Catch:{ 4tV -> 0x01ce }
                r6.A0E(r0)     // Catch:{ 4tV -> 0x01ce }
                X.AnonymousClass8GR.A00(r7, r8, r4)     // Catch:{ 4tV -> 0x01ce }
                goto L_0x01df
            L_0x01ce:
                r4 = move-exception
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e9 }
                java.lang.String r0 = "GroupPendingRequestsViewModel/SendAction timeout on "
                r1.append(r0)     // Catch:{ all -> 0x01e9 }
                X.9It r0 = r4     // Catch:{ all -> 0x01e9 }
                java.lang.String r0 = r0.value     // Catch:{ all -> 0x01e9 }
                X.C108985cd.A1M(r0, r1, r4)     // Catch:{ all -> 0x01e9 }
            L_0x01df:
                X.8GR r0 = r6
                X.1DT r0 = r0.A04
                r0.A0E(r2)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x01e9:
                r1 = move-exception
                X.8GR r0 = r6
                X.1DT r0 = r0.A04
                r0.A0E(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPendingRequestsViewModel$sendAction$1(C179639It r2, AUA aua, AnonymousClass8GR r4, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = r4;
        this.$row = aua;
        this.$action = r2;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AnonymousClass8GR r3 = this.this$0;
        return new GroupPendingRequestsViewModel$sendAction$1(this.$action, this.$row, r3, r8, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass8GR r6 = this.this$0;
            final AUA aua = this.$row;
            final C179639It r4 = this.$action;
            final int i2 = this.$position;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass4Z5.A00(this, r3, 2000) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupPendingRequestsViewModel$sendAction$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
