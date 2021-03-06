/*
 *  Copyright 2019 Arcus Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package arcus.cornea.subsystem.climate.model;

import java.util.List;


public class MoreSettingsModel {
    private List<ThermostatSettingsModel> thermostats;
    private DeviceSettingsModel dashboardTemperature;
    private DeviceSettingsModel dashboardHumidity;

    public List<ThermostatSettingsModel> getThermostats() {
        return thermostats;
    }

    public void setThermostats(List<ThermostatSettingsModel> thermostats) {
        this.thermostats = thermostats;
    }

    public DeviceSettingsModel getDashboardTemperature() {
        return dashboardTemperature;
    }

    public void setDashboardTemperature(DeviceSettingsModel dashboardTemperature) {
        this.dashboardTemperature = dashboardTemperature;
    }

    public DeviceSettingsModel getDashboardHumidity() {
        return dashboardHumidity;
    }

    public void setDashboardHumidity(DeviceSettingsModel dashboardHumidity) {
        this.dashboardHumidity = dashboardHumidity;
    }

    @Override
    public String toString() {
        return "MoreSettingsModel{" +
                "thermostats=" + thermostats +
                ", dashboardTemperature=" + dashboardTemperature +
                ", dashboardHumidity=" + dashboardHumidity +
                '}';
    }
}
