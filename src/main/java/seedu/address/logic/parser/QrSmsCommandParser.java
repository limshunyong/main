package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.QrCallCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new QrCallCommand object
 */
//@@author danielweide
public class QrSmsCommandParser implements Parser<QrCallCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the QrCallCommand
     * and returns an QrCallCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public QrCallCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new QrCallCommand(index);
        } catch (IllegalValueException ive) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, QrCallCommand.MESSAGE_USAGE));
        }
    }
}
