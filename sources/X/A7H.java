package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class A7H {
    public static final Object A04 = C17880vN.A0p();
    public final AnonymousClass1PH A00;
    public final C187559g0 A01;
    public final C59482mN A02;
    public final AnonymousClass1PF A03;

    public static Cipher A00(SecretKeySpec secretKeySpec, int i, int i2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i2;
            bArr[2] = (byte) (i2 >> 8);
            bArr[1] = (byte) (i2 >> 16);
            bArr[0] = (byte) (i2 >> 24);
            instance.init(i, secretKeySpec, AnonymousClass8BR.A19(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A6i, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.A6i, java.lang.Object] */
    private byte[] A01(C21575AmP amP, C19964A0z a0z) {
        LinkedList linkedList = a0z.A00;
        Iterator it = linkedList.iterator();
        LinkedList A14 = AnonymousClass8BR.A14();
        try {
            C20082A6i a6i = a0z.A01;
            ? obj = new Object();
            C20082A6i.A01(a6i.A00.A0O(), obj);
            byte[] A022 = A02(amP, obj);
            a0z.A01 = obj;
            return A022;
        } catch (AnonymousClass1P5 e) {
            while (true) {
                A14.add(e);
                if (it.hasNext()) {
                    ? obj2 = new Object();
                    C20082A6i.A01(((C20082A6i) it.next()).A00.A0O(), obj2);
                    byte[] A023 = A02(amP, obj2);
                    it.remove();
                    linkedList.addFirst(a0z.A01);
                    a0z.A01 = obj2;
                    if (linkedList.size() > 40) {
                        linkedList.removeLast();
                    }
                    return A023;
                }
                throw new AnonymousClass1P5((List) A14);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x031f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0325, code lost:
        throw new X.AnonymousClass1P5(r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x031f A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r1v18 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:80:0x02e8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] A02(X.C21575AmP r12, X.C20082A6i r13) {
        /*
            r11 = this;
            X.8cI r1 = r13.A00
            int r0 = r1.bitField0_
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x0369
            int r4 = r12.A01
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x0013
            r0 = 2
        L_0x0013:
            if (r4 != r0) goto L_0x0353
            X.AiX r6 = r12.A02
            int r1 = r12.A00
            X.2kk r0 = X.C20082A6i.A00(r6, r13)     // Catch:{ 1P8 -> 0x034c }
            if (r0 == 0) goto L_0x0051
            X.2kk r0 = X.C20082A6i.A00(r6, r13)     // Catch:{ 1P8 -> 0x034c }
            java.lang.Object r5 = r0.A00     // Catch:{ 1P8 -> 0x034c }
            X.8b5 r5 = (X.C165398b5) r5     // Catch:{ 1P8 -> 0x034c }
            if (r5 != 0) goto L_0x002b
            goto L_0x00d7
        L_0x002b:
            X.8cI r0 = r13.A00     // Catch:{ 1P8 -> 0x034c }
            int r0 = r0.sessionVersion_     // Catch:{ 1P8 -> 0x034c }
            if (r0 != 0) goto L_0x0032
            r0 = 2
        L_0x0032:
            X.9z2 r3 = X.C198859z2.A00(r0)     // Catch:{ 1P8 -> 0x034c }
            X.8Zp r0 = r5.chainKey_     // Catch:{ 1P8 -> 0x034c }
            if (r0 != 0) goto L_0x003c
            X.8Zp r0 = X.C164638Zp.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x034c }
        L_0x003c:
            X.DSQ r0 = r0.key_     // Catch:{ 1P8 -> 0x034c }
            byte[] r2 = r0.A06()     // Catch:{ 1P8 -> 0x034c }
            X.8Zp r0 = r5.chainKey_     // Catch:{ 1P8 -> 0x034c }
            if (r0 != 0) goto L_0x0048
            X.8Zp r0 = X.C164638Zp.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x034c }
        L_0x0048:
            int r0 = r0.index_     // Catch:{ 1P8 -> 0x034c }
            X.A4X r5 = new X.A4X     // Catch:{ 1P8 -> 0x034c }
            r5.<init>(r3, r2, r0)     // Catch:{ 1P8 -> 0x034c }
            goto L_0x00d8
        L_0x0051:
            X.8cI r0 = r13.A00     // Catch:{ 1P8 -> 0x034c }
            int r0 = r0.sessionVersion_     // Catch:{ 1P8 -> 0x034c }
            if (r0 != 0) goto L_0x0058
            r0 = 2
        L_0x0058:
            X.9z2 r2 = X.C198859z2.A00(r0)     // Catch:{ 1P8 -> 0x034c }
            X.8cI r0 = r13.A00     // Catch:{ 1P8 -> 0x034c }
            X.DSQ r0 = r0.rootKey_     // Catch:{ 1P8 -> 0x034c }
            byte[] r0 = r0.A06()     // Catch:{ 1P8 -> 0x034c }
            X.9kq r5 = new X.9kq     // Catch:{ 1P8 -> 0x034c }
            r5.<init>(r2, r0)     // Catch:{ 1P8 -> 0x034c }
            X.8cI r0 = r13.A00     // Catch:{ 1P8 -> 0x0346 }
            X.8b5 r0 = r0.senderChain_     // Catch:{ 1P8 -> 0x0346 }
            if (r0 != 0) goto L_0x0071
            X.8b5 r0 = X.C165398b5.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x0346 }
        L_0x0071:
            X.DSQ r0 = r0.senderRatchetKey_     // Catch:{ 1P8 -> 0x0346 }
            X.AiX r3 = X.C20065A5o.A00(r0)     // Catch:{ 1P8 -> 0x0346 }
            X.8cI r0 = r13.A00     // Catch:{ 1P8 -> 0x034c }
            X.8b5 r0 = r0.senderChain_     // Catch:{ 1P8 -> 0x034c }
            if (r0 != 0) goto L_0x007f
            X.8b5 r0 = X.C165398b5.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x034c }
        L_0x007f:
            X.DSQ r0 = r0.senderRatchetKeyPrivate_     // Catch:{ 1P8 -> 0x034c }
            byte[] r0 = r0.A06()     // Catch:{ 1P8 -> 0x034c }
            X.9ZN r2 = new X.9ZN     // Catch:{ 1P8 -> 0x034c }
            r2.<init>(r0)     // Catch:{ 1P8 -> 0x034c }
            X.9cI r0 = new X.9cI     // Catch:{ 1P8 -> 0x034c }
            r0.<init>(r2, r3)     // Catch:{ 1P8 -> 0x034c }
            X.2kk r2 = r5.A00(r6, r0)     // Catch:{ 1P8 -> 0x034c }
            X.9cI r8 = X.C20065A5o.A02()     // Catch:{ 1P8 -> 0x034c }
            java.lang.Object r0 = r2.A00     // Catch:{ 1P8 -> 0x034c }
            X.9kq r0 = (X.C190379kq) r0     // Catch:{ 1P8 -> 0x034c }
            X.2kk r9 = r0.A00(r6, r8)     // Catch:{ 1P8 -> 0x034c }
            java.lang.Object r0 = r9.A00     // Catch:{ 1P8 -> 0x034c }
            X.9kq r0 = (X.C190379kq) r0     // Catch:{ 1P8 -> 0x034c }
            r13.A0D(r0)     // Catch:{ 1P8 -> 0x034c }
            java.lang.Object r5 = r2.A01     // Catch:{ 1P8 -> 0x034c }
            X.A4X r5 = (X.A4X) r5     // Catch:{ 1P8 -> 0x034c }
            r13.A0B(r6, r5)     // Catch:{ 1P8 -> 0x034c }
            X.A4X r0 = r13.A05()     // Catch:{ 1P8 -> 0x034c }
            int r0 = r0.A00     // Catch:{ 1P8 -> 0x034c }
            int r2 = r0 + -1
            r0 = 0
            int r7 = java.lang.Math.max(r2, r0)     // Catch:{ 1P8 -> 0x034c }
            X.8cI r0 = r13.A00     // Catch:{ 1P8 -> 0x034c }
            X.Bmt r3 = X.AnonymousClass8BS.A07(r0)     // Catch:{ 1P8 -> 0x034c }
            X.Bm6 r2 = r3.A00     // Catch:{ 1P8 -> 0x034c }
            X.8cI r2 = (X.C166068cI) r2     // Catch:{ 1P8 -> 0x034c }
            int r0 = r2.bitField0_     // Catch:{ 1P8 -> 0x034c }
            r0 = r0 | 16
            r2.bitField0_ = r0     // Catch:{ 1P8 -> 0x034c }
            r2.previousCounter_ = r7     // Catch:{ 1P8 -> 0x034c }
            X.C20082A6i.A01(r3, r13)     // Catch:{ 1P8 -> 0x034c }
            java.lang.Object r0 = r9.A01     // Catch:{ 1P8 -> 0x034c }
            X.A4X r0 = (X.A4X) r0     // Catch:{ 1P8 -> 0x034c }
            r13.A0C(r8, r0)     // Catch:{ 1P8 -> 0x034c }
            goto L_0x00d8
        L_0x00d7:
            r5 = 0
        L_0x00d8:
            int r3 = r5.A00
            if (r3 <= r1) goto L_0x01b7
            X.2kk r0 = X.C20082A6i.A00(r6, r13)
            java.lang.Object r0 = r0.A00
            X.8b5 r0 = (X.C165398b5) r0
            if (r0 == 0) goto L_0x032e
            X.EE9 r0 = r0.messageKeys_
            java.util.Iterator r2 = r0.iterator()
        L_0x00ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x032e
            java.lang.Object r0 = r2.next()
            X.8b4 r0 = (X.C165388b4) r0
            int r0 = r0.index_
            if (r0 != r1) goto L_0x00ec
            X.2kk r6 = X.C20082A6i.A00(r6, r13)
            java.lang.Object r8 = r6.A00
            X.8b5 r8 = (X.C165398b5) r8
            r3 = 0
            if (r8 == 0) goto L_0x018b
            X.EE9 r0 = r8.messageKeys_
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>(r0)
            java.util.Iterator r10 = r7.iterator()
        L_0x0112:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r9 = r10.next()
            X.8b4 r9 = (X.C165388b4) r9
            int r0 = r9.index_
            if (r0 != r1) goto L_0x0112
            X.DSQ r0 = r9.cipherKey_
            byte[] r0 = r0.A06()
            javax.crypto.spec.SecretKeySpec r5 = X.AnonymousClass8BS.A0v(r0)
            X.DSQ r0 = r9.macKey_
            byte[] r1 = r0.A06()
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            r2.<init>(r1, r0)
            X.DSQ r0 = r9.iv_
            byte[] r0 = r0.A06()
            javax.crypto.spec.IvParameterSpec r1 = X.AnonymousClass8BR.A19(r0)
            int r0 = r9.index_
            X.9fD r3 = new X.9fD
            r3.<init>(r1, r5, r2, r0)
            r10.remove()
        L_0x014d:
            X.Bmt r5 = X.AnonymousClass8BS.A07(r8)
            X.Bm6 r1 = r5.A00
            X.8b5 r1 = (X.C165398b5) r1
            X.Bm9 r0 = X.C23579Bm9.A02
            r1.messageKeys_ = r0
            X.Bm6 r2 = X.C17880vN.A0G(r5)
            X.8b5 r2 = (X.C165398b5) r2
            X.EE9 r1 = r2.messageKeys_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x016e
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.messageKeys_ = r1
        L_0x016e:
            X.DND.A09(r7, r1)
            X.Bm6 r2 = r5.A0C()
            X.8b5 r2 = (X.C165398b5) r2
            X.8cI r0 = r13.A00
            X.Bmt r1 = r0.A0O()
            X.8Wn r1 = (X.C163838Wn) r1
            java.lang.Object r0 = r6.A01
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.A0G(r2, r0)
            X.C20082A6i.A01(r1, r13)
        L_0x018b:
            X.2r0 r7 = r13.A04()
            X.2r0 r6 = r13.A03()
            javax.crypto.spec.SecretKeySpec r5 = r3.A03
            byte[] r2 = r12.A04
            int r1 = r2.length
            r0 = 8
            int r1 = r1 - r0
            byte[][] r2 = X.C20011A3b.A01(r2, r1, r0)
            r0 = 0
            r0 = r2[r0]
            byte[] r1 = X.C21575AmP.A00(r5, r7, r6, r0, r4)
            r0 = 1
            r0 = r2[r0]
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            if (r0 == 0) goto L_0x0326
            byte[] r6 = r12.A03
            r0 = 3
            r5 = 2
            if (r4 < r0) goto L_0x02fc
            goto L_0x02e8
        L_0x01b7:
            int r2 = r1 - r3
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r0) goto L_0x01c5
            java.lang.String r0 = "Over 2000 messages into the future!"
            X.1P5 r1 = new X.1P5
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x01c5:
            int r7 = r5.A00
            if (r7 >= r1) goto L_0x02a4
            X.9fD r10 = r5.A01()
            X.2kk r9 = X.C20082A6i.A00(r6, r13)
            java.lang.Object r8 = r9.A00
            X.Bm6 r8 = (X.C23577Bm6) r8
            X.8b4 r0 = X.C165388b4.DEFAULT_INSTANCE
            X.Bmt r7 = r0.A0N()
            javax.crypto.spec.SecretKeySpec r0 = r10.A02
            byte[] r0 = r0.getEncoded()
            X.BmB r3 = X.C17900vP.A03(r7, r0)
            X.Bm6 r2 = r7.A00
            X.8b4 r2 = (X.C165388b4) r2
            int r0 = r2.bitField0_
            r0 = r0 | 2
            r2.bitField0_ = r0
            r2.cipherKey_ = r3
            javax.crypto.spec.SecretKeySpec r0 = r10.A03
            byte[] r0 = r0.getEncoded()
            X.BmB r3 = X.C17900vP.A03(r7, r0)
            X.Bm6 r2 = r7.A00
            X.8b4 r2 = (X.C165388b4) r2
            int r0 = r2.bitField0_
            r0 = r0 | 4
            r2.bitField0_ = r0
            r2.macKey_ = r3
            int r3 = r10.A00
            X.Bm6 r2 = X.C17880vN.A0G(r7)
            X.8b4 r2 = (X.C165388b4) r2
            int r0 = r2.bitField0_
            r0 = r0 | 1
            r2.bitField0_ = r0
            r2.index_ = r3
            javax.crypto.spec.IvParameterSpec r0 = r10.A01
            byte[] r0 = r0.getIV()
            X.BmB r3 = X.C17900vP.A03(r7, r0)
            X.Bm6 r2 = r7.A00
            X.8b4 r2 = (X.C165388b4) r2
            int r0 = r2.bitField0_
            r0 = r0 | 8
            r2.bitField0_ = r0
            r2.iv_ = r3
            X.Bm6 r7 = r7.A0C()
            X.Bmt r8 = X.AnonymousClass8BS.A07(r8)
            X.Bm6 r3 = r8.A00
            X.8b5 r3 = (X.C165398b5) r3
            int r0 = X.C165398b5.CHAINKEY_FIELD_NUMBER
            r7.getClass()
            X.EE9 r2 = r3.messageKeys_
            r0 = r2
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x024d
            X.EE9 r2 = X.C23577Bm6.A09(r2)
            r3.messageKeys_ = r2
        L_0x024d:
            r2.add(r7)
            X.Bm6 r0 = r8.A00
            X.8b5 r0 = (X.C165398b5) r0
            X.EE9 r0 = r0.messageKeys_
            int r2 = r0.size()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 <= r0) goto L_0x0277
            X.Bm6 r7 = X.C17880vN.A0G(r8)
            X.8b5 r7 = (X.C165398b5) r7
            r3 = 0
            X.EE9 r2 = r7.messageKeys_
            r0 = r2
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0274
            X.EE9 r2 = X.C23577Bm6.A09(r2)
            r7.messageKeys_ = r2
        L_0x0274:
            r2.remove(r3)
        L_0x0277:
            X.8cI r0 = r13.A00
            X.Bmt r3 = r0.A0O()
            X.8Wn r3 = (X.C163838Wn) r3
            java.lang.Object r0 = r9.A01
            int r2 = X.AnonymousClass000.A0M(r0)
            X.Bm6 r0 = r8.A0C()
            X.8b5 r0 = (X.C165398b5) r0
            r3.A0G(r0, r2)
            X.C20082A6i.A01(r3, r13)
            byte[] r0 = X.A4X.A03
            byte[] r3 = X.A4X.A00(r5, r0)
            X.9z2 r2 = r5.A01
            int r0 = r5.A00
            int r0 = r0 + 1
            X.A4X r5 = new X.A4X
            r5.<init>(r2, r3, r0)
            goto L_0x01c5
        L_0x02a4:
            byte[] r0 = X.A4X.A03
            byte[] r3 = X.A4X.A00(r5, r0)
            X.9z2 r2 = r5.A01
            int r0 = r7 + 1
            X.A4X r1 = new X.A4X
            r1.<init>(r2, r3, r0)
            X.2kk r3 = X.C20082A6i.A00(r6, r13)
            java.lang.Object r0 = r3.A00
            X.Bm6 r0 = (X.C23577Bm6) r0
            X.8Zp r1 = X.AnonymousClass8X5.A00(r1)
            X.Bmt r0 = r0.A0O()
            X.8Wo r0 = (X.C163848Wo) r0
            r0.A0G(r1)
            X.Bm6 r2 = r0.A0C()
            X.8b5 r2 = (X.C165398b5) r2
            X.8cI r0 = r13.A00
            X.Bmt r1 = r0.A0O()
            X.8Wn r1 = (X.C163838Wn) r1
            java.lang.Object r0 = r3.A01
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.A0G(r2, r0)
            X.C20082A6i.A01(r1, r13)
            X.9fD r3 = r5.A01()
            goto L_0x018b
        L_0x02e8:
            javax.crypto.spec.SecretKeySpec r2 = r3.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
            javax.crypto.spec.IvParameterSpec r1 = r3.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02f6, BadPaddingException | IllegalBlockSizeException -> 0x031f }
            r0.init(r5, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02f6, BadPaddingException | IllegalBlockSizeException -> 0x031f }
            goto L_0x0304
        L_0x02f6:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
        L_0x02fc:
            javax.crypto.spec.SecretKeySpec r1 = r3.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
            int r0 = r3.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
            javax.crypto.Cipher r0 = A00(r1, r5, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
        L_0x0304:
            byte[] r3 = r0.doFinal(r6)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x031f }
            X.8cI r0 = r13.A00
            X.Bmt r2 = X.AnonymousClass8BS.A07(r0)
            X.Bm6 r1 = r2.A00
            X.8cI r1 = (X.C166068cI) r1
            r0 = 0
            r1.pendingPreKey_ = r0
            int r0 = r1.bitField0_
            r0 = r0 & -65
            r1.bitField0_ = r0
            X.C20082A6i.A01(r2, r13)
            return r3
        L_0x031f:
            r1 = move-exception
            X.1P5 r0 = new X.1P5
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0326:
            java.lang.String r1 = "Bad Mac!"
            X.1P5 r0 = new X.1P5
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x032e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Received message with old counter: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " , "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r1)
            X.1P6 r1 = new X.1P6
            r1.<init>(r0)
            throw r1
        L_0x0346:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ 1P8 -> 0x034c }
            throw r0     // Catch:{ 1P8 -> 0x034c }
        L_0x034c:
            r1 = move-exception
            X.1P5 r0 = new X.1P5
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0353:
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass000.A1L(r1, r4)
            X.AnonymousClass000.A1M(r1, r0)
            java.lang.String r0 = "Message version %d, but session version %d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.1P5 r0 = new X.1P5
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0369:
            java.lang.String r1 = "Uninitialized session!"
            X.1P5 r0 = new X.1P5
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7H.A02(X.AmP, X.A6i):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        throw X.AnonymousClass8BR.A0v(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f A[ExcHandler: BadPaddingException | IllegalBlockSizeException (r0v26 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:11:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C72333Ln A03(byte[] r29) {
        /*
            r28 = this;
            r0 = r28
            X.1PF r5 = r0.A03
            X.2mN r4 = r0.A02
            X.A0z r3 = r5.Bhr(r4)
            X.A6i r2 = r3.A01
            X.A4X r1 = r2.A05()
            X.9fD r9 = r1.A01()
            X.8cI r0 = r2.A00     // Catch:{ 1P8 -> 0x0115 }
            X.8b5 r0 = r0.senderChain_     // Catch:{ 1P8 -> 0x0115 }
            if (r0 != 0) goto L_0x001c
            X.8b5 r0 = X.C165398b5.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x0115 }
        L_0x001c:
            X.DSQ r0 = r0.senderRatchetKey_     // Catch:{ 1P8 -> 0x0115 }
            X.AiX r15 = X.C20065A5o.A00(r0)     // Catch:{ 1P8 -> 0x0115 }
            X.8cI r0 = r2.A00
            int r7 = r0.previousCounter_
            int r6 = r0.sessionVersion_
            if (r6 != 0) goto L_0x002b
            r6 = 2
        L_0x002b:
            r0 = 3
            r11 = 1
            if (r6 < r0) goto L_0x0043
            javax.crypto.spec.SecretKeySpec r10 = r9.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
            javax.crypto.spec.IvParameterSpec r8 = r9.A01     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x003d, BadPaddingException | IllegalBlockSizeException -> 0x010f }
            r0.init(r11, r10, r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x003d, BadPaddingException | IllegalBlockSizeException -> 0x010f }
            goto L_0x004b
        L_0x003d:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
            throw r0     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
        L_0x0043:
            javax.crypto.spec.SecretKeySpec r8 = r9.A02     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
            int r0 = r9.A00     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
            javax.crypto.Cipher r0 = A00(r8, r11, r0)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
        L_0x004b:
            r8 = r29
            byte[] r16 = r0.doFinal(r8)     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x010f }
            X.AmP r11 = new X.AmP
            javax.crypto.spec.SecretKeySpec r12 = r9.A03
            int r0 = r1.A00
            X.2r0 r13 = r2.A03()
            X.2r0 r14 = r2.A04()
            r20 = r11
            r19 = r7
            r18 = r0
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            X.8cI r8 = r2.A00
            int r7 = r8.bitField0_
            r7 = r7 & 64
            if (r7 == 0) goto L_0x00c9
            X.8ad r7 = r8.pendingPreKey_     // Catch:{ 1P8 -> 0x00ac }
            r10 = r7
            r8 = r7
            if (r7 != 0) goto L_0x007a
            X.8ad r7 = X.C165128ad.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x00ac }
        L_0x007a:
            int r7 = r7.bitField0_     // Catch:{ 1P8 -> 0x00ac }
            r7 = r7 & 1
            if (r7 == 0) goto L_0x0098
            if (r10 != 0) goto L_0x0084
            X.8ad r8 = X.C165128ad.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x00ac }
        L_0x0084:
            int r7 = r8.preKeyId_     // Catch:{ 1P8 -> 0x00ac }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 1P8 -> 0x00ac }
            if (r7 == 0) goto L_0x0092
            X.3K3 r9 = new X.3K3     // Catch:{ 1P8 -> 0x00ac }
            r9.<init>(r7)     // Catch:{ 1P8 -> 0x00ac }
            goto L_0x009a
        L_0x0092:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ 1P8 -> 0x00ac }
            r0.<init>()     // Catch:{ 1P8 -> 0x00ac }
            throw r0     // Catch:{ 1P8 -> 0x00ac }
        L_0x0098:
            X.3K4 r9 = X.AnonymousClass3K4.A00     // Catch:{ 1P8 -> 0x00ac }
        L_0x009a:
            r7 = r10
            if (r10 != 0) goto L_0x009f
            X.8ad r7 = X.C165128ad.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x00ac }
        L_0x009f:
            int r8 = r7.signedPreKeyId_     // Catch:{ 1P8 -> 0x00ac }
            if (r10 != 0) goto L_0x00a5
            X.8ad r10 = X.C165128ad.DEFAULT_INSTANCE     // Catch:{ 1P8 -> 0x00ac }
        L_0x00a5:
            X.DSQ r7 = r10.baseKey_     // Catch:{ 1P8 -> 0x00ac }
            X.AiX r22 = X.C20065A5o.A00(r7)     // Catch:{ 1P8 -> 0x00ac }
            goto L_0x00b2
        L_0x00ac:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x00b2:
            X.8cI r7 = r2.A00
            int r7 = r7.localRegistrationId_
            X.2r0 r21 = r2.A03()
            X.AmN r20 = new X.AmN
            r23 = r11
            r24 = r9
            r25 = r6
            r26 = r7
            r27 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
        L_0x00c9:
            byte[] r6 = X.A4X.A03
            byte[] r7 = X.A4X.A00(r1, r6)
            X.9z2 r6 = r1.A01
            int r1 = r0 + 1
            X.A4X r0 = new X.A4X
            r0.<init>(r6, r7, r1)
            X.8Zp r1 = X.AnonymousClass8X5.A00(r0)
            X.8cI r0 = r2.A00
            X.8b5 r0 = r0.senderChain_
            if (r0 != 0) goto L_0x00e4
            X.8b5 r0 = X.C165398b5.DEFAULT_INSTANCE
        L_0x00e4:
            X.Bmt r0 = r0.A0O()
            X.8Wo r0 = (X.C163848Wo) r0
            r0.A0G(r1)
            X.Bm6 r7 = r0.A0C()
            X.8b5 r7 = (X.C165398b5) r7
            X.8cI r0 = r2.A00
            X.Bmt r6 = X.AnonymousClass8BS.A07(r0)
            X.Bm6 r1 = r6.A00
            X.8cI r1 = (X.C166068cI) r1
            r7.getClass()
            r1.senderChain_ = r7
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            X.C20082A6i.A01(r6, r2)
            r5.COh(r4, r3)
            return r20
        L_0x010f:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x0115:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7H.A03(byte[]):X.3Ln");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.9N8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.9z2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v5, types: [X.2S5, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e3, code lost:
        if (X.AnonymousClass000.A0M(r2.A00()) != 16777215) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(X.C22490B9w r19, X.C21573AmN r20) {
        /*
            r18 = this;
            r6 = r18
            X.1PF r0 = r6.A03
            r17 = r0
            X.2mN r7 = r6.A02
            X.A0z r8 = r0.Bhr(r7)
            X.9g0 r13 = r6.A01
            r9 = r20
            X.2r0 r5 = r9.A03
            X.1PG r4 = r13.A03
            X.2mN r3 = r13.A02
            r4.Bgm(r5, r3)
            int r10 = r9.A02
            X.AiX r11 = r9.A04
            byte[] r2 = r11.A00()
            X.A6i r0 = r8.A01
            X.8cI r1 = r0.A00
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x002a
            r0 = 2
        L_0x002a:
            if (r0 != r10) goto L_0x007f
            X.DSQ r0 = r1.aliceBaseKey_
            byte[] r0 = r0.A06()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x007f
        L_0x0038:
            java.lang.String r10 = "SessionBuilder"
            java.lang.String r2 = "We've already setup a session for this V3 message, letting bundled message fall through..."
            X.1DV r0 = X.AnonymousClass1DW.A00
            if (r0 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SignalProtocolLogger ("
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "): "
            X.C17900vP.A0g(r0, r2, r1)
        L_0x0051:
            X.3K4 r2 = X.AnonymousClass3K4.A00
        L_0x0053:
            r4.CGj(r5, r3)
            X.AmP r0 = r9.A05
            byte[] r4 = r6.A01(r0, r8)
            r0 = r19
            r0.BcN(r4)
            r0 = r17
            r0.COh(r7, r8)
            boolean r0 = r2 instanceof X.AnonymousClass3K3
            if (r0 == 0) goto L_0x007d
            r0 = 1
        L_0x006b:
            if (r0 == 0) goto L_0x007c
            X.1PH r3 = r6.A00
            java.lang.Object r0 = r2.A00()
            int r1 = X.AnonymousClass000.A0M(r0)
            X.1PC r0 = r3.A03
            r0.A02(r1)
        L_0x007c:
            return r4
        L_0x007d:
            r0 = 0
            goto L_0x006b
        L_0x007f:
            java.util.LinkedList r0 = r8.A00
            java.util.Iterator r12 = r0.iterator()
        L_0x0085:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r0 = r12.next()
            X.A6i r0 = (X.C20082A6i) r0
            X.8cI r1 = r0.A00
            int r0 = r1.sessionVersion_
            if (r0 != 0) goto L_0x0098
            r0 = 2
        L_0x0098:
            if (r0 != r10) goto L_0x0085
            X.DSQ r0 = r1.aliceBaseKey_
            byte[] r0 = r0.A06()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x0085
            goto L_0x0038
        L_0x00a7:
            X.1PI r0 = r13.A01
            int r10 = r9.A01
            X.1PD r0 = r0.A00
            byte[] r1 = r0.A01(r10)
            if (r1 == 0) goto L_0x0243
            X.9N8 r2 = new X.9N8     // Catch:{ IOException -> 0x0225 }
            r2.<init>()     // Catch:{ IOException -> 0x0225 }
            X.2BQ r0 = X.AnonymousClass2BQ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0225 }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ IOException -> 0x0225 }
            X.2BQ r0 = (X.AnonymousClass2BQ) r0     // Catch:{ IOException -> 0x0225 }
            r2.A00 = r0     // Catch:{ IOException -> 0x0225 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0225 }
            java.lang.String r0 = "axolotl loaded a signed pre key with id "
            X.C17900vP.A0j(r0, r1, r10)     // Catch:{ IOException -> 0x0225 }
            X.2BQ r1 = r2.A00     // Catch:{ 1P8 -> 0x021f }
            X.DSQ r0 = r1.publicKey_     // Catch:{ 1P8 -> 0x021f }
            X.AiX r2 = X.C20065A5o.A00(r0)     // Catch:{ 1P8 -> 0x021f }
            X.DSQ r0 = r1.privateKey_     // Catch:{ 1P8 -> 0x021f }
            byte[] r1 = r0.A06()     // Catch:{ 1P8 -> 0x021f }
            X.9ZN r0 = new X.9ZN     // Catch:{ 1P8 -> 0x021f }
            r0.<init>(r1)     // Catch:{ 1P8 -> 0x021f }
            X.9cI r12 = new X.9cI     // Catch:{ 1P8 -> 0x021f }
            r12.<init>(r0, r2)     // Catch:{ 1P8 -> 0x021f }
            X.2dT r0 = r4.BSl()
            X.3BW r2 = r9.A06
            boolean r1 = r2 instanceof X.AnonymousClass3K3
            if (r1 == 0) goto L_0x0104
            r16 = 1
        L_0x00ef:
            if (r16 == 0) goto L_0x0129
            X.1PH r13 = r13.A00
            java.lang.Object r1 = r2.A00()
            int r10 = X.AnonymousClass000.A0M(r1)
            X.1PC r13 = r13.A03
            byte[] r15 = r13.A04(r10)
            if (r15 == 0) goto L_0x0202
            goto L_0x0107
        L_0x0104:
            r16 = 0
            goto L_0x00ef
        L_0x0107:
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01e7 }
            java.lang.String r1 = "SignalProtocolStore/load found a pre key with id "
            X.C17900vP.A0j(r1, r14, r10)     // Catch:{ IOException -> 0x01e7 }
            X.2S5 r14 = new X.2S5     // Catch:{ IOException -> 0x01e7 }
            r14.<init>()     // Catch:{ IOException -> 0x01e7 }
            X.2BH r1 = X.AnonymousClass2BH.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x01e7 }
            X.Bm6 r1 = X.C23577Bm6.A07(r1, r15)     // Catch:{ IOException -> 0x01e7 }
            X.2BH r1 = (X.AnonymousClass2BH) r1     // Catch:{ IOException -> 0x01e7 }
            r14.A00 = r1     // Catch:{ IOException -> 0x01e7 }
            X.9cI r1 = r14.A00()
            X.3K3 r13 = new X.3K3
            r13.<init>(r1)
            goto L_0x012b
        L_0x0129:
            X.3K4 r13 = X.AnonymousClass3K4.A00
        L_0x012b:
            boolean r1 = r8.A02
            if (r1 != 0) goto L_0x0132
            r8.A00()
        L_0x0132:
            X.A6i r10 = r8.A01
            if (r5 == 0) goto L_0x0218
            r10.A06()     // Catch:{ IOException -> 0x0212 }
            r10.A0A(r5)     // Catch:{ IOException -> 0x0212 }
            X.2r0 r1 = r0.A00     // Catch:{ IOException -> 0x0212 }
            r10.A09(r1)     // Catch:{ IOException -> 0x0212 }
            java.io.ByteArrayOutputStream r1 = X.C108945cZ.A15()     // Catch:{ IOException -> 0x0212 }
            r14 = 32
            byte[] r15 = new byte[r14]     // Catch:{ IOException -> 0x0212 }
            r14 = -1
            java.util.Arrays.fill(r15, r14)     // Catch:{ IOException -> 0x0212 }
            r1.write(r15)     // Catch:{ IOException -> 0x0212 }
            X.AiX r15 = r5.A00     // Catch:{ IOException -> 0x0212 }
            X.9ZN r14 = r12.A00     // Catch:{ IOException -> 0x0212 }
            byte[] r15 = X.C20065A5o.A03(r14, r15)     // Catch:{ IOException -> 0x0212 }
            r1.write(r15)     // Catch:{ IOException -> 0x0212 }
            X.9ZN r0 = r0.A01     // Catch:{ IOException -> 0x0212 }
            byte[] r0 = X.C20065A5o.A03(r0, r11)     // Catch:{ IOException -> 0x0212 }
            r1.write(r0)     // Catch:{ IOException -> 0x0212 }
            byte[] r0 = X.C20065A5o.A03(r14, r11)     // Catch:{ IOException -> 0x0212 }
            r1.write(r0)     // Catch:{ IOException -> 0x0212 }
            boolean r0 = r13 instanceof X.AnonymousClass3K3     // Catch:{ IOException -> 0x0212 }
            if (r0 == 0) goto L_0x0171
            r0 = 1
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r0 == 0) goto L_0x0183
            java.lang.Object r0 = r13.A00()     // Catch:{ IOException -> 0x0212 }
            X.9cI r0 = (X.C185259cI) r0     // Catch:{ IOException -> 0x0212 }
            X.9ZN r0 = r0.A00     // Catch:{ IOException -> 0x0212 }
            byte[] r0 = X.C20065A5o.A03(r0, r11)     // Catch:{ IOException -> 0x0212 }
            r1.write(r0)     // Catch:{ IOException -> 0x0212 }
        L_0x0183:
            byte[] r13 = r1.toByteArray()     // Catch:{ IOException -> 0x0212 }
            X.B4D r15 = new X.B4D     // Catch:{ IOException -> 0x0212 }
            r15.<init>()     // Catch:{ IOException -> 0x0212 }
            java.lang.String r0 = "WhisperText"
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x0212 }
            r0 = 64
            byte[] r1 = r15.A02(r13, r1, r0)     // Catch:{ IOException -> 0x0212 }
            r0 = 32
            byte[][] r1 = X.C20011A3b.A01(r1, r0, r0)     // Catch:{ IOException -> 0x0212 }
            r14 = 0
            r0 = r1[r14]     // Catch:{ IOException -> 0x0212 }
            X.9kq r13 = new X.9kq     // Catch:{ IOException -> 0x0212 }
            r13.<init>(r15, r0)     // Catch:{ IOException -> 0x0212 }
            r0 = 1
            r1 = r1[r0]     // Catch:{ IOException -> 0x0212 }
            X.A4X r0 = new X.A4X     // Catch:{ IOException -> 0x0212 }
            r0.<init>(r15, r1, r14)     // Catch:{ IOException -> 0x0212 }
            X.9cJ r1 = new X.9cJ     // Catch:{ IOException -> 0x0212 }
            r1.<init>(r0, r13)     // Catch:{ IOException -> 0x0212 }
            X.A4X r0 = r1.A00     // Catch:{ IOException -> 0x0212 }
            r10.A0C(r12, r0)     // Catch:{ IOException -> 0x0212 }
            X.9kq r0 = r1.A01     // Catch:{ IOException -> 0x0212 }
            r10.A0D(r0)     // Catch:{ IOException -> 0x0212 }
            X.A6i r1 = r8.A01
            int r0 = r4.BU5()
            r1.A07(r0)
            X.A6i r1 = r8.A01
            int r0 = r9.A00
            r1.A08(r0)
            X.A6i r1 = r8.A01
            byte[] r0 = r11.A00()
            r1.A0E(r0)
            if (r16 == 0) goto L_0x0051
            java.lang.Object r0 = r2.A00()
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r1 == r0) goto L_0x0051
            goto L_0x0053
        L_0x01e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SignalProtocolStore/load error reading prekey "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; deleting"
            X.C108985cd.A1M(r0, r1, r2)
            r13.A02(r10)
            X.1P9 r0 = new X.1P9
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0202:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No prekey found with id "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r10)
            X.1P9 r0 = new X.1P9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0212:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x0218:
            java.lang.String r0 = "Null value!"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x021f:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        L_0x0225:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "failed to parse signed pre key record during load for id "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r10)
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "invalid prekey record with id "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r10)
            X.1P9 r0 = new X.1P9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0243:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "no signed prekey available with id "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r10)
            X.1P9 r0 = new X.1P9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7H.A04(X.B9w, X.AmN):byte[]");
    }

    public byte[] A05(C22490B9w b9w, C21575AmP amP) {
        AnonymousClass1PF r3 = this.A03;
        C59482mN r2 = this.A02;
        if (r3.BFm(r2)) {
            C19964A0z Bhr = r3.Bhr(r2);
            byte[] A012 = A01(amP, Bhr);
            b9w.BcN(A012);
            r3.COh(r2, Bhr);
            return A012;
        }
        throw new AnonymousClass1P7(AnonymousClass001.A1E(r2, "No session for: ", AnonymousClass000.A10()));
    }

    public A7H(AnonymousClass1PH r7, AnonymousClass1PI r8, C59482mN r9, AnonymousClass1PG r10, AnonymousClass1PF r11) {
        this.A03 = r11;
        this.A00 = r7;
        this.A02 = r9;
        AnonymousClass1PI r2 = r8;
        this.A01 = new C187559g0(r7, r2, r9, r10, r11);
    }
}
