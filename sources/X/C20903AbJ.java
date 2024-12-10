package X;

import java.util.Map;

/* renamed from: X.AbJ  reason: case insensitive filesystem */
public class C20903AbJ implements C22521BBe {
    public final int A00;
    public final Object A01;

    public C20903AbJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Btu(C19980A1q a1q, Map map) {
        AnonymousClass1KB r2;
        Runnable runnable;
        int i;
        switch (this.A00) {
            case 0:
                C188069gp r3 = (C188069gp) this.A01;
                r2 = r3.A01;
                runnable = new C21426Ajt(r3, 0);
                break;
            case 1:
                r2 = ((AnonymousClass91y) this.A01).A00;
                i = 1;
                break;
            case 2:
                r2 = ((AnonymousClass1FU) this.A01).A05;
                i = 37;
                break;
            case 3:
                r2 = ((AnonymousClass1FU) this.A01).A05;
                i = 39;
                break;
            case 6:
                r2 = ((AnonymousClass1FU) this.A01).A05;
                runnable = new C21427Aju(this, 20);
                break;
            default:
                return;
        }
        runnable = C21447AkE.A00(this, i);
        r2.A0J(runnable);
    }

    public void C7V(Map map) {
        AnonymousClass1KB r3;
        Runnable ajt;
        int i;
        switch (this.A00) {
            case 0:
                C188069gp r1 = (C188069gp) this.A01;
                r3 = r1.A01;
                ajt = new C21426Ajt(r1, 1);
                break;
            case 1:
                r3 = ((AnonymousClass91y) this.A01).A00;
                i = 2;
                break;
            case 2:
                r3 = ((AnonymousClass1FU) this.A01).A05;
                i = 38;
                break;
            case 3:
                r3 = ((AnonymousClass1FU) this.A01).A05;
                i = 40;
                break;
            case 4:
                r3 = ((AnonymousClass1FU) this.A01).A05;
                ajt = new C21432Ajz(this, map, 28);
                break;
            case 5:
                AnonymousClass1FU r32 = (AnonymousClass1FU) this.A01;
                r32.A05.A0J(new C21427Aju(r32, 15));
                r32.A05.CGN(new C21432Ajz(r32, map, 33));
                return;
            default:
                r3 = ((AnonymousClass1FU) this.A01).A05;
                ajt = new C21427Aju(this, 21);
                break;
        }
        ajt = C21447AkE.A00(this, i);
        r3.A0J(ajt);
    }
}
