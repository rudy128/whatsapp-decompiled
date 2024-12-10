package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import com.facebook.stash.core.FileStash;
import java.io.File;

/* renamed from: X.AIc  reason: case insensitive filesystem */
public class C20371AIc implements C22551BCi {
    public final B4X A00;

    public static String A00(A6K a6k) {
        ARAssetType aRAssetType = a6k.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal != 1) {
            if (!(ordinal == 0 || ordinal == 3 || ordinal == 2 || ordinal == 4)) {
                throw AnonymousClass8BX.A0V(aRAssetType, "Got unexpected metadata type: ", AnonymousClass000.A10());
            }
        } else if (a6k.A09 == null) {
            return a6k.A0A;
        }
        return a6k.A09;
    }

    public File BNx(A6K a6k, StorageCallback storageCallback) {
        C20373AIe aIe = (C20373AIe) this.A00;
        String A002 = A00(a6k);
        if (A002 == null) {
            return null;
        }
        return aIe.A02.getFile(A002);
    }

    public boolean BeA(A6K a6k) {
        C20373AIe aIe = (C20373AIe) this.A00;
        String A002 = A00(a6k);
        if (A002 == null || !aIe.A02.hasKey(A002)) {
            return false;
        }
        return true;
    }

    public void CEX(A6K a6k) {
        C20373AIe aIe = (C20373AIe) this.A00;
        String A002 = A00(a6k);
        if (A002 != null) {
            aIe.A02.remove(A002);
        }
    }

    public File CGf(A6K a6k, StorageCallback storageCallback, File file) {
        if (file == null) {
            return null;
        }
        C20373AIe aIe = (C20373AIe) this.A00;
        String A002 = A00(a6k);
        if (A002 == null) {
            return null;
        }
        FileStash fileStash = aIe.A02;
        File filePath = fileStash.getFilePath(A002);
        if (!C196389uy.A01(filePath)) {
            filePath = fileStash.insertFile(A002);
            if (!file.renameTo(filePath)) {
                Object[] A1b = AnonymousClass3MX.A1b(file, 0);
                A1b[1] = filePath;
                C26294Cx6.A0F("StashDiskCacheWrapper", "Failed renaming file from %s to %s", A1b);
                fileStash.remove(A002);
                return null;
            }
        }
        return filePath;
    }

    public void CRS(A6K a6k) {
        C20373AIe aIe = (C20373AIe) this.A00;
        String A002 = A00(a6k);
        if (A002 != null) {
            aIe.A02.getFile(A002);
        }
    }

    public C20371AIc(B4X b4x) {
        if (b4x != null) {
            this.A00 = b4x;
            return;
        }
        throw AnonymousClass000.A0n("Must provide a disk cache wrapper");
    }
}
