package X;

import android.content.Context;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Qf  reason: invalid class name and case insensitive filesystem */
public abstract class C05050Qf {
    public Map A00;
    public Map A01;
    public List A02;
    public List A03;
    public final Integer A04;
    public final List A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C05050Qf(java.lang.Integer r2) {
        /*
            r1 = this;
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.0wS r0 = X.AnonymousClass1ZU.A09()
            r1.<init>(r2, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05050Qf.<init>(java.lang.Integer):void");
    }

    public abstract long A0C();

    public abstract C17110tl A0D();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        if (r8 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d6 A[LOOP:1: B:23:0x00d6->B:27:0x00f8, LOOP_START, PHI: r0 
      PHI: (r0v44 int) = (r0v15 int), (r0v48 int) binds: [B:22:0x00d4, B:27:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(android.content.Context r27, X.AnonymousClass0KR r28, X.AnonymousClass0Ke r29, X.AnonymousClass0J4 r30, X.C05050Qf r31, java.lang.Object r32, java.lang.Object r33, java.lang.Object r34, boolean r35) {
        /*
            r26 = this;
            r0 = 2
            r13 = r31
            X.C18070vi.A0d(r13, r0)
            r0 = 6
            r12 = r28
            X.C18070vi.A0d(r12, r0)
            r0 = 8
            r11 = r30
            X.C18070vi.A0d(r11, r0)
            boolean r8 = r11.A02()
            r7 = r26
            java.util.List r0 = r7.A02
            int r1 = X.AnonymousClass001.A0m(r0)
            java.util.ArrayList r25 = new java.util.ArrayList
            r0 = r25
            r0.<init>(r1)
            java.util.List r0 = r13.A02
            int r0 = X.AnonymousClass001.A0m(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.List r0 = r7.A03
            int r0 = X.AnonymousClass001.A0m(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.List r0 = r13.A03
            int r0 = X.AnonymousClass001.A0m(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.List r3 = r13.A05     // Catch:{ Exception -> 0x021e }
            java.util.List r2 = r7.A05     // Catch:{ Exception -> 0x021e }
            r14 = r33
            r9 = r34
            long r23 = A04(r14, r9, r3, r2)     // Catch:{ Exception -> 0x021e }
            java.util.List r10 = r13.A02
            java.util.List r1 = r7.A02
            java.util.Map r0 = r13.A00
            r15 = r9
            r16 = r10
            r17 = r1
            r18 = r25
            r19 = r6
            r20 = r0
            A0B(r14, r15, r16, r17, r18, r19, r20)
            java.util.List r10 = r13.A03
            java.util.List r1 = r7.A03
            java.util.Map r0 = r13.A01
            r16 = r10
            r17 = r1
            r18 = r5
            r19 = r4
            r20 = r0
            A0B(r14, r15, r16, r17, r18, r19, r20)
            r0 = r29
            if (r29 == 0) goto L_0x0081
            r0.A06(r11)
        L_0x0081:
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>"
            r13 = r27
            r10 = r32
            if (r35 == 0) goto L_0x00bf
            if (r8 == 0) goto L_0x0094
            java.lang.StringBuilder r0 = A06(r7)
            java.lang.String r15 = ":detach"
            A09(r11, r15, r0)
        L_0x0094:
            int r0 = X.AnonymousClass000.A0Q(r6)
            if (r0 < 0) goto L_0x00c2
        L_0x009a:
            int r16 = r0 + -1
            java.lang.Object r15 = r6.get(r0)
            X.C18070vi.A0z(r15, r1)
            X.0Ij r15 = (X.AnonymousClass0Ij) r15
            A08(r11, r15, r8)
            X.0tO r0 = r15.A00
            java.lang.Class r0 = r0.Bar()
            java.lang.Object r0 = r12.A00(r0)
            r15.A00(r13, r10, r14, r0)
            if (r8 == 0) goto L_0x00ba
            r11.A00()
        L_0x00ba:
            if (r16 < 0) goto L_0x00c2
            r0 = r16
            goto L_0x009a
        L_0x00bf:
            if (r8 == 0) goto L_0x00d0
            goto L_0x00c7
        L_0x00c2:
            if (r8 == 0) goto L_0x00d0
            r11.A00()
        L_0x00c7:
            java.lang.StringBuilder r6 = A06(r7)
            java.lang.String r0 = ":unmount-optional"
            A09(r11, r0, r6)
        L_0x00d0:
            int r0 = X.AnonymousClass000.A0Q(r4)
            if (r0 < 0) goto L_0x00fa
        L_0x00d6:
            int r15 = r0 + -1
            java.lang.Object r6 = r4.get(r0)
            X.C18070vi.A0z(r6, r1)
            X.0Ij r6 = (X.AnonymousClass0Ij) r6
            A08(r11, r6, r8)
            X.0tO r0 = r6.A00
            java.lang.Class r0 = r0.Bar()
            java.lang.Object r0 = r12.A01(r0)
            r6.A00(r13, r10, r14, r0)
            if (r8 == 0) goto L_0x00f6
            r11.A00()
        L_0x00f6:
            if (r15 < 0) goto L_0x00fa
            r0 = r15
            goto L_0x00d6
        L_0x00fa:
            if (r8 == 0) goto L_0x00ff
            r11.A00()
        L_0x00ff:
            r21 = 1
            r19 = 0
            int r0 = (r23 > r19 ? 1 : (r23 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x014f
            if (r8 == 0) goto L_0x0112
            java.lang.StringBuilder r1 = A06(r7)
            java.lang.String r0 = ":unmount-fixed"
            A09(r11, r0, r1)
        L_0x0112:
            if (r2 == 0) goto L_0x014a
            int r0 = r2.size()
            int r15 = r0 + -1
            if (r15 < 0) goto L_0x014a
        L_0x011c:
            int r18 = r15 + -1
            long r0 = r21 << r15
            long r16 = r23 & r0
            int r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0145
            if (r3 == 0) goto L_0x0145
            java.lang.Object r6 = r3.get(r15)
            X.0Ij r6 = (X.AnonymousClass0Ij) r6
            if (r6 == 0) goto L_0x0145
            A08(r11, r6, r8)
            java.lang.Object[] r4 = r12.A00
            r1 = 0
            if (r4 == 0) goto L_0x013d
            r0 = r4[r15]
            r4[r15] = r1
            r1 = r0
        L_0x013d:
            r6.A00(r13, r10, r14, r1)
            if (r8 == 0) goto L_0x0145
            r11.A00()
        L_0x0145:
            if (r18 < 0) goto L_0x014a
            r15 = r18
            goto L_0x011c
        L_0x014a:
            if (r8 == 0) goto L_0x014f
            r11.A00()
        L_0x014f:
            int r0 = (r23 > r19 ? 1 : (r23 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x01a1
            int r6 = X.AnonymousClass001.A0m(r2)
            if (r8 == 0) goto L_0x0162
            java.lang.StringBuilder r1 = A06(r7)
            java.lang.String r0 = ":mount-fixed"
            A09(r11, r0, r1)
        L_0x0162:
            r4 = 0
        L_0x0163:
            if (r4 >= r6) goto L_0x019c
            long r21 = r21 << r4
            long r14 = r23 & r21
            int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0195
            if (r2 == 0) goto L_0x0195
            java.lang.Object r0 = r2.get(r4)
            X.0Ij r0 = (X.AnonymousClass0Ij) r0
            if (r0 == 0) goto L_0x0195
            A08(r11, r0, r8)
            X.0tO r1 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r3 = r1.BD3(r13, r10, r0, r9)
            if (r3 == 0) goto L_0x0190
            java.lang.Object[] r1 = r12.A00
            if (r1 != 0) goto L_0x019a
            java.lang.Object[] r0 = new java.lang.Object[r6]
        L_0x018a:
            r0[r4] = r3
            if (r1 != 0) goto L_0x0190
            r12.A00 = r0
        L_0x0190:
            if (r8 == 0) goto L_0x0195
            r11.A00()
        L_0x0195:
            int r4 = r4 + 1
            r21 = 1
            goto L_0x0163
        L_0x019a:
            r0 = r1
            goto L_0x018a
        L_0x019c:
            if (r8 == 0) goto L_0x01a1
            r11.A00()
        L_0x01a1:
            java.util.List r0 = r7.A03
            int r6 = X.AnonymousClass001.A0m(r0)
            if (r8 == 0) goto L_0x01b2
            java.lang.StringBuilder r1 = A06(r7)
            java.lang.String r0 = ":mount-optional"
            A09(r11, r0, r1)
        L_0x01b2:
            int r4 = r5.size()
            r3 = 0
        L_0x01b7:
            if (r3 >= r4) goto L_0x01d9
            java.lang.Object r0 = r5.get(r3)
            X.0Ij r0 = (X.AnonymousClass0Ij) r0
            A08(r11, r0, r8)
            X.0tO r2 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r1 = r2.BD3(r13, r10, r0, r9)
            java.lang.Class r0 = r2.Bar()
            r12.A03(r0, r1, r6)
            if (r8 == 0) goto L_0x01d6
            r11.A00()
        L_0x01d6:
            int r3 = r3 + 1
            goto L_0x01b7
        L_0x01d9:
            if (r8 == 0) goto L_0x01de
            r11.A00()
        L_0x01de:
            java.util.List r0 = r7.A02
            int r5 = X.AnonymousClass001.A0m(r0)
            if (r8 == 0) goto L_0x01ef
            java.lang.StringBuilder r1 = A06(r7)
            java.lang.String r0 = ":attach"
            A09(r11, r0, r1)
        L_0x01ef:
            int r4 = r25.size()
            r3 = 0
        L_0x01f4:
            if (r3 >= r4) goto L_0x0218
            r0 = r25
            java.lang.Object r0 = r0.get(r3)
            X.0Ij r0 = (X.AnonymousClass0Ij) r0
            A08(r11, r0, r8)
            X.0tO r2 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r1 = r2.BD3(r13, r10, r0, r9)
            java.lang.Class r0 = r2.Bar()
            r12.A02(r0, r1, r5)
            if (r8 == 0) goto L_0x0215
            r11.A00()
        L_0x0215:
            int r3 = r3 + 1
            goto L_0x01f4
        L_0x0218:
            if (r8 == 0) goto L_0x021d
            r11.A00()
        L_0x021d:
            return
        L_0x021e:
            r2 = move-exception
            java.lang.String r1 = "Exception resolving fixed mount binders to update"
            X.0aW r0 = new X.0aW
            r0.<init>(r7, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05050Qf.A0F(android.content.Context, X.0KR, X.0Ke, X.0J4, X.0Qf, java.lang.Object, java.lang.Object, java.lang.Object, boolean):void");
    }

    public void A0G(Context context, AnonymousClass0KR r9, AnonymousClass0J4 r10, Object obj, Object obj2) {
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r10, 4);
        List list = this.A02;
        if (list != null) {
            boolean A022 = r10.A02();
            int size = list.size();
            if (A022) {
                A09(r10, ":attach", A06(this));
            }
            for (int i = 0; i < size; i++) {
                AnonymousClass0Ij r0 = (AnonymousClass0Ij) list.get(i);
                A08(r10, r0, A022 ? 1 : 0);
                C16890tO r2 = r0.A00;
                r9.A02(r2.Bar(), r2.BD3(context, obj, r0.A01, obj2), size);
                if (A022) {
                    r10.A00();
                }
            }
            if (A022) {
                r10.A00();
            }
        }
    }

    public void A0H(Context context, AnonymousClass0KR r7, AnonymousClass0J4 r8, Object obj, Object obj2) {
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r8, 4);
        List list = this.A02;
        if (list != null) {
            boolean A022 = r8.A02();
            if (A022) {
                A09(r8, ":detach", A06(this));
            }
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj3 = list.get(size);
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>");
                    AnonymousClass0Ij r1 = (AnonymousClass0Ij) obj3;
                    A08(r8, r1, A022 ? 1 : 0);
                    r1.A00(context, obj, obj2, r7.A00(r1.A00.Bar()));
                    if (A022) {
                        r8.A00();
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            if (A022) {
                r8.A00();
            }
        }
    }

    public void A0I(Context context, AnonymousClass0KR r10, AnonymousClass0J4 r11, Object obj, Object obj2) {
        C07190aW r1;
        Object[] objArr;
        C18070vi.A0d(obj, 1);
        C18070vi.A0d(r10, 3);
        C18070vi.A0d(r11, 4);
        boolean A022 = r11.A02();
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            if (A022) {
                A09(r11, ":mount-fixed", A06(this));
            }
            int i = 0;
            while (i < size) {
                AnonymousClass0Ij r4 = (AnonymousClass0Ij) list.get(i);
                A08(r11, r4, A022 ? 1 : 0);
                try {
                    Object BD3 = r4.A00.BD3(context, obj, r4.A01, obj2);
                    if (BD3 != null) {
                        Object[] objArr2 = r10.A00;
                        if (objArr2 == null) {
                            objArr = new Object[size];
                        } else {
                            objArr = objArr2;
                        }
                        objArr[i] = BD3;
                        if (objArr2 == null) {
                            r10.A00 = objArr;
                        }
                    }
                    if (A022) {
                        r11.A00();
                    }
                    i++;
                } catch (Exception e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Exception binding fixed mount binder: ");
                    r1 = new C07190aW(this, AnonymousClass000.A0y(r4.A00.BQX(), A10), e);
                } catch (Throwable th) {
                    if (A022) {
                        r11.A00();
                    }
                    throw th;
                }
            }
            if (A022) {
                r11.A00();
            }
        }
        List list2 = this.A03;
        A022 = r11.A02();
        if (list2 != null) {
            int size2 = list2.size();
            if (A022) {
                A09(r11, ":mount-optional", A06(this));
            }
            int i2 = 0;
            while (i2 < size2) {
                AnonymousClass0Ij r42 = (AnonymousClass0Ij) list2.get(i2);
                A08(r11, r42, A022 ? 1 : 0);
                try {
                    r10.A03(r42.A00.Bar(), r42.A00.BD3(context, obj, r42.A01, obj2), size2);
                    if (A022) {
                        r11.A00();
                    }
                    i2++;
                } catch (Exception e2) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Exception while mounting optional mount binder: ");
                    r1 = new C07190aW(this, AnonymousClass000.A0y(r42.A00.BQX(), A102), e2);
                    throw r1;
                }
            }
            if (A022) {
                r11.A00();
            }
        }
    }

    public void A0J(Context context, AnonymousClass0KR r7, AnonymousClass0J4 r8, Object obj, Object obj2) {
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r8, 4);
        List list = this.A03;
        if (list != null) {
            boolean A022 = r8.A02();
            if (A022) {
                A09(r8, ":unmount-optional", A06(this));
            }
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj3 = list.get(size);
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit.unmountBinders$lambda$5, kotlin.Any>");
                    AnonymousClass0Ij r4 = (AnonymousClass0Ij) obj3;
                    A08(r8, r4, A022 ? 1 : 0);
                    try {
                        r4.A00(context, obj, obj2, r7.A01(r4.A00.Bar()));
                        if (A022) {
                            r8.A00();
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } catch (Exception e) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Exception while unmounting optional binder: [");
                        A10.append(A0E());
                        A10.append("] ");
                        throw new C07190aW(this, AnonymousClass000.A0y(r4.A00.BQX(), A10), e);
                    } catch (Throwable th) {
                        if (A022) {
                            r8.A00();
                        }
                        throw th;
                    }
                }
            }
            if (A022) {
                r8.A00();
            }
        }
        A07(context, r7, r8, obj, obj2);
    }

    public void A0K(AnonymousClass0Ij r3) {
        C18070vi.A0d(r3, 0);
        List list = this.A02;
        List list2 = list;
        if (list == null) {
            list = AnonymousClass000.A13();
        }
        if (list2 == null) {
            this.A02 = list;
            if (this.A00 == null) {
                this.A00 = new HashMap();
            } else {
                throw AnonymousClass000.A0n("Binder Map and Binder List out of sync!");
            }
        }
        Map map = this.A00;
        if (map != null) {
            A0A(r3, list, map);
        }
    }

    public void A0L(AnonymousClass0Ij r3) {
        C18070vi.A0d(r3, 0);
        List list = this.A03;
        List list2 = list;
        if (list == null) {
            list = AnonymousClass000.A13();
        }
        if (list2 == null) {
            this.A03 = list;
            if (this.A01 == null) {
                this.A01 = new HashMap();
            } else {
                throw AnonymousClass000.A0n("Binder Map and Binder List out of sync!");
            }
        }
        Map map = this.A01;
        if (map != null) {
            A0A(r3, list, map);
        }
    }

    public static final long A04(Object obj, Object obj2, List list, List list2) {
        Integer num;
        Integer num2;
        Integer num3;
        long j = 0;
        if ((list != null && !list.isEmpty()) || (list2 != null && !list2.isEmpty())) {
            Integer num4 = null;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (list2 != null) {
                num2 = Integer.valueOf(list2.size());
            } else {
                num2 = null;
            }
            if (!C18070vi.A18(num, num2)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Current and new fixed Mount Binders are of sync: \ncurrentFixedBinders.size() = ");
                if (list != null) {
                    num3 = Integer.valueOf(list.size());
                } else {
                    num3 = null;
                }
                A10.append(num3);
                A10.append("\nnewFixedBinders.size() = ");
                if (list2 != null) {
                    num4 = Integer.valueOf(list2.size());
                }
                A10.append(num4);
                throw AnonymousClass000.A0m(A10);
            } else if (!(list == null || list2 == null)) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any, kotlin.Any, kotlin.Any>");
                    Object obj4 = list2.get(i);
                    C18070vi.A0z(obj4, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any, kotlin.Any, kotlin.Any>");
                    if (((AnonymousClass0Ij) obj4).A01((AnonymousClass0Ij) obj3, obj, obj2)) {
                        j |= 1 << i;
                    }
                }
            }
        }
        return j;
    }

    public static StringBuilder A06(C05050Qf r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A0E());
        return sb;
    }

    public static void A08(AnonymousClass0J4 r1, AnonymousClass0Ij r2, int i) {
        if (i != 0) {
            r1.A01(A05(r2.A00.BQX()));
        }
    }

    public static final void A0A(AnonymousClass0Ij r4, List list, Map map) {
        Class Bar = r4.A00.Bar();
        if (map.put(Bar, r4) != null) {
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (!C18070vi.A18(((AnonymousClass0Ij) list.get(size)).A00.Bar(), Bar)) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        list.remove(size);
                        break;
                    }
                }
            }
            throw AnonymousClass000.A0n("Binder Map and Binder List out of sync!");
        }
        list.add(r4);
    }

    public static final void A0B(Object obj, Object obj2, List list, List list2, List list3, List list4, Map map) {
        AnonymousClass0Ij r1;
        if (list == null || list.isEmpty()) {
            if (list2 != null) {
                list3.addAll(list2);
            }
        } else if (list2 == null || list2.isEmpty()) {
            list4.addAll(list);
        } else {
            HashMap hashMap = new HashMap(list2.size());
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass0Ij r5 = (AnonymousClass0Ij) list2.get(i);
                Class Bar = r5.A00.Bar();
                if (!(map == null || (r1 = (AnonymousClass0Ij) map.get(Bar)) == null)) {
                    C18070vi.A0z(r5, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any, kotlin.Any, kotlin.Any>");
                    boolean A012 = r5.A01(r1, obj, obj2);
                    hashMap.put(Bar, Boolean.valueOf(A012));
                    if (!A012) {
                    }
                }
                list3.add(r5);
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnonymousClass0Ij r2 = (AnonymousClass0Ij) list.get(i2);
                Class Bar2 = r2.A00.Bar();
                if (!hashMap.containsKey(Bar2) || C18070vi.A18(hashMap.get(Bar2), AnonymousClass000.A0i())) {
                    list4.add(r2);
                }
            }
        }
    }

    public static final String A05(String str) {
        if (str.length() <= 127) {
            return str;
        }
        String substring = str.substring(0, StringTreeSet.OFFSET_BASE_ENCODING);
        C18070vi.A0X(substring);
        return substring;
    }

    private final void A07(Context context, AnonymousClass0KR r10, AnonymousClass0J4 r11, Object obj, Object obj2) {
        boolean A022 = r11.A02();
        List list = this.A05;
        if (list != null) {
            if (A022) {
                A09(r11, ":unmount-fixed", A06(this));
            }
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj3 = list.get(size);
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>");
                    AnonymousClass0Ij r4 = (AnonymousClass0Ij) obj3;
                    A08(r11, r4, A022 ? 1 : 0);
                    try {
                        Object[] objArr = r10.A00;
                        Object obj4 = null;
                        if (objArr != null) {
                            Object obj5 = objArr[size];
                            objArr[size] = null;
                            obj4 = obj5;
                        }
                        r4.A00(context, obj, obj2, obj4);
                        if (A022) {
                            r11.A00();
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } catch (Exception e) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Exception while unmounting fixed binder: ");
                        throw new C07190aW(this, AnonymousClass000.A0y(r4.A00.BQX(), A10), e);
                    } catch (Throwable th) {
                        if (A022) {
                            r11.A00();
                        }
                        throw th;
                    }
                }
            }
            if (A022) {
                r11.A00();
            }
        }
    }

    public static void A09(AnonymousClass0J4 r1, String str, StringBuilder sb) {
        sb.append(str);
        r1.A01(A05(sb.toString()));
    }

    public String A0E() {
        return C25321CdS.A00(getClass());
    }

    public final Integer BY5() {
        return this.A04;
    }

    public C05050Qf(Integer num, List list, List list2, List list3) {
        C18070vi.A0d(list2, 3);
        C18070vi.A0d(list3, 4);
        if (list.size() <= 64) {
            this.A04 = num;
            this.A05 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                A0L((AnonymousClass0Ij) list2.get(i));
            }
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                A0K((AnonymousClass0Ij) list3.get(i2));
            }
            return;
        }
        throw AnonymousClass000.A0n("Too many fixed mount binders. Max is 64");
    }
}
