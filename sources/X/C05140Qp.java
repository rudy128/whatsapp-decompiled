package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Qp  reason: invalid class name and case insensitive filesystem */
public class C05140Qp {
    public AnonymousClass0Ke A00;
    public C04240Mk A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C001100p A05 = new C001100p(10);
    public final AnonymousClass0J4 A06;
    public final AnonymousClass05E A07;

    public C05140Qp(AnonymousClass05E r3, AnonymousClass0J4 r4) {
        C18070vi.A0d(r4, 2);
        this.A07 = r3;
        this.A06 = r4;
        Context context = r3.getContext();
        C18070vi.A0X(context);
        this.A04 = context;
    }

    public static Object A00(Context context, C17110tl r5, AnonymousClass0ME r6) {
        Object BHD;
        String str;
        AnonymousClass0K6 A012;
        C18070vi.A0d(r6, 2);
        if (!r5.BXH().A00 || (A012 = AnonymousClass0QO.A01(context, r5, r6)) == null || (BHD = A012.A00()) == null) {
            boolean A022 = AnonymousClass0O7.A01.A02();
            if (A022) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MountContentPools:createMountContent ");
                Class BXG = r5.BXG();
                if (BXG == null || (str = BXG.getSimpleName()) == null) {
                    str = BXG.toString();
                }
                AnonymousClass0O7.A01(AnonymousClass000.A0y(str, A10));
            }
            BHD = r5.BHD(context);
            if (A022) {
                AnonymousClass0O7.A00();
                return BHD;
            }
        }
        return BHD;
    }

    public static void A03(Context context, C17110tl r2, AnonymousClass0ME r3, Object obj) {
        C18070vi.A0d(r3, 3);
        AnonymousClass0QO.A05(context, r2, r3, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3[r4] == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(java.lang.Object[] r2, java.lang.Object[] r3, int r4) {
        /*
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            if (r3 == 0) goto L_0x000b
            r0 = r3[r4]
            r1 = 1
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r0 = 0
            if (r1 == 0) goto L_0x0014
            if (r3 == 0) goto L_0x0013
            r3[r4] = r0
        L_0x0013:
            return
        L_0x0014:
            r2[r4] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05140Qp.A0C(java.lang.Object[], java.lang.Object[], int):void");
    }

    private final void A01() {
        C001100p r1 = this.A05;
        C03330Hq r2 = (C03330Hq) r1.A05(0);
        if (r2 != null) {
            if (r2.A02) {
                A05(r2);
            }
            r1.A08(0);
            C04240Mk r0 = this.A01;
            if (r0 != null) {
                RenderTreeNode renderTreeNode = r0.A03;
                C05050Qf r3 = renderTreeNode.A07;
                C18070vi.A0z(r3, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                Object obj = r2.A04;
                AnonymousClass0KR r5 = r2.A03;
                AnonymousClass0Ke r02 = this.A00;
                if (r02 != null) {
                    r02.A05();
                }
                r3.A0J(this.A04, r5, this.A06, obj, renderTreeNode.A08);
                return;
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
    }

    private final void A02(long j) {
        C001100p r9 = this.A05;
        C03330Hq r2 = (C03330Hq) r9.A05(j);
        if (r2 != null) {
            AnonymousClass0J4 r14 = this.A06;
            boolean A022 = r14.A02();
            RenderTreeNode renderTreeNode = r2.A01;
            C05050Qf r11 = renderTreeNode.A07;
            C18070vi.A0z(r11, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
            Object obj = r2.A04;
            AnonymousClass0OA.A01();
            if (A022) {
                A08(r14, r11, "UnmountItem: ", AnonymousClass000.A10());
            }
            if (RenderTreeNode.A00(renderTreeNode).size() > 0) {
                int size = RenderTreeNode.A00(renderTreeNode).size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    A02(((RenderTreeNode) RenderTreeNode.A00(renderTreeNode).get(size)).A07.A0C());
                }
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                if (((AnonymousClass05E) obj).getMountItemCount() > 0) {
                    throw AnonymousClass000.A0n("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            long A0C = r11.A0C();
            if (A0C == 0) {
                A01();
            } else {
                r9.A08(A0C);
                AnonymousClass05E r8 = r2.A00;
                if (A022) {
                    A08(r14, r11, "UnmountItem:remove: ", AnonymousClass000.A10());
                }
                if (r8 != null) {
                    C01930Bz r82 = (C01930Bz) r8;
                    int A002 = C01930Bz.A00(r82, r2);
                    if (r2.A01.A07.A04 == AnonymousClass00R.A00) {
                        C01930Bz.A0A(r82, r2);
                    } else {
                        C01930Bz.A0B(r82, r2);
                        r82.A02 = true;
                    }
                    A0C(r82.A03, r82.A04, A002);
                    C03330Hq[] r7 = r82.A04;
                    if (r7 != null) {
                        int length = r7.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (r7[i] != null) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        r2.A00 = null;
                    }
                    r82.A04 = null;
                    r2.A00 = null;
                }
                if (A022) {
                    r14.A00();
                }
                if (r2.A02) {
                    if (A022) {
                        A08(r14, r11, "UnmountItem:unbind: ", AnonymousClass000.A10());
                    }
                    A05(r2);
                    if (A022) {
                        r14.A00();
                    }
                }
                if (obj instanceof View) {
                    ((View) obj).setPadding(0, 0, 0, 0);
                }
                if (A022) {
                    A08(r14, r11, "UnmountItem:unmount: ", AnonymousClass000.A10());
                }
                AnonymousClass0KR r13 = r2.A03;
                AnonymousClass0Ke r0 = this.A00;
                if (r0 != null) {
                    r0.A05();
                }
                Context context = this.A04;
                r11.A0J(context, r13, r14, obj, renderTreeNode.A08);
                if (A022) {
                    r14.A00();
                }
                RenderTreeNode renderTreeNode2 = r2.A01;
                A03(context, renderTreeNode2.A07.A0D(), renderTreeNode2.A05, obj);
            }
            if (A022) {
                r14.A00();
            }
        }
    }

    private final void A04(C03330Hq r8) {
        C05050Qf r1 = r8.A01.A07;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        r1.A0G(this.A04, r8.A03, this.A06, r8.A04, r8.A01.A08);
        AnonymousClass0Ke r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        r8.A02 = true;
    }

    private final void A05(C03330Hq r8) {
        C05050Qf r1 = r8.A01.A07;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        Object obj = r8.A04;
        Object obj2 = r8.A01.A08;
        AnonymousClass0Ke r0 = this.A00;
        if (r0 != null) {
            r0.A04();
        }
        r1.A0H(this.A04, r8.A03, this.A06, obj, obj2);
        r8.A02 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (((android.view.View) r13).isLayoutRequested() == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.C03330Hq r17, com.facebook.rendercore.RenderTreeNode r18) {
        /*
            r16 = this;
            r9 = r16
            X.0Ke r3 = r9.A00
            X.0J4 r2 = r9.A06
            boolean r8 = r2.A02()
            r4 = r18
            X.0Qf r11 = r4.A07
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>"
            X.C18070vi.A0z(r11, r1)
            java.lang.Object r15 = r4.A08
            r10 = r17
            com.facebook.rendercore.RenderTreeNode r0 = r10.A01
            X.0Qf r12 = r0.A07
            X.C18070vi.A0z(r12, r1)
            java.lang.Object r14 = r0.A08
            java.lang.Object r13 = r10.A04
            r10.A01 = r4
            boolean r0 = r9.A0L(r12, r11, r14, r15)
            if (r0 == 0) goto L_0x0077
            X.AnonymousClass0OA.A01()
            if (r8 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UpdateItem: "
            A08(r2, r11, r0, r1)
        L_0x0038:
            r9.A0I(r10, r11, r12, r13, r14, r15)
            if (r8 == 0) goto L_0x0040
            r2.A00()
        L_0x0040:
            r0 = 1
            r10.A02 = r0
            if (r8 == 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "UpdateBounds: "
            A08(r2, r11, r0, r1)
        L_0x004e:
            long r6 = r11.A0C()
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            boolean r0 = r13 instanceof android.view.View
            if (r0 == 0) goto L_0x0066
            r0 = r13
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isLayoutRequested()
            r1 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            com.facebook.rendercore.RenderTreeNode r0 = r10.A01
            A07(r2, r0, r13, r1)
            if (r3 == 0) goto L_0x0071
            r3.A02()
        L_0x0071:
            if (r8 == 0) goto L_0x0076
            r2.A00()
        L_0x0076:
            return
        L_0x0077:
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0040
            r9.A04(r10)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05140Qp.A06(X.0Hq, com.facebook.rendercore.RenderTreeNode):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r15 == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r14.getBottom() == r1) goto L_0x009e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass0J4 r12, com.facebook.rendercore.RenderTreeNode r13, java.lang.Object r14, boolean r15) {
        /*
            android.graphics.Rect r0 = r13.A03
            android.graphics.Rect r9 = r13.A04
            int r4 = r0.left
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            r5 = 1
            boolean r0 = r12.A02()
            r11 = 0
            if (r0 != r5) goto L_0x001a
            r11 = 1
            java.lang.String r0 = "applyBoundsToMountContent"
            r12.A01(r0)
        L_0x001a:
            boolean r0 = r14 instanceof android.view.View     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x0080
            android.view.View r14 = (android.view.View) r14     // Catch:{ all -> 0x00b3 }
            int r8 = r2 - r4
            int r7 = r1 - r3
            if (r9 == 0) goto L_0x0035
            boolean r0 = r14 instanceof X.AnonymousClass05E     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x0035
            int r10 = r9.left     // Catch:{ all -> 0x00b3 }
            int r6 = r9.top     // Catch:{ all -> 0x00b3 }
            int r5 = r9.right     // Catch:{ all -> 0x00b3 }
            int r0 = r9.bottom     // Catch:{ all -> 0x00b3 }
            r14.setPadding(r10, r6, r5, r0)     // Catch:{ all -> 0x00b3 }
        L_0x0035:
            if (r15 != 0) goto L_0x0043
            int r0 = r14.getMeasuredHeight()     // Catch:{ all -> 0x00b3 }
            if (r0 != r7) goto L_0x0043
            int r0 = r14.getMeasuredWidth()     // Catch:{ all -> 0x00b3 }
            if (r0 == r8) goto L_0x0052
        L_0x0043:
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)     // Catch:{ all -> 0x00b3 }
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)     // Catch:{ all -> 0x00b3 }
            r14.measure(r5, r0)     // Catch:{ all -> 0x00b3 }
            if (r15 != 0) goto L_0x006a
        L_0x0052:
            int r0 = r14.getLeft()     // Catch:{ all -> 0x00b3 }
            if (r0 != r4) goto L_0x006a
            int r0 = r14.getTop()     // Catch:{ all -> 0x00b3 }
            if (r0 != r3) goto L_0x006a
            int r0 = r14.getRight()     // Catch:{ all -> 0x00b3 }
            if (r0 != r2) goto L_0x006a
            int r0 = r14.getBottom()     // Catch:{ all -> 0x00b3 }
            if (r0 == r1) goto L_0x009e
        L_0x006a:
            r14.layout(r4, r3, r2, r1)     // Catch:{ NullPointerException -> 0x006e }
            goto L_0x009e
        L_0x006e:
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0Z(r1)     // Catch:{ all -> 0x00b3 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0Z(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x009e
        L_0x0080:
            boolean r0 = r14 instanceof android.graphics.drawable.Drawable     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x00a4
            if (r9 == 0) goto L_0x0092
            int r0 = r9.left     // Catch:{ all -> 0x00b3 }
            int r4 = r4 + r0
            int r0 = r9.top     // Catch:{ all -> 0x00b3 }
            int r3 = r3 + r0
            int r0 = r9.right     // Catch:{ all -> 0x00b3 }
            int r2 = r2 - r0
            int r0 = r9.bottom     // Catch:{ all -> 0x00b3 }
            int r1 = r1 - r0
        L_0x0092:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14     // Catch:{ all -> 0x00b3 }
            android.graphics.Rect r0 = r14.getBounds()     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00b3 }
            r14.setBounds(r4, r3, r2, r1)     // Catch:{ all -> 0x00b3 }
        L_0x009e:
            if (r11 == 0) goto L_0x00a3
            r12.A00()
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "Unsupported mounted content "
            java.lang.String r0 = X.AnonymousClass001.A1E(r14, r0, r1)     // Catch:{ all -> 0x00b3 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00b3 }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            if (r11 == 0) goto L_0x00b9
            r12.A00()
        L_0x00b9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05140Qp.A07(X.0J4, com.facebook.rendercore.RenderTreeNode, java.lang.Object, boolean):void");
    }

    private final void A09(C04240Mk r13) {
        Object obj;
        C04240Mk r5 = this.A01;
        if (r5 != null && r13 != null) {
            AnonymousClass0J4 r4 = this.A06;
            boolean A022 = r4.A02();
            if (A022) {
                r4.A01("unmountOrMoveOldItems");
            }
            RenderTreeNode[] renderTreeNodeArr = r13.A04;
            int length = renderTreeNodeArr.length;
            for (int i = 1; i < length; i++) {
                C05050Qf r10 = renderTreeNodeArr[i].A07;
                int A0M = AnonymousClass000.A0M(r5.A01.A06(-1, r10.A0C()));
                C001100p r7 = this.A05;
                C03330Hq r8 = (C03330Hq) r7.A05(r10.A0C());
                if (r8 != null) {
                    if (A0M >= 0) {
                        RenderTreeNode renderTreeNode = r5.A04[A0M];
                        if (renderTreeNode != null) {
                            RenderTreeNode renderTreeNode2 = renderTreeNode.A06;
                            if (renderTreeNode2 != null) {
                                C03330Hq r0 = (C03330Hq) r7.A05(renderTreeNode2.A07.A0C());
                                if (r0 != null) {
                                    obj = r0.A04;
                                    C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                                } else {
                                    obj = null;
                                }
                                AnonymousClass05E r72 = r8.A00;
                                if (r72 != null && r72 == obj) {
                                    int i2 = r8.A01.A02;
                                    int i3 = renderTreeNode.A02;
                                    if (i2 != i3) {
                                        r72.A0C(r8, i2, i3);
                                    }
                                }
                            } else {
                                throw AnonymousClass000.A0n("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass000.A0n("Required value was null.");
                        }
                    }
                    A02(r8.A01.A07.A0C());
                }
            }
            if (A022) {
                r4.A00();
            }
        }
    }

    private final void A0A(RenderTreeNode renderTreeNode) {
        AnonymousClass05E r8 = this.A07;
        C03330Hq r3 = new C03330Hq(renderTreeNode, r8);
        C05050Qf r4 = renderTreeNode.A07;
        C18070vi.A0z(r4, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        AnonymousClass0KR r6 = r3.A03;
        AnonymousClass0OA.A01();
        r4.A0I(this.A04, r6, this.A06, r8, renderTreeNode.A08);
        AnonymousClass0Ke r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
        this.A05.A0A(0, r3);
        A04(r3);
    }

    public static final void A0B(C05050Qf r4, C05050Qf r5, Object obj) {
        if (!(obj instanceof AnonymousClass05E)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("\n            Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
            A10.append(obj.getClass().getSimpleName());
            A10.append("'.\n            Parent RenderUnit: id=");
            A10.append(r5.A0C());
            A10.append("; poolKey='");
            A10.append(r5.A0D().BXG());
            A10.append("'.\n            Child RenderUnit: id=");
            A10.append(r4.A0C());
            A10.append("; poolKey='");
            A10.append(r4.A0D().BXG());
            throw new RuntimeException(AnonymousClass1Y7.A01(AnonymousClass000.A0y("'.\n            ", A10)));
        }
    }

    public static final boolean A0D(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (!(obj instanceof C15880rM) || !(obj2 instanceof C15880rM)) {
            return C25322CdT.A01(obj, obj2);
        }
        C15880rM r1 = (C15880rM) obj;
        C15880rM r2 = (C15880rM) obj2;
        if (r1 == r2) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }
        return ((C17780vD) r1).Beg((C17780vD) r2);
    }

    public void A0E() {
        C04240Mk r1 = this.A01;
        if (r1 != null) {
            AnonymousClass0J4 r6 = this.A06;
            boolean A022 = r6.A02();
            if (A022) {
                r6.A01("MountState.bind");
            }
            for (RenderTreeNode renderTreeNode : r1.A04) {
                C03330Hq r12 = (C03330Hq) this.A05.A05(renderTreeNode.A07.A0C());
                if (r12 != null && !r12.A02) {
                    Object obj = r12.A04;
                    A04(r12);
                    if ((obj instanceof View) && !(obj instanceof AnonymousClass05E) && ((View) obj).isLayoutRequested()) {
                        A07(r6, r12.A01, obj, true);
                    }
                }
            }
            if (A022) {
                r6.A00();
            }
        }
    }

    public void A0F() {
        C04240Mk r1 = this.A01;
        if (r1 != null) {
            AnonymousClass0J4 r5 = this.A06;
            boolean A022 = r5.A02();
            if (A022) {
                r5.A01("MountState.unbind");
                r5.A01("MountState.unbindAllContent");
            }
            for (RenderTreeNode renderTreeNode : r1.A04) {
                C03330Hq r12 = (C03330Hq) this.A05.A05(renderTreeNode.A07.A0C());
                if (r12 != null && r12.A02) {
                    A05(r12);
                }
            }
            if (A022) {
                r5.A00();
                r5.A01("MountState.unbindExtensions");
            }
            AnonymousClass0Ke r0 = this.A00;
            if (r0 != null) {
                List list = r0.A01;
                if (0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass000.A0s("onUnbind");
                }
            }
            if (A022) {
                r5.A00();
                r5.A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0G() {
        try {
            C01930Bz r5 = (C01930Bz) this.A07;
            r5.A01 = true;
            if (this.A01 == null) {
                A0H();
            } else {
                AnonymousClass0J4 r3 = this.A06;
                boolean A022 = r3.A02();
                if (A022) {
                    r3.A01("MountState.unmountAllItems");
                }
                A02(0);
                A0H();
                if (A022) {
                    r3.A00();
                }
                this.A02 = true;
                this.A01 = null;
            }
            r5.A01 = false;
        } catch (Throwable th) {
            ((C01930Bz) this.A07).A01 = false;
            throw th;
        }
    }

    public void A0H() {
        AnonymousClass0Ke r3 = this.A00;
        if (r3 != null) {
            List list = r3.A01;
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass000.A0s("onUnbind");
            }
            List list2 = r3.A01;
            if (0 < list2.size()) {
                list2.get(0);
                throw AnonymousClass000.A0s("onUnmount");
            } else {
                list2.clear();
            }
        }
    }

    public void A0I(C03330Hq r11, C05050Qf r12, C05050Qf r13, Object obj, Object obj2, Object obj3) {
        Context context = this.A04;
        AnonymousClass0Ke r3 = this.A00;
        C05050Qf r0 = r12;
        r0.A0F(context, r11.A03, r3, this.A06, r13, obj, obj2, obj3, r11.A02);
    }

    public void A0J(C04240Mk r13) {
        Throwable th;
        if (r13 != null) {
            AnonymousClass0OA.A01();
            System.currentTimeMillis();
            AnonymousClass0CT r5 = AnonymousClass0CT.DEBUG;
            if (r5.compareTo(AnonymousClass0OA.A00()) >= 0) {
                Set set = AnonymousClass0OA.A00;
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AnonymousClass000.A0s("getEvents");
                    }
                }
            }
            try {
                if (!this.A03) {
                    this.A03 = true;
                    C04240Mk r4 = this.A01;
                    if (!r13.equals(r4) || this.A02) {
                        this.A01 = r13;
                        AnonymousClass0J4 r3 = this.A06;
                        boolean A022 = r3.A02();
                        AnonymousClass05E r2 = this.A07;
                        if (A022) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("MountState.mount");
                            r3.A01(AnonymousClass000.A0y("", A10));
                            r3.A01("RenderCoreExtension.beforeMount");
                            r3.A00();
                            r3.A01("MountState.prepareMount");
                        }
                        A09(r4);
                        C001100p r8 = this.A05;
                        C03330Hq r1 = (C03330Hq) r8.A05(0);
                        C04240Mk r0 = this.A01;
                        if (r0 != null) {
                            RenderTreeNode renderTreeNode = r0.A04[0];
                            if (r1 == null) {
                                A0A(renderTreeNode);
                            } else {
                                A06(r1, renderTreeNode);
                            }
                            if (A022) {
                                r3.A00();
                            }
                            RenderTreeNode[] renderTreeNodeArr = r13.A04;
                            int length = renderTreeNodeArr.length;
                            for (int i = 1; i < length; i++) {
                                RenderTreeNode renderTreeNode2 = renderTreeNodeArr[i];
                                AnonymousClass0Ke r02 = this.A00;
                                if (r02 != null) {
                                    r02.A07(renderTreeNode2);
                                }
                                C03330Hq r03 = (C03330Hq) r8.A05(renderTreeNode2.A07.A0C());
                                if (r03 != null) {
                                    A06(r03, renderTreeNode2);
                                } else {
                                    A0K(renderTreeNode2);
                                }
                            }
                            this.A02 = false;
                            if (A022) {
                                r3.A00();
                                r3.A01("RenderCoreExtension.afterMount");
                            }
                            AnonymousClass0Ke r04 = this.A00;
                            if (r04 != null) {
                                List list = r04.A01;
                                if (0 < list.size()) {
                                    list.get(0);
                                    th = AnonymousClass000.A0s("afterMount");
                                }
                            }
                            if (A022) {
                                r3.A00();
                            }
                            this.A03 = false;
                            if (this.A00 != null) {
                                if (A022) {
                                    r3.A01("MountState.onRenderTreeUpdated");
                                }
                                C18070vi.A0z(r2, "null cannot be cast to non-null type com.facebook.rendercore.RenderCoreExtensionHost");
                                if (A022) {
                                    r3.A00();
                                }
                            }
                            this.A03 = false;
                            System.currentTimeMillis();
                            if (r5.compareTo(AnonymousClass0OA.A00()) >= 0) {
                                Set set2 = AnonymousClass0OA.A00;
                                if (!set2.isEmpty()) {
                                    Iterator it2 = set2.iterator();
                                    if (it2.hasNext()) {
                                        it2.next();
                                        throw AnonymousClass000.A0s("getEvents");
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        th = AnonymousClass000.A0n("Required value was null.");
                    } else {
                        this.A03 = false;
                        System.currentTimeMillis();
                        if (r5.compareTo(AnonymousClass0OA.A00()) >= 0) {
                            Set set3 = AnonymousClass0OA.A00;
                            if (!set3.isEmpty()) {
                                Iterator it3 = set3.iterator();
                                if (it3.hasNext()) {
                                    it3.next();
                                    throw AnonymousClass000.A0s("getEvents");
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    th = AnonymousClass000.A0n("Trying to mount while already mounting!");
                }
                throw th;
            } catch (Exception e) {
                AnonymousClass0CT r32 = AnonymousClass0CT.ERROR;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Exception while mounting: ");
                AnonymousClass0MD.A00(r32, "MountState:Exception", AnonymousClass000.A0y(e.getMessage(), A102), e);
                if (e instanceof RuntimeException) {
                    throw e;
                }
                throw new RuntimeException(e);
            } catch (Throwable th2) {
                this.A03 = false;
                System.currentTimeMillis();
                if (r5.compareTo(AnonymousClass0OA.A00()) >= 0) {
                    Set set4 = AnonymousClass0OA.A00;
                    if (!set4.isEmpty()) {
                        Iterator it4 = set4.iterator();
                        if (it4.hasNext()) {
                            it4.next();
                            throw AnonymousClass000.A0s("getEvents");
                        }
                    }
                }
                throw th2;
            }
        } else {
            throw AnonymousClass000.A0n("Trying to mount a null RenderTreeNode");
        }
    }

    public void A0K(RenderTreeNode renderTreeNode) {
        boolean z;
        AnonymousClass0J4 r4;
        C05050Qf r3;
        C001100p r2;
        Object obj;
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        C05050Qf r6 = renderTreeNode2.A07;
        if (r6.A0C() == 0) {
            A0A(renderTreeNode2);
            return;
        }
        Set set = AnonymousClass0OA.A00;
        if (set.isEmpty()) {
            r4 = this.A06;
            z = r4.A02();
            if (z) {
                A08(r4, r6, "MountItem: ", AnonymousClass000.A10());
            }
            RenderTreeNode renderTreeNode3 = renderTreeNode2.A06;
            if (renderTreeNode3 != null) {
                r3 = renderTreeNode3.A07;
                C18070vi.A0z(r6, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                if (z) {
                    A08(r4, r3, "MountItem:mount-parent ", AnonymousClass000.A10());
                }
                long A0C = r3.A0C();
                r2 = this.A05;
                if (r2.A05(A0C) == null) {
                    A0K(renderTreeNode3);
                }
                if (z) {
                    r4.A00();
                }
                obj = r2.A05(r3.A0C());
                if (obj == null) {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("getEvents");
            }
            r4 = this.A06;
            z = r4.A02();
            if (z) {
                A08(r4, r6, "MountItem: ", AnonymousClass000.A10());
            }
            RenderTreeNode renderTreeNode4 = renderTreeNode2.A06;
            if (renderTreeNode4 != null) {
                r3 = renderTreeNode4.A07;
                C18070vi.A0z(r6, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                if (z) {
                    A08(r4, r3, "MountItem:mount-parent ", AnonymousClass000.A10());
                }
                long A0C2 = r3.A0C();
                r2 = this.A05;
                if (r2.A05(A0C2) == null) {
                    A0K(renderTreeNode4);
                }
                if (z) {
                    r4.A00();
                }
                obj = r2.A05(r3.A0C());
                if (obj == null) {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        }
        Object obj2 = ((C03330Hq) obj).A04;
        A0B(r6, r3, obj2);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type com.facebook.rendercore.Host");
        AnonymousClass05E r14 = (AnonymousClass05E) obj2;
        if (z) {
            A08(r4, r6, "MountItem:acquire-content ", AnonymousClass000.A10());
        }
        C17110tl A0D = r6.A0D();
        Context context = this.A04;
        Object A002 = A00(context, A0D, renderTreeNode2.A05);
        if (z) {
            r4.A00();
            A08(r4, r6, "MountItem:mount ", AnonymousClass000.A10());
        }
        C03330Hq r32 = new C03330Hq(renderTreeNode2, A002);
        AnonymousClass0KR r1 = r32.A03;
        AnonymousClass0OA.A01();
        r6.A0I(context, r1, r4, A002, renderTreeNode2.A08);
        AnonymousClass0Ke r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
        r2.A0A(r6.A0C(), r32);
        int i = renderTreeNode2.A02;
        C01930Bz r142 = (C01930Bz) r14;
        if (r32.A01.A07.A04 == AnonymousClass00R.A00) {
            C01930Bz.A08(r142, r32);
        } else {
            C01930Bz.A09(r142, r32);
        }
        C03330Hq[] r8 = r142.A03;
        int length = r8.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            C03330Hq[] r12 = new C03330Hq[i2];
            System.arraycopy(r8, 0, r12, 0, length);
            r142.A03 = r12;
            r8 = r12;
        }
        r8[i] = r32;
        r32.A00 = r142;
        if (z) {
            r4.A00();
            A08(r4, r6, "MountItem:bind ", AnonymousClass000.A10());
        }
        A04(r32);
        if (z) {
            r4.A00();
            A08(r4, r6, "MountItem:applyBounds ", AnonymousClass000.A10());
        }
        A07(r4, renderTreeNode2, r32.A04, true);
        if (z) {
            r4.A00();
            A08(r4, r6, "MountItem:after ", AnonymousClass000.A10());
        }
        AnonymousClass0Ke r02 = this.A00;
        if (r02 != null) {
            r02.A02();
        }
        if (z) {
            r4.A00();
            r4.A00();
        }
    }

    public boolean A0L(C05050Qf r3, C05050Qf r4, Object obj, Object obj2) {
        if (r3 != r4 || !A0D(obj, obj2)) {
            return true;
        }
        return false;
    }

    public static void A08(AnonymousClass0J4 r1, C05050Qf r2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r2.A0E());
        r1.A01(sb.toString());
    }
}
