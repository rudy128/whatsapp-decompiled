package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class A8L {
    public static final A8L A00 = new Object();

    public static final int A00(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 8;
        }
        throw AnonymousClass8BX.A0W("Unexpected backup result value: ", AnonymousClass000.A10(), i);
    }

    public static final void A02(AnonymousClass190 r3, byte[] bArr) {
        C18070vi.A0d(r3, 0);
        int length = bArr.length;
        if (length != 32) {
            r3.A0G("crypto-iq-incorrect-account-hash-size", String.valueOf(length), true);
        }
    }

    public static final void A03(AnonymousClass1L7 r4) {
        C18070vi.A0d(r4, 0);
        File[] listFiles = r4.A04().listFiles(new C21335AiL(2));
        if (listFiles != null) {
            for (File A0Q : listFiles) {
                C64062u9.A0Q(A0Q);
            }
        }
        File[] listFiles2 = r4.A03().listFiles();
        if (listFiles2 != null) {
            for (File A0Q2 : listFiles2) {
                C64062u9.A0Q(A0Q2);
            }
        }
    }

    public static final boolean A04(C165178ai r5, String str) {
        C18070vi.A0d(r5, 0);
        if ((r5.bitField0_ & 8) != 0) {
            C166288ce r0 = r5.backupMetadata_;
            C166288ce r1 = r0;
            if (r0 == null) {
                r0 = C166288ce.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 4) != 0) {
                if (r1 == null) {
                    r1 = C166288ce.DEFAULT_INSTANCE;
                }
                String str2 = r1.jidSuffix_;
                if (!(str2 == null || str2.length() == 0 || str.endsWith(str2))) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("EncBackupUtils/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                    A10.append(str2);
                    C17900vP.A0e("  actual-jid-user: ", str, A10);
                    return true;
                }
            }
        }
        return false;
    }

    public static final byte[] A05(byte[] bArr) {
        MessageDigest messageDigest;
        C18070vi.A0d(bArr, 0);
        AnonymousClass8BS.A1K(bArr);
        try {
            messageDigest = C108945cZ.A1I();
        } catch (NoSuchAlgorithmException e) {
            Log.e("calculateahash/digester ", e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            Log.e("calculateahash/digester is null");
            return null;
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public final long A06(C18030ve r8, boolean z) {
        if (z) {
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        AnonymousClass8BV.A1Q(instance, 14, 0);
        instance.set(12, 0);
        instance.set(11, C18020vd.A00(C18040vf.A02, r8, 954) + 2);
        return Math.max(instance.getTimeInMillis(), System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(AnonymousClass8BR.A05(r8, 955)));
    }

    public static final ArrayList A01(File file, List list) {
        File[] listFiles;
        boolean A1Z = C72453Mb.A1Z(list);
        SimpleDateFormat A0q = AnonymousClass8BS.A0q("yyyy-MM-dd");
        ArrayList A13 = AnonymousClass000.A13();
        String pattern = A0q.toPattern();
        String name = file.getName();
        String substring = C60412nz.A01(name, new Date()).substring(A1Z ? 1 : 0, name.indexOf(46) + 1);
        String name2 = file.getName();
        String A0A = C17900vP.A0A(name2.substring(name2.indexOf(46)), "");
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            String name3 = file.getName();
            A0D.add(C17900vP.A0A(name3.substring(name3.indexOf(46)), A0v));
        }
        File parentFile = file.getParentFile();
        if (!(parentFile == null || (listFiles = parentFile.listFiles()) == null)) {
            ArrayList A132 = AnonymousClass000.A13();
            for (File file2 : listFiles) {
                String name4 = file2.getName();
                C18070vi.A0b(name4);
                C18070vi.A0b(substring);
                if (AnonymousClass1YE.A0A(name4, substring, A1Z)) {
                    C18070vi.A0b(A0A);
                    AnonymousClass3Ma.A1N(name4, A1Z, A0A);
                    if (name4.endsWith(A0A)) {
                        if (name4.length() > substring.length() + pattern.length()) {
                            A132.add(file2);
                        }
                    } else if (!(A0D instanceof Collection) || !A0D.isEmpty()) {
                        Iterator it2 = A0D.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String A0v2 = C17880vN.A0v(it2);
                                if (A0v2 == null) {
                                    A0v2 = "";
                                }
                                if (name4.endsWith(A0v2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            A13.addAll(A132);
        }
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            A0D2.add(C108945cZ.A17(AnonymousClass001.A1H(file.getPath(), C17880vN.A0v(it3), AnonymousClass000.A10())));
        }
        ArrayList A133 = AnonymousClass000.A13();
        for (Object next : A0D2) {
            if (((File) next).exists()) {
                A133.add(next);
            }
        }
        A13.addAll(A133);
        C18070vi.A0b(substring);
        C29391cC.A0H(A13, new C21484Akp(substring, A0q));
        return A13;
    }
}
