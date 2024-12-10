package X;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AjO  reason: case insensitive filesystem */
public final /* synthetic */ class C21395AjO implements Runnable {
    public final /* synthetic */ C20463AMa A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicReference A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        int i;
        String str;
        C20463AMa aMa = this.A00;
        File file = this.A01;
        String str2 = this.A02;
        List list = this.A03;
        List list2 = this.A04;
        AtomicReference atomicReference = this.A06;
        boolean z = this.A07;
        CountDownLatch countDownLatch = this.A05;
        AnonymousClass8BU.A1H(atomicReference, 5, countDownLatch);
        try {
            AnonymousClass1L7 r12 = aMa.A0P;
            String A062 = C41361wE.A06(r12, file);
            if (A062 == null) {
                C17900vP.A0X(file, "gdrive/backup/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass000.A10());
            } else {
                Map map = aMa.A0b;
                C19990A2d a2d = (C19990A2d) map.get(A062);
                C36821oW r24 = aMa.A0M;
                if (r24.A01()) {
                    String absolutePath = file.getAbsolutePath();
                    C18070vi.A0X(absolutePath);
                    AnonymousClass1NW r13 = aMa.A0B;
                    int A002 = C20127A8m.A00(r13, a2d, r12, absolutePath);
                    if (!(A002 == 1 || A002 == 3)) {
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = new Object[2];
                        objArr[0] = A062;
                        if (A002 != 2) {
                            str = "remote-file-different-from-local";
                        } else {
                            str = "remote-file-does-not-exist";
                        }
                        C108955ca.A1W("gdrive/backup/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", locale, C108945cZ.A1b(str, objArr, 1, 2));
                        C20002A2r a2r = new C20002A2r(aMa.A0A, r13, aMa.A0G, aMa.A0J, r12, aMa.A0Q, file, str2, A062);
                        list.add(a2r);
                        String str3 = a2r.A05;
                        map.remove(str3);
                        if (a2d != null && !C18070vi.A18(a2d.A06, str3)) {
                            list2.add(a2d);
                            map.remove(a2d.A01());
                        }
                    }
                    AtomicLong atomicLong = aMa.A0d;
                    atomicLong.addAndGet(file.length());
                    if (r24.A01() && aMa.A0H.A0P.get() && z) {
                        C175238yN r7 = aMa.A0I;
                        long j = atomicLong.get();
                        long j2 = aMa.A05;
                        if (j2 > 0) {
                            i = Math.min(100, (int) ((100 * j) / j2));
                        } else {
                            i = -1;
                        }
                        if (j2 <= 0) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("GoogleBackupRestoreObservable/backup-preparation-progress ");
                            A10.append(j);
                            C17900vP.A0m("/", A10, j2);
                        }
                        if (i >= 0 && i != r7.A00) {
                            r7.A00 = i;
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("GoogleBackupRestoreObservable/backup-preparation-progress/");
                            A102.append(i);
                            C17890vO.A1A(A102, "%");
                            r7.notifyAllObservers(new C20723AWd(r7, 4));
                        }
                    }
                }
            }
        } catch (C167678gm e) {
            C108995ce.A1J(file, "gdrive/backup/get-files-to-be-uploaded problem with a file ", AnonymousClass000.A10(), e);
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ C21395AjO(C20463AMa aMa, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, boolean z) {
        this.A00 = aMa;
        this.A01 = file;
        this.A02 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A06 = atomicReference;
        this.A07 = z;
        this.A05 = countDownLatch;
    }
}
