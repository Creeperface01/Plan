/*
 *  This file is part of Player Analytics (Plan).
 *
 *  Plan is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License v3 as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Plan is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Plan. If not, see <https://www.gnu.org/licenses/>.
 */
package com.djrapitops.plan.delivery.formatting.time;

import com.djrapitops.plan.settings.config.PlanConfig;
import com.djrapitops.plan.settings.locale.Locale;

/**
 * Formatter for a timestamp in ISO-8601 format without the clock.
 *
 * @author Rsl1122
 */
public class ISO8601NoClockFormatter extends DateFormatter {

    public ISO8601NoClockFormatter(PlanConfig config, Locale locale) {
        super(config, locale);
    }

    @Override
    public String apply(Long date) {
        return date > 0 ? format(date) : "-";
    }

    private String format(Long date) {
        String format = "yyyy-MM-dd";

        return format(date, format);
    }
}