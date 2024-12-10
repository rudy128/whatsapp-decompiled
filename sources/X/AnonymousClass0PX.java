package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.0PX  reason: invalid class name */
public final class AnonymousClass0PX {
    public AnonymousClass0NU A00;
    public C18090vk A01;
    public C18090vk A02;
    public C18090vk A03;
    public C18090vk A04;
    public final C18090vk A05;

    public AnonymousClass0PX() {
        this((C18090vk) null, 63);
    }

    public AnonymousClass0PX(AnonymousClass0NU r2, C18090vk r3) {
        this.A05 = r3;
        this.A00 = r2;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
    }

    public final void A01() {
        C18090vk r0 = this.A05;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void A02(Menu menu) {
        Integer num = AnonymousClass00R.A00;
        if (this.A01 != null) {
            if (menu.findItem(0) == null) {
                A00(menu, num);
            }
        } else if (menu.findItem(0) != null) {
            menu.removeItem(0);
        }
        Integer num2 = AnonymousClass00R.A01;
        if (this.A03 != null) {
            if (menu.findItem(1) == null) {
                A00(menu, num2);
            }
        } else if (menu.findItem(1) != null) {
            menu.removeItem(1);
        }
        Integer num3 = AnonymousClass00R.A0C;
        if (this.A02 != null) {
            if (menu.findItem(2) == null) {
                A00(menu, num3);
            }
        } else if (menu.findItem(2) != null) {
            menu.removeItem(2);
        }
        Integer num4 = AnonymousClass00R.A0N;
        if (this.A04 != null) {
            if (menu.findItem(3) == null) {
                A00(menu, num4);
            }
        } else if (menu.findItem(3) != null) {
            menu.removeItem(3);
        }
    }

    public final boolean A07(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw AnonymousClass000.A0k("onCreateActionMode requires a non-null menu");
        } else if (actionMode != null) {
            if (this.A01 != null) {
                A00(menu, AnonymousClass00R.A00);
            }
            if (this.A03 != null) {
                A00(menu, AnonymousClass00R.A01);
            }
            if (this.A02 != null) {
                A00(menu, AnonymousClass00R.A0C);
            }
            if (this.A04 == null) {
                return true;
            }
            A00(menu, AnonymousClass00R.A0N);
            return true;
        } else {
            throw AnonymousClass000.A0k("onCreateActionMode requires a non-null mode");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r2 == 2) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r1 = 17039373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r5.add(0, r4, r3, r1).setShowAsAction(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r1 = 17039371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r1 = 17039361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r2 = r6.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r2 == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r2 == 1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r1 = 17039363;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.Menu r5, java.lang.Integer r6) {
        /*
            int r0 = r6.intValue()
            switch(r0) {
                case 0: goto L_0x0037;
                case 1: goto L_0x0034;
                case 2: goto L_0x0031;
                default: goto L_0x0007;
            }
        L_0x0007:
            r4 = 3
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0035;
                case 2: goto L_0x0032;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = 3
        L_0x000c:
            int r2 = r6.intValue()
            r0 = 0
            if (r2 == r0) goto L_0x002d
            r0 = 1
            if (r2 == r0) goto L_0x0029
            r0 = 2
            r1 = 17039363(0x1040003, float:2.424458E-38)
            if (r2 == r0) goto L_0x001f
            r1 = 17039373(0x104000d, float:2.4244607E-38)
        L_0x001f:
            r0 = 0
            android.view.MenuItem r1 = r5.add(r0, r4, r3, r1)
            r0 = 1
            r1.setShowAsAction(r0)
            return
        L_0x0029:
            r1 = 17039371(0x104000b, float:2.4244602E-38)
            goto L_0x001f
        L_0x002d:
            r1 = 17039361(0x1040001, float:2.4244574E-38)
            goto L_0x001f
        L_0x0031:
            r4 = 2
        L_0x0032:
            r3 = 2
            goto L_0x000c
        L_0x0034:
            r4 = 1
        L_0x0035:
            r3 = 1
            goto L_0x000c
        L_0x0037:
            r4 = 0
        L_0x0038:
            r3 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PX.A00(android.view.Menu, java.lang.Integer):void");
    }

    public final boolean A08(ActionMode actionMode, MenuItem menuItem) {
        C18090vk r0;
        C18070vi.A0b(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            r0 = this.A01;
        } else if (itemId == 1) {
            r0 = this.A03;
        } else if (itemId == 2) {
            r0 = this.A02;
        } else if (itemId != 3) {
            return false;
        } else {
            r0 = this.A04;
        }
        if (r0 != null) {
            r0.invoke();
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final void A03(C18090vk r1) {
        this.A01 = r1;
    }

    public final void A04(C18090vk r1) {
        this.A02 = r1;
    }

    public final void A05(C18090vk r1) {
        this.A03 = r1;
    }

    public final void A06(C18090vk r1) {
        this.A04 = r1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass0PX(X.C18090vk r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0006
            r3 = r1
        L_0x0006:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x000c
            X.0NU r1 = X.AnonymousClass0NU.A04
        L_0x000c:
            r2.<init>((X.AnonymousClass0NU) r1, (X.C18090vk) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PX.<init>(X.0vk, int):void");
    }
}
