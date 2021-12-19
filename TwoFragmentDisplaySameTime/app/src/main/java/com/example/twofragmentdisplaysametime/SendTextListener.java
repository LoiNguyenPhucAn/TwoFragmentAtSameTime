package com.example.twofragmentdisplaysametime;

/** https://viblo.asia/p/truyen-du-lieu-giua-cac-fragments-bang-interface-eW65Gw3O5DO
 * Mục đích của interface này là mỗi khi được gọi,
 * nó sẽ lấy ra data (cái tham số text trong hàm ấy) và truyền về nơi implement cái interface này.
 * */

public interface SendTextListener {
    void sendText(String text);
}
