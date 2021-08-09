/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ohos.samples.abilityinteractionex.slice;

import ohos.samples.abilityinteractionex.ResourceTable;
import ohos.samples.abilityinteractionex.utils.Const;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

/**
 * Second Ability Slice
 */
public class SecondAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_second_ability_slice);

        Component secondBackFirstButton = findComponentById(ResourceTable.Id_second_back_first);
        secondBackFirstButton.setClickedListener(component -> terminate());

        Text showParametersText = (Text) findComponentById(ResourceTable.Id_second_text);
        showParametersText.setText(intent.getStringParam(Const.ABILITY_PARAMETER_KEY));
    }
}
