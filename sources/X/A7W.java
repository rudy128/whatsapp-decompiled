package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;

public class A7W {
    public static A7W A0A;
    public static A7W A0B;
    public static final Object A0C = C17880vN.A0p();
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public AnonymousClass00I A02;
    public C20359AHp A03;
    public WorkDatabase A04;
    public AnonymousClass9UN A05;
    public C71973Kb A06;
    public List A07;
    public boolean A08;
    public final C186369e5 A09;

    public static C199079zO[] A01(C191929nQ r1, Object obj, C199079zO[] r3, int i) {
        r3[0] = obj;
        r1.A00(r3);
        return new C199079zO[i];
    }

    public void A0A(String str) {
        this.A06.BKq(new AnonymousClass8KT(this, str, true));
    }

    static {
        A5Z.A01("WorkManagerImpl");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.B6a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.B6a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.B6a} */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025e, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("A required auto migration spec (");
        r1.append(r11.getCanonicalName());
        r0 = X.AnonymousClass001.A12(") is missing in the database configuration.", r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A7W A00(android.content.Context r32) {
        /*
            java.lang.Object r17 = A0C
            monitor-enter(r17)
            X.A7W r0 = A0B     // Catch:{ all -> 0x04d7 }
            if (r0 != 0) goto L_0x04d5
            X.A7W r0 = A0A     // Catch:{ all -> 0x04d7 }
            if (r0 != 0) goto L_0x04d5
            android.content.Context r7 = r32.getApplicationContext()     // Catch:{ all -> 0x04e0 }
            boolean r0 = r7 instanceof X.AnonymousClass006     // Catch:{ all -> 0x04e0 }
            if (r0 == 0) goto L_0x04d9
            r0 = r7
            X.006 r0 = (X.AnonymousClass006) r0     // Catch:{ all -> 0x04e0 }
            X.00I r6 = r0.getWorkManagerConfiguration()     // Catch:{ all -> 0x04e0 }
            X.A7W r0 = A0B     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x0029
            X.A7W r0 = A0A     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x04d1
            java.lang.String r0 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x04d7 }
        L_0x0028:
            throw r0     // Catch:{ all -> 0x04d7 }
        L_0x0029:
            android.content.Context r8 = r7.getApplicationContext()     // Catch:{ all -> 0x04d7 }
            X.A7W r9 = A0A     // Catch:{ all -> 0x04d7 }
            if (r9 != 0) goto L_0x04cf
            r10 = 0
            boolean r9 = X.C18070vi.A17(r8, r6)     // Catch:{ all -> 0x04d7 }
            r12 = 0
            java.util.concurrent.Executor r0 = r6.A09     // Catch:{ all -> 0x04d7 }
            X.AHx r5 = new X.AHx     // Catch:{ all -> 0x04d7 }
            r5.<init>(r0)     // Catch:{ all -> 0x04d7 }
            android.content.Context r11 = X.AnonymousClass8BS.A02(r8)     // Catch:{ all -> 0x04d7 }
            X.AlD r3 = r5.A01     // Catch:{ all -> 0x04d7 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x04d7 }
            X.E0T r2 = r6.A03     // Catch:{ all -> 0x04d7 }
            android.content.res.Resources r1 = r8.getResources()     // Catch:{ all -> 0x04d7 }
            r0 = 2131034128(0x7f050010, float:1.7678765E38)
            boolean r0 = r1.getBoolean(r0)     // Catch:{ all -> 0x04d7 }
            r4 = 2
            X.C18070vi.A0d(r2, r4)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<androidx.work.impl.WorkDatabase> r16 = androidx.work.impl.WorkDatabase.class
            if (r0 == 0) goto L_0x00e4
            X.9nQ r0 = new X.9nQ     // Catch:{ all -> 0x04d7 }
            r0.<init>(r11, r12)     // Catch:{ all -> 0x04d7 }
            r0.A07 = r9     // Catch:{ all -> 0x04d7 }
        L_0x0063:
            r0.A04 = r3     // Catch:{ all -> 0x04d7 }
            X.9wv r1 = new X.9wv     // Catch:{ all -> 0x04d7 }
            r1.<init>(r2)     // Catch:{ all -> 0x04d7 }
            java.util.List r14 = r0.A0C     // Catch:{ all -> 0x04d7 }
            r14.add(r1)     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = new X.C199079zO[r9]     // Catch:{ all -> 0x04d7 }
            X.8JU r1 = X.AnonymousClass8JU.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r3 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            r2 = 3
            X.8JM r1 = new X.8JM     // Catch:{ all -> 0x04d7 }
            r1.<init>(r11, r4, r2)     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r3, r9)     // Catch:{ all -> 0x04d7 }
            X.8JZ r1 = X.AnonymousClass8JZ.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JV r1 = X.AnonymousClass8JV.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r4 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            r3 = 5
            r2 = 6
            X.8JM r1 = new X.8JM     // Catch:{ all -> 0x04d7 }
            r1.<init>(r11, r3, r2)     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r4, r9)     // Catch:{ all -> 0x04d7 }
            X.8JW r1 = X.AnonymousClass8JW.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JX r1 = X.AnonymousClass8JX.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JY r1 = X.AnonymousClass8JY.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JP r1 = new X.8JP     // Catch:{ all -> 0x04d7 }
            r1.<init>(r11)     // Catch:{ all -> 0x04d7 }
            X.9zO[] r4 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            r3 = 10
            r2 = 11
            X.8JM r1 = new X.8JM     // Catch:{ all -> 0x04d7 }
            r1.<init>(r11, r3, r2)     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r4, r9)     // Catch:{ all -> 0x04d7 }
            X.8JQ r1 = X.AnonymousClass8JQ.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JR r1 = X.AnonymousClass8JR.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JS r1 = X.AnonymousClass8JS.A00     // Catch:{ all -> 0x04d7 }
            X.9zO[] r2 = A01(r0, r1, r2, r9)     // Catch:{ all -> 0x04d7 }
            X.8JT r1 = X.AnonymousClass8JT.A00     // Catch:{ all -> 0x04d7 }
            r2[r10] = r1     // Catch:{ all -> 0x04d7 }
            r0.A00(r2)     // Catch:{ all -> 0x04d7 }
            r0.A08 = r10     // Catch:{ all -> 0x04d7 }
            r0.A06 = r9     // Catch:{ all -> 0x04d7 }
            java.util.concurrent.Executor r2 = r0.A04     // Catch:{ all -> 0x04d7 }
            java.util.concurrent.Executor r1 = r0.A05     // Catch:{ all -> 0x04d7 }
            if (r2 != 0) goto L_0x0105
            goto L_0x0102
        L_0x00e4:
            java.lang.String r1 = "androidx.work.workdb"
            boolean r0 = X.AnonymousClass1YF.A0T(r1)     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x00f4:
            X.9nQ r0 = new X.9nQ     // Catch:{ all -> 0x04d7 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x04d7 }
            X.AHS r1 = new X.AHS     // Catch:{ all -> 0x04d7 }
            r1.<init>(r11)     // Catch:{ all -> 0x04d7 }
            r0.A00 = r1     // Catch:{ all -> 0x04d7 }
            goto L_0x0063
        L_0x0102:
            if (r1 != 0) goto L_0x010e
            goto L_0x010a
        L_0x0105:
            if (r1 != 0) goto L_0x0110
            r0.A05 = r2     // Catch:{ all -> 0x04d7 }
            goto L_0x0110
        L_0x010a:
            java.util.concurrent.Executor r1 = X.C001600u.A02     // Catch:{ all -> 0x04d7 }
            r0.A05 = r1     // Catch:{ all -> 0x04d7 }
        L_0x010e:
            r0.A04 = r1     // Catch:{ all -> 0x04d7 }
        L_0x0110:
            java.util.Set r1 = r0.A02     // Catch:{ all -> 0x04d7 }
            if (r1 == 0) goto L_0x0138
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x04d7 }
        L_0x0118:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x04d7 }
            if (r1 == 0) goto L_0x0138
            int r2 = X.C72453Mb.A0H(r3)     // Catch:{ all -> 0x04d7 }
            java.util.Set r1 = r0.A03     // Catch:{ all -> 0x04d7 }
            boolean r1 = X.C108965cb.A1b(r1, r2)     // Catch:{ all -> 0x04d7 }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0118
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x0138:
            X.B6a r13 = r0.A00     // Catch:{ all -> 0x04d7 }
            if (r13 != 0) goto L_0x0141
            X.AHR r13 = new X.AHR     // Catch:{ all -> 0x04d7 }
            r13.<init>()     // Catch:{ all -> 0x04d7 }
        L_0x0141:
            java.lang.String r3 = "Required value was null."
            android.content.Context r12 = r0.A09     // Catch:{ all -> 0x04d7 }
            java.lang.String r1 = r0.A0B     // Catch:{ all -> 0x04d7 }
            r21 = r1
            X.9id r1 = r0.A0A     // Catch:{ all -> 0x04d7 }
            r20 = r1
            boolean r1 = r0.A07     // Catch:{ all -> 0x04d7 }
            r19 = r1
            java.lang.String r1 = "activity"
            java.lang.Object r2 = r12.getSystemService(r1)     // Catch:{ all -> 0x04d7 }
            boolean r1 = r2 instanceof android.app.ActivityManager     // Catch:{ all -> 0x04d7 }
            if (r1 == 0) goto L_0x01b3
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x01b3
            boolean r1 = r2.isLowRamDevice()     // Catch:{ all -> 0x04d7 }
            if (r1 != 0) goto L_0x01b3
            java.lang.Integer r22 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x04d7 }
        L_0x0167:
            java.util.concurrent.Executor r11 = r0.A04     // Catch:{ all -> 0x04d7 }
            if (r11 == 0) goto L_0x0494
            java.util.concurrent.Executor r4 = r0.A05     // Catch:{ all -> 0x04d7 }
            if (r4 == 0) goto L_0x048e
            boolean r1 = r0.A08     // Catch:{ all -> 0x04d7 }
            r18 = r1
            boolean r15 = r0.A06     // Catch:{ all -> 0x04d7 }
            java.util.Set r3 = r0.A03     // Catch:{ all -> 0x04d7 }
            java.util.List r2 = r0.A0D     // Catch:{ all -> 0x04d7 }
            java.util.List r1 = r0.A01     // Catch:{ all -> 0x04d7 }
            X.9hl r0 = new X.9hl     // Catch:{ all -> 0x04d7 }
            r23 = r21
            r24 = r14
            r25 = r2
            r26 = r1
            r27 = r3
            r28 = r11
            r29 = r4
            r30 = r19
            r31 = r18
            r32 = r15
            r18 = r0
            r19 = r12
            r21 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x04d7 }
            java.lang.String r13 = "_Impl"
            java.lang.Package r1 = r16.getPackage()     // Catch:{ all -> 0x04d7 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x04d7 }
            java.lang.String r12 = r1.getName()     // Catch:{ all -> 0x04d7 }
            java.lang.String r11 = r16.getCanonicalName()     // Catch:{ all -> 0x04d7 }
            X.C18070vi.A0b(r11)     // Catch:{ all -> 0x04d7 }
            int r4 = X.AnonymousClass8BS.A00(r12)     // Catch:{ all -> 0x04d7 }
            goto L_0x01b6
        L_0x01b3:
            java.lang.Integer r22 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x04d7 }
            goto L_0x0167
        L_0x01b6:
            if (r4 == 0) goto L_0x01be
            int r1 = r4 + 1
            java.lang.String r11 = X.C108955ca.A0z(r11, r1)     // Catch:{ all -> 0x04d7 }
        L_0x01be:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            r2 = 46
            r1 = 95
            X.C18070vi.A0d(r11, r10)     // Catch:{ all -> 0x04d7 }
            java.lang.String r1 = r11.replace(r2, r1)     // Catch:{ all -> 0x04d7 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x04d7 }
            java.lang.String r3 = X.AnonymousClass001.A1H(r1, r13, r3)     // Catch:{ all -> 0x04d7 }
            if (r4 != 0) goto L_0x01d8
            r2 = r3
            goto L_0x01e0
        L_0x01d8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.String r2 = X.C17890vO.A0Z(r3, r1, r2)     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
        L_0x01e0:
            java.lang.ClassLoader r1 = r16.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.Class r2 = java.lang.Class.forName(r2, r9, r1)     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"
            X.C18070vi.A0z(r2, r1)     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x046a, IllegalAccessException -> 0x0453, InstantiationException -> 0x043c }
            X.A6c r1 = (X.C20076A6c) r1     // Catch:{ all -> 0x04d7 }
            r3 = r1
            androidx.work.impl.WorkDatabase_Impl r3 = (androidx.work.impl.WorkDatabase_Impl) r3     // Catch:{ all -> 0x04d7 }
            X.A6D r2 = new X.A6D     // Catch:{ all -> 0x04d7 }
            r2.<init>(r3)     // Catch:{ all -> 0x04d7 }
            X.8Ja r13 = new X.8Ja     // Catch:{ all -> 0x04d7 }
            r13.<init>(r0, r2)     // Catch:{ all -> 0x04d7 }
            android.content.Context r12 = r0.A00     // Catch:{ all -> 0x04d7 }
            java.lang.String r14 = r0.A04     // Catch:{ all -> 0x04d7 }
            X.9fH r11 = new X.9fH     // Catch:{ all -> 0x04d7 }
            r16 = r10
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04d7 }
            X.B6a r2 = r0.A02     // Catch:{ all -> 0x04d7 }
            X.BE1 r2 = r2.BGA(r11)     // Catch:{ all -> 0x04d7 }
            r1.A00 = r2     // Catch:{ all -> 0x04d7 }
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ all -> 0x04d7 }
            java.util.BitSet r4 = new java.util.BitSet     // Catch:{ all -> 0x04d7 }
            r4.<init>()     // Catch:{ all -> 0x04d7 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x04d7 }
        L_0x0229:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x0276
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x04d7 }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x04d7 }
            java.util.List r13 = r0.A05     // Catch:{ all -> 0x04d7 }
            int r12 = X.AnonymousClass3MX.A01(r13)     // Catch:{ all -> 0x04d7 }
            if (r12 < 0) goto L_0x025e
        L_0x023d:
            int r3 = r12 + -1
            java.lang.Object r2 = r13.get(r12)     // Catch:{ all -> 0x04d7 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x04d7 }
            boolean r2 = r11.isAssignableFrom(r2)     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x025a
            r4.set(r12)     // Catch:{ all -> 0x04d7 }
            java.util.Map r3 = r1.A02     // Catch:{ all -> 0x04d7 }
            java.lang.Object r2 = r13.get(r12)     // Catch:{ all -> 0x04d7 }
            r3.put(r11, r2)     // Catch:{ all -> 0x04d7 }
            goto L_0x0229
        L_0x025a:
            if (r3 < 0) goto L_0x025e
            r12 = r3
            goto L_0x023d
        L_0x025e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "A required auto migration spec ("
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = r11.getCanonicalName()     // Catch:{ all -> 0x04d7 }
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = ") is missing in the database configuration."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x0276:
            java.util.List r2 = r0.A05     // Catch:{ all -> 0x04d7 }
            int r2 = X.AnonymousClass3MX.A01(r2)     // Catch:{ all -> 0x04d7 }
            if (r2 < 0) goto L_0x0292
        L_0x027e:
            int r3 = r2 + -1
            boolean r2 = r4.get(r2)     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x028a
            r2 = r3
            if (r3 >= 0) goto L_0x027e
            goto L_0x0292
        L_0x028a:
            java.lang.String r0 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x0292:
            r2 = 6
            X.9zO[] r4 = new X.C199079zO[r2]     // Catch:{ all -> 0x04d7 }
            X.8JI r2 = new X.8JI     // Catch:{ all -> 0x04d7 }
            r2.<init>()     // Catch:{ all -> 0x04d7 }
            r4[r10] = r2     // Catch:{ all -> 0x04d7 }
            X.8JN r2 = new X.8JN     // Catch:{ all -> 0x04d7 }
            r2.<init>()     // Catch:{ all -> 0x04d7 }
            r4[r9] = r2     // Catch:{ all -> 0x04d7 }
            X.8JJ r3 = new X.8JJ     // Catch:{ all -> 0x04d7 }
            r3.<init>()     // Catch:{ all -> 0x04d7 }
            r2 = 2
            r4[r2] = r3     // Catch:{ all -> 0x04d7 }
            X.8JK r3 = new X.8JK     // Catch:{ all -> 0x04d7 }
            r3.<init>()     // Catch:{ all -> 0x04d7 }
            r2 = 3
            r4[r2] = r3     // Catch:{ all -> 0x04d7 }
            X.8JL r3 = new X.8JL     // Catch:{ all -> 0x04d7 }
            r3.<init>()     // Catch:{ all -> 0x04d7 }
            r2 = 4
            r4[r2] = r3     // Catch:{ all -> 0x04d7 }
            X.8JO r3 = new X.8JO     // Catch:{ all -> 0x04d7 }
            r3.<init>()     // Catch:{ all -> 0x04d7 }
            r2 = 5
            java.util.List r2 = X.AnonymousClass8BR.A15(r3, r4, r2)     // Catch:{ all -> 0x04d7 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x04d7 }
        L_0x02c9:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x04d7 }
            r11 = 1
            if (r2 == 0) goto L_0x0304
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x04d7 }
            X.9zO r11 = (X.C199079zO) r11     // Catch:{ all -> 0x04d7 }
            X.9id r4 = r0.A01     // Catch:{ all -> 0x04d7 }
            int r2 = r11.A01     // Catch:{ all -> 0x04d7 }
            int r13 = r11.A00     // Catch:{ all -> 0x04d7 }
            java.util.Map r12 = r4.A00     // Catch:{ all -> 0x04d7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x04d7 }
            boolean r2 = r12.containsKey(r3)     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x02fc
            java.util.Map r3 = X.AnonymousClass8BS.A0u(r3, r12)     // Catch:{ all -> 0x04d7 }
            if (r3 != 0) goto L_0x02f2
            X.1CQ r3 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x04d7 }
        L_0x02f2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x04d7 }
            boolean r2 = r3.containsKey(r2)     // Catch:{ all -> 0x04d7 }
            if (r2 != 0) goto L_0x02c9
        L_0x02fc:
            X.9zO[] r2 = new X.C199079zO[r9]     // Catch:{ all -> 0x04d7 }
            r2[r10] = r11     // Catch:{ all -> 0x04d7 }
            r4.A00(r2)     // Catch:{ all -> 0x04d7 }
            goto L_0x02c9
        L_0x0304:
            java.lang.Class<X.AHU> r3 = X.AHU.class
            X.BE1 r2 = r1.A03()     // Catch:{ all -> 0x04d7 }
            r3.isInstance(r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.AHT> r3 = X.AHT.class
            X.BE1 r2 = r1.A03()     // Catch:{ all -> 0x04d7 }
            r3.isInstance(r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Integer r3 = r0.A03     // Catch:{ all -> 0x04d7 }
            java.lang.Integer r2 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x04d7 }
            if (r3 == r2) goto L_0x031d
            r11 = 0
        L_0x031d:
            X.BE1 r4 = r1.A03()     // Catch:{ all -> 0x04d7 }
            X.AHV r4 = (X.AHV) r4     // Catch:{ all -> 0x04d7 }
            X.0vl r3 = r4.A04     // Catch:{ all -> 0x04d7 }
            boolean r2 = r3.Bf6()     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x0337
            java.lang.Object r2 = r3.getValue()     // Catch:{ all -> 0x04d7 }
            X.8CH r2 = (X.AnonymousClass8CH) r2     // Catch:{ all -> 0x04d7 }
            X.C18070vi.A0d(r2, r10)     // Catch:{ all -> 0x04d7 }
            r2.setWriteAheadLoggingEnabled(r11)     // Catch:{ all -> 0x04d7 }
        L_0x0337:
            r4.A00 = r11     // Catch:{ all -> 0x04d7 }
            java.util.List r2 = r0.A06     // Catch:{ all -> 0x04d7 }
            r1.A01 = r2     // Catch:{ all -> 0x04d7 }
            java.util.concurrent.Executor r2 = r0.A09     // Catch:{ all -> 0x04d7 }
            r1.A03 = r2     // Catch:{ all -> 0x04d7 }
            java.util.concurrent.Executor r3 = r0.A0A     // Catch:{ all -> 0x04d7 }
            X.AlC r2 = new X.AlC     // Catch:{ all -> 0x04d7 }
            r2.<init>(r3)     // Catch:{ all -> 0x04d7 }
            r1.A04 = r2     // Catch:{ all -> 0x04d7 }
            boolean r2 = r0.A0C     // Catch:{ all -> 0x04d7 }
            r1.A05 = r2     // Catch:{ all -> 0x04d7 }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.BD8> r3 = X.BD8.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.B6d> r3 = X.C22400B6d.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.BA4> r3 = X.BA4.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.BA3> r3 = X.BA3.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.B4S> r3 = X.B4S.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.B6e> r3 = X.C22401B6e.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.BA2> r3 = X.BA2.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.lang.Class<X.B4R> r3 = X.B4R.class
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04d7 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04d7 }
            java.util.BitSet r9 = new java.util.BitSet     // Catch:{ all -> 0x04d7 }
            r9.<init>()     // Catch:{ all -> 0x04d7 }
            java.util.Iterator r14 = X.C17890vO.A0i(r4)     // Catch:{ all -> 0x04d7 }
        L_0x03a3:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x0410
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r14)     // Catch:{ all -> 0x04d7 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x04d7 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x04d7 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x04d7 }
            java.util.Iterator r13 = X.AnonymousClass8BR.A13(r2)     // Catch:{ all -> 0x04d7 }
        L_0x03bb:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x03a3
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x04d7 }
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x04d7 }
            java.util.List r12 = r0.A07     // Catch:{ all -> 0x04d7 }
            int r11 = X.AnonymousClass3MX.A01(r12)     // Catch:{ all -> 0x04d7 }
            if (r11 < 0) goto L_0x03f0
        L_0x03cf:
            int r3 = r11 + -1
            java.lang.Object r2 = r12.get(r11)     // Catch:{ all -> 0x04d7 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x04d7 }
            boolean r2 = r10.isAssignableFrom(r2)     // Catch:{ all -> 0x04d7 }
            if (r2 == 0) goto L_0x03ec
            r9.set(r11)     // Catch:{ all -> 0x04d7 }
            java.util.Map r3 = r1.A08     // Catch:{ all -> 0x04d7 }
            java.lang.Object r2 = r12.get(r11)     // Catch:{ all -> 0x04d7 }
            r3.put(r10, r2)     // Catch:{ all -> 0x04d7 }
            goto L_0x03bb
        L_0x03ec:
            if (r3 < 0) goto L_0x03f0
            r11 = r3
            goto L_0x03cf
        L_0x03f0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "A required type converter ("
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            r1.append(r10)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = ") for "
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = r4.getCanonicalName()     // Catch:{ all -> 0x04d7 }
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = " is missing in the database configuration."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x0410:
            java.util.List r4 = r0.A07     // Catch:{ all -> 0x04d7 }
            int r3 = X.AnonymousClass3MX.A01(r4)     // Catch:{ all -> 0x04d7 }
            if (r3 < 0) goto L_0x049a
        L_0x0418:
            int r2 = r3 + -1
            boolean r0 = r9.get(r3)     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x0424
            if (r2 < 0) goto L_0x049a
            r3 = r2
            goto L_0x0418
        L_0x0424:
            java.lang.Object r2 = r4.get(r3)     // Catch:{ all -> 0x04d7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "Unexpected type converter "
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            r1.append(r2)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x043c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "Failed to create an instance of "
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = r16.getCanonicalName()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x04d7 }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x0453:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "Cannot access the constructor "
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = r16.getCanonicalName()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x04d7 }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x046a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = "Cannot find implementation for "
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = r16.getCanonicalName()     // Catch:{ all -> 0x04d7 }
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = ". "
            r1.append(r0)     // Catch:{ all -> 0x04d7 }
            r1.append(r3)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = " does not exist"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x04d7 }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x048e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r3)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x0494:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r3)     // Catch:{ all -> 0x04d7 }
            goto L_0x0028
        L_0x049a:
            androidx.work.impl.WorkDatabase r1 = (androidx.work.impl.WorkDatabase) r1     // Catch:{ all -> 0x04d7 }
            android.content.Context r0 = X.AnonymousClass8BS.A02(r8)     // Catch:{ all -> 0x04d7 }
            X.9e5 r3 = new X.9e5     // Catch:{ all -> 0x04d7 }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x04d7 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x04d7 }
            X.AHp r2 = new X.AHp     // Catch:{ all -> 0x04d7 }
            r2.<init>(r0, r6, r1, r5)     // Catch:{ all -> 0x04d7 }
            X.AtE r9 = X.C21826AtE.A00     // Catch:{ all -> 0x04d7 }
            r0 = 3
            X.C108965cb.A1O(r1, r0, r9)     // Catch:{ all -> 0x04d7 }
            r10 = r8
            r11 = r6
            r12 = r5
            r13 = r1
            r14 = r3
            r15 = r2
            java.lang.Object r0 = r9.invoke(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x04d7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x04d7 }
            android.content.Context r10 = r8.getApplicationContext()     // Catch:{ all -> 0x04d7 }
            X.A7W r9 = new X.A7W     // Catch:{ all -> 0x04d7 }
            r12 = r2
            r15 = r5
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04d7 }
            A0A = r9     // Catch:{ all -> 0x04d7 }
        L_0x04cf:
            A0B = r9     // Catch:{ all -> 0x04d7 }
        L_0x04d1:
            X.A7W r0 = A00(r7)     // Catch:{ all -> 0x04e0 }
        L_0x04d5:
            monitor-exit(r17)     // Catch:{ all -> 0x04e0 }
            return r0
        L_0x04d7:
            r0 = move-exception
            goto L_0x04df
        L_0x04d9:
            java.lang.String r0 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x04e0 }
        L_0x04df:
            throw r0     // Catch:{ all -> 0x04e0 }
        L_0x04e0:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x04e0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7W.A00(android.content.Context):X.A7W");
    }

    public BDL A02(C162258Jw r14, Integer num, String str) {
        C162258Jw r5 = r14;
        String str2 = str;
        if (num == AnonymousClass00R.A0C) {
            C20346AHc aHc = new C20346AHc();
            ((C20367AHx) this.A06).A01.execute(new C21462AkT(this, aHc, new C22031AwX(r14, aHc, this, str2), r5, str2, 0));
            return aHc;
        }
        Integer num2 = AnonymousClass00R.A01;
        if (num != num2) {
            num2 = AnonymousClass00R.A00;
        }
        return new A7G(this, num2, str2, Collections.singletonList(r14), (List) null).A02();
    }

    public C113975oM A04(String str) {
        C21430Ajx ajx = new C21430Ajx(this, str);
        ((C20367AHx) this.A06).A01.execute(ajx);
        return ajx.A00;
    }

    public void A05() {
        synchronized (A0C) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A06() {
        if (Build.VERSION.SDK_INT >= 23) {
            C20354AHk.A03(this.A01);
        }
        WorkDatabase workDatabase = this.A04;
        C20365AHv aHv = (C20365AHv) workDatabase.A0E();
        C20076A6c a6c = aHv.A02;
        a6c.A06();
        C19955A0m a0m = aHv.A05;
        BDc A012 = a0m.A01();
        a6c.A07();
        try {
            AHW.A00(a6c, A012);
            C20076A6c.A02(a6c);
            a0m.A02(A012);
            C20066A5p.A01(this.A02, workDatabase, this.A07);
        } catch (Throwable th) {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
            throw th;
        }
    }

    public void A09(String str) {
        this.A06.BKq(new AnonymousClass8KS(this, str));
    }

    public A7W(Context context, AnonymousClass00I r5, C20359AHp aHp, WorkDatabase workDatabase, C186369e5 r8, C71973Kb r9, List list) {
        this.A08 = false;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 24 || !AnonymousClass9OF.A00(applicationContext)) {
            C162188Jp r0 = new C162188Jp(r5.A02);
            synchronized (A5Z.A00) {
                A5Z.A01 = r0;
            }
            this.A01 = applicationContext;
            this.A06 = r9;
            this.A04 = workDatabase;
            this.A03 = aHp;
            this.A09 = r8;
            this.A02 = r5;
            this.A07 = list;
            this.A05 = new AnonymousClass9UN(workDatabase);
            aHp.A02(new C20349AHf(r5, workDatabase, list, ((C20367AHx) r9).A01));
            this.A06.BKq(new C21460AkR(applicationContext, this));
            return;
        }
        throw AnonymousClass000.A0n("Cannot initialize WorkManager in direct boot mode");
    }

    public final A7G A03(C162248Jv r7, Integer num, String str) {
        List singletonList = Collections.singletonList(r7);
        if (!singletonList.isEmpty()) {
            return new A7G(this, num, str, singletonList, (List) null);
        }
        throw AnonymousClass000.A0k("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public void A07(C162248Jv r7, Integer num, String str) {
        new A7G(this, num, str, Collections.singletonList(r7), (List) null).A02();
    }

    public final void A08(C185319cO r7) {
        List singletonList = Collections.singletonList(r7);
        if (!singletonList.isEmpty()) {
            new A7G(this, AnonymousClass00R.A01, (String) null, singletonList, (List) null).A02();
            return;
        }
        throw AnonymousClass000.A0k("enqueue needs at least one WorkRequest.");
    }

    public A7W() {
    }
}
